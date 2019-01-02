<%@page import="Beans.Produit"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css"
    </head>
    <body>  
     <div class="container-fluid"> 
         <h3> <i> ${msg} </i> </p> 
         <br>
        <h3> Nouveau Produit  Ajouter <br>
            Id : ${produit.idproduit} <br>
            Libelle : ${produit.libelleproduit} <br>
        </h3>
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
        // declarer tableau de type List<Produit> 
        // remplir le tableau par le resultat introduit par request 
        List<Produit> listeproduit = (List<Produit>) request.getAttribute("produits");
            if(listeproduit.size()< 0 ) 
             
                { out.println("the liste is vide"); }
            else { 
            //parcouru la liste et affiche 
              for (Produit p : listeproduit) 
                { 
            %>
           <tr> 
           <td> 
               <% out.println(p.getIdproduit());  %> 
           </td>
           <td> 
               <% out.println(p.getLibelleproduit()); %> 
           </td>
           <td> 
               <% out.println(p.getCategorie()); %> 
           </td>
           </tr>
             <%
                }  
            }
               
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
