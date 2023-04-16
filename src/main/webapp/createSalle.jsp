<%--
  Created by IntelliJ IDEA.
  User: olivialiu
  Date: 16/4/2023
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Create Exposition</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width-device-width, intiale-scale=1.0">
  <meta charset="utf-8"/>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
  <!-- STYLE CSS -->
  <style>



    .wrapper {
      font-family: "Muli-Regular";
      font-size: 15px;
      color: #999;
      margin: 0;
      -webkit-box-sizing: border-box;
      -moz-box-sizing: border-box;
      box-sizing: border-box; }




    .wrapper {
      height: 100vh;
      background: #f9f6f1;
      display: flex;
      align-items: center;
      justify-content: center; }


    .wizard > .steps ul {
      display: flex;
      justify-content: center; }

    .wizard > .steps li a {
      display: inline-block;
      width: 12px;
      height: 12px;
      border-radius: 50%;
      background: #e9e0cf;
      margin-right: 78px;
      position: relative; }
    .wizard > .steps li a:before {
      content: "";
      width: 58px;
      height: 2px;
      background: #e9e0cf;
      position: absolute;
      right: 22px;
      top: 5px; }
    .wizard > .steps li a:after {
      content: "";
      width: 0;
      height: 2px;
      background: #6d7f52;
      position: absolute;
      left: -68px;
      top: 5px;
      transition: all 0.6s ease; }
    .wizard > .steps li.first a {
      background: #6d7f52; }
    .wizard > .steps li.checked a {
      background: #6d7f52; }
    .wizard > .steps li.checked a:after {
      width: 58px; }
    .wizard > .steps li:last-child a {
      margin-right: 0; }
    .wizard > .steps li:first-child a:before {
      display: none; }
    .wizard > .steps li:first-child a:after {
      display: none; }

    .wizard > .content {
      position: relative;
      height: 521px; }

    .inner {
      display: flex;
      background: #fff;
      box-shadow: 0px 0px 5px 0px rgba(0, 0, 0, 0.2);
      -webkit-box-shadow: 0px 0px 5px 0px rgba(0, 0, 0, 0.2);
      -moz-box-shadow: 0px 0px 5px 0px rgba(0, 0, 0, 0.2);
      -ms-box-shadow: 0px 0px 5px 0px rgba(0, 0, 0, 0.2);
      -o-box-shadow: 0px 0px 5px 0px rgba(0, 0, 0, 0.2); }


    .form-content {

      padding-top: 60px;
      padding-left: 51px;
      padding-right: 51px;
      padding-bottom: 50px;}

    .form-header {
      text-align: center; }

    .wrapper h3 {

      font-family: "Muli-SemiBold";
      font-size: 22px;
      color: #453e79;
      text-transform: uppercase;
      letter-spacing: 7px;
      display: inline-block;
      border: 1px solid #dad8e4;
      margin-bottom: 35px;
      text-align: center;

    }

    p {
      font-family: "Muli-SemiBold";
      font-size: 20px;
      color: #6d7f52;
      text-align: center;
      margin-bottom: 26px; }

    .form-row {
      display: flex;
      margin-bottom: 18px; }
    .form-row .form-holder {
      width: 50%;
      margin-right: 30px; }
    .form-row .form-holder:last-child {
      margin-right: 0; }

    .actions ul {
      display: flex; }
    .actions li a {
      padding: 0;
      border: none;
      display: inline-flex;
      height: 41px;
      width: 135px;
      align-items: center;
      background: #e9e0cf;
      font-family: "Muli-SemiBold";
      color: #666;
      cursor: pointer;
      position: relative;
      padding-left: 28px; }
    .actions li a:before {
      content: '\f301';
      position: absolute;
      top: 14px;
      right: 28px;
      font-family: Material-Design-Iconic-Font; }
    .actions li a:hover {
      background: #cfc7b8; }
    .actions li:first-child a {
      width: 144px;
      padding-left: 48px; }
    .actions li:first-child a:before {
      content: '\f2ff';
      position: absolute;
      top: 14px;
      left: 26px;
      font-family: Material-Design-Iconic-Font; }
    .actions li:nth-child(2) a, .actions li:last-child a {
      margin-left: 20px; }
    .actions li:last-child a {
      width: 124px;
      background: #6d7f52;
      color: #fff; }
    .actions li:last-child a:hover {
      background: #849963; }
    .actions li:last-child a:before {
      content: '\f26b';
      position: absolute;
      top: 13px;
      right: 28px;
      font-family: Material-Design-Iconic-Font; }
    .actions li[aria-disabled="true"] a {
      opacity: 0;
      transition: all 1s; }
    .actions li[aria-disabled="false"] ~ li a {
      background: #6d7f52;
      color: #fff; }
    .actions li[aria-disabled="false"] ~ li a:hover {
      background: #849963; }
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
<div class="wrapper">
  <form action="" id="wizard">
    <h2></h2>
    <section>
      <div class="inner">

        <div class="form-content" >
          <div class="form-header">
            <h3>Crée une exposition</h3>
          </div>
          <p>Please fill with your details</p>
          <div class="form-row">

            <div class="form-holder w-100">
              <input type="text" placeholder="Titre *" class="form-control">
            </div>

            <div class="form-holder">
              <input type="text" placeholder="date début" class="form-control">
            </div>
            <div class="form-holder">
              <input type="text" placeholder="date de fin" class="form-control">
            </div>
          </div>
          <div class="form-row">
            <div class="form-holder">
              <input type="text" placeholder="nbr de place*" class="form-control">
            </div>
          </div>

        </div>
        <button type="button" class="btn btn-outline-succes">Ajouter</button>
      </div>
    </section>

  </form>
</div>

</body>
</html>
