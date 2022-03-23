<!DOCTYPE html>
<html>
<head>
    <title>Extraits des tarifs</title>
</head>
<body>
    <?php $bdd = new PDO('mysql:host=localhost;dbname=marieteam', 'root', ''); ?>

    <h1>compagnie atlantik</h1>
    <table border=4 cellspacing=0 cellpadding=15>

    <tr><th rowspan ="1" colspan ="5" align="left">  Liaison : +++ </th></tr>

    <tr>
        <th rowspan ="2">Catégories</th>
        <th rowspan ="2">Type </th>
	    <th colspan ="3">Période</th>
	</tr>
	<tr>
	    <th>$dateDebut1 , $dateFin1</th>
	    <th>$dateDebut2 , $dateFin2</th>
	    <th>$dateDebut3 , $dateFin3</th>  
    </tr>
    <tr>
        <th rowspan ="3"> A     Passager </th>
        <th> A1 - Adulte  
        <th></th>
        <th></th>
        <th></th>    
        <tr>
            <th> A2 - junior 8 à 18 ans</th>
            <th></th>
            <th></th>
            <th></th>  
        </tr>
        <tr>
            <th> A3 - enfants 0 à 7 ans</th>
            <th></th>
            <th></th>
            <th></th>  
        </tr>
             
        </th>
    </tr>
    <tr>
        <th rowspan ="2"> B     Veh.inf.2m </th>
        <th> B1 - Véhicule long.inf.4m</th>
        <th></th>
        <th></th>
        <th></th>     
        <tr>
            <th> B2 - Vehicule long.inf.5m</th>
            <th></th>
            <th></th>
            <th></th>  
        </tr>  
        </th>
    </tr>
    <tr>
        <th rowspan ="3"> C     Veh.sup.2m </th>
        <th> C1 - Fourgon 
        <th></th>
        <th></th>
        <th></th>
    <tr>
        <th> C2 - Camping Car</th>
        <th></th>
        <th></th>
        <th></th>
    </tr>
    <tr>
        <th> C3 - Fourgon</th>
        <th></th>
        <th></th>
        <th></th>
    </tr>   
    </th>
    </tr>
