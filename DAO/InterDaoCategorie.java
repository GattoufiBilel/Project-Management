package DAO;

import java.util.ArrayList;

public interface InterDaoCategorie<Object> {
    public Boolean ajouter(Object o); 
    public Boolean modifier(Object o) ; 
    public Boolean supprimer(Object o) ; 
    public ArrayList<Object> getAll() ; 
    
}
