package DAO;

import java.sql.Connection; 
import utilitaire.SingletonConnection; 
import Beans.Categorie; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList; 


public class CategorieDao implements InterDaoCategorie<Categorie> {
    private static Connection conn ; 
    private PreparedStatement stmt ; 
    
    public CategorieDao() {
        conn = SingletonConnection.getConn(); 
    }
        
   
    @Override
    public Boolean ajouter(Categorie o) {
    
       String req = " insert into categorie (codecategorie , designation ) values (? , ? )  " ; 
       
       try {
           stmt = conn.prepareStatement(req) ; 
           stmt.setInt(1 , o.getCodecategorie()); 
           stmt.setString(2, o.getDesignation()); 
           
           stmt.executeUpdate();
           return true ; 
       }
       catch (SQLException e) {
           System.out.println(e.getMessage()); 
       }
       return false ; 
    }

   
    @Override
    public ArrayList<Categorie> getAll() 
    {
        String req ="SELECT * FROM categorie Order by codecategorie asc ";
         ArrayList<Categorie> listcategorie = new ArrayList();
        try 
        {
            stmt = conn.prepareStatement(req);
            ResultSet result = stmt.executeQuery();
            
            while(result.next()) 
            {
                Categorie categorie = new Categorie
                (
                    result.getInt(1),
                    result.getString(2)
                ); 
                
                listcategorie.add(categorie);
            }
            
        } 
        catch (SQLException e) 
        {
            throw new RuntimeException("no list categorie found " , e);
        }
        
        return listcategorie;
    }

    @Override
    public Boolean modifier(Categorie o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean supprimer(Categorie o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    }


    
   
    
    

