package Beans;

public class Categorie {
    private int codecategorie ; 
    private String designation ; 

    public Categorie() {
    }
    

    public Categorie(int codecategorie, String designation) {
        this.codecategorie = codecategorie;
        this.designation = designation;
    }

    

    

    public int getCodecategorie() {
        return codecategorie;
    }

    public void setCodecategorie(int codecategorie) {
        this.codecategorie = codecategorie;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    
}
