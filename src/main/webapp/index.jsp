<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bienvenue</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width-device-width, intiale-scale=1.0">
    <meta charset="utf-8"/>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script type="text/javascript" >
        const threshold = .1
        const options = {
            root: null,
            rootMargin: '0px',
            threshold
        }

        const handleIntersect = function (entries, observer) {
            entries.forEach(function (entry) {
                if (entry.intersectionRatio > threshold){
                    entry.target.classList.remove('appear')
                    observer.unobserve(entry.target)
                }
            })
        }

        document.documentElement.classList.add('appear-loaded')
        window.addEventListener("DOMContentLoaded", function () {
            const observer = new IntersectionObserver(handleIntersect, options)
            const targets = document.querySelectorAll('.appear')
            targets.forEach(function (target) {
                observer.observe(target)
            })
        })

        var counter=1;
        setInterval(function(){
            document.getElementById('radio'+ counter).checked=true;
            counter++;
            if(counter>4){
                counter=1;
            }
        },5000);

    </script>
    <style>
        .logo{
            border-radius: 100%;
            width: 90px;
            height: 90px;
        }
        .partie1{
            background-attachment: fixed;
            width: 100%;
            height: 800px;
            background-image: url("https://zupimages.net/up/23/11/aun7.jpeg");
            background-repeat: no-repeat;
            background-size:cover;
        }
        .text-P1{
            font-family: 'Helvetica',sans-serif;
            color: white;
            font-size: 100px;
            position: absolute;
            top: 30%;
            left: 30%;
            animation-duration: 4s;
            animation-name: Slidein;

        }
        @keyframes Slidein {
            from {
                margin-left: 100%;
                width: 400%;
            }

            to {
                margin-left: 0%;
                width: 20%;
            }
        }

        @keyframes slidein {
            from {
                margin-left: 100%;
                width: 400%;
            }

            to {
                margin-left: 0%;
                width: 50%;
            }
        }
        .text1-P1{
            font-family: 'Hoefler Text',sans-serif;
            color: white;
            font-size: 50px;
            position: absolute;
            top: 55%;
            left: 30%;
            animation-duration: 4s;
            animation-name: slidein;
        }
        .partie2{
            inline-size: 90%;
            margin-inline: auto;
            max-inline-size: 48em;
            line-height: 1.75;
        }
        .text1-P2{
            font-family: "Helvetica", sans-serif;
            font-size: 35px;
            animation-duration: 4s;
            animation-name: slidein;
        }

        .text-P2{
            font-family: "Hoefler Text", sans-serif;
            font-size: 20px;
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
<div class="partie1">
    <br>
    <h2 class="text-P1"> BIENVENUE </h2><br>
    <h2 class="text1-P1"> à la Galerie d'Art</h2>
</div>
<br>
<br>
<br>
<main class="main">
    <div class="partie2">
        <h1 class="text1-P2"> Bienvenue à la Galerie d'Art</h1>
        <br>
        <p class="text-P2">L'endroit pour en apprendre plus sur le monde de l'art ! La Galerie
            d'Art est un lieu dédié à la présentation, à l'appréciation et à l'échange des
            connaissances sur l'art et sa pratique. Trouvez des pièces de tous les styles et
            de tous les médiums, et vous ne manquerez jamais de trouver l'inspiration pour
            votre propre art. Que vous soyez un artiste débutant ou un collectionneur avisé,
            vous trouverez certainement quelque chose à apprécier à la Galerie d'Art.
            Visitez-nous et découvrez la richesse artistique que nous partageons à la Galerie d'Art.</p>
        <br>
        <p class="text-P2"> La Galerie d'Art vous fait sentir connecté à une communauté
            d'artistes et de collectionneurs qui acceptent et célèbrent l'art de toutes sortes.
            En visitant la Galerie d'Art, vous puvez sentir profondément inspiré et motivé à
            continuer à apprendre et à créer votre propre art. Alors venez nous rendre visite
            et laissez-vous inspirer par la merveille de l'art ! </p>
    </div>
</main>
</body>
</html>