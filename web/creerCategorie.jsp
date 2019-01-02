<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Creer Categorie </title>
        <!-- Bootsrap -->
        <link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css" >
    <!--  bootstrap js vs 3.3.7-->
    <script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>  
        
    </head>
    <body>
        <div class="container-fluid">
        <h1>Ajout Categories </h1>
        </div>
        <br> 
        <div class="container"> 
            <form method="get" action="ServletCategorie">
            <fieldset>  
                <legend> Information Categorie </legend>
             <div class="form-group">
                <label for="codeCategorie">Code CATEGORIE : <span class="requis">*</span></label>
                <input type="text" id="codecategorie" name="codecategorie" value="" size="20" maxlength="20" class="form-control">
             </div>
            <div class="form-group">
                <label for="Designation"> Disignation : <span class="requis">*</span></label>
                <input type="text" id="designation" name="disignation" value="" size="20" maxlength="20" class="form-control">
            </div>
            </fieldset>
            <fieldset>
                <legend> Boite Commande </legend>
              <div class="form-group">
                <input type="submit" value="Valider" class="btn btn-block" class="form-control"/>
                <br>
                <input type="reset" value="reset" class="btn btn-warning" class="form-control"/>
              </div>
                
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
