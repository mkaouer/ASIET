package projetgraph2006;

import java.io.*;

public class Animal implements Serializable{
  String Nom, Cat�gorie, Origine, R�gimeAli, Vitesse, Dur�eIncub, Long�vit�;
  public Animal() {


  }

  public Animal(String Nom, String Cat�gorie, String Origine, String R�gimeAli,
                String Vitesse, String Dur�eIncub, String Long�vit�) {
    this.Nom = Nom;
    this.Cat�gorie = Cat�gorie;
    this.Origine = Origine;
    this.R�gimeAli = R�gimeAli;
    this.Vitesse = Vitesse;
    this.Dur�eIncub = Dur�eIncub;
    this.Long�vit� = Long�vit�;

  }

  public String getNom() {
    return Nom;
  }
}
