<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <title>InfinityConnect</title>
    <link rel="stylesheet" href="mission.css">
    <link rel="stylesheet" href="slidbar.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/css/select2.min.css" rel="stylesheet" />
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/js/select2.min.js"></script>
</head>

<body>

    <?php include "navbar.php" ?>

    <h5>Déclarer une Mission</h5>

    <section id='incident'>

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
                    echo '<td><a href="#" onclick="openModal(' . $incident["id_incident"] . ', ' . $incident["id_adresse"] . ')">Voir détails</a></td>';
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

    <button id="openModalBtn">Open Modal</button>

    <div id="myModal" class="modal">
        <div class="modal-content">
            <span class="close">&times;</span>
            <form id="missionForm" action="http://localhost:8080/newMission" method="POST">


                <!-- Sélection du héros -->
                <select class="select2" name="id_hero">
                    <option value="1">Héros</option>
                    <?php
                    $url = 'http://localhost:8080/hero';
                    $response = file_get_contents($url);
                    $hero_details = json_decode($response, true);

                    foreach ($hero_details as $hero) {
                        echo '<option value="' . $hero["id_hero"] . '">' . $hero["nom"] . '</option>';
                    }
                    ?>
                </select>

                <!-- Titre -->
                <input type="text" placeholder="Entrer un titre" name="titre" required>


                <!-- Date et heure de début -->
                <label for="datetime_debut">Date et heure de début</label>
                <input type="datetime-local" name="datetime_debut" required>

                <!-- Date et heure de fin -->
                <label for="datetime_fin">Date et heure de fin</label>
                <input type="datetime-local" name="datetime_fin" required>

                <!-- Sélection de l'urgence -->
                <select name="urgence" required>
                    <option value="">Choisir une urgence</option>
                    <option value="pas urgent">Pas urgent</option>
                    <option value="urgent">Urgent</option>
                    <option value="tres urgent">Très urgent</option>
                </select>

                <!-- Champ caché pour l'ID de l'incident -->
                <input type="hidden" id="incidentId" name="id_incident">

                <!-- Champ caché pour l'ID de l'adresse -->
                <input type="hidden" id="adresseId" name="id_adresse">

                <!-- Bouton de soumission -->
                <button type="submit">Créer la mission</button>

            </form>


        </div>
    </div>

    <script>
        function openModal(incidentId, adresseId) {
            var modal = document.getElementById("myModal");
            modal.style.display = "block";
            console.log("ID de l'incident:", incidentId);
            console.log("ID de l'adresse:", adresseId);
            // Stockez les ID dans des champs cachés du formulaire
            document.getElementById("incidentId").value = incidentId;
            document.getElementById("adresseId").value = adresseId;
        }

        // Gestionnaire d'événements pour fermer la fenêtre modale
        document.querySelector(".close").addEventListener("click", function () {
            document.getElementById("myModal").style.display = "none";
        });

        // Get the modal
        var modal = document.getElementById("myModal");

        // Get the button that opens the modal
        var btn = document.getElementById("openModalBtn");

        // When the user clicks the button, open the modal 
        btn.onclick = function () {
            modal.style.display = "block";
        }        
    </script>
<script>
    // Gestionnaire d'événement pour soumettre le formulaire
    document.querySelector("#missionForm").addEventListener("submit", function(event) {
        // Empêcher le comportement par défaut de soumission du formulaire
        event.preventDefault();

        // Récupérer les valeurs des champs du formulaire
        var id_incident = document.getElementById("incidentId").value;
        var id_hero = document.querySelector("[name='id_hero']").value;
        var titre = document.querySelector("[name='titre']").value;
        var date_debut = document.querySelector("[name='datetime_debut']").value;
        var date_fin = document.querySelector("[name='datetime_fin']").value;
        var urgence = document.querySelector("[name='urgence']").value;
        var id_adresse = document.getElementById("adresseId").value;

        // Créer un objet avec les données du formulaire
        var formData = {
            "id_incident": id_incident,
            "id_hero": id_hero,
            "titre": titre,
            "date_debut": date_debut,
            "date_fin": date_fin,
            "urgence": urgence,
            "id_adresse": id_adresse
        };

        // Envoyer les données à l'API via une requête POST
        fetch('http://localhost:8080/newMission', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(formData),
        })
        .then(response => {
            if (response.ok) {
                alert("Mission créée avec succès !");
                // Fermer la fenêtre modale ou effectuer toute autre action nécessaire
            } else {
                alert("Erreur lors de la création de la mission !");
            }
        })
        .catch(error => {
            console.error('Erreur lors de la demande :', error);
            alert("Une erreur s'est produite. Veuillez réessayer !");
        });
    });
</script>


    <script>
        $(document).ready(function () {
            $('.select2').select2();
        });
    </script>

    <script src="slidebar.js"></script>

</body>

</html>
