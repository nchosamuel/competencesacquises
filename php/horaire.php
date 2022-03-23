<!DOCTYPE html>
<html>
<head>  
    <title>Horraires</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<body>
    <?php  
    
    // IMPORT DE LA BDD

    try
    {
        // On se connecte à MySQL
        $bdd = new PDO('mysql:host=localhost;dbname=marieteam;charset=utf8', 'root', '');
    }
    catch(Exception $e)
    {
        // En cas d'erreur, on affiche un message et on arrête tout
            die('Erreur : '.$e->getMessage());
    }

    // Si tout va bien, on peut continuer

    // On récupère tout le contenu de la table jeux_video
    $reponse = $bdd->query('SELECT * FROM secteur');
    $reponse2= $bdd->query('SELECT * FROM liaison');
    $reponse3= $bdd->query('SELECT * FROM traversee');
    // On affiche chaque entrée une à une
    

    

    //SIDEBAR

    ?>
    
    <div class="w3-sidebar w3-dark-grey w3-bar-block" style="width:17%">
        <h3 class="w3-bar-item">SECTEURS :</h3>
        <?php
            while ($donnees = $reponse->fetch())
            {
                
                ?>
                <a href="#" class="w3-bar-item w3-button"><?php echo $donnees['nom'],' ';

              
            }
        ?>       
    </div>
    <div style="margin-left:18%">

        <h3>Selectionnez la liaison ainsi que la date souhaitee.</h3>

        <select name="pets" id="pet-select">
            <?php//mettre laisons disponible ici

            ?><option value="">--Selectionnez la liaison--</option><?php ?>
            <?php while($fff = $reponse2->fetch())
            {
                ?>
                <option value="dog"><?php echo $fff['distance'];
            } 
            ?>      
        </select>
        <input type="date" id="start" name="trip-start"
            value="2020-07-22"
            min="2020-01-01" max="2021-12-31"
        >

        <?php//boutton1?>
        <button class="favorite styled" type="button">Afficher les traversees</button>

        <br><br><br></br></br></br>

        <a><h4>Nom de la liaison</h4></a>
        <a><h4>Traversee pour le .........DATE......... Selectionner la traversee souhaitee</h4></a>

        <table border=5 cellspacing=0 cellpadding=20>
            <tr  width=20px>
                <th colspan="3"width=20px>Traversee</th>
                <th colspan="3">Nombre de places par categories</th>
                <th></th>
                <tr>
                    <th>n°</th>
                    <th>Heure</th>
                    <th>Bateau</th>
                    <th>A Passager</th>
                    <th>B Veh.in.2m</th>
                    <th>C Veh.sup.2m</th>
                    <th></th>
                </tr>

                <?php//remplissage d'informations dans le tableau?>
                
                <?php while($hhh = $reponse3->fetch())
                {
                ?>
                    <tr>
                        <th><?php echo $hhh['num']; ?></th>
                        <th><?php echo $hhh['heure'];?></th>
                        <th><?php echo $hhh['id']; ?></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th><input type="radio" name="Boutton"></th>              
                    </tr>
                }
                                          
                    <tr>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th><input type="radio" name="Boutton"></th>
                    </tr>
                    <tr>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th><input type="radio" name="Boutton"></th>
                    </tr>           
                
            </tr>
        </table>

        <br></br>
        <button class="favorite styled" type="button">Reserver cette traversee</button>

    </div>
</body>
</html>
