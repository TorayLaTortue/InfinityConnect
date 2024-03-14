<!DOCTYPE html>
<html lang="fr">

<head>
  <meta charset="UTF-8">
  <title>TimeOut</title>
  <link rel="stylesheet" href="admin.css">
  <link rel="stylesheet" href="slidbar.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

  <?php include "navbar.php" ?>




  <section id="section_profil">
    <h1>Profil</h1>
    <div id="profil">
      <img src="image.png" alt="Clement" width="15%" height="auto">
      <ul id="profil_home">
        <?php

        $url_profil = 'http://localhost:8080/profil/1';
        $profil = file_get_contents($url_profil);
        $profil_details = json_decode($profil, true);

        function formatDate($date)
        {
          return $date ? date('d/m/Y', strtotime($date)) : 'null';
        }

        echo '<li>' . ($profil_details['id_civile'] ?? 'null') . '</li>';
        echo '<li>' . ($profil_details['nom'] ?? 'null') . '</li>';
        echo '<li>' . ($profil_details['prenom'] ?? 'null') . '</li>';
        echo '<li>' . formatDate($profil_details['date_naissance']) . '</li>';

        ?>

      </ul>
    </div>
  </section>

  <section id="incident-decla">
    <table class="table table-striped table-dark">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">Civile</th>
          <th scope="col">Hero</th>
          <th scope="col">Vilain</th>
          <th scope="col">Organisation</th>
          <th scope="col">Type incident</th>
          <th scope="col">Adresse</th>
          <th scope="col">Date</th>
          <th scope="col">Commentaire</th>
        </tr>
      </thead>
      <tbody>

        <?php

        $url = 'http://localhost:8080/incidents';
        $response = file_get_contents($url);
        $incident_details = json_decode($response, true);

        function formatDateTime($datetime)
        {
          return $datetime ? date('H:i:s d-m-Y', strtotime($datetime)) : 'null';
        }


        foreach ($incident_details as $incident) {
          $numero1 = $numero1 + 1;
          echo '<tr>';
          echo "<th scope='row'>$numero1</th>";
          echo '<td>' . ($incident['id_civil'] ? $incident['id_civil'] : 'null') . '<br>' . '</td>';
          echo '<td>' . '<a href="hero.php?id_hero=' . $incident["id_hero"] . '">' . ($incident['id_hero'] ? $incident['id_hero'] : 'null') . '<br>' . '</td>';
          echo '<td>' . ($incident['id_vilain'] ? $incident['id_vilain'] : 'null') . '<br>' . '</td>';
          echo '<td>' . ($incident['id_organisation'] ? $incident['id_organisation'] : 'null') . '<br>' . '</td>';
          echo '<td>' . '' . ($incident['type_incident'] ? $incident['type_incident'] : 'null') . '<br>' . '</td>';
          echo '<td>' . '<a href="adresse.php?id_adresse=' . $incident["id_adresse"] . '">' . ($incident['id_adresse'] ? $incident['id_adresse'] : 'null') . '<br>' . '</td>';
          echo '<td>' . formatDateTime($incident['date']) . '</td>';
          echo '<td>' . $incident['commentaire'] . '</td>';
          echo '</tr>';
        }

        ?>

      </tbody>
    </table>
  </section>
  <section id="mission_cour">
    <table class="table table-striped table-dark">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">Incident</th>
          <th scope="col">Hero</th>
          <th scope="col">Titre</th>
          <th scope="col">Début</th>
          <th scope="col">Fin</th>
          <th scope="col">Urgence</th>
          <th scope="col">Adresse</th>
        </tr>
      </thead>
      <tbody>

        <?php

        $url_mission = 'http://localhost:8080/missions';
        $mission = file_get_contents($url_mission);
        $mission_details = json_decode($mission, true);




        foreach ($mission_details as $mission) {
          $numero = $numero + 1;
          echo '<tr>';
          echo "<th scope='row'>$numero</th>";
          echo '<td>' . ($mission['id_incident'] ? $mission['id_incident'] : 'null') . '</td>';
          echo '<td>' . '<a href="hero.php?id_hero=' . $mission["id_hero"] . '">' . ($mission['id_hero'] ? $mission['id_hero'] : 'null') . '<br>' . '</td>';
          echo '<td>' . ($mission['titre'] ? $mission['titre'] : 'null') . '</td>';
          echo '<td>' . formatDateTime($mission['date_debut']) . '</td>';
          echo '<td>' . formatDateTime($mission['date_fin']) . '</td>';
          echo '<td>' . $mission['urgence'] . '</td>';
          echo '<td>' . '<a href="hero.php?id_hero=' . $mission["id_adresse"] . '">' . ($mission['id_adresse'] ? $mission['id_adresse'] : 'null') . '<br>' . '</td>';
          echo '</tr>';
        }

        ?>

      </tbody>
    </table>
  </section>



  </main>
  <script src="slidebar.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-hjs21p2lnq7po+ArZfF6PQRm7o6P/R2DzpzlOOvZhCGIi4qGDOk8d5e7RAlKahHC"
    crossorigin="anonymous"></script>
</body>

</html>