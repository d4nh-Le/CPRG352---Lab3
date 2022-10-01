import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        String message = "Result: ---";
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
     
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String operation = request.getParameter("operation"); 
        String first = request.getParameter("first_value"); 
        String second = request.getParameter("second_value"); 
        String message; 
        int result = 0; 
        
        request.setAttribute("firstVal", first);
        request.setAttribute("secondVal", second);
        
        
        if (first == null || first.equals("") || second == null || second.equals("")) {
            message = "Result: invalid";
        }
        else if ( isNumber(first) == false || isNumber(second) == false) {
            message = "Result: invalid"; 
        }
        else {
        
        int numOne = Integer.parseInt(first); 
        int numSecond = Integer.parseInt(second); 
        
        if (operation.equals("+")) {
                result = numOne + numSecond; 
            }
        else if (operation.equals("-")) {
                result = numOne - numSecond; 
            }
        else if (operation.equals("*")) {
                result = numOne * numSecond; 
            }
        else if (operation.equals("%")) {
                result = numOne / numSecond; 
            }
            
            message = "Result: " + result; 
        }
        
        
        request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return; //IMPORTANT!
        
}
    
    public boolean isNumber(String string) {
           int num;
           
      if (string == null) {
          return false; 
      }
      else {
          
          try {
          num = Integer.parseInt(string); 
      }
          catch (NumberFormatException nfe) {
          return false; 
      }
      
      return true; 
      }
    }
}