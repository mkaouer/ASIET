package projetgraph2006;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.*;

public class SaisieInfo
    extends JDialog {
  JPanel jPanel1 = new JPanel();
  Border border1;
  JLabel jLblIdentificateur = new JLabel();
  JTextField jTxtFIdentificateur = new JTextField();
  JPanel jPanel2 = new JPanel();
  Border border2;
  TitledBorder titledBorder1;
  JLabel jLblOrigine = new JLabel();
  JLabel jLblRégimeAlimentaire = new JLabel();
  JLabel jLblCatégorie = new JLabel();
  JLabel jLblVitesse = new JLabel();
  JComboBox jCmbxCatégorie = new JComboBox();
  JComboBox jCmbxOrigine = new JComboBox();
  JComboBox jCmbxRégimeAlimentaire = new JComboBox();
  JTextField jTxtFVitesse = new JTextField();
  JLabel jLblDurée = new JLabel();
  JTextField jTxFNom2 = new JTextField();
  JTextField jTxtFDurée = new JTextField();
  JLabel jLblLongévité = new JLabel();
  JTextField jTxtFLongévité = new JTextField();
  JPanel jPanel3 = new JPanel();
  JButton jBtnValider = new JButton();
  JButton jBtnFermer = new JButton();
  JComboBox jCmbxlangue = new JComboBox();
  ArrayList CatFr;
  ArrayList CatAn;
  ArrayList RégimFr;
  ArrayList RégimAn;
  ArrayList RégFr;
  ArrayList RégAn;
//Bilingue animal=new Bilingue();
  public SaisieInfo() {
    try {
      jbInit();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {
    border1 = new EtchedBorder(EtchedBorder.RAISED, Color.white,
                               new Color(178, 178, 178));
    border2 = new EtchedBorder(EtchedBorder.RAISED, Color.white,
                               new Color(148, 145, 140));
    titledBorder1 = new TitledBorder(BorderFactory.createBevelBorder(
        BevelBorder.LOWERED, Color.white, new Color(182, 182, 182),
        new Color(62, 62, 62), new Color(89, 89, 89)), "Informations");
    this.getContentPane().setBackground(new Color(192, 192, 203));
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    //this.setState(Frame.NORMAL);
    this.setTitle("Informations sur le Noeud");
    this.getContentPane().setLayout(null);
    jPanel1.setBackground(Color.gray);
    jPanel1.setBorder(BorderFactory.createRaisedBevelBorder());
    jPanel1.setBounds(new Rectangle(7, 6, 361, 30));
    jPanel1.setLayout(null);
    jLblIdentificateur.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblIdentificateur.setText("Identificateur   :");
    jLblIdentificateur.setBounds(new Rectangle(13, 6, 94, 15));
    jTxtFIdentificateur.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFIdentificateur.setForeground(Color.blue);
    jTxtFIdentificateur.setEditable(false);
    jTxtFIdentificateur.setText("");
    jTxtFIdentificateur.setBounds(new Rectangle(110, 5, 117, 21));
    jPanel2.setBackground(Color.gray);
    jPanel2.setBorder(titledBorder1);
    jPanel2.setBounds(new Rectangle(9, 40, 359, 246));
    jPanel2.setLayout(null);
    jLblOrigine.setBounds(new Rectangle(10, 96, 126, 31));
    jLblOrigine.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblOrigine.setText("Origine                    :");
    jLblRégimeAlimentaire.setBounds(new Rectangle(10, 59, 126, 31));
    jLblRégimeAlimentaire.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblRégimeAlimentaire.setText("Régime Alimentaire :");
    jLblCatégorie.setBounds(new Rectangle(10, 22, 126, 31));
    jLblCatégorie.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblCatégorie.setText("Catégorie                 :");
    jLblVitesse.setBounds(new Rectangle(10, 169, 126, 31));
    jLblVitesse.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblVitesse.setText("Vitesse                    :");
    jCmbxCatégorie.setFont(new java.awt.Font("Dialog", 1, 11));
    jCmbxCatégorie.setBounds(new Rectangle(167, 28, 159, 24));
    jCmbxlangue.addItem("Français");
    jCmbxlangue.addItem("Anglais");
    jCmbxCatégorie.addItem("Mammifères");
    jCmbxCatégorie.addItem("Poissons");
    jCmbxCatégorie.addItem("Oiseaux");
    jCmbxCatégorie.addItem("Animaux Domestiques");
    jCmbxCatégorie.addItem("Amphibiens");
    jCmbxCatégorie.addItem("Animaux dits invertébrés");
    jCmbxCatégorie.addItem("Reptiles");
    jCmbxOrigine.setFont(new java.awt.Font("Dialog", 1, 11));
    jCmbxOrigine.setBounds(new Rectangle(167, 67, 159, 24));
    jCmbxRégimeAlimentaire.setFont(new java.awt.Font("Dialog", 1, 11));
    jCmbxRégimeAlimentaire.setBounds(new Rectangle(167, 107, 159, 24));
    jCmbxRégimeAlimentaire.addItem("Omnivore");
    jCmbxRégimeAlimentaire.addItem("Herbivore");
    jCmbxRégimeAlimentaire.addItem("Carnivore");
    jCmbxOrigine.addItem("Afrique");
    jCmbxOrigine.addItem("Asie");
    jCmbxOrigine.addItem("Amérique du Nord");
    jCmbxOrigine.addItem("Améique du Sud");
    jCmbxOrigine.addItem("Europe");
    jCmbxOrigine.addItem("Australie");
    jTxtFVitesse.setBounds(new Rectangle(167, 140, 157, 25));
    jTxtFVitesse.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFVitesse.setText("");
    jLblDurée.setBounds(new Rectangle(10, 132, 126, 31));
    jLblDurée.setText("Durée d\'incubation  :  ");
    jLblDurée.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblDurée.setRequestFocusEnabled(true);
    jTxtFDurée.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFDurée.setText("");
    jTxtFDurée.setBounds(new Rectangle(166, 175, 157, 25));
    jLblLongévité.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblLongévité.setRequestFocusEnabled(true);
    jLblLongévité.setText("Longévité                :  ");
    jLblLongévité.setBounds(new Rectangle(10, 206, 126, 31));
    jTxtFLongévité.setBounds(new Rectangle(166, 208, 157, 25));
    jTxtFLongévité.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFLongévité.setText("");
    jPanel3.setBackground(Color.gray);
    jPanel3.setBorder(BorderFactory.createRaisedBevelBorder());
    jPanel3.setDebugGraphicsOptions(0);
    jPanel3.setBounds(new Rectangle(9, 290, 356, 34));
    jPanel3.setLayout(null);
    jBtnValider.setBounds(new Rectangle(21, 7, 103, 23));
    jBtnValider.setText("Valider");
    jBtnValider.addActionListener(new SaisieInfo_jBtnValider_actionAdapter(this));
    jBtnFermer.setText("Fermer");
    jBtnFermer.addActionListener(new SaisieInfo_jBtnFermer_actionAdapter(this));
    jBtnFermer.setBounds(new Rectangle(188, 4, 103, 23));
    jCmbxlangue.setBounds(new Rectangle(242, 6, 109, 19));
    jCmbxlangue.addMouseListener(new SaisieInfo_jCmbxlangue_mouseAdapter(this));
    jCmbxlangue.addActionListener(new SaisieInfo_jCmbxlangue_actionAdapter(this));
    jPanel1.add(jTxtFIdentificateur, null);
    jPanel1.add(jCmbxlangue, null);
    jPanel1.add(jLblIdentificateur, null);
    this.getContentPane().add(jPanel2, null);
    jPanel2.add(jLblCatégorie, null);
    jPanel2.add(jCmbxCatégorie, null);
    jPanel2.add(jLblOrigine, null);
    jPanel2.add(jLblRégimeAlimentaire, null);
    jPanel2.add(jLblVitesse, null);
    jPanel2.add(jCmbxOrigine, null);
    jPanel2.add(jCmbxRégimeAlimentaire, null);
    jPanel2.add(jTxtFVitesse, null);
    jPanel2.add(jLblDurée, null);
    jPanel2.add(jTxtFDurée, null);
    jPanel2.add(jLblLongévité, null);
    jPanel2.add(jTxtFLongévité, null);
    this.getContentPane().add(jPanel3, null);
    jPanel3.add(jBtnValider, null);
    jPanel3.add(jBtnFermer, null);
    this.getContentPane().add(jPanel1, null);
    CatFr = new ArrayList();
    CatAn = new ArrayList();
    RégimFr = new ArrayList();
    RégimAn = new ArrayList();
    RégFr = new ArrayList();
    RégAn = new ArrayList();
    CatFr.add("Mammifères");
    CatFr.add("Poissons");
    CatFr.add("Oiseaux");
    CatFr.add("Animaux Domestiques");
    CatFr.add("Amphibiens");
    CatFr.add("Animaux dits invertébrés");
    CatFr.add("Reptiles");
    CatAn.add("Mammalian");
    CatAn.add("Fish");
    CatAn.add("Bird");
    CatAn.add("Domestic Animal");
    CatAn.add("Amphibian");
    CatAn.add("Invertebrate Animal");
    CatAn.add("Reptile");
    RégimFr.add("Omnivore");
    RégimFr.add("Herbivore");
    RégimFr.add("Carnivore");
    RégimAn.add("Omnivorous");
    RégimAn.add("Herbivorous");
    RégimAn.add("Carnivorous");
    RégFr.add("Afrique");
    RégFr.add("Asie");
    RégFr.add("Amérique du Nord");
    RégFr.add("Améique du Sud");
    RégFr.add("Europe");
    RégFr.add("Australie");
    RégAn.add("Africa");
    RégAn.add("Asia");
    RégAn.add("North America");
    RégAn.add("South America");
    RégAn.add("Europe");
    RégAn.add("Australia");
  }

  void jBtnValider_actionPerformed(ActionEvent e) {

    if (FentrePrincipale.graphe.dico.contains(FentrePrincipale.animal)) {
      FentrePrincipale.animal = (Bilingue) FentrePrincipale.graphe.dico.get(
          FentrePrincipale.clé /*.animal.Francais.getNom()*/);
      FentrePrincipale.graphe.dico.remove(FentrePrincipale.clé
                                          /*jTxtFIdentificateur.getText()*/);
      if (jCmbxlangue.getSelectedItem() == "Français") {
        FentrePrincipale.animal.Francais = new Animal(jTxtFIdentificateur.
            getText(),
            "" + jCmbxCatégorie.getSelectedItem(),
            "" + jCmbxOrigine.getSelectedItem(),
            "" + jCmbxRégimeAlimentaire.getSelectedItem(),
            jTxtFVitesse.getText(), jTxtFDurée.getText(),
            jTxtFLongévité.getText());
        if (jCmbxCatégorie.getSelectedIndex() > -1) {
          FentrePrincipale.animal.Anglais.Catégorie = "" +
              CatAn.get(jCmbxCatégorie.getSelectedIndex());
        }
        if (jCmbxRégimeAlimentaire.getSelectedIndex() > -1) {
          FentrePrincipale.animal.Anglais.RégimeAli = "" +
              RégimAn.get(jCmbxRégimeAlimentaire.getSelectedIndex());
        }
        if (jCmbxOrigine.getSelectedIndex() > -1) {
          FentrePrincipale.animal.Anglais.Origine = "" +
              RégAn.get(jCmbxOrigine.getSelectedIndex());
        }

      }
      else {
        FentrePrincipale.animal.Anglais = new Animal(jTxtFIdentificateur.
            getText(),
            "" + jCmbxCatégorie.getSelectedItem(),
            "" + jCmbxOrigine.getSelectedItem(),
            "" + jCmbxRégimeAlimentaire.getSelectedItem(),
            jTxtFVitesse.getText(), jTxtFDurée.getText(),
            jTxtFLongévité.getText());
        if (jCmbxCatégorie.getSelectedIndex() > -1) {
          FentrePrincipale.animal.Francais.Catégorie = "" +
              CatFr.get(jCmbxCatégorie.getSelectedIndex());
        }
        if (jCmbxRégimeAlimentaire.getSelectedIndex() > -1) {
          FentrePrincipale.animal.Francais.RégimeAli = "" +
              RégimFr.get(jCmbxRégimeAlimentaire.getSelectedIndex());
        }
        if (jCmbxOrigine.getSelectedIndex() > -1) {
          FentrePrincipale.animal.Francais.Origine = "" +
              RégFr.get(jCmbxOrigine.getSelectedIndex());
        }

      }
      FentrePrincipale.graphe.dico.put(FentrePrincipale.clé,
                                       FentrePrincipale.animal);
    }
    else {
      FentrePrincipale.animal = new Bilingue(jTxtFIdentificateur.getText(),
                                             "" +
                                             jCmbxCatégorie.getSelectedItem(),
                                             "" + jCmbxOrigine.getSelectedItem(),
                                             "" +
                                             jCmbxRégimeAlimentaire.
                                             getSelectedItem(),
                                             jTxtFVitesse.getText(),
                                             jTxtFDurée.getText(),
                                             jTxtFLongévité.getText());
      if (jCmbxCatégorie.getSelectedIndex() > -1) {
        FentrePrincipale.animal.Francais.Catégorie = "" +
            CatFr.get(jCmbxCatégorie.getSelectedIndex());
        FentrePrincipale.animal.Anglais.Catégorie = "" +
            CatAn.get(jCmbxCatégorie.getSelectedIndex());
      }
      if (jCmbxRégimeAlimentaire.getSelectedIndex() > -1) {
        FentrePrincipale.animal.Francais.RégimeAli = "" +
            RégimFr.get(jCmbxRégimeAlimentaire.getSelectedIndex());
        FentrePrincipale.animal.Anglais.RégimeAli = "" +
            RégimAn.get(jCmbxRégimeAlimentaire.getSelectedIndex());
      }
      if (jCmbxOrigine.getSelectedIndex() > -1) {
        FentrePrincipale.animal.Francais.Origine = "" +
            RégFr.get(jCmbxOrigine.getSelectedIndex());
        FentrePrincipale.animal.Anglais.Origine = "" +
            RégAn.get(jCmbxOrigine.getSelectedIndex());
      }

      FentrePrincipale.graphe.dico.put(FentrePrincipale.clé,
                                       FentrePrincipale.animal);

    }

    jBtnFermer.setEnabled(true);
    jTxtFIdentificateur.setEditable(false);
  }

  void jBtnFermer_actionPerformed(ActionEvent e) {
    this.dispose();
  }

  void jCmbxlangue_actionPerformed(ActionEvent e) {

    jCmbxCatégorie.removeAllItems();
    jCmbxRégimeAlimentaire.removeAllItems();
    jCmbxOrigine.removeAllItems();
    if (jCmbxlangue.getSelectedIndex() == 0) {

      jCmbxCatégorie.addItem("Mammifères");
      jCmbxCatégorie.addItem("Poissons");
      jCmbxCatégorie.addItem("Oiseaux");
      jCmbxCatégorie.addItem("Animaux Domestiques");
      jCmbxCatégorie.addItem("Amphibiens");
      jCmbxCatégorie.addItem("Animaux dits invertébrés");
      jCmbxCatégorie.addItem("Reptiles");
      jCmbxRégimeAlimentaire.addItem("Omnivore");
      jCmbxRégimeAlimentaire.addItem("Herbivore");
      jCmbxRégimeAlimentaire.addItem("Carnivore");
      jCmbxOrigine.addItem("Afrique");
      jCmbxOrigine.addItem("Asie");
      jCmbxOrigine.addItem("Amérique du Nord");
      jCmbxOrigine.addItem("Améique du Sud");
      jCmbxOrigine.addItem("Europe");
      jCmbxOrigine.addItem("Australie");

      if (FentrePrincipale.animal.Francais != null) {
        if (FentrePrincipale.animal.Francais.getNom() != null) {
          jTxtFIdentificateur.setText(FentrePrincipale.animal.Francais.getNom());
        }
        jTxtFIdentificateur.setEditable(true);
        jCmbxCatégorie.setSelectedItem(FentrePrincipale.animal.Francais.
                                       Catégorie);
        jCmbxOrigine.setSelectedItem(FentrePrincipale.animal.Francais.Origine);
        jCmbxRégimeAlimentaire.setSelectedItem(FentrePrincipale.animal.Francais.
                                               RégimeAli);
        jTxtFDurée.setText(FentrePrincipale.animal.Francais.DuréeIncub);
        jTxtFLongévité.setText(FentrePrincipale.animal.Francais.Longévité);
        jTxtFVitesse.setText(FentrePrincipale.animal.Francais.Vitesse);

      }
    }
    else {

      jCmbxCatégorie.addItem("Mammalian");
      jCmbxCatégorie.addItem("Fish");
      jCmbxCatégorie.addItem("Bird");
      jCmbxCatégorie.addItem("Domestic Animal ");
      jCmbxCatégorie.addItem("Amphibian");
      jCmbxCatégorie.addItem("Invertebrate Animal");
      jCmbxCatégorie.addItem("Reptile");
      jCmbxRégimeAlimentaire.addItem("Omnivorous");
      jCmbxRégimeAlimentaire.addItem("Herbivorous");
      jCmbxRégimeAlimentaire.addItem("Carnivorous");
      jCmbxOrigine.addItem("Africa");
      jCmbxOrigine.addItem("Asia");
      jCmbxOrigine.addItem("North America");
      jCmbxOrigine.addItem("South America");
      jCmbxOrigine.addItem("Europe");
      jCmbxOrigine.addItem("Australia");

      if (FentrePrincipale.animal.Anglais != null) {
         if (FentrePrincipale.animal.Francais.getNom() != null) {
        jTxtFIdentificateur.setText(FentrePrincipale.animal.Anglais.getNom());}
        jTxtFIdentificateur.setEditable(true);
        jCmbxCatégorie.setSelectedItem(FentrePrincipale.animal.Anglais.
                                       Catégorie);
        jCmbxOrigine.setSelectedItem(FentrePrincipale.animal.Anglais.Origine);
        jCmbxRégimeAlimentaire.setSelectedItem(FentrePrincipale.animal.Anglais.
                                               RégimeAli);
        jTxtFDurée.setText(FentrePrincipale.animal.Anglais.DuréeIncub);
        jTxtFLongévité.setText(FentrePrincipale.animal.Anglais.Longévité);
        jTxtFVitesse.setText(FentrePrincipale.animal.Anglais.Vitesse);

      }
    }
  }

  void jCmbxlangue_mouseClicked(MouseEvent e) {
    /* if (! (FentrePrincipale.lang == jCmbxlangue.getSelectedIndex())) {
       jTxtFIdentificateur.setEnabled(true);
     }
     if (jCmbxlangue.getSelectedIndex() == 0) {
       if (FentrePrincipale.animal.Francais != null) {
         jCmbxCatégorie.setSelectedItem(FentrePrincipale.animal.Francais.
                                        Catégorie);
     jCmbxOrigine.setSelectedItem(FentrePrincipale.animal.Francais.Origine);
     jCmbxRégimeAlimentaire.setSelectedItem(FentrePrincipale.animal.Francais.
                                                RégimeAli);
         jTxtFDurée.setText(FentrePrincipale.animal.Francais.DuréeIncub);
         jTxtFLongévité.setText(FentrePrincipale.animal.Francais.Longévité);
         jTxtFVitesse.setText(FentrePrincipale.animal.Francais.Vitesse);

       }
     }
     else {
       if (FentrePrincipale.animal.Anglais != null) {
         jCmbxCatégorie.setSelectedItem(FentrePrincipale.animal.Anglais.
                                        Catégorie);
         jCmbxOrigine.setSelectedItem(FentrePrincipale.animal.Anglais.Origine);
     jCmbxRégimeAlimentaire.setSelectedItem(FentrePrincipale.animal.Anglais.
                                                RégimeAli);
         jTxtFDurée.setText(FentrePrincipale.animal.Anglais.DuréeIncub);
         jTxtFLongévité.setText(FentrePrincipale.animal.Anglais.Longévité);
         jTxtFVitesse.setText(FentrePrincipale.animal.Anglais.Vitesse);

       }
     }*/

  }
}

class SaisieInfo_jBtnValider_actionAdapter
    implements java.awt.event.ActionListener {
  SaisieInfo adaptee;

  SaisieInfo_jBtnValider_actionAdapter(SaisieInfo adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnValider_actionPerformed(e);
  }
}

class SaisieInfo_jBtnFermer_actionAdapter
    implements java.awt.event.ActionListener {
  SaisieInfo adaptee;

  SaisieInfo_jBtnFermer_actionAdapter(SaisieInfo adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnFermer_actionPerformed(e);
  }
}

class SaisieInfo_jCmbxlangue_actionAdapter
    implements java.awt.event.ActionListener {
  SaisieInfo adaptee;

  SaisieInfo_jCmbxlangue_actionAdapter(SaisieInfo adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jCmbxlangue_actionPerformed(e);
  }
}

class SaisieInfo_jCmbxlangue_mouseAdapter
    extends java.awt.event.MouseAdapter {
  SaisieInfo adaptee;

  SaisieInfo_jCmbxlangue_mouseAdapter(SaisieInfo adaptee) {
    this.adaptee = adaptee;
  }

  public void mouseClicked(MouseEvent e) {
    adaptee.jCmbxlangue_mouseClicked(e);
  }
}
