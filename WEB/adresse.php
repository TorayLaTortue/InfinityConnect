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

    <h1>Adresse</h1>

    <?php

    $id_adresse = $_GET["id_adresse"];

    if  ($id_adresse == 0) {
        header( 'Location: home_admin.php' ) ;
    }

    $url_adresse = 'http://localhost:8080/adresse/' . $id_adresse;
    $adresse = file_get_contents($url_adresse);
    $adresse_details = json_decode($adresse, true);
    echo '<ul>';
    echo '<li>' . ($adresse_details['ville'] ?? 'null') . '</li>';
    echo '<li>' . ($adresse_details['code_postal'] ?? 'null') . '</li>';
    echo '<li>' . ($adresse_details['rue'] ?? 'null') . '</li>';
    echo '<li>' . ($adresse_details['numero'] ?? 'null') . '</li>';
    echo '</ul>';
    
    ?>

    <script src="slidebar.js"></script>

</body>

</html>