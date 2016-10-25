
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration page</title>
    </head>
    <body>
        <form method="post" action="./RegisterServletTest.do" >
            <table border="1">
               <tr>
                        <td>Enter Customer Id:</td>
                        <td><input type="text" name="customerId" value="" /></td>
                    </tr>
               
                    <tr>
                        <td>Enter First Name:</td>
                        <td><input type="text" name="firstName" value="" /></td>
                    </tr>
                    <tr>
                        <td>Enter Last Name:</td>
                        <td><input type="text" name="lastName" value="" /></td>
                    </tr>
                    
                     <tr>
                        <td>Enter Department:</td>
                        <td><input type="text" name="department" value="" /></td>
                    </tr>
                     <tr>
                        <td>Enter Email:</td>
                        <td><input type="text" name="email" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Register" name="s" /></td>
                        <td><input type="reset" value="Reset" name="r" /></td>
                    </tr>
                </tbody>
            </table>
            
            
            
        </form>
    </body>
</html>
