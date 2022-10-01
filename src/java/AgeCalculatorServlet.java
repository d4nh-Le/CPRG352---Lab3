import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        return;
     
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age");
        String message;
        
        if( age == null || age.equals("")){
            message = "You must give your current age";
        }
        else if (isNumber(age) == false) {
            message = "You must enter a number";
        }
        else {
        int user_age = Integer.parseInt(age) + 1;
        message = "Your age next birthday will be " + user_age; 
        }
        
        request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
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

