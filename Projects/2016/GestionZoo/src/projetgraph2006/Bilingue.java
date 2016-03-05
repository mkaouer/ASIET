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
  public Bilingue(String Nom, String Catégorie, String Origine, String RégimeAli,
                String Vitesse, String DuréeIncub, String Longévité) {
    Francais =new Animal(Nom, Catégorie, Origine, RégimeAli, Vitesse, DuréeIncub, Longévité);
    Anglais=new Animal(Nom, Catégorie, Origine, RégimeAli, Vitesse, DuréeIncub, Longévité);
  }

}
