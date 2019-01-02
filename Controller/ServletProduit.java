package Controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.ProduitMetier;

public class ServletProduit extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String idp = request.getParameter("idProduit") ; 
        String libelle = request.getParameter("libelleProduit") ; 
        String categorie = request.getParameter("categorieproduit"); 
        String message ; 
        int id = Integer.parseInt(idp); 
        
        if ( idp.isEmpty() || libelle.isEmpty() ) 
        {
	message = " erreur" ; 
	}
        else 
        {
            message = " Produit ajouter avec succes " ; 
        }
        
        

      //Produit prod = new Produit(id, libelle) ; 
        ProduitMetier model = new ProduitMetier(); 
        model.getProduit().setIdproduit(id);
        model.getProduit().setLibelleproduit(libelle);
        model.getProduit().setCategorie(categorie); 
        model.Ajouter();
        
        request.setAttribute("produit", model.getProduit());
        request.setAttribute("produits", model.getAll());
        request.setAttribute("msg", message);
        
        
        
   this.getServletContext().getRequestDispatcher("/afficherProduit.jsp").forward(request, response);     
    }

    

}
