package projetgraph2006;

import java.util.*;
import java.io.*;

public class Bilingue implements Serializable {
  Animal Francais;
  Animal Anglais;
  public Bilingue() {
    Francais =new Animal();
    Anglais=new Animal();
  }
  public Bilingue(String Nom, String Cat�gorie, String Origine, String R�gimeAli,
                String Vitesse, String Dur�eIncub, String Long�vit�) {
    Francais =new Animal(Nom, Cat�gorie, Origine, R�gimeAli, Vitesse, Dur�eIncub, Long�vit�);
    Anglais=new Animal(Nom, Cat�gorie, Origine, R�gimeAli, Vitesse, Dur�eIncub, Long�vit�);
  }

}
