package projetgraph2006;

import java.util.*;
import javax.swing.*;
import java.io.Serializable;

class Noeud
    extends JTextField
    implements Serializable {

 // protected Animal animal = new Animal();
 protected String Nom ;
  protected List fils = new LinkedList();
  protected List p�res = new LinkedList();

  public Noeud(String nom) {

    this.Nom = nom;
  }

  public String getNom() {
    return Nom;
  }

  public void addFils(Noeud fils) {
    this.fils.add(fils);
  }

  public void removeFils(Noeud fils) {
    this.fils.remove(fils);
  }

  public void addP�re(Noeud p�re) {
    this.p�res.add(p�re);
  }

  public void removeP�re(Noeud p�re) {

    this.p�res.remove(p�re);
  }

  public boolean isPeres(Noeud noeud) {
    boolean trouve = false;
    Noeud pere;
    Iterator itr = p�res.iterator();
    while ( (itr.hasNext()) && (!trouve)) {
      pere = (Noeud) itr.next();
      trouve = pere.equals(noeud);
    }

    return trouve;
  }

  public boolean isFils(Noeud noeud) {
    boolean trouve = false;
    Noeud fils;
    Iterator itr = this.fils.iterator();
    while ( (itr.hasNext()) && (!trouve)) {
      fils = (Noeud) itr.next();
      trouve = fils.equals(noeud);
    }

    return trouve;
  }
}
