<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <form method="POST" action=""> 
        <h1>Age Calculator</h1>
        <label> Age next birthday: </label> <input type="text" name="age"> <br>
        <input type ="submit" value="Calculate your age">
        </form>
        <div>
    <p1>${message}</p1>
        </div>
        
        
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
