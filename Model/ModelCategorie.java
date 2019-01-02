package Model;
import DAO.CategorieDao; 
import Beans.Categorie; 
import java.util.ArrayList; 



public class ModelCategorie {
    private final CategorieDao dao ; 
    private Categorie categorie ; 
    
    public ModelCategorie () {
       
        dao = new CategorieDao()  ;
        categorie = new Categorie(); 
    }
    
    public Categorie getCategorie(){ 
        return categorie ;
    }
  
    public void setCategorie (Categorie categorie)  {
        this.categorie=categorie ; 
    }
    
    public void Ajouter() {
        dao.ajouter(categorie) ; }
    
    public ArrayList<Categorie> getAll()
    {
       return dao.getAll(); 
    }
    
}
