package projetgraph2006;

import java.util.*;
import java.io.*;

public class Graphe
    implements Serializable {
  public boolean modifié = false;
  public short nombreNoeudMax = 1;
  protected List noeuds = new LinkedList();
  protected List arêtes = new LinkedList();

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
        for (Iterator itr1 = n.pères.iterator(); itr1.hasNext(); ) {
          Noeud n1 = (Noeud) itr1.next();
          n1.removeFils(n);
          removeArrête(n1, n);
        }
        for (Iterator itr1 = n.fils.iterator(); itr1.hasNext(); ) {
          Noeud n1 = (Noeud) itr1.next();
          n1.removePère(n);
          removeArrête(n, n1);
        }
        return;
      }
    }
  }

  public void getAscendant(Noeud n, LinkedList list) {

// Noeud n=getNoeud(Nom);
    if (n.pères!=null){
    for (Iterator itr = n.pères.iterator(); itr.hasNext(); ) {
      Noeud pere = (Noeud) itr.next();
      if (!list.contains( (Noeud) pere)) {
        list.add(pere);


      if (pere.pères != null) {
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

  public void addArête(Arête arête) {
    arêtes.add(arête);
  }

  public void addArrête(Noeud n1, Noeud n2,String Nom) {
    if (!n1.fils.contains(n2)) {
      n1.addFils(n2);
    }
    if (!n2.pères.contains(n1)) {
      n2.addPère(n1);
    }

    arêtes.add(new Arête(n1, n2,Nom));
  }

  public void removeArrête(Noeud n1, Noeud n2) {

    for (int i = 0; i < arêtes.size(); i++) {
      Arête a = (Arête) arêtes.get(i);
      if (a.début == n1 && a.fin == n2) {
        arêtes.remove(a);
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
