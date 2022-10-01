

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="">
            <label>First: </label> <input type="text" name="first_value" value="${firstVal}"><br> 
        <label>Second: </label> <input type="text" name="second_value" value="${secondVal}"> <br>
        <input type="submit" name="operation" value="+">
        <input type="submit" name="operation" value="-">
        <input type="submit" name="operation" value="*">
        <input type="submit" name="operation" value="%">
        </form>
        <div>
    <p1>${message}</p1>
        </div>
        <div>
    <p1><a href="age">Arithmetic Calculator</a></p1>
        </div>
    </body>
</html>
