package Controller;

import Model.ModelCategorie;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCategorie extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String  codecat = request.getParameter("codecategorie"); 
        String designation = request.getParameter("disignation"); 
        
        String m  ; 

        if ( designation.trim().isEmpty() ) 
        {
            m = " erreur existe des champs vide  <a href=\"creerCategorie\" /> "   ;  
        }
        else 
        {
             m = " Categorie Ajouter avec success " ;
        }
        
        Integer codecategorie = Integer.parseInt(codecat); 
        
        //enregistrement catgerorie 
        
        ModelCategorie model = new ModelCategorie() ;
        model.getCategorie().setCodecategorie(codecategorie);
        model.getCategorie().setDesignation(designation);
        model.Ajouter();
        request.setAttribute("categories", model.getAll());
        request.setAttribute("categorie", model.getCategorie());
        request.setAttribute("msg", m);
        
        
        
        this.getServletContext().getRequestDispatcher("/afficheCategorie.jsp").forward(request, response);     
    }
    
}
