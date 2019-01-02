package Controller;

import Beans.Categorie;
import Model.ModelCategorie;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ProduitControler", urlPatterns = {"/ProduitControler"})
public class ProduitControler extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ModelCategorie model = new ModelCategorie();
        ArrayList<Categorie> list = model.getAll();
        request.setAttribute("categorie", list);
        
        request.getRequestDispatcher("/creerProduit.jsp").forward(request, response);
    }
    

}
