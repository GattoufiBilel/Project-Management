<%@page import="java.util.ArrayList"%>
<%@page import="Beans.Categorie"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
        <title>Liste de tous les Categories </title>
    </head>
    <body>
        <div class="container-fluid">
             <h1>Gestion de produit</h1>
        </div>
        <div class="container"> 
        <h1>Liste Categorie : </h1>
        <br>
    <table border="1">
        <thead>
            <th>Code Categorie </th>
            <th>Disignation </th>
        </thead>
        <tbody>
            <% 
               if (request.getAttribute("catg") != null ) 
                {
                  ArrayList<Categorie> listecategorie = (ArrayList<Categorie>)request.getAttribute("catg");
                     for (Categorie c : listecategorie) 
                         { 
            %>
                             <tr>
                                 <td>
                                    <%= c.getCodecategorie() %> 
                                  </trd>
                                  <td>
                                     <%= c.getDesignation() %> 
                                  </td>
                      <%
                         }
                     }
                                else  { out.println("list vide ") ;    }                       

                      %>
        </tbody>    
        <tfoot>
            <div class="footer">
                 <th> 
                     <a href="index.html" > Page D'acceuil </a> 
                 </th>
                 <th>
                      <a href="creerCategorie.jsp" >ajouter autre </a>
                 </th>
             </div>  
        </tfoot>
    </div>  
        
</tbale>
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    </body>
</html>
