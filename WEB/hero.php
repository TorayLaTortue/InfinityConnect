<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <title>InfinityConnect</title>
    <link rel="stylesheet" href="adresse.css">
    <link rel="stylesheet" href="slidbar.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>

    <?php include "navbar.php" ?>

    <h1>Héro</h1>

    <?php

    $id_hero = $_GET["id_hero"];
    if  ($id_hero == 0) {
        header( 'Location: home_admin.php' ) ;
    }

    $url_hero = 'http://localhost:8080/hero/' . $id_hero;
    $hero = file_get_contents($url_hero);
    $hero_details = json_decode($hero, true);
    echo '<ul>';
    echo '<li>' . ($hero_details['nom'] ?? 'null') . '</li>';
    echo '<li>' . ($hero_details['pouvoir'] ?? 'null') . '</li>';
    echo '<li>' . ($hero_details['point_faible'] ?? 'null') . '</li>';
    echo '<li>' . ($hero_details['score'] ?? 'null') . '</li>';
    echo '</ul>';
    
    ?>

    <script src="slidebar.js"></script>

</body>

</html>