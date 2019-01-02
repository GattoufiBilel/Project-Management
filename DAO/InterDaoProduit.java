
package DAO;

import java.util.ArrayList;

public interface InterDaoProduit<Object> {
    public boolean ajouter(Object o) ;
    public ArrayList<Object> getAll();
    public void CloseConnexion();
}


