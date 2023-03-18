<%--
  Created by IntelliJ IDEA.
  User: olivialiu
  Date: 13/3/2023
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Login </title>
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
            font-family: "Hoefler";
            background: url("https://zupimages.net/up/23/11/70l1.jpg") no-repeat center center;
            height: 100vh;
            background-size: cover;
        }
        .login-box{
            width: 450px;
            position: absolute;
            top: 55%;
            left: 50%;
            transform: translate(-50%,-50%);
            color: white;
            background-color: rgba(0,0,0,0.5);
            padding: 0rem 2rem 3rem;
        }
        .login-box h1{
            float: left;
            font-size: 2.7rem;
            border-bottom: 4px solid green;
            margin-bottom: 3rem;
            padding: 0.3rem 0;
        }
        .txt-box{
            width: 100%;
            overflow: hidden;
            font-size: 1.2rem;
            padding: 0rem 0;
            margin: 1.4rem 0;
            border-bottom: 1px solid green;
        }
        .txt-box i{
            width: 1.6rem;
            float: left;
            text-align: center;
        }
        .txt-box input{
            border: none;
            outline: none;
            background: none;
            color: white;
            font-size: 1.1rem;
            width: 80%;
            float: left;
            margin: 0 10px;

        }
        .submit-box{
            width: 100%;
            background: none;
            border: 1px solid green;
            color: white;
            padding: 5px;
            font-size: 1rem;
            margin: 24px 0 12px;
            cursor: pointer;

        }
        .connex{
            color: white;
        }
        .logo{
            border-radius: 100%;
            width: 90px;
            height: 90px;
        }
        .entete{
            color: black;
            font-family: "Hoefler Text";
            font-size: 30px;
            padding-right: 10px;
        }
    </style>
    <script>

        function verifConnexion(){


            var login=document.getElementById("login").value;
            var password=document.getElementById("password").value;



            if ((login==="")||(!login.match(/^[a-zA-Z-\s]+$/))){
                document.getElementById("login").focus();
                document.getElementById("login").style.border="2px solid yellow";
                var vlogin=document.getElementById("vlogin");
                vlogin.innerHTML="Veuillez saisir votre nom d'utilisateur";
                vlogin.style.color="yellow";

            }


            if (password.length<8){
                document.getElementById("password").focus();
                document.getElementById("password").style.border="2px solid yellow";
                var vpassword=document.getElementById("vpassword");
                vpassword.innerHTML="Mot de passe incorrecte";
                vpassword.style.color="yellow";

            }

        }

    </script>
</head>

<body>
<div>
    <a href="index.jsp"><img src="https://zupimages.net/up/23/11/7574.png" class="logo" align="left"> </a>
    <p class="entete" align="right"><a href="index.jsp" class="entete">  Home <i class="fas fa-list-ul"></i> </a></p>
</div>

<form id="connexionForm" action="login" method="post">
    <div class="login-box">
        <h1> Login </h1>
        <div class="txt-box">
            <i class="fas fa-user-tie"></i>
            <span id="vlogin"></span>
            <input type="text" placeholder="Name" name="name" id="name" autocomplete="off" required>
        </div>
        <div class="txt-box">
            <i class="fas fa-key"></i>
            <span id="vpassword"></span>
            <input type="password"  placeholder="Passeword" name="passeword" id="password" autocomplete="off" required>
        </div>
        <table>
            <tr>
                <td> <input type="reset" class="submit-box" value="Effacer" name="effacer">
                    <button type="submit" class="submit-box"> Entrer </button></td>
            </tr>
        </table>
        <div class="txt-box">
            <table>
                <tr>
                    <td> <i class="fab fa-facebook"></i>
                        <a href="https://www.facebook.com" class="connex"> Se connecter avec Facebook </a> </td>
                </tr>
                <tr>
                    <td> <i class="fab fa-google-plus"></i>
                        <a href="https://www.google.com" class="connex"> Se connecter avec Google</a> </td>
                </tr>
            </table>
        </div>
        <p align="center"> <a href="" class="connex">Mot de passe oublié ? </a></p>
        <p align="center"><a href="Inscription.jsp" class="connex"> Vous n'avez pas de compte ? </a></p>
        <p align="center"> <a href="Inscription.jsp" class="connex"> Inscrivez-vous </a> </p>

    </div>
    <script src="https://kit.fontawesome.com/3ea0bb51d0.js"></script>
</form>

</body>
</html>
