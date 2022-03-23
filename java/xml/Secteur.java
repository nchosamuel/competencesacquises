/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;

import java.util.ArrayList;

/**
 *
 * @author JV
 */
public class Secteur {
    private int numSecteur ;
	private String nomSecteur ; // nom du quartier
	private boolean espaceVert; // Indique la présence ou non dans le quartier dâ€™un espace vert municipal Ã  arroser

	private Commune laCommune ; 
	//private ArrayList<Branchement> lesBranchements;
        
		
        // constructeur
        public Secteur(int unNumeroSecteur , String unNomSecteur , boolean unEspaceVert ,Commune uneCommune ){
            this.numSecteur=unNumeroSecteur;
            this.nomSecteur = unNomSecteur; 
            this.espaceVert=unEspaceVert;
            this.laCommune=uneCommune;
            //lesBranchements= new ArrayList<Branchement>();
         }
        
	public int getNumSecteur(){
            return this.numSecteur;
        }
	public String getNomSecteur() {
            return this.nomSecteur;
        }
	public boolean getEspaceVert() {
            return this.espaceVert;
        }
	public ArrayList<Branchement> getLesBranchements() {
        return this.lesBranchements;
    }      
              
               
}
