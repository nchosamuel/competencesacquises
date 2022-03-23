<!DOCTYPE html>
<html>
<head>
	<title>réservation</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>

	<?php 

		try{

			$bdd = new PDO('mysql:host=localhost;dbname=marieteam;charset=utf8', 'root', ''); // connexion bdd
		}

		catch(Exception $e){

			die('Erreur : '.$e->getmessage("ERREUR BDD")); // en cas d'erreur, renvoie message
		}

		$secteurBDD = $bdd->query('SELECT * FROM secteur'); // variable qui contient et renvoie les secteurs
		$liaisonBDD = $bdd->query('SELECT code,distance,id_port,id_port_depart FROM liaison,secteur WHERE liaison.id_secteur = secteur.id '); // variable qui va chercher les liaisons du meme id que le secteur

	?>

	<div class="w3-sidebar w3-dark-grey w3-bar-block" style="width:17%">
            <h3 class="w3-bar-item">SECTEUR :</h3>
            <?php
                while ($nom_secteur_bar = $secteurBDD->fetch())
                {
                    
                    ?>
                    <a href="#" class="w3-bar-item w3-button"><?php echo $nom_secteur_bar['nom']; ?></a>

                  <?php
                }
            ?>       
        </div>

        <h1>compagnie atlantik</h1>

    <table border=4 cellspacing=0 cellpadding=15>

	    <tr>
		    <th rowspan ="2">Secteur</th>
		    <th colspan ="4"> liaison</th>
		</tr>
		<tr>
		    <th>code liaison</th>
		    <th>distance en miles marin</th>
		    <th>port de départ </th>
		    <th>port d'arrivée</th>
		</tr>
		<?php
		$secteurBDD = $bdd->query('SELECT * FROM secteur');
			while( $données1 = $secteurBDD->fetch()) // fetch = renvoie la donnée
		{
			?>
			<tr>
				<th><?php echo $données1['nom'] ?></th>
				<?php
					while( $données2 = $liaisonBDD->fetch()){
						?>
						<tr><?php echo $données2['code']; ?></tr>
						<tr><?php echo $données2['distance']; ?></tr>
						<tr><?php echo $données2['id_port_depart']; ?></tr>
						<tr><?php echo $données2['id_port']; ?></tr>
						<th>
						<?php
					}

					$liaisonBDD->closeCursor();

					?>
					</th>
			</tr>
			<?php
		}

				$secteurBDD->closeCursor(); // Termine le traitement de la requête

			?>
	
    </table>
</body>
</html>



