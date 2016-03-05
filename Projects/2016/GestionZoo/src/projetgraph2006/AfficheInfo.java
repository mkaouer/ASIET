package projetgraph2006;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class AfficheInfo extends JDialog {
  JLabel jLblOrigine = new JLabel();
  JTextField jTxtFDurée = new JTextField();
  JLabel jLblRégimeAlimentaire = new JLabel();
  JTextField jTxtFLongévité = new JTextField();
  JLabel jLblCatégorie = new JLabel();
  JTextField jTxtFIdentificateur = new JTextField();
  JLabel jLblVitesse = new JLabel();
  JPanel jPanel1 = new JPanel();
  JComboBox jCmbxlangue = new JComboBox();
  JTextField jTxtFVitesse = new JTextField();
  JPanel jPanel2 = new JPanel();
  JLabel jLblDurée = new JLabel();
  JLabel jLblLongévité = new JLabel();
  JLabel jLblIdentificateur = new JLabel();
  JTextField jTxtFCatégorie = new JTextField();
  JTextField jTxtFOrigine = new JTextField();
  JTextField jTxtFRégime = new JTextField();
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
    jLblCatégorie.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblCatégorie.setText("Catégorie                 :");
    jLblCatégorie.setBounds(10, 22, 126, 31);
    jTxtFLongévité.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFLongévité.setText("");
    jTxtFLongévité.setBounds(166, 208, 157, 25);
    jLblRégimeAlimentaire.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblRégimeAlimentaire.setText("Régime Alimentaire :");
    jLblRégimeAlimentaire.setBounds(12, 102, 126, 31);
    jTxtFDurée.setBounds(166, 175, 157, 25);
    jTxtFDurée.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFDurée.setText("");
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
    jLblDurée.setBounds(12, 175, 130, 31);
    jLblDurée.setText("Durée d\'incubation  :  ");
    jLblDurée.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblDurée.setRequestFocusEnabled(true);
    jLblLongévité.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblLongévité.setRequestFocusEnabled(true);
    jLblLongévité.setText("Longévité                :  ");
    jLblLongévité.setBounds(11, 206, 130, 31);
    jLblIdentificateur.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblIdentificateur.setText("Identificateur   :");
    jLblIdentificateur.setBounds(8, 6, 87, 15);
    jCmbxlangue.addItem("Français");
    jCmbxlangue.addItem("Anglais");
    jTxtFCatégorie.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFCatégorie.setText("");
    jTxtFCatégorie.setBounds(168, 29, 157, 25);
    jTxtFOrigine.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFOrigine.setText("");
    jTxtFOrigine.setBounds(167, 64, 157, 25);
    jTxtFRégime.setFont(new java.awt.Font("Dialog", 1, 11));
    jTxtFRégime.setText("");
    jTxtFRégime.setBounds(165, 102, 157, 25);
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
    jLabel2.setText("Déscendants");
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
    jPanel2.add(jLblCatégorie, null);
    jPanel2.add(jLblOrigine, null);
    jPanel2.add(jLblRégimeAlimentaire, null);
    jPanel2.add(jLblVitesse, null);
    jPanel2.add(jTxtFVitesse, null);
    jPanel2.add(jLblDurée, null);
    jPanel2.add(jTxtFDurée, null);
    jPanel2.add(jLblLongévité, null);
    jPanel2.add(jTxtFLongévité, null);
    jPanel2.add(jTxtFCatégorie, null);
    jPanel2.add(jTxtFOrigine, null);
    jPanel2.add(jTxtFRégime, null);
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
      jTxtFRégime.setText(FentrePrincipale.animal.Francais.RégimeAli);
      jTxtFLongévité.setText(FentrePrincipale.animal.Francais.Longévité);
      jTxtFVitesse.setText(FentrePrincipale.animal.Francais.Vitesse);
      jTxtFDurée.setText(FentrePrincipale.animal.Francais.DuréeIncub);
      jTxtFCatégorie.setText(FentrePrincipale.animal.Francais.Catégorie);
      ListeNoeuds1.clear();
    ListeNoeuds2.clear();
      FentrePrincipale.graphe.graphe.getAscendant(FentrePrincipale.graphe.
                                                  graphe.getNoeud(
          FentrePrincipale.getclé(FentrePrincipale.animal.Francais.getNom())),
                                                  list);
      FentrePrincipale.graphe.graphe.getDescendant(FentrePrincipale.graphe.
          graphe.getNoeud(FentrePrincipale.getclé(FentrePrincipale.animal.
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
      jTxtFRégime.setText(FentrePrincipale.animal.Anglais.RégimeAli);
      jTxtFLongévité.setText(FentrePrincipale.animal.Anglais.Longévité);
      jTxtFVitesse.setText(FentrePrincipale.animal.Anglais.Vitesse);
      jTxtFDurée.setText(FentrePrincipale.animal.Anglais.DuréeIncub);
      jTxtFCatégorie.setText(FentrePrincipale.animal.Anglais.Catégorie);

      ListeNoeuds1.clear();
    ListeNoeuds2.clear();
      FentrePrincipale.graphe.graphe.getAscendant(FentrePrincipale.graphe.
                                                  graphe.getNoeud(
          FentrePrincipale.getclé(FentrePrincipale.animal.Anglais.getNom())),
                                                  list);
      FentrePrincipale.graphe.graphe.getDescendant(FentrePrincipale.graphe.
          graphe.getNoeud(FentrePrincipale.getclé(FentrePrincipale.animal.
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
