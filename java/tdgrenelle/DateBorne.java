/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdgrenelle;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class DateBorne {
   private int annee;
   private int mois;
   private int jour;
   
  public DateBorne(int a, int m, int j){
      this.annee=a;
      this.mois=m;
      this.jour=j;
  } 
   

  
   public static DateBorne aujourdhui(){	

    int jour, mois, annee;
    Calendar calendar = new GregorianCalendar();
    Date dateJour = new Date();
    calendar.setTime(dateJour);
    annee = calendar.get(Calendar.YEAR);
    mois = calendar.get(Calendar.MONTH)+1;
    jour=  calendar.get(Calendar.DAY_OF_MONTH);
    
  
    DateBorne d = new DateBorne(annee, mois, jour);
     
    return d; 
   }
   
   public int annee(){
       return annee;
   }
      public int mois(){
       return mois;
   }
      public int jour(){
       return jour;
   }
      
      public void afficheDate(){
          System.out.println(this.annee + "/" + this.mois + "/" + this.jour);
      }
      
      
   /* renvoie le nombre de jours de différence entre l'objet Date courant et le paramètre uneDate
  	 si l’objet Date courant correspond à une date postérieure au paramètre uneDate, 
  	 le nombre de jours retourné est positif. 
  	 Dans le cas contraire, le nombre de jours retourné est négatif.*/

      
     public long difference(DateBorne uneDate){
         long CONST_DURATION_OF_DAY = 1000l * 60 * 60 * 24;

        // Construction de la date placée en paramètre 
        Calendar calendar1 = new GregorianCalendar();
        calendar1.set(Calendar.YEAR, uneDate.annee());
        calendar1.set(Calendar.MONTH, uneDate.mois());
        calendar1.set(Calendar.DAY_OF_MONTH, uneDate.jour());
        Date date1 = calendar1.getTime();
        
     
        // construction de l'objet Date courant
        Calendar calendar2 = new GregorianCalendar();
        calendar2.set(Calendar.YEAR, annee);
        calendar2.set(Calendar.MONTH, mois);
        calendar2.set(Calendar.DAY_OF_MONTH, jour);
        Date date2 = calendar2.getTime();
        
        // Formule permettant de calculer la différence entre les deux dates
	
        long diff =  date2.getTime()-date1.getTime() ;
        long numberOfDay = (long)diff/CONST_DURATION_OF_DAY;
        
        return numberOfDay;
     }    
   
}
