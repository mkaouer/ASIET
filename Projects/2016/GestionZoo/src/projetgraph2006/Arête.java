package projetgraph2006;

import java.io.Serializable;

class Ar�te
    implements Serializable {

  protected String nom;
  protected Noeud d�but;
  protected Noeud fin;

  public Ar�te(Noeud d�but, Noeud fin,String Nom) {
    this.d�but = d�but;
    this.fin = fin;
    this.nom = Nom;

  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Noeud getd�but() {
    return d�but;
  }

  public Noeud getfin() {
    return fin;
  }
}
