

package tdgrenelle;
import java.util.ArrayList;

/**
 *
 * @author lastreet'zer
 */
public class Station {

    private int idStation;
    private String libelleEmplacement;
    private ArrayList<Borne> lesBornes;
    
       
        public int getId(){
            return idStation;
        }
        
        public String getLibelleEmplacement() {
            return libelleEmplacement;
        }
        
        public void setLibelleEmplacement(String lib){
            this.libelleEmplacement = lib;
        }
        
        public void ajoutBorne(Borne uneBorne) {
            
        }
        
        public Visite getVisiteAFaire(){
            Visite uneVisite;
            ArrayList<Borne> lesBornesAVisiter = new ArrayList<Borne>();
            for (Borne uneBorne : lesBornes) {
                if (uneBorne.estAReviser(){
                    lesBornesAVisiter.add(uneBorne);
                }
            }
            if (!lesBornesAVisiter.isEmpty()){
                uneVisite = new Visite (lesBornesAVisiter, this);
            }
            else { 
                uneVisite = null;
            }
        }
        
}
    

