package projetgraph2006;

import java.io.*;

public class Animal implements Serializable{
  String Nom, Catégorie, Origine, RégimeAli, Vitesse, DuréeIncub, Longévité;
  public Animal() {


  }

  public Animal(String Nom, String Catégorie, String Origine, String RégimeAli,
                String Vitesse, String DuréeIncub, String Longévité) {
    this.Nom = Nom;
    this.Catégorie = Catégorie;
    this.Origine = Origine;
    this.RégimeAli = RégimeAli;
    this.Vitesse = Vitesse;
    this.DuréeIncub = DuréeIncub;
    this.Longévité = Longévité;

  }

  public String getNom() {
    return Nom;
  }
}
