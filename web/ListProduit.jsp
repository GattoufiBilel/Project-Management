<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="Beans.Produit"%>
<%@page import="Beans.Produit"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Liste de tous nos PRODUITS</title>
    </head>
    <body>
        <div class="container-fluid">
              <h1>Gestion de produit</h1>
        </div>
        <div class="container">
        <h2>Liste produits : </h2>
        <br>
        <table border="1">
            <thead> 
            <th> ID produit </th>
            <th> Libelle Produit </th>
            <th>Categorie Produit </th>
            </thead>
            <tbody>
         <%
        
        if(request.getAttribute("prod") != null) 
        {
            ArrayList<Produit> listeproduit = (ArrayList<Produit>)request.getAttribute("prod");
            //parcouru la liste et affiche 
              for (Produit p : listeproduit) 
                { 
         %>
           <tr> 
           <td> 
               <%= p.getIdproduit()  %> 
           </td>
           <td> 
               <%= p.getLibelleproduit() %> 
           </td>
           <td> 
               <%= p.getCategorie() %> 
           </td>
           </tr>
             <%
                }  
            }
            else  { out.println("the list is vide ") ; }
             %>
            </tbody>
            
            <tfoot>
            <div class="footer">
            <th>
                 <a href="index.html" > Page D'acceuil </a>                  
            </th>
            <th>
                 <a href="ProduitControler" >ajouter autre </a> 
            </th>
            </div> 
            </tfoot>
            
        </table>
            
     </div>      
        
        
        
    </body>
</html>
