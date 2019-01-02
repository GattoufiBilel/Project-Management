<%@page import="Beans.Categorie"%>
<%@page import="java.util.List"%>
<%@ page isELIgnored ="false" %> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" >
                    <!--  bootstrap js vs 3.3.7-->
        <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
        <title> Liste Categorie </title>
    </head>
    <body>
        <div class="container-fluid">
          <p> <i>Notif  :  ${msg}  </i></p> 
          <h3> Nouveau Categorie ajouter </h3>
            Code Categorie :  ${categorie.codecategorie}
            <br>
            Designation : ${categorie.designation}
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
                List<Categorie> listecategorie = (List<Categorie>) request.getAttribute("categories") ; 
                     if (listecategorie.size() > 0 ) 
                     {
                        for (Categorie c : listecategorie) 
                           {
                             %> 
                               <tr>
                                 <td>
                                    <% out.println(c.getCodecategorie()); %> 
                                  </trd>
                                  <td>
                                     <% out.println(c.getDesignation()) ; %> 
                                  </td>
                       
                            <%
                             }    
                         }
                            else { out.println("the liste is vide") ; }
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

