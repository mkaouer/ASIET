package projetgraph2006;

import java.util.*;
import java.io.*;

public class Multilingue implements Serializable {
  protected Graphe graphe;
  protected Hashtable dico;

  public Multilingue() {
    graphe=new Graphe();
    dico=new Hashtable();

  }
  public void removeAnimal(String nom) {

 FentrePrincipale.graphe.graphe.removeNoeud(nom);
 FentrePrincipale.graphe.dico.remove(nom);
       return;
     }



}
