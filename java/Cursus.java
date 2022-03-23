


import java.util.*;

public class Cursus {
 private HashMap<String, Etudiant> listeClassee;
 public Cursus()   {
	listeClassee = new HashMap<String, Etudiant> ();		
 }
  public String creerUneCle(Etudiant e) {
  	 String tmp;
  	 tmp = (e.quelPrenom()).charAt(0)+ e.quelNom();
  	 tmp.toUpperCase();
  	 return tmp;
  }
  public String creerUneCle(String p, String n ) {
  	 String tmp;
  	 tmp = p.charAt(0)+ n;
  	 tmp.toUpperCase();
  	 return tmp;
  }	
  public void ajouteUnEtudiant() {
	 Etudiant e = new Etudiant();
 	 String cle = creerUneCle(e);	
 	 Etudiant nouveau = (Etudiant) listeClassee.get(cle);
 	 if (nouveau == null) listeClassee.put(cle, e);
  }	
  public void rechercheUnEtudiant(String p, String n) {
 	 String cle = creerUneCle(p, n);
 	 Etudiant e = (Etudiant) listeClassee.get(cle);
 	 if (e != null)  	e.afficheUnEtudiant();
   else System.out.println(p + " " + n + " est inconnu ! ");
  }
 	public void supprimeUnEtudiant(String p, String n) {
	  	String cle = creerUneCle(p, n);
    	Etudiant e = (Etudiant) listeClassee.get(cle);
 	  if (e != null)  {
 	   	listeClassee.remove(cle);
 	  	  	System.out.println(p + " " + n + " a ete supprime ");
 	  } 
 	  else System.out.println(p + " " + n + " est inconnu ! ");
  }
  public void afficheLesEtudiants() 	{
	if(listeClassee.size() != 0)
	{
           Collection<Etudiant> c = listeClassee.values();
 
           for (  Etudiant e : c) {
  		  e.afficheUnEtudiant(); 	
        }
	}
	else System.out.println("Il n'y a pas d'etudiant dans cette liste");
 }
}