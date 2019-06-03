import java.io.*;
import java.util.*;

public class Dessin extends java.util.ArrayList<Figure>{
  
  private String nom;

  //Le Constructeur :
  public Dessin(String nom){
    this.nom = nom;
  }

  //L'Acesseur :
  public String get_nom(){
    return this.nom;
  }

  //Le Mutateur :
  public void set_nom(String nom){
    this.nom = nom;
  }
}//fin de la class 