<%--
  Created by IntelliJ IDEA.
  User: olivialiu
  Date: 16/4/2023
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en"><head>
    <meta charset="utf-8">
    <title>Salle 2</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width-device-width, intiale-scale=1.0">
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
        * {
            box-sizing: inherit;
        }

        html {
            box-sizing: border-box;
        }

        body{
            background-color:#eee
        }


        .wrap
        {
            margin:50px auto 0 auto;
            width:100%;
            display:flex;
            align-items:space-around;
            max-width:1200px;
        }
        .tile
        {
            width:380px;
            height:380px;
            margin:10px;
            background-color: black;
            display:inline-block;
            background-size:cover;
            position:relative;
            cursor:pointer;
            transition: all 0.5s ease-out;
            box-shadow: 20px 60px 77px -17px rgba(0,0,0,0.44);
            overflow:hidden;
            color:white;
            font-family:'Hoefler Text';

        }
        .tile img
        {
            height:100%;
            width:100%;
            position:absolute;
            top:0;
            left:0;
            z-index:0;
            transition: all 0.4s ease-out;
        }
        .tile .text
        {
            position:absolute;
            padding:30px;
            height:calc(100% - 60px);
        }
        .tile h1
        {

            font-weight:300;
            margin:0;
            text-shadow: 2px 2px 10px rgba(0,0,0,0.3);
        }
        .tile h2
        {
            font-weight:100;
            margin:20px 0 0 0;
            font-style:italic;
            transform: translateX(200px);
        }
        .tile p
        {
            position: absolute;
            top: 90%;
            left: 60%;
            font-weight:300;
            margin:20px 0 0 0;
            line-height: 25px;
            transform: translateX(-200px);
            transition-delay: 0.2s;
        }
        .animate-text
        {
            opacity:0;
            transition: all 0.6s ease-in-out;
            color: white;
        }
        .tile:hover
        {
            box-shadow: 0px 35px 77px -17px rgba(0,0,0,0.64);
            transform:scale(1.05);
        }
        .tile:hover img
        {
            opacity: 0.6;
        }
        .tile:hover .animate-text
        {
            transform:translateX(0);
            opacity:1;
        }

        .dots span
        {
            width: 5px;
            height:5px;
            background-color: currentColor;
            border-radius: 50%;
            display:block;
            opacity:0;
            transition: transform 0.4s ease-out, opacity 0.5s ease;
            transform: translateY(30px);

        }

        .tile:hover span
        {
            opacity:1;
            transform:translateY(0px);
        }

        .dots span:nth-child(1)
        {
            transition-delay: 0.05s;
        }
        .dots span:nth-child(2)
        {
            transition-delay: 0.1s;
        }
        .dots span:nth-child(3)
        {
            transition-delay: 0.15s;
        }
        .sous_titre{
            margin:50px auto 0 auto;
            max-width:1200px;
            font-family: "Hoefler Text";
            font-size: 40px;
            color: black;
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
<form action="/salle" method="get">

    <div class="sous_titre">
        Salles 2
    </div>
    <div class="wrap">

        <div class="tile">
                <img src='https://zupimages.net/up/23/15/ouq7.jpg'/>
                <div class="text">
                    <h1> KEVAN </h1>
                    <h2 class="animate-text"> </h2>
                    <p class="animate-text">---- Savoir Plus</p>

                </div>
        </div>

        <div class="tile">
                <img src='https://zupimages.net/up/23/15/m19h.jpg'/>
                <div class="text">
                    <h1> La Petite Fille Perle</h1>
                    <h2 class="animate-text"> </h2>
                    <p class="animate-text">---- Savoir Plus</p>

                </div>
        </div>

        <div class="tile">
                <img src='https://zupimages.net/up/23/15/25ta.jpg'/>
                <div class="text">
                    <h1> Mona Lisa</h1>
                    <h2 class="animate-text"></h2>
                    <p class="animate-text"> ---- Savoir Plus</p>

                </div>
        </div>
    </div>
    <div class="wrap">
        <div class="tile">
                <img src='https://zupimages.net/up/23/15/mdzn.jpg'/>
                <div class="text">
                    <h1>Nuit Etoile</h1>
                    <h2 class="animate-text"></h2>
                    <p class="animate-text"> ---- Savoir Plus</p>

                </div>
        </div>
        <div class="tile">
                <img src='https://zupimages.net/up/23/15/w3nf.jpg'/>
                <div class="text">
                    <h1>Tourne Sol</h1>
                    <h2 class="animate-text"></h2>
                    <p class="animate-text"> ---- Savoir Plus</p>

                </div>
        </div>

    </div>
</form>
</body>
</html>