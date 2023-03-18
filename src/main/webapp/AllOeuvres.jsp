<%@ page import="Entity.Peinture" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: olivialiu
  Date: 18/3/2023
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
  <title>Tous Oeuvres</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width-device-width, intiale-scale=1.0">
  <meta charset="utf-8"/>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <style>
    .logo{
      border-radius: 100%;
      width: 90px;
      height: 90px;
    }
    .container-fluid  {
      height: 40px;
      margin-left: 20px;
    }
  </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg bg-light" style="background-color: lightgray; padding-bottom: 50px">
      <div class="container-fluid" style="padding-top: 40px">
        <a  href="index.jsp">
          <img class="logo" src="https://zupimages.net/up/23/11/7574.png">
        </a>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="index.jsp" style="font-family:'Hoefler Text', sans-serif; font-size: 25px">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" aria-current="page" href="AllOeuvres.jsp" style="font-family:'Hoefler Text', sans-serif; font-size: 25px">Oeuvres</a>
            </li>
          </ul>


          <form class="d-flex" style="padding-right: 10%">
            <form class="d-flex" >
              <a class="btn btn-outline-success"  href="Login.jsp">Connection</a>
              <a class="btn btn-outline-primary"  href="Inscription.jsp">Inscription</a>
            </form>

          </form>

        </div>
      </div>
    </nav>
<form id="myForm" action="toeuvre" method="GET">
  <div class="container mb-3">
    <table class="table">
      <thead>
      <tr>
        <th scope="col">Id</th>
        <th scope="col">Nom</th>
        <th scope="col">Photo</th>
        <th scope="col">Prix d'estimation</th>
        <th scope="col">Description</th>
        <th scope="col">Date de Creation</th>
        <th scope="col">Nom d'Artiste</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach var="oeuv" items="${listoeuvre}">

        <tr>
          <td>
            <c:out value="${oeuv.Id}" />
          </td>
          <td>
            <c:out value="${oeuv.name}" />
          </td>
          <td>
            <c:out value="${oeuv.photo}" />
          </td>
          <td>
            <c:out value="${oeuv.estimationPrice}" />
          </td>
          <td>
            <c:out value="${oeuv.description}" />
          </td>
          <td>
              <c:out value="${oeuv.dateCreation}" />
          <td>
          <td>
              <c:out value="${oeuv.nameArtiste}" />
          <td>
            <a href="edit?name=<c:out value='${oeuv.name}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="delete?name=<c:out value='${oeuv.name}' />">Delete</a>
          </td>
        </tr>
      </c:forEach>


      </tbody>

    </table>
    <a class="btn btn-outline-success"  href="InsertPeinture.jsp">Ajouter un Oeuvre</a>
  </div>
</form>
</body>
</html>
