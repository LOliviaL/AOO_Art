<%--
  Created by IntelliJ IDEA.
  User: olivialiu
  Date: 16/4/2023
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste Exposition </title>
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
<br><br><br>
<div class="container text-center">
  <table class="table">
    <thead>
    <tr>
      <th scope="col">Titre</th>
      <th scope="col">date debut</th>
      <th scope="col">date fin</th>
      <th scope="col">nbrPlace</th>
      <th scope="col">list salle</th>
      <th scope="col">edit</th>
      <th scope="col">delete</th>
      <th scope="col" colspan="2"><button type="button"  class="btn btn-success">Nouveau</button></th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <th scope="row">Exposition 1</th>
      <td>12-08-2022</td>
      <td>12-08-2025</td>
      <td>700</td>
			<td>[Salle 1], [Salle 2], [Salle 3]</td>
      <td><button type="button" class="btn btn-outline-warning">edit</button></td>
      <td><button type="button" class="btn btn-outline-danger">delete</button></td>
    </tr>

    </tbody>
  </table>
</div>
</body>
</html>
