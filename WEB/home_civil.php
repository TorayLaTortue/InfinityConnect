<!DOCTYPE html>
<html lang="fr">

<head>
  <meta charset="UTF-8">
  <title>InfinityConnect</title>
  <link rel="stylesheet" href="admin.css">
  <link rel="stylesheet" href="slidbar.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body>

  <?php include  "navbar.php" ?>

  <div id="container1">
    <div id="containerp1">

      <section id="section_profil">
        <h1>Profil</h1>
        <div id="profil">
          <img src="image.png" alt="Clement" width="15%" height="auto">
          <ul id="profil_home">
            <li>Clément</li>
            <li>Auger</li>
            <li>3 mai 1955</li>
            <li>3 incident declarer </li>
            <li>6 victime d'incidents </li>
          </ul>
        </div>
      </section>
      <section id="incident">
        <ul id="list-button">
          <li>
            <div class="containerimg">
              <img src="https://pixabay.com/get/gab10a1463d42352a6bc9b9b4cadc92fc1398d355f07fa9a6c3d8a934f01ab5d527d2c4dd1411c68f7bda39c5499e01c10c6faf783ecf91de035623d4f615041131fb86724866ad639c769c44da45bbf2_640.jpg" class="background-image">
              <div class="overlay-text">
                <a href="url_de_votre_maison"><b>Ma maison...</b></a>
              </div>
            </div>

          </li>
        </ul>
      </section>
    </div>
    <section id="incident-decla">
      <table class="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">First</th>
            <th scope="col">Last</th>
            <th scope="col">Handle</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>@mdo</td>
          </tr>
          <tr>
            <th scope="row">2</th>
            <td>Jacob</td>
            <td>Thornton</td>
            <td>@fat</td>
          </tr>
          <tr>
            <th scope="row">3</th>
            <td>Larry</td>
            <td>the Bird</td>
            <td>@twitter</td>
          </tr>
        </tbody>
      </table>
    </section>

  </div>
  </main>
  <script src="slidebar.js"></script>
</body>

</html>