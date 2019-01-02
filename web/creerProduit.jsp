<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="Beans.Categorie"%>
<%@page import="Controller.ServletCategorie"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" >
        <title>Creation Produit</title>
    </head>
    <body>
        <div class="container-fluid">
            <h2> Ajout Produit </h2>
        </div>
        <div class="container">
            
            <form method="get" action="ServletProduit">
                <fieldset>
                <legend>Informations Produit</legend>
                <div class="form-group">
                    <label for="idProduit">Id Produit <span class="requis">*</span></label>
                    <input class="form-control"  type="text" id="idProduit" name="idProduit" value="" size="20" maxlength="20"/>
                </div>
                <div class="form-group">   
                    <label for="LibelleProduit">Libelle Produit </label>
                    <input class="form-control" type="text" id="libelleProduit" name="libelleProduit" value="" size="20" maxlength="20" "/>
                </div>
               
                <div class="form-group">
                  
                  <label for="categorieproduit">Select Categorie list:</label>
                  <select class="form-control" id="categorieproduit" name="categorieproduit">  
                       <option selected="">choisie une categorie </option>
                    <% if(request.getAttribute("categorie") != null) {
                        ArrayList<Categorie> list = (ArrayList<Categorie>)request.getAttribute("categorie");
                        for(Categorie c : list) {%>       
                        <option value="<%= c.getDesignation()%>"><%= c.getDesignation() %></option>
                        
                           <%} 
                    }%>
                      
                 
                  </select>                        
                </div>
                </fieldset>
                <fieldset>
                    <legend> Boite Commande </legend>
                <input type="submit" value="Valider" class="btn btn-group-justified"/>
                <br>
                <input type="reset" value="Remettre à zéro" class="btn btn-group-justified"/> <br />
                </fieldset>
            </form>
        </div>
        <footer class="container">         
        <div class="footer" class="container">
            <h3><a href="index.html" > Page D'acceuil </a> </h3>
        </div>
        </footer>
    </body>
</html>