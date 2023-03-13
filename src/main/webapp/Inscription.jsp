<%--
  Created by IntelliJ IDEA.
  User: olivialiu
  Date: 13/3/2023
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Inscrivez-vous </title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css"
          integrity="sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7" crossorigin="anonymous">

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

    <style>
        body{
            margin:0;
            padding:0;
            font-family: "Times New Roman";
            background: url("https://zupimages.net/up/23/11/zgl1.jpg") center;
            height: 100vh;
            background-size: cover;
        }
        .inscri{
            width: 450px;
            position: absolute;
            top: 55%;
            left: 50%;
            transform: translate(-50%,-50%);
            color: white;
            background-color: rgba(0,0,0,0.5);
            padding: 0rem 2rem 3rem;
        }
        .inscri h1{
            float: left;
            font-size: 2.7rem;
            border-bottom: 4px solid white;
            margin-bottom: 2rem;
            padding: 0.3rem 0;
        }
        .txt{
            width: 100%;
            overflow: hidden;
            font-size: 1.2rem;
            padding: 0rem 0;
            margin: 0.5rem 0;
            border-bottom: 1px solid white;
        }
        .txt i{
            width: 1.6rem;
            float: left;
            text-align: center;
        }
        .txt input{
            border: none;
            outline: none;
            background: none;
            color: white;
            font-size: 1.1rem;
            width: 80%;
            float: left;
            margin: 0 10px;
        }
        .Submit{
            width: 100%;
            background: none;
            border: 1px solid white;
            color: white;
            padding: 5px;
            font-size: 1rem;
            margin: 24px 0 12px;
            cursor: pointer;
        }
        .con{
            color: white;
        }
    </style>
</head>
<body>

<form id="myForm" action="${pageContext.request.contextPath}/inscripservlet" method="post">
    <div class="inscri">
        <h4> Inscrivez vous pour savoir plus d'information sur l'art Gallery </h4>
        <hr>
        <i class="fas fa-mail-bulk"></i>
        <label for="mail">E-mail : </label>
        <div class="txt">
            <span id="vmail"></span>
            <input type="text"  placeholder="Adresse mail " name="email" id="mail">

        </div>
        <i class="fas fa-user"></i>
        <label for="lenom"> Nom  : </label>
        <div class="txt">
            <span id="vnom"></span>
            <input type="text" placeholder="Nom" name="nom" id="lenom" autocomplete="off" required>
        </div>
        <i class="fas fa-user"></i>
        <label for="leprénom"> Prénom : </label>
        <div class="txt">
            <span id="vprénom"></span>
            <input type="text"  placeholder="Prénom" name="prenom"id="leprénom" autocomplete="off" required>
        </div>
        <i class="fas fa-user"></i>
        <label for="lenom"> Adresse  : </label>
        <div class="txt">
            <span id="vadre"></span>
            <input type="text" placeholder="Adresse" name="adresse" id="adresse" autocomplete="off" required>
        </div>
        <i class="fas fa-unlock-alt"></i>
        <label for="password"> Mot de passe (Min 8 chiffres, ex: Aa1234567) : </label>
        <div class="txt">
            <span id="vpassword"></span>
            <input type="password" placeholder="Mot de passe" name="MP" id="password" autocomplete="off" required>
        </div>
        <i class="fas fa-unlock-alt"></i>
        <label for="confpassword"> Confirmation de mot de passe : </label>
        <div class="txt">
            <span id="vconfpassword"></span>
            <input type="password" placeholder="Mot de passe" name="cMP" id="confpassword" autocomplete="off" required>
        </div>
        <button type="submit" class="Submit"> Inscrivez-vous </button></td>

        <p align="center"> En vous inscrivant, vous acceptez nos Conditions générales.
            Découvrez comment nous recueillons, utilisons et partageons
            vos données en lisant notre Politique d’utilisation des données
            et comment nous utilisons les cookies et autres technologies
            similaires en consultant notre Politique d’utilisation des cookies.</p>
        <hr>
        <p align="center"> <a href="/loginservlet" class="con"> Vous avez un compte ? </a> <a href="Login.jsp" class="con"> Connectez-vous </a> </p>
    </div>

</form>
<script src="https://kit.fontawesome.com/3ea0bb51d0.js"></script>
</body>
</html>

