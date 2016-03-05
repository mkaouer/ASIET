package projetgraph2006;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class AfficheInfo extends JDialog {
  JLabel jLblOrigine = new JLabel();
  JTextField jTxtFDur�e = new JTextField();
  JLabel jLblR�gimeAlimentaire = new JLabel();
  JTextField jTxtFLong�vit� = new JTextField();
  JLabel jLblCat�gorie = new JLabel();
  JTextField jTxtFIdentificateur = new JTextField();
  JLabel jLblVitesse = new JLabel();
  JPanel jPanel1 = new JPanel();
  JComboBox jCmbxlangue = new JComboBox();
  JTextField jTxtFVitesse = new JTextField();
  JPanel jPanel2 = new JPanel();
  JLabel jLblDur�e = new JLabel();
  JLabel jLblLong�vit� = new JLabel();
  JLabel jLblIdentificateur = new JLabel();
  JTextField jTxtFCat�gorie = new JTextField();
  JTextField jTxtFOrigine = new JTextField();
  JTextField jTxtFR�gime = new JTextField();
  DefaultListModel ListeNoeuds1 = new DefaultListModel();
  DefaultListModel ListeNoeuds2 = new DefaultListModel();
  JPanel jPanel4 = new JPanel();
  JList jList1 = new JList(ListeNoeuds1);
  JList jList2 = new JList(ListeNoeuds2);
  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JButton jButton1 = new JButton();

  public AfficheInfo() {
    try {
      jbInit();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {
    jLblVitesse.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblVitesse.setText("Vitesse                    :");
    jLblVitesse.setBounds(10, 136, 126, 31);
    jTxtFIdentificateur.setBounds(110, 5, 89, 21);
    jTxtFIdentificateur.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFIdentificateur.setForeground(Color.blue);
    jTxtFIdentificateur.setEditable(true);
    jTxtFIdentificateur.setText("");
    jLblCat�gorie.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblCat�gorie.setText("Cat�gorie                 :");
    jLblCat�gorie.setBounds(10, 22, 126, 31);
    jTxtFLong�vit�.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFLong�vit�.setText("");
    jTxtFLong�vit�.setBounds(166, 208, 157, 25);
    jLblR�gimeAlimentaire.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblR�gimeAlimentaire.setText("R�gime Alimentaire :");
    jLblR�gimeAlimentaire.setBounds(12, 102, 126, 31);
    jTxtFDur�e.setBounds(166, 175, 157, 25);
    jTxtFDur�e.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFDur�e.setText("");
    jLblOrigine.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblOrigine.setText("Origine                    :");
    jLblOrigine.setBounds(11, 63, 126, 31);
    this.setLocale(java.util.Locale.getDefault());
    this.getContentPane().setLayout(null);
    jPanel1.setBackground(Color.gray);
    jPanel1.setBorder(BorderFactory.createRaisedBevelBorder());
    jPanel1.setBounds(9, 75, 332, 30);
    jPanel1.setLayout(null);
    jCmbxlangue.setFont(new java.awt.Font("Dialog", 1, 11));
    jCmbxlangue.setBounds(213, 5, 105, 19);
    jCmbxlangue.addActionListener(new AfficheInfo_jCmbxlangue_actionAdapter(this));
    // jCmbxlangue.addMouseListener(new SaisieInfo_jCmbxlangue_mouseAdapter(this));
//    jCmbxlangue.addActionListener(new SaisieInfo_jCmbxlangue_actionAdapter(this));
    jTxtFVitesse.setBounds(167, 140, 157, 25);
    jTxtFVitesse.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFVitesse.setText("");
    jPanel2.setBackground(Color.gray);
    jPanel2.setBorder(BorderFactory.createRaisedBevelBorder());
    jPanel2.setBounds(8, 107, 333, 278);
    jPanel2.setLayout(null);
    jLblDur�e.setBounds(12, 175, 130, 31);
    jLblDur�e.setText("Dur�e d\'incubation  :  ");
    jLblDur�e.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblDur�e.setRequestFocusEnabled(true);
    jLblLong�vit�.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblLong�vit�.setRequestFocusEnabled(true);
    jLblLong�vit�.setText("Long�vit�                :  ");
    jLblLong�vit�.setBounds(11, 206, 130, 31);
    jLblIdentificateur.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblIdentificateur.setText("Identificateur   :");
    jLblIdentificateur.setBounds(8, 6, 87, 15);
    jCmbxlangue.addItem("Fran�ais");
    jCmbxlangue.addItem("Anglais");
    jTxtFCat�gorie.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFCat�gorie.setText("");
    jTxtFCat�gorie.setBounds(168, 29, 157, 25);
    jTxtFOrigine.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFOrigine.setText("");
    jTxtFOrigine.setBounds(167, 64, 157, 25);
    jTxtFR�gime.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFR�gime.setText("");
    jTxtFR�gime.setBounds(165, 102, 157, 25);
    jPanel4.setBackground(Color.gray);
    jPanel4.setBorder(BorderFactory.createRaisedBevelBorder());
    jPanel4.setBounds(346, 106, 217, 278);
    jPanel4.setLayout(null);
    jList1.setFont(new java.awt.Font("Dialog", 1, 11));
    jList1.setBounds(13, 45, 85, 184);
    jList2.setFont(new java.awt.Font("Dialog", 1, 11));
    jList2.setBounds(121, 45, 85, 184);
    jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 13));
    jLabel1.setText("Ascendants");
    jLabel1.setBounds(12, 9, 89, 27);
    jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 13));
    jLabel2.setText("D�scendants");
    jLabel2.setBounds(121, 9, 89, 27);
    jLabel3.setFont(new java.awt.Font("EucrosiaUPC", 1, 30));
    jLabel3.setForeground(new Color(0, 0, 85));
    jLabel3.setText("Informations Sur Les Noeuds");
    jLabel3.setBounds(123, 5, 270, 33);
    jLabel4.setText(
        "__________________________________________________________");
    jLabel4.setBounds(100, 32, 386, 14);
    jButton1.setBounds(238, 388, 127, 51));
    jButton1.setOpaque(false);
    jButton1.setBorderPainted(false);
    jButton1.setContentAreaFilled(false);
    jButton1.setText("");
    jButton1.addActionListener(new AfficheInfo_jButton1_actionAdapter(this));
    jPanel1.add(jTxtFIdentificateur, null);
    jPanel1.add(jCmbxlangue, null);
    jPanel1.add(jLblIdentificateur, null);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jLabel4, null);
    jPanel2.add(jLblCat�gorie, null);
    jPanel2.add(jLblOrigine, null);
    jPanel2.add(jLblR�gimeAlimentaire, null);
    jPanel2.add(jLblVitesse, null);
    jPanel2.add(jTxtFVitesse, null);
    jPanel2.add(jLblDur�e, null);
    jPanel2.add(jTxtFDur�e, null);
    jPanel2.add(jLblLong�vit�, null);
    jPanel2.add(jTxtFLong�vit�, null);
    jPanel2.add(jTxtFCat�gorie, null);
    jPanel2.add(jTxtFOrigine, null);
    jPanel2.add(jTxtFR�gime, null);
    this.getContentPane().add(jPanel4, null);
    this.getContentPane().add(jPanel1, null);
    jPanel4.add(jList2, null);
    jPanel4.add(jLabel1, null);
    jPanel4.add(jLabel2, null);
    jPanel4.add(jList1, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jPanel2, null);
    jButton1.setIcon(new ImageIcon(getClass().getResource("rtr1.jpg")));
    jButton1.setRolloverIcon(new ImageIcon(getClass().getResource("rtr2.jpg")));

  }

  public static void main(String[] args) {
    AfficheInfo afficheInfo = new AfficheInfo();
  }

  void jCmbxlangue_actionPerformed(ActionEvent e) {

    LinkedList list = new LinkedList();
    LinkedList list2 = new LinkedList();
    Noeud n;
    if (jCmbxlangue.getSelectedIndex() == 0) {
      jTxtFIdentificateur.setText(FentrePrincipale.animal.Francais.getNom());
      jTxtFOrigine.setText(FentrePrincipale.animal.Francais.Origine);
      jTxtFR�gime.setText(FentrePrincipale.animal.Francais.R�gimeAli);
      jTxtFLong�vit�.setText(FentrePrincipale.animal.Francais.Long�vit�);
      jTxtFVitesse.setText(FentrePrincipale.animal.Francais.Vitesse);
      jTxtFDur�e.setText(FentrePrincipale.animal.Francais.Dur�eIncub);
      jTxtFCat�gorie.setText(FentrePrincipale.animal.Francais.Cat�gorie);
      ListeNoeuds1.clear();
    ListeNoeuds2.clear();
      FentrePrincipale.graphe.graphe.getAscendant(FentrePrincipale.graphe.
                                                  graphe.getNoeud(
          FentrePrincipale.getcl�(FentrePrincipale.animal.Francais.getNom())),
                                                  list);
      FentrePrincipale.graphe.graphe.getDescendant(FentrePrincipale.graphe.
          graphe.getNoeud(FentrePrincipale.getcl�(FentrePrincipale.animal.
                                                  Francais.getNom())), list2);
      for (Iterator itr = list.iterator(); itr.hasNext(); ) {
        n = (Noeud) itr.next();
        ListeNoeuds1.addElement( ( (Bilingue) FentrePrincipale.graphe.dico.get(
            n.getNom())).Francais.getNom());
      }
        for (Iterator itr2 = list2.iterator(); itr2.hasNext(); ) {
          n = (Noeud) itr2.next();
          ListeNoeuds2.addElement( ( (Bilingue) FentrePrincipale.graphe.dico.
                                    get(n.getNom())).Francais.getNom());

        }

    }
    else {
      jTxtFIdentificateur.setText(FentrePrincipale.animal.Anglais.getNom());
      jTxtFOrigine.setText(FentrePrincipale.animal.Anglais.Origine);
      jTxtFR�gime.setText(FentrePrincipale.animal.Anglais.R�gimeAli);
      jTxtFLong�vit�.setText(FentrePrincipale.animal.Anglais.Long�vit�);
      jTxtFVitesse.setText(FentrePrincipale.animal.Anglais.Vitesse);
      jTxtFDur�e.setText(FentrePrincipale.animal.Anglais.Dur�eIncub);
      jTxtFCat�gorie.setText(FentrePrincipale.animal.Anglais.Cat�gorie);

      ListeNoeuds1.clear();
    ListeNoeuds2.clear();
      FentrePrincipale.graphe.graphe.getAscendant(FentrePrincipale.graphe.
                                                  graphe.getNoeud(
          FentrePrincipale.getcl�(FentrePrincipale.animal.Anglais.getNom())),
                                                  list);
      FentrePrincipale.graphe.graphe.getDescendant(FentrePrincipale.graphe.
          graphe.getNoeud(FentrePrincipale.getcl�(FentrePrincipale.animal.
                                                  Anglais.getNom())), list2);
      for (Iterator itr = list.iterator(); itr.hasNext(); ) {
        n = (Noeud) itr.next();
        ListeNoeuds1.addElement( ( (Bilingue) FentrePrincipale.graphe.dico.get(
            n.getNom())).Anglais.getNom());
      }
        for (Iterator itr2 = list2.iterator(); itr2.hasNext(); ) {
          n = (Noeud) itr2.next();
          ListeNoeuds2.addElement( ( (Bilingue) FentrePrincipale.graphe.dico.
                                    get(n.getNom())).Anglais.getNom());

        }

    }
  }

  void jButton1_actionPerformed(ActionEvent e) {
this.dispose();
  }
}

class AfficheInfo_jCmbxlangue_actionAdapter implements java.awt.event.ActionListener {
  AfficheInfo adaptee;

  AfficheInfo_jCmbxlangue_actionAdapter(AfficheInfo adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jCmbxlangue_actionPerformed(e);
  }
}

class AfficheInfo_jButton1_actionAdapter implements java.awt.event.ActionListener {
  AfficheInfo adaptee;

  AfficheInfo_jButton1_actionAdapter(AfficheInfo adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}
