
<%@ page import="Entity.Peinture" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="BDD.entityBDD.PeintureBDD" %><%--
  Created by IntelliJ IDEA.
  User: olivialiu
  Date: 18/3/2023
  Time: 16:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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
    <a  href="Homepage.jsp">
      <img class="logo" src="https://zupimages.net/up/23/11/7574.png">
    </a>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Homepage.jsp" style="font-family:'Hoefler Text', sans-serif; font-size: 25px">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="AllOeuvres.jsp" style="font-family:'Hoefler Text', sans-serif; font-size: 25px">Oeuvres</a>
        </li>
      </ul>


      <form class="d-flex" style="padding-right: 10%">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item dropdown">
            <a class="nav-link " role="button" data-bs-toggle="dropdown" aria-expanded="false">
              <svg xmlns="http://www.w3.org/2000/svg" width="25" height="25" fill="currentColor" class="bi bi-person-fill" viewBox="0 0 16 16">
                <path d="M3 14s-1 0-1-1 1-4 6-4 6 3 6 4-1 1-1 1H3Zm5-6a3 3 0 1 0 0-6 3 3 0 0 0 0 6Z"/>
              </svg>
            </a>
            <ul class="dropdown-menu">
              <li><a class="dropdown-item" href="Profil.jsp">Mon Profil</a></li>
              <li><a class="dropdown-item" href="MesOeuvre.jsp">Mes Oeuvres</a></li>
              <li><hr class="dropdown-divider"></li>
              <li><a class="dropdown-item" href="index.jsp">Déconnection</a></li>
            </ul>
          </li>
        </ul>
      </form>

    </div>
  </div>
</nav>

<form id="myForm" action="oeuvre" method="GET">

  <a href="/oeuvre" ><button class="btn btn-primary btn-sm">Actualiser Page</button></a>

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
      <c:forEach var="item" items="${listoeuvre}">
      <tr>
          <th scope="row">
              <c:out value="${item.name}" />
          </th>
          <th>
              <c:out value="${item.photo}" />
          </th>
          <th>
              <c:out value="${item.estimationPrice}" />
          </th>
            <th>
            <c:out value="${item.dateCreation}" />
            </th>
            <th>
            <c:out value="${item.description}" />
            </th>
            <th>
            <c:out value="${item.nameArtiste}" />
            </th>
        <td>
          <a href="">
            <button class="btn btn-primary btn-sm">Acheter</button>
          </a>
        </td>
      </tr>
          </c:forEach>
      </tbody>

    </table>

  </div>
</form>

</body>
</html>
