package DAO;
import Beans.Categorie;
import java.sql.Connection; 
import utilitaire.SingletonConnection; 
import Beans.Produit ; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProduitDao implements InterDaoProduit<Produit>   {
    private static Connection conn;
    private PreparedStatement stmt;
    
    public ProduitDao() 
    {
        conn = SingletonConnection.getConn();
    }

    @Override
    public boolean ajouter(Produit o) {
       
       
        String req = " INSERT INTO PRODUIT (idproduit , libelleproduit , categorie) VALUES (? , ? , ?) " ; 
        try 
        {
            stmt = conn.prepareStatement(req);
            stmt.setInt(1 , o.getIdproduit());
            stmt.setString(2, o.getLibelleproduit());
            stmt.setString(3, o.getCategorie()) ; 
            
            stmt.executeUpdate();
            
            return true;
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        return false;
    }
        
    @Override
    public ArrayList<Produit> getAll() 
    {
        String query = "SELECT * FROM `Produit`Order by idproduit asc  " ; 
        ArrayList<Produit> listproduit = new ArrayList();
        try 
        {
            stmt = conn.prepareStatement(query);
            ResultSet result = stmt.executeQuery();
            
            while(result.next()) 
            {
                Produit produit;
                produit = new Produit
                        (
                                result.getInt(1),
                                result.getString(2),
                                result.getString(3)
                        );
                
                listproduit.add(produit);
            }
            
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage() + "--");
        }
        
        return listproduit;
    }
    

    @Override
    public void CloseConnexion() {
        try 
        {
            stmt.close();
            conn.close();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(ProduitDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    

   
    
    
}
