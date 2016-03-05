package projetgraph2006;

import java.io.Serializable;

class Arête
    implements Serializable {

  protected String nom;
  protected Noeud début;
  protected Noeud fin;

  public Arête(Noeud début, Noeud fin,String Nom) {
    this.début = début;
    this.fin = fin;
    this.nom = Nom;

  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Noeud getdébut() {
    return début;
  }

  public Noeud getfin() {
    return fin;
  }
}
