package Model;
import DAO.ProduitDao ; 
import Beans.Produit; 
import java.util.ArrayList;


public class ProduitMetier {
    
    private final ProduitDao dao ;  
    private Produit produit ; 
    
    public ProduitMetier () {
        dao = new ProduitDao() ; 
        produit = new Produit(); 
    }
    
    public Produit getProduit(){
        return produit ; 
    }
    
    public void setProduit(Produit produit) {
        this.produit=produit; 
    }
    
    
    public void Ajouter()
        { dao.ajouter(produit); }
    
    /**
     *
     * @return
     */
    public ArrayList<Produit> getAll()
    {
        return dao.getAll();
    }
     
    
 
}
