/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sncf;
import java.util.ArrayList;
/**
 *
 * @author lastreet'zer
 */
public class Program2 {
    
    public static void main(String[] args)
{
// déclaration et instanciation de trains
Train t1 = new Train();
Train t2 = new Train(50, true);
Train t3 = new Train(80, true);
Train t4 = new Train(0, false);
Train t5 = new Train(20, true);
Train t6 = new Train(30, true);
// liste des trains
ArrayList<Train> liste = new ArrayList<Train>();
// ajout des trains à la liste
liste.add(t1);
liste.add(t2);
liste.add(t3);
liste.add(t4);
liste.add(t5);
liste.add(t6);

//1)a.
//Affichez tous les trains avec un boucle « for each » :
for (Train unTrain : liste)
{
System.out.println( unTrain.toString() );
}

//1)b.
for (int i = 0 ; i < liste.size() ; i++)
{
Train unTrain = liste.get(i); // obtient le train à la position i
System.out.println( unTrain.toString() ); // affiche une description du train
}

//1)c.
for (int i = 0 ; i < liste.size() ; i++)
{
Train unTrain = liste.get(i); // obtient le train à la position i
System.out.println( "le train n°" + i + " roule a " + unTrain.toStringVit() ); // affiche une description du train
}

//1)d.
int marche = 0; 
int arret = 0;
for (int i = 0 ; i < liste.size() ; i++)
{
Train unTrain = liste.get(i); // obtient le train à la position i
System.out.println( "le train n°" + i + " roule a " + unTrain.toStringEtat() );// affiche une description du train
if (unTrain.enMarche == false){
    arret++;
}
else {
    marche++;
}
}
System.out.println("Il y a " + marche + " trains en marche."  );
System.out.println("Il y a " + arret + " trains a l'arret."  );



}

}
