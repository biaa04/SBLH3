<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  <h1>SBLH</h1>
        <h3>
         <a href="NovaBanda.jsp">Nova Banda</a>
         &nbsp;&nbsp;&nbsp;
       
         
        </h3>

    
        <table >
            <caption><h2>Lista de Bandas</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gênero</th>
              
            </tr>
            <c:forEach var="banda" items="${listBanda}">
                <tr>
                    <td><c:out value="${banda.idbanda}" /></td>
                    <td><c:out value="${banda.name}" /></td>
                    <td><c:out value="${banda.genero}" /></td>
                   
                    <td>
                     <a href="EditarBanda.jsp">Edit</a>
                     &nbsp;&nbsp;&nbsp;&nbsp;
                     <a href="delete?id=<c:out value='${banda.id}' />">Delete</a>                     
                    </td>
                </tr>
            </c:forEach>
        </table>
  

</body>
</html>