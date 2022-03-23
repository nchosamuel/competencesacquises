<!DOCTYPE html>
<html>
<head>Formulaire</head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<?php
try
{
    $bdd = new PDO('mysql:host=localhost;dbname=marieteam;charset=utf8', 'root', '');
    $bdd->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
}
catch(Exception $e)
{
    die('Erreur : '.$e->getMessage());
}

echo "<br/>
<form method='post'> 
<input type=submit name='ajout' value='Ajouter cette liaison'\><br> 
</form> 
"; 
echo '<br/>';

if (isset($_POST['stmt'])) 
{ 
    $distance=$_POST['Nom1'];
    $idsecteur=$_POST['Nom2'];
    $idport=$_POST['Nom3'];
    $idport2=$_POST['Nom4'];

    $stmt->bindParam(1, $distance);
    $stmt->bindParam(2, $idsecteur);
    $stmt->bindParam(3, $idport);
    $stmt->bindParam(4, $idport2);

    try{
        $stmt = "INSERT INTO liaison (code,distance,id_secteur,id_port,id_port_depart) VALUES ('26','$distance','$idsecteur','$idport','$idport2')";
        $req= mysql_query($stmt);
        $bdd->exec($stmt);
        echo 'Produit ajouté au panier';
    }catch(PDOException $e) {
        echo $sql . "<br>" . $e->getMessage();
    }

}
else{

}
$bdd = null;
?>
<body>
    <div>
        <label>Distance :<input type="int" id="1" name="Nom1" /></label>
        <label>id_secteur :<input type="int" id="2" name="Nom2" /></label>
        <label>id_port :<input type="int" id="3" name="Nom3" /></label>
        <label>id_port depart :<input type="int" id="4" name="Nom4" /></label>
    </div>
    <br>
    
    <?php
    

    ?>
</body>
</html>