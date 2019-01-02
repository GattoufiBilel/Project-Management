package Beans;

public class Produit {
    private int idproduit ; 
    private String libelleproduit ; 
    private String categorie ; 

    public Produit(int idproduit , String libelle) {
        this.idproduit=idproduit ; 
        this.libelleproduit=libelle ; 
    }
    
    public Produit (int idproduit , String libelle , String categorie ) {
        this.idproduit=idproduit; 
        this.libelleproduit=libelle ; 
        this.categorie=categorie; 
    }

    public Produit() {
    }

    public int getIdproduit() {
        return idproduit;
    }

    public void setIdproduit(int idproduit) {
        this.idproduit = idproduit;
    }

    public String getLibelleproduit() {
        return libelleproduit;
    }

    public void setLibelleproduit(String libelleproduit) {
        this.libelleproduit = libelleproduit;
    }
    
    public String getCategorie() {
        return categorie ; 
    }
    
    public void setCategorie(String categorie) {
        this.categorie=categorie  ; 
    }


    
    
    
}
