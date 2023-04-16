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
</head>
<body>
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
      <th scope="col" colspan="2"><button type="button"  class="btn btn-success">Nouveau</button></a></th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <th scope="row">Exposition 1</th>
      <td>12-08-2022</td>
      <td>12-08-2025</td>
      <td>700</td>
			<td>[Salle 1], [Salle 2], [Salle 3]</td>
      <td><button type="button" class="btn btn-outline-warning">edit</button></a></td>
      <td><button type="button" class="btn btn-outline-danger">delete</button></a></td>
    </tr>
    {% endfor %}
    </tbody>
  </table>
</div>
</body>
</html>
