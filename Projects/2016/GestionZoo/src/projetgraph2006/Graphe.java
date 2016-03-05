package projetgraph2006;

import java.util.*;
import java.io.*;

public class Graphe
    implements Serializable {
  public boolean modifi� = false;
  public short nombreNoeudMax = 1;
  protected List noeuds = new LinkedList();
  protected List ar�tes = new LinkedList();

  public Graphe() {
  }

  public Noeud getNoeud(String nom) {
    for (Iterator itr = noeuds.iterator(); itr.hasNext(); ) {
      Noeud n = (Noeud) itr.next();
      if (n.Nom.equals(nom)) {
        return n;
      }
    }
    return null;
  }

  public void addNoeud(Noeud noeud) {
    ++nombreNoeudMax;
    noeuds.add(noeud);
  }

  public void removeNoeud(String nom) {

    for (Iterator itr = noeuds.iterator(); itr.hasNext(); ) {
      Noeud n = (Noeud) itr.next();
      if (n.Nom.equals(nom)) {
        noeuds.remove(n);
        for (Iterator itr1 = n.p�res.iterator(); itr1.hasNext(); ) {
          Noeud n1 = (Noeud) itr1.next();
          n1.removeFils(n);
          removeArr�te(n1, n);
        }
        for (Iterator itr1 = n.fils.iterator(); itr1.hasNext(); ) {
          Noeud n1 = (Noeud) itr1.next();
          n1.removeP�re(n);
          removeArr�te(n, n1);
        }
        return;
      }
    }
  }

  public void getAscendant(Noeud n, LinkedList list) {

// Noeud n=getNoeud(Nom);
    if (n.p�res!=null){
    for (Iterator itr = n.p�res.iterator(); itr.hasNext(); ) {
      Noeud pere = (Noeud) itr.next();
      if (!list.contains( (Noeud) pere)) {
        list.add(pere);


      if (pere.p�res != null) {
       getAscendant(pere,list);
      } }

    }
   // return null;
  }
  }
  public void getDescendant(Noeud n, LinkedList list) {

// Noeud n=getNoeud(Nom);
   if (n.fils!=null){
   for (Iterator itr = n.fils.iterator(); itr.hasNext(); ) {
     Noeud fils = (Noeud) itr.next();
     if (!list.contains( (Noeud) fils)) {
       list.add(fils);


     if (fils.fils != null) {
      getDescendant(fils,list);
     } }

   }
  // return null;
 }
 }

  public void addAr�te(Ar�te ar�te) {
    ar�tes.add(ar�te);
  }

  public void addArr�te(Noeud n1, Noeud n2,String Nom) {
    if (!n1.fils.contains(n2)) {
      n1.addFils(n2);
    }
    if (!n2.p�res.contains(n1)) {
      n2.addP�re(n1);
    }

    ar�tes.add(new Ar�te(n1, n2,Nom));
  }

  public void removeArr�te(Noeud n1, Noeud n2) {

    for (int i = 0; i < ar�tes.size(); i++) {
      Ar�te a = (Ar�te) ar�tes.get(i);
      if (a.d�but == n1 && a.fin == n2) {
        ar�tes.remove(a);
      }
    }
  }

  public boolean contains(String nom) {
    for (Iterator itr = noeuds.iterator(); itr.hasNext(); ) {
      Noeud n = (Noeud) itr.next();
      if (n.getNom().equals(nom)) {
        return true;
      }
    }
    return false;
  }
}
