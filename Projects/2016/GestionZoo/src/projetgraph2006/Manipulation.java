package projetgraph2006;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.util.*;

public class Manipulation
    extends JFrame {
  JPanel jPanel1 = new JPanel();
  JLabel jLblIdentificateur = new JLabel();
  JTextField jTxtIdentificateur = new JTextField();
  JButton jBtnOk = new JButton();
  JPanel jPanel2 = new JPanel();
  JButton jBtnUpDate = new JButton();
  JButton jBtnModifier = new JButton();
  SaisieInfo s = new SaisieInfo();
  JScrollPane ScrollPane = new JScrollPane();
  JLabel jLblNoeud = new JLabel();
  Border border1;
  TitledBorder titledBorder1;
  Border border2;
  Object[] a = new Object[4];
  ArrayList data = new ArrayList();
  Tableur Table = new Tableur();
  String[] names = {
      "Noeud", "Père", "Mère", "Relation"};
  JPanel jPanel3 = new JPanel();
  Border border3;
  JCheckBox jCheckBox1 = new JCheckBox();
  JCheckBox jCheckBox2 = new JCheckBox();
  JCheckBox jCheckBox3 = new JCheckBox();
  JButton jButton1 = new JButton();
  boolean firstopen;
  JButton jButton2 = new JButton();
  DefaultListModel ListeNoeuds1 = new DefaultListModel();
  JScrollPane jScrollPane1 = new JScrollPane();
  JList jList1 = new JList(ListeNoeuds1);
  public Manipulation() {
    try {
      jbInit();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  void jbInit() throws Exception {
    Table.setFont(new java.awt.Font("Dialog", 1, 13));
    Table.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
    border1 = new EtchedBorder(EtchedBorder.RAISED, Color.white,
                               new Color(148, 145, 140));
    titledBorder1 = new TitledBorder(new EtchedBorder(EtchedBorder.RAISED,
        Color.white, new Color(148, 145, 140)), "Noeud Actuel");
    border2 = BorderFactory.createCompoundBorder(null, titledBorder1);
    border3 = new TitledBorder(new EtchedBorder(EtchedBorder.RAISED,
                                                Color.white,
                                                new Color(178, 178, 178)),
                               "Afficher");
    this.getContentPane().setBackground(Color.white);
    this.setTitle("Manipulation des Noeuds");
    this.getContentPane().setLayout(null);
    jPanel1.setBackground(Color.white);
    jPanel1.setBounds(new Rectangle(19, 7, 578, 316));
    jPanel1.setLayout(null);
    jLblIdentificateur.setText("Identificateur :");
    jLblIdentificateur.setBounds(new Rectangle(9, 24, 73, 15));
    jTxtIdentificateur.setText("");
    jTxtIdentificateur.setBounds(new Rectangle(97, 18, 104, 21));
    jTxtIdentificateur.addActionListener(new
                                         Manipulation_jTxtIdentificateur_actionAdapter(this));
    jBtnOk.setBounds(new Rectangle(213, 18, 89, 24));
    jBtnOk.setText("Ajouter");
    jBtnOk.addMouseListener(new Manipulation_jBtnOk_mouseAdapter(this));
    jBtnOk.addActionListener(new Manipulation_jBtnOk_actionAdapter(this));
    jBtnOk.addActionListener(new Manipulation_jBtnOk_actionAdapter(this));
    jPanel2.setBackground(Color.white);
    jPanel2.setBounds(new Rectangle(20, 320, 395, 36));
    jBtnUpDate.setText("UpDate");
    jBtnUpDate.addMouseListener(new Manipulation_jBtnUpDate_mouseAdapter(this));
    jBtnUpDate.addActionListener(new Manipulation_jBtnUpDate_actionAdapter(this));
    jBtnUpDate.addActionListener(new Manipulation_jBtnUpDate_actionAdapter(this));
    jBtnModifier.setText("Modifier");
    jBtnModifier.addMouseListener(new Manipulation_jBtnModifier_mouseAdapter(this));
    jBtnModifier.addActionListener(new Manipulation_jBtnModifier_actionAdapter(this));
    jBtnModifier.addActionListener(new Manipulation_jBtnModifier_actionAdapter(this));

    jLblNoeud.setFont(new java.awt.Font("Dialog", 1, 12));
    jLblNoeud.setAlignmentX( (float) 20.0);
    jLblNoeud.setAlignmentY( (float) 0.0);
    jLblNoeud.setBorder(border2);
    jLblNoeud.setRequestFocusEnabled(true);
    jLblNoeud.setVerifyInputWhenFocusTarget(true);
    jLblNoeud.setHorizontalAlignment(SwingConstants.CENTER);
    jLblNoeud.setHorizontalTextPosition(SwingConstants.CENTER);
    jLblNoeud.setText("");
    jLblNoeud.setBounds(new Rectangle(16, 43, 117, 38));
    jPanel3.setBackground(SystemColor.activeCaptionText);
    jPanel3.setBorder(border3);
    jPanel3.setBounds(new Rectangle(386, 86, 110, 119));
    jPanel3.setLayout(null);
    jCheckBox1.setSelected(true);
    jCheckBox1.setText("Liste Pères");
    jCheckBox1.setBounds(new Rectangle(11, 25, 79, 22));
    jCheckBox2.setSelected(true);
    jCheckBox2.setText("Liste Fils");
    jCheckBox2.setBounds(new Rectangle(11, 54, 79, 22));
    jCheckBox3.setToolTipText("");
    jCheckBox3.setSelected(true);
    jCheckBox3.setText("Autres");
    jCheckBox3.setBounds(new Rectangle(10, 84, 79, 22));
    jButton1.setText("Supprimer");
    jButton1.addActionListener(new Manipulation_jButton1_actionAdapter(this));
    jButton2.setBounds(new Rectangle(275, 376, 75, 26));
    jButton2.setText("jButton2");
    jButton2.addActionListener(new Manipulation_jButton2_actionAdapter(this));
    jScrollPane1.setBounds(new Rectangle(388, 208, 114, 104));
    jList1.setBackground(Color.red);
    ScrollPane.setFont(new java.awt.Font("Dialog", 1, 13));
    this.getContentPane().add(jPanel1, null);
    jPanel1.add(jTxtIdentificateur, null);
    jPanel1.add(jBtnOk, null);
    jPanel1.add(jLblIdentificateur, null);
    jPanel1.add(ScrollPane, null);
    jPanel1.add(jLblNoeud, null);
    jPanel1.add(jPanel3, null);
    jPanel3.add(jCheckBox1, null);
    jPanel3.add(jCheckBox2, null);
    jPanel3.add(jCheckBox3, null);
    jPanel1.add(jScrollPane1, null);
    jScrollPane1.getViewport().add(jList1, null);
    this.getContentPane().add(jPanel2, null);
    jPanel2.add(jButton1, null);
    jPanel2.add(jBtnModifier, null);
    jPanel2.add(jBtnUpDate, null);
    this.getContentPane().add(jButton2, null);
    ScrollPane.getViewport().add(Table);
    ArrayList l = new ArrayList();
    l.add("Noeuds");
    l.add("Pères");
    l.add("Fils");
    l.add("Relation");
    Table.setColumnsNames(l);
    //loadData();

    //ScrollPane.setBounds(new Rectangle(19, 61, 350, 100));
    ScrollPane.setBounds(new Rectangle(17, 84, 347, 223));
    a = new Object[4];
    firstopen = true;
    /*if (FentrePrincipale.graphe != null) {
      Iterator itr = FentrePrincipale.graphe.noeuds.iterator();
      Noeud n;
      while (itr.hasNext()) {
        n = (Noeud) itr.next();
        a[0] = n.getNom();
        a[1] = new Boolean(false);
        a[2] = new Boolean(false);
        a[3] = "";
        data.add(a);
        Table.addRow(a);
        a = new Object[4];
      }
         }*/
    initTable();
  }

  void initTable() {
    Table.clear();
    jLblNoeud.setText("");
    Table.setEditable(false);
    if (FentrePrincipale.graphe != null) {
      Iterator itr = FentrePrincipale.graphe.graphe.noeuds.iterator();
      Noeud n;
      data=new ArrayList();
      while (itr.hasNext()) {
        n = (Noeud) itr.next();
        a[0] = n.getNom();
        a[1] = new Boolean(false);
        a[2] = new Boolean(false);
        a[3] = "";
        data.add(a);
        Table.addRow(a);
        a = new Object[4];
      }
    }

  }

  void initTable(String elm) {
    Table.clear();
    Table.setEditable(true);
    if (FentrePrincipale.graphe != null) {
      Noeud n1 = FentrePrincipale.graphe.graphe.getNoeud(elm);
      Iterator itr = FentrePrincipale.graphe.graphe.noeuds.iterator();
      Noeud n;
      data=new ArrayList();
      while (itr.hasNext()) {
        n = (Noeud) itr.next();
        a[0] = (String)n.getNom();
       /* if (n.isPeres(n1)) {
          JOptionPane.showMessageDialog(null,
                                        n.getNom() + "est perede" + n1.getNom());
        }*/
        a[1] = new Boolean((boolean)n1.isPeres(n));
        a[2] = new Boolean(n1.isFils(n));
        a[3] = "";

        if (a[0] != elm) {
        data.add(a);
          Table.addRow(a);
          }


        a = new Object[4];
      }n=FentrePrincipale.graphe.graphe.getNoeud(elm);
          a[0] = (String)n.getNom();
          a[1] = new Boolean(false);
          a[2] = new Boolean(false);
          a[3] = "";

    }

  }

  void jBtnOk_actionPerformed(ActionEvent e) {

    Table.setEditable(true);
    if (!jTxtIdentificateur.getText().equals("")) {
      Noeud n = new Noeud(jTxtIdentificateur.getText());
      if (FentrePrincipale.graphe.graphe.contains(n.getNom())) {
        JOptionPane.showMessageDialog(null, "Le graphe contient déja ce noeud",
                                      "Noeud existant", 0);
      }
      else {
        jLblNoeud.setText(jTxtIdentificateur.getText());
        FentrePrincipale.graphe.graphe.addNoeud(n);
        a = new Object[4];
        a[0] = jTxtIdentificateur.getText();
        a[1] = new Boolean(false);
        a[2] = new Boolean(false);
        a[3] = "";
        data.add(a);
        if (firstopen != true) {
          if (data.size() > 1) {
            Table.addRow( (Object[]) data.get(data.size() - 2));

          }

        }
        firstopen = false;
        /*  Random alea = new Random();
          n.setBounds(50 + alea.nextInt(650), 10 + alea.nextInt(450),
                      n.getNom().length() * 11 + 11,
                      20);
          jPanel4.add(n, null);*/
      }
      jTxtIdentificateur.setText("");
    }

  }

  void jBtnModifier_actionPerformed(ActionEvent e) {
    //JOptionPane.showMessageDialog(null, String.valueOf(Table.getSelectedRow()));
    /*  int pos=Table.getSelectedRow();
      String s=(String)((Object[])data.get(pos))[0];
      jLblNoeud.setText((String)((Object[])data.get(pos))[0]);
      initTable(s);*/
  }

  void jBtnUpDate_actionPerformed(ActionEvent e) {
    /*   for (int i = 0; i < data.size() - 1; i++) {
         Noeud n;
         Noeud n1;
         String s;
     n = FentrePrincipale.graphe.getNoeud( (String) ( (Object[]) data.get(i))[
                                              0]);
         n1 = FentrePrincipale.graphe.getNoeud( (String) ( (Object[]) data.get(
             data.size() - 1))[0]);
         a = (Object[]) data.get(i);
         s = a[1].toString();
         if (s.equals("true")) {

           if (! (n1.isPeres(n))) {
             n1.addPère(n);
             JOptionPane.showMessageDialog(null, "Pére de +");
           }
         }
         else {
           if ( (n1.isPeres(n))) {
             n1.removePère(n);
             JOptionPane.showMessageDialog(null, "Pére de -");
           }

         }
         s = a[2].toString();
         if (s.equals("true")) {
           if (! (n1.isFils(n))) {
             JOptionPane.showMessageDialog(null, "Fils de +");
             n1.addFils(n);
           }
         }
         else {
           if ( (n1.isFils(n))) {
             JOptionPane.showMessageDialog(null, "Fils de -");
             n1.addFils(n);
           }

         }
       }
      initTable();*/
  }

  class Manipulation_jBtnOk_actionAdapter
      implements java.awt.event.ActionListener {
    Manipulation adaptee;

    Manipulation_jBtnOk_actionAdapter(Manipulation adaptee) {
      this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
      adaptee.jBtnOk_actionPerformed(e);
    }
  }

  class Manipulation_jBtnModifier_actionAdapter
      implements java.awt.event.ActionListener {
    Manipulation adaptee;

    Manipulation_jBtnModifier_actionAdapter(Manipulation adaptee) {
      this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
      adaptee.jBtnModifier_actionPerformed(e);
    }
  }

  class Manipulation_jBtnUpDate_actionAdapter
      implements java.awt.event.ActionListener {
    Manipulation adaptee;

    Manipulation_jBtnUpDate_actionAdapter(Manipulation adaptee) {
      this.adaptee = adaptee;
    }

    public void actionPerformed(ActionEvent e) {
      adaptee.jBtnUpDate_actionPerformed(e);
    }
  }

  void jTxtIdentificateur_actionPerformed(ActionEvent e) {
    jBtnOk_actionPerformed(e);
  }

  void jButton1_actionPerformed(ActionEvent e) {
    int pos = Table.getSelectedRow();
    /*Noeud n;
     n=FentrePrincipale.graphe.getNoeud( (String) ( (Object[]) data.get(pos))[
                                           0]);*/
    a = (Object[]) data.get(pos);
    String s = a[0].toString();
    FentrePrincipale.graphe.graphe.removeNoeud(s);
    data.remove(pos);
    initTable();
  }

  void jBtnUpDate_mouseClicked(MouseEvent e) {
    for (int i = 0; i < data.size() ; i++) {
      Noeud n;
      Noeud noeudAct;
      String s;
      n = FentrePrincipale.graphe.graphe.getNoeud( (String) ( (Object[]) data.get(i))[
                                           0]);
      noeudAct = FentrePrincipale.graphe.graphe.getNoeud(jLblNoeud.getText());
      a = (Object[]) data.get(i);
      s = a[1].toString();
      if (s.equals("true")) {

        if (! (noeudAct.isPeres(n))) {
          noeudAct.addPère(n);
          n.addFils(noeudAct);
//          JOptionPane.showMessageDialog(null, "Pére de +");
        }
      }
      else {
        if ( (noeudAct.isPeres(n))) {
         noeudAct.removePère(n);
         n.removeFils(noeudAct);
//          JOptionPane.showMessageDialog(null, "Pére de -");
        }

      }
      s = a[2].toString();
      if (s.equals("true")) {
        if (! (noeudAct.isFils(n))) {
          //JOptionPane.showMessageDialog(null, "Fils de +");
          noeudAct.addFils(n);
          n.addPère(noeudAct);
        }
      }
      else {
        if ( (noeudAct.isFils(n))) {
//          JOptionPane.showMessageDialog(null, "Fils de -");
          noeudAct.addFils(n);
          n.removeFils(noeudAct);
        }

      }
    }
    initTable();

  }

  void jBtnModifier_mouseClicked(MouseEvent e) {

    int pos = Table.getSelectedRow();
    if (pos > -1) {
      String s = (String) ( (Object[]) data.get(pos))[0];
      jLblNoeud.setText(s);
      initTable(s);
    }
  }

  void jButton2_actionPerformed(ActionEvent e) {
ListeNoeuds1.clear();
    int pos = Table.getSelectedRow();
        if (pos > -1) {
          String s = (String) ( (Object[]) data.get(pos))[0];
          jLblNoeud.setText(s);
          initTable(s);
          LinkedList list=new LinkedList();
          FentrePrincipale.graphe.graphe.getAscendant(FentrePrincipale.graphe.graphe.getNoeud(s),list);
          for(Iterator itr=list.iterator();itr.hasNext();){
            Noeud n= (Noeud) itr.next();
          ListeNoeuds1.addElement(n.getNom());
        }
      }

  }

  void jBtnOk_mouseClicked(MouseEvent e) {

  }
    }

class Manipulation_jBtnOk_actionAdapter
    implements java.awt.event.ActionListener {
  Manipulation adaptee;

  Manipulation_jBtnOk_actionAdapter(Manipulation adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnOk_actionPerformed(e);
  }
}

class Manipulation_jTxtIdentificateur_actionAdapter
    implements java.awt.event.ActionListener {
  Manipulation adaptee;

  Manipulation_jTxtIdentificateur_actionAdapter(Manipulation adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jTxtIdentificateur_actionPerformed(e);
  }
}

class Manipulation_jButton1_actionAdapter
    implements java.awt.event.ActionListener {
  Manipulation adaptee;

  Manipulation_jButton1_actionAdapter(Manipulation adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class Manipulation_jBtnModifier_actionAdapter
    implements java.awt.event.ActionListener {
  Manipulation adaptee;

  Manipulation_jBtnModifier_actionAdapter(Manipulation adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnModifier_actionPerformed(e);
  }
}

class Manipulation_jBtnUpDate_actionAdapter
    implements java.awt.event.ActionListener {
  Manipulation adaptee;

  Manipulation_jBtnUpDate_actionAdapter(Manipulation adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnUpDate_actionPerformed(e);
  }
}

class Manipulation_jBtnUpDate_mouseAdapter
    extends java.awt.event.MouseAdapter {
  Manipulation adaptee;

  Manipulation_jBtnUpDate_mouseAdapter(Manipulation adaptee) {
    this.adaptee = adaptee;
  }

  public void mouseClicked(MouseEvent e) {
    adaptee.jBtnUpDate_mouseClicked(e);
  }
}

class Manipulation_jBtnModifier_mouseAdapter
    extends java.awt.event.MouseAdapter {
  Manipulation adaptee;

  Manipulation_jBtnModifier_mouseAdapter(Manipulation adaptee) {
    this.adaptee = adaptee;
  }

  public void mouseClicked(MouseEvent e) {
    adaptee.jBtnModifier_mouseClicked(e);
  }
}

class Manipulation_jButton2_actionAdapter implements java.awt.event.ActionListener {
  Manipulation adaptee;

  Manipulation_jButton2_actionAdapter(Manipulation adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}

class Manipulation_jBtnOk_mouseAdapter extends java.awt.event.MouseAdapter {
  Manipulation adaptee;

  Manipulation_jBtnOk_mouseAdapter(Manipulation adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.jBtnOk_mouseClicked(e);
  }
}
