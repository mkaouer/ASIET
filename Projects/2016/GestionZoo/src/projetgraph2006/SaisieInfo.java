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
  JLabel jLblR�gimeAlimentaire = new JLabel();
  JLabel jLblCat�gorie = new JLabel();
  JLabel jLblVitesse = new JLabel();
  JComboBox jCmbxCat�gorie = new JComboBox();
  JComboBox jCmbxOrigine = new JComboBox();
  JComboBox jCmbxR�gimeAlimentaire = new JComboBox();
  JTextField jTxtFVitesse = new JTextField();
  JLabel jLblDur�e = new JLabel();
  JTextField jTxFNom2 = new JTextField();
  JTextField jTxtFDur�e = new JTextField();
  JLabel jLblLong�vit� = new JLabel();
  JTextField jTxtFLong�vit� = new JTextField();
  JPanel jPanel3 = new JPanel();
  JButton jBtnValider = new JButton();
  JButton jBtnFermer = new JButton();
  JComboBox jCmbxlangue = new JComboBox();
  ArrayList CatFr;
  ArrayList CatAn;
  ArrayList R�gimFr;
  ArrayList R�gimAn;
  ArrayList R�gFr;
  ArrayList R�gAn;
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
    jLblR�gimeAlimentaire.setBounds(new Rectangle(10, 59, 126, 31));
    jLblR�gimeAlimentaire.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblR�gimeAlimentaire.setText("R�gime Alimentaire :");
    jLblCat�gorie.setBounds(new Rectangle(10, 22, 126, 31));
    jLblCat�gorie.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblCat�gorie.setText("Cat�gorie                 :");
    jLblVitesse.setBounds(new Rectangle(10, 169, 126, 31));
    jLblVitesse.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblVitesse.setText("Vitesse                    :");
    jCmbxCat�gorie.setFont(new java.awt.Font("Dialog", 1, 11));
    jCmbxCat�gorie.setBounds(new Rectangle(167, 28, 159, 24));
    jCmbxlangue.addItem("Fran�ais");
    jCmbxlangue.addItem("Anglais");
    jCmbxCat�gorie.addItem("Mammif�res");
    jCmbxCat�gorie.addItem("Poissons");
    jCmbxCat�gorie.addItem("Oiseaux");
    jCmbxCat�gorie.addItem("Animaux Domestiques");
    jCmbxCat�gorie.addItem("Amphibiens");
    jCmbxCat�gorie.addItem("Animaux dits invert�br�s");
    jCmbxCat�gorie.addItem("Reptiles");
    jCmbxOrigine.setFont(new java.awt.Font("Dialog", 1, 11));
    jCmbxOrigine.setBounds(new Rectangle(167, 67, 159, 24));
    jCmbxR�gimeAlimentaire.setFont(new java.awt.Font("Dialog", 1, 11));
    jCmbxR�gimeAlimentaire.setBounds(new Rectangle(167, 107, 159, 24));
    jCmbxR�gimeAlimentaire.addItem("Omnivore");
    jCmbxR�gimeAlimentaire.addItem("Herbivore");
    jCmbxR�gimeAlimentaire.addItem("Carnivore");
    jCmbxOrigine.addItem("Afrique");
    jCmbxOrigine.addItem("Asie");
    jCmbxOrigine.addItem("Am�rique du Nord");
    jCmbxOrigine.addItem("Am�ique du Sud");
    jCmbxOrigine.addItem("Europe");
    jCmbxOrigine.addItem("Australie");
    jTxtFVitesse.setBounds(new Rectangle(167, 140, 157, 25));
    jTxtFVitesse.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFVitesse.setText("");
    jLblDur�e.setBounds(new Rectangle(10, 132, 126, 31));
    jLblDur�e.setText("Dur�e d\'incubation  :  ");
    jLblDur�e.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblDur�e.setRequestFocusEnabled(true);
    jTxtFDur�e.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFDur�e.setText("");
    jTxtFDur�e.setBounds(new Rectangle(166, 175, 157, 25));
    jLblLong�vit�.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblLong�vit�.setRequestFocusEnabled(true);
    jLblLong�vit�.setText("Long�vit�                :  ");
    jLblLong�vit�.setBounds(new Rectangle(10, 206, 126, 31));
    jTxtFLong�vit�.setBounds(new Rectangle(166, 208, 157, 25));
    jTxtFLong�vit�.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFLong�vit�.setText("");
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
    jPanel2.add(jLblCat�gorie, null);
    jPanel2.add(jCmbxCat�gorie, null);
    jPanel2.add(jLblOrigine, null);
    jPanel2.add(jLblR�gimeAlimentaire, null);
    jPanel2.add(jLblVitesse, null);
    jPanel2.add(jCmbxOrigine, null);
    jPanel2.add(jCmbxR�gimeAlimentaire, null);
    jPanel2.add(jTxtFVitesse, null);
    jPanel2.add(jLblDur�e, null);
    jPanel2.add(jTxtFDur�e, null);
    jPanel2.add(jLblLong�vit�, null);
    jPanel2.add(jTxtFLong�vit�, null);
    this.getContentPane().add(jPanel3, null);
    jPanel3.add(jBtnValider, null);
    jPanel3.add(jBtnFermer, null);
    this.getContentPane().add(jPanel1, null);
    CatFr = new ArrayList();
    CatAn = new ArrayList();
    R�gimFr = new ArrayList();
    R�gimAn = new ArrayList();
    R�gFr = new ArrayList();
    R�gAn = new ArrayList();
    CatFr.add("Mammif�res");
    CatFr.add("Poissons");
    CatFr.add("Oiseaux");
    CatFr.add("Animaux Domestiques");
    CatFr.add("Amphibiens");
    CatFr.add("Animaux dits invert�br�s");
    CatFr.add("Reptiles");
    CatAn.add("Mammalian");
    CatAn.add("Fish");
    CatAn.add("Bird");
    CatAn.add("Domestic Animal");
    CatAn.add("Amphibian");
    CatAn.add("Invertebrate Animal");
    CatAn.add("Reptile");
    R�gimFr.add("Omnivore");
    R�gimFr.add("Herbivore");
    R�gimFr.add("Carnivore");
    R�gimAn.add("Omnivorous");
    R�gimAn.add("Herbivorous");
    R�gimAn.add("Carnivorous");
    R�gFr.add("Afrique");
    R�gFr.add("Asie");
    R�gFr.add("Am�rique du Nord");
    R�gFr.add("Am�ique du Sud");
    R�gFr.add("Europe");
    R�gFr.add("Australie");
    R�gAn.add("Africa");
    R�gAn.add("Asia");
    R�gAn.add("North America");
    R�gAn.add("South America");
    R�gAn.add("Europe");
    R�gAn.add("Australia");
  }

  void jBtnValider_actionPerformed(ActionEvent e) {

    if (FentrePrincipale.graphe.dico.contains(FentrePrincipale.animal)) {
      FentrePrincipale.animal = (Bilingue) FentrePrincipale.graphe.dico.get(
          FentrePrincipale.cl� /*.animal.Francais.getNom()*/);
      FentrePrincipale.graphe.dico.remove(FentrePrincipale.cl�
                                          /*jTxtFIdentificateur.getText()*/);
      if (jCmbxlangue.getSelectedItem() == "Fran�ais") {
        FentrePrincipale.animal.Francais = new Animal(jTxtFIdentificateur.
            getText(),
            "" + jCmbxCat�gorie.getSelectedItem(),
            "" + jCmbxOrigine.getSelectedItem(),
            "" + jCmbxR�gimeAlimentaire.getSelectedItem(),
            jTxtFVitesse.getText(), jTxtFDur�e.getText(),
            jTxtFLong�vit�.getText());
        if (jCmbxCat�gorie.getSelectedIndex() > -1) {
          FentrePrincipale.animal.Anglais.Cat�gorie = "" +
              CatAn.get(jCmbxCat�gorie.getSelectedIndex());
        }
        if (jCmbxR�gimeAlimentaire.getSelectedIndex() > -1) {
          FentrePrincipale.animal.Anglais.R�gimeAli = "" +
              R�gimAn.get(jCmbxR�gimeAlimentaire.getSelectedIndex());
        }
        if (jCmbxOrigine.getSelectedIndex() > -1) {
          FentrePrincipale.animal.Anglais.Origine = "" +
              R�gAn.get(jCmbxOrigine.getSelectedIndex());
        }

      }
      else {
        FentrePrincipale.animal.Anglais = new Animal(jTxtFIdentificateur.
            getText(),
            "" + jCmbxCat�gorie.getSelectedItem(),
            "" + jCmbxOrigine.getSelectedItem(),
            "" + jCmbxR�gimeAlimentaire.getSelectedItem(),
            jTxtFVitesse.getText(), jTxtFDur�e.getText(),
            jTxtFLong�vit�.getText());
        if (jCmbxCat�gorie.getSelectedIndex() > -1) {
          FentrePrincipale.animal.Francais.Cat�gorie = "" +
              CatFr.get(jCmbxCat�gorie.getSelectedIndex());
        }
        if (jCmbxR�gimeAlimentaire.getSelectedIndex() > -1) {
          FentrePrincipale.animal.Francais.R�gimeAli = "" +
              R�gimFr.get(jCmbxR�gimeAlimentaire.getSelectedIndex());
        }
        if (jCmbxOrigine.getSelectedIndex() > -1) {
          FentrePrincipale.animal.Francais.Origine = "" +
              R�gFr.get(jCmbxOrigine.getSelectedIndex());
        }

      }
      FentrePrincipale.graphe.dico.put(FentrePrincipale.cl�,
                                       FentrePrincipale.animal);
    }
    else {
      FentrePrincipale.animal = new Bilingue(jTxtFIdentificateur.getText(),
                                             "" +
                                             jCmbxCat�gorie.getSelectedItem(),
                                             "" + jCmbxOrigine.getSelectedItem(),
                                             "" +
                                             jCmbxR�gimeAlimentaire.
                                             getSelectedItem(),
                                             jTxtFVitesse.getText(),
                                             jTxtFDur�e.getText(),
                                             jTxtFLong�vit�.getText());
      if (jCmbxCat�gorie.getSelectedIndex() > -1) {
        FentrePrincipale.animal.Francais.Cat�gorie = "" +
            CatFr.get(jCmbxCat�gorie.getSelectedIndex());
        FentrePrincipale.animal.Anglais.Cat�gorie = "" +
            CatAn.get(jCmbxCat�gorie.getSelectedIndex());
      }
      if (jCmbxR�gimeAlimentaire.getSelectedIndex() > -1) {
        FentrePrincipale.animal.Francais.R�gimeAli = "" +
            R�gimFr.get(jCmbxR�gimeAlimentaire.getSelectedIndex());
        FentrePrincipale.animal.Anglais.R�gimeAli = "" +
            R�gimAn.get(jCmbxR�gimeAlimentaire.getSelectedIndex());
      }
      if (jCmbxOrigine.getSelectedIndex() > -1) {
        FentrePrincipale.animal.Francais.Origine = "" +
            R�gFr.get(jCmbxOrigine.getSelectedIndex());
        FentrePrincipale.animal.Anglais.Origine = "" +
            R�gAn.get(jCmbxOrigine.getSelectedIndex());
      }

      FentrePrincipale.graphe.dico.put(FentrePrincipale.cl�,
                                       FentrePrincipale.animal);

    }

    jBtnFermer.setEnabled(true);
    jTxtFIdentificateur.setEditable(false);
  }

  void jBtnFermer_actionPerformed(ActionEvent e) {
    this.dispose();
  }

  void jCmbxlangue_actionPerformed(ActionEvent e) {

    jCmbxCat�gorie.removeAllItems();
    jCmbxR�gimeAlimentaire.removeAllItems();
    jCmbxOrigine.removeAllItems();
    if (jCmbxlangue.getSelectedIndex() == 0) {

      jCmbxCat�gorie.addItem("Mammif�res");
      jCmbxCat�gorie.addItem("Poissons");
      jCmbxCat�gorie.addItem("Oiseaux");
      jCmbxCat�gorie.addItem("Animaux Domestiques");
      jCmbxCat�gorie.addItem("Amphibiens");
      jCmbxCat�gorie.addItem("Animaux dits invert�br�s");
      jCmbxCat�gorie.addItem("Reptiles");
      jCmbxR�gimeAlimentaire.addItem("Omnivore");
      jCmbxR�gimeAlimentaire.addItem("Herbivore");
      jCmbxR�gimeAlimentaire.addItem("Carnivore");
      jCmbxOrigine.addItem("Afrique");
      jCmbxOrigine.addItem("Asie");
      jCmbxOrigine.addItem("Am�rique du Nord");
      jCmbxOrigine.addItem("Am�ique du Sud");
      jCmbxOrigine.addItem("Europe");
      jCmbxOrigine.addItem("Australie");

      if (FentrePrincipale.animal.Francais != null) {
        if (FentrePrincipale.animal.Francais.getNom() != null) {
          jTxtFIdentificateur.setText(FentrePrincipale.animal.Francais.getNom());
        }
        jTxtFIdentificateur.setEditable(true);
        jCmbxCat�gorie.setSelectedItem(FentrePrincipale.animal.Francais.
                                       Cat�gorie);
        jCmbxOrigine.setSelectedItem(FentrePrincipale.animal.Francais.Origine);
        jCmbxR�gimeAlimentaire.setSelectedItem(FentrePrincipale.animal.Francais.
                                               R�gimeAli);
        jTxtFDur�e.setText(FentrePrincipale.animal.Francais.Dur�eIncub);
        jTxtFLong�vit�.setText(FentrePrincipale.animal.Francais.Long�vit�);
        jTxtFVitesse.setText(FentrePrincipale.animal.Francais.Vitesse);

      }
    }
    else {

      jCmbxCat�gorie.addItem("Mammalian");
      jCmbxCat�gorie.addItem("Fish");
      jCmbxCat�gorie.addItem("Bird");
      jCmbxCat�gorie.addItem("Domestic Animal ");
      jCmbxCat�gorie.addItem("Amphibian");
      jCmbxCat�gorie.addItem("Invertebrate Animal");
      jCmbxCat�gorie.addItem("Reptile");
      jCmbxR�gimeAlimentaire.addItem("Omnivorous");
      jCmbxR�gimeAlimentaire.addItem("Herbivorous");
      jCmbxR�gimeAlimentaire.addItem("Carnivorous");
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
        jCmbxCat�gorie.setSelectedItem(FentrePrincipale.animal.Anglais.
                                       Cat�gorie);
        jCmbxOrigine.setSelectedItem(FentrePrincipale.animal.Anglais.Origine);
        jCmbxR�gimeAlimentaire.setSelectedItem(FentrePrincipale.animal.Anglais.
                                               R�gimeAli);
        jTxtFDur�e.setText(FentrePrincipale.animal.Anglais.Dur�eIncub);
        jTxtFLong�vit�.setText(FentrePrincipale.animal.Anglais.Long�vit�);
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
         jCmbxCat�gorie.setSelectedItem(FentrePrincipale.animal.Francais.
                                        Cat�gorie);
     jCmbxOrigine.setSelectedItem(FentrePrincipale.animal.Francais.Origine);
     jCmbxR�gimeAlimentaire.setSelectedItem(FentrePrincipale.animal.Francais.
                                                R�gimeAli);
         jTxtFDur�e.setText(FentrePrincipale.animal.Francais.Dur�eIncub);
         jTxtFLong�vit�.setText(FentrePrincipale.animal.Francais.Long�vit�);
         jTxtFVitesse.setText(FentrePrincipale.animal.Francais.Vitesse);

       }
     }
     else {
       if (FentrePrincipale.animal.Anglais != null) {
         jCmbxCat�gorie.setSelectedItem(FentrePrincipale.animal.Anglais.
                                        Cat�gorie);
         jCmbxOrigine.setSelectedItem(FentrePrincipale.animal.Anglais.Origine);
     jCmbxR�gimeAlimentaire.setSelectedItem(FentrePrincipale.animal.Anglais.
                                                R�gimeAli);
         jTxtFDur�e.setText(FentrePrincipale.animal.Anglais.Dur�eIncub);
         jTxtFLong�vit�.setText(FentrePrincipale.animal.Anglais.Long�vit�);
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
