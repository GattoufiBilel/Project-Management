package Controller;
import Beans.Categorie;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.ModelCategorie; 
import java.util.ArrayList;


@WebServlet(name = "ListCategorie", urlPatterns = {"/ListCategorie"})
public class ListCategorie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ModelCategorie model = new ModelCategorie(); 
        ArrayList<Categorie> list = model.getAll(); 
        
        request.setAttribute("catg", list);
        
        request.getRequestDispatcher("/ListCategorie.jsp").forward(request, response);
        
        
       
    }

    
}
