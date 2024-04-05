<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Home</title>
    </head>
    <body>
        <form action="/tabuada/calcular">
            <input type="number" name="valor" />
            <button type="submit"> Calcular</button>
        </form>
        <ul>
            <c:forEach var="i" items="${tabuada}">
                <li>${i}</li>
            </c:forEach>    
            
        </ul>
    </body>
</html>

