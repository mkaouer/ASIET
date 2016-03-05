package projetgraph2006;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import com.borland.internetbeans.*;
import com.borland.jbcl.layout.*;
import java.util.*;
import javax.swing.border.*;

public class FentrePrincipale
    extends JFrame {
  static Multilingue graphe;
  static String clé;
  SaisieInfo sMod;
  File fichier = null;
  JFileChooser fileChooser = new JFileChooser();
  JPanel contentPane;
  JMenuBar jMenuBar1 = new JMenuBar();
  JMenu jMenuFile = new JMenu();
  JMenuItem jMenuFileExit = new JMenuItem();
  JMenu jMenuHelp = new JMenu();
  JMenuItem jMenuHelpAbout = new JMenuItem();
  Manipulation m;
  JScrollPane ScrollPane = new JScrollPane();
  Tableur Table = new Tableur();
  JMenuItem jMenuOuvrir = new JMenuItem();
  JMenuItem jMenuSave = new JMenuItem();
  ImageIcon btn, arr;
  boolean firstopen;
  Object[] a = new Object[4];
  ArrayList data = new ArrayList();
  //Tableur Table = new Tableur();
  String[] names = {
      "Noeud", "Père", "Mère", "Relation"};
  static Bilingue animal;
 DefaultListModel ListeNoeuds1 = new DefaultListModel();
//Bilingue an;
//JList jList1 = new JList(ListeNoeuds1);

  //Construire le cadre
  public FentrePrincipale() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();
      graphe = new Multilingue();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }

  //Initialiser le composant
  private void jbInit() throws Exception {
    border3 = new EtchedBorder(EtchedBorder.RAISED, Color.white,
                               new Color(148, 145, 140));
    titledBorder4 = new TitledBorder(border3, "Langue");
    border4 = new EtchedBorder(EtchedBorder.RAISED, Color.white,
                               new Color(148, 145, 140));
    Table.setFont(new java.awt.Font("Dialog", 1, 13));
    Table.setBorder(BorderFactory.createLoweredBevelBorder());
    Table.setRowHeight(25);
    Table.setRowMargin(2);

    contentPane = (JPanel)this.getContentPane();
    border1 = new EtchedBorder(EtchedBorder.RAISED, Color.white,
                               new Color(178, 178, 178));
    titledBorder1 = new TitledBorder(border1, "Noeud Actuel");
    border2 = BorderFactory.createBevelBorder(BevelBorder.LOWERED, Color.white,
                                              Color.white,
                                              new Color(103, 101, 98),
                                              new Color(148, 145, 140));
    titledBorder2 = new TitledBorder(border2, "Afficher");
    titledBorder3 = new TitledBorder("");
    contentPane.setLayout(null);
    this.setLocale(java.util.Locale.getDefault());
    this.setResizable(false);
    this.setSize(800, 652);
    this.setState(Frame.NORMAL);
    this.setTitle("Monde des Animaux");
    jMenuFile.setText("Fichier");
    jMenuFileExit.setText("Quitter");
    jMenuFileExit.addActionListener(new
                                    FentrePrincipale_jMenuFileExit_ActionAdapter(this));
    jMenuHelp.setText("Aide");
    jMenuHelpAbout.setText("A propos");
    jMenuHelpAbout.addActionListener(new
                                     FentrePrincipale_jMenuHelpAbout_ActionAdapter(this));
    contentPane.setBackground(Color.white);
    contentPane.setOpaque(true);
    jMenuOuvrir.setText("Ouvrir");
    jMenuOuvrir.addActionListener(new
                                  FentrePrincipale_jMenuOuvrir_actionAdapter(this));
    jMenuSave.setText("Enregistrer");
    jMenuSave.addActionListener(new FentrePrincipale_jMenuSave_actionAdapter(this));
    jMenuSaveAs.addActionListener(new
                                  FentrePrincipale_jMenuSaveAs_actionAdapter(this));
    ScrollPane.getViewport().setBackground(SystemColor.activeCaptionBorder);
    ScrollPane.setFont(new java.awt.Font("Dialog", 1, 13));
    ScrollPane.setBounds(207, 222, 404, 274);
    Table.setEditable(false);
    jLblNoeud.setBackground(Color.lightGray);
    jLblNoeud.setFont(new java.awt.Font("Dialog", 1, 11));
    jLblNoeud.setBorder(titledBorder1);
    jLblNoeud.setOpaque(true);
    jLblNoeud.setText("");
    jLblNoeud.setBounds(209, 173, 117, 44);
    jTxtIdentificateur.setText("");
    jTxtIdentificateur.setBounds(328, 127, 107, 33);
    jTxtIdentificateur.addActionListener(new
                                         FentrePrincipale_jTxtIdentificateur_actionAdapter(this));
    jLblIdentificateur.setFont(new java.awt.Font("Dialog", 1, 14));
    jLblIdentificateur.setText("Identificateur :");
    jLblIdentificateur.setBounds(211, 129, 104, 26);
    jButton1.setBounds(447, 117, 127, 52);
    jButton1.setBorderPainted(false);
    jButton1.setContentAreaFilled(false);
    jButton1.setFocusPainted(false);
    jButton1.setIcon(new ImageIcon(getClass().getResource("ajn.jpg")));
    jButton1.setRolloverIcon(new ImageIcon(getClass().getResource("aj2.jpg")));
    jButton1.addActionListener(new FentrePrincipale_jButton1_actionAdapter(this));
    jButton1.addActionListener(new FentrePrincipale_jButton1_actionAdapter(this));
    jBtnModifier.setRolloverIcon(new ImageIcon(getClass().getResource(
        "mn2.jpg")));
    jBtnModifier.addActionListener(new
                                   FentrePrincipale_jBtnModifier_actionAdapter(this));
    jBtnModifier.setIcon(new ImageIcon(getClass().getResource("mn.jpg")));
    jBtnModifier.setFocusPainted(false);
    jBtnModifier.setContentAreaFilled(false);
    jBtnModifier.setBorderPainted(false);
    jBtnModifier.setBounds(43, 258, 127, 52);
    jBtnSupp.setIcon(new ImageIcon(getClass().getResource("sn1.jpg")));
    jBtnSupp.setRolloverIcon(new ImageIcon(getClass().getResource("sn2.jpg")));
    jBtnSupp.addActionListener(new FentrePrincipale_jBtnSupp_actionAdapter(this));
    jBtnSupp.setFocusPainted(false);
    jBtnSupp.setContentAreaFilled(false);
    jBtnSupp.setBorderPainted(false);
    jBtnSupp.setBounds(42, 345, 127, 52);
    jBtnUpDate.setRolloverIcon(new ImageIcon(getClass().getResource("un2.jpg")));
    jBtnUpDate.addActionListener(new FentrePrincipale_jBtnUpDate_actionAdapter(this));
    jBtnUpDate.setIcon(new ImageIcon(getClass().getResource("un1.jpg")));
    jBtnUpDate.setFocusPainted(false);
    jBtnUpDate.setContentAreaFilled(false);
    jBtnUpDate.setBorderPainted(false);
    jBtnUpDate.setBounds(43, 330, 127, 52);
    jCheckBox2.setFont(new java.awt.Font("Monotype Corsiva", 1, 14));
    jCheckBox2.setForeground(new Color(0, 90, 160));
    jCheckBox2.setBorder(BorderFactory.createEtchedBorder());
    jCheckBox2.setBorderPainted(true);
    jCheckBox2.setSelected(true);
    jCheckBox2.setText("Liste des Fils");
    jCheckBox2.setBorderPaintedFlat(true);
    jCheckBox2.setBounds(9, 53, 126, 27);
    jCheckBox1.setFont(new java.awt.Font("Monotype Corsiva", 1, 14));
    jCheckBox1.setForeground(new Color(0, 90, 160));
    jCheckBox1.setBorder(BorderFactory.createEtchedBorder());
    jCheckBox1.setBorderPainted(true);
    jCheckBox1.setSelected(true);
    jCheckBox1.setText("Liste des Pères");
    jCheckBox1.setBounds(10, 24, 126, 27);
    jCheckBox3.setFont(new java.awt.Font("Monotype Corsiva", 1, 14));
    jCheckBox3.setForeground(new Color(0, 90, 160));
    jCheckBox3.setBorder(BorderFactory.createEtchedBorder());
    jCheckBox3.setToolTipText("");
    jCheckBox3.setBorderPainted(true);
    jCheckBox3.setSelected(true);
    jCheckBox3.setText("Liste des Autres");
    jCheckBox3.setBounds(10, 82, 126, 27);
    jPanel3.setBackground(SystemColor.inactiveCaptionText);
    jPanel3.setFont(new java.awt.Font("Dialog", 1, 14));
    jPanel3.setBorder(titledBorder2);
    jPanel3.setDebugGraphicsOptions(0);
    jPanel3.setOpaque(true);
    jPanel3.setPreferredSize(new Dimension(1, 1));
    jPanel3.setBounds(623, 241, 150, 123);
    jPanel3.setLayout(null);
    jPanel3.setVisible(false);
    jLabel1.setBackground(Color.lightGray);
    jLabel1.setOpaque(false);
    jLabel1.setIcon(new ImageIcon(getClass().getResource("bg1.jpg")));
    jLabel1.setBounds(0, 0, 800, 601);
    jLabel1.setBounds(0, 0, 802, 603);
    francais.setBorder(border4);
    francais.setOpaque(false);
    francais.setPreferredSize(new Dimension(67, 23));
    francais.setText("Francais");
    francais.setBounds(11, 26, 135, 23);
    francais.addActionListener(new FentrePrincipale_francais_actionAdapter(this));
    anglais.setOpaque(false);
    anglais.setText("Anglais");
    anglais.setBounds(11, 54, 135, 23);
    anglais.addActionListener(new FentrePrincipale_anglais_actionAdapter(this));
    jPaneLang.setBorder(titledBorder4);
    jPaneLang.setOpaque(false);
    jPaneLang.setBounds(613, 118, 157, 91);
    jPaneLang.setLayout(null);
    jMenuSaveAs.setText("Enregistrer Sous");
    jMenuNew.setText("Nouveau");
    jMenuNew.addActionListener(new FentrePrincipale_jMenuNew_actionAdapter(this));
    jBtnAfficher.setBounds(335, 505, 125, 43);
    jBtnAfficher.setOpaque(false);
    jBtnAfficher.setBorderPainted(false);
    jBtnAfficher.setContentAreaFilled(false);
    jBtnAfficher.setText("");
    jBtnAfficher.addActionListener(new FentrePrincipale_jBtnAfficher_actionAdapter(this));
    jMenuFile.add(jMenuNew);
    jMenuFile.add(jMenuOuvrir);
    jMenuFile.addSeparator();
    jMenuFile.add(jMenuSave);
    jMenuFile.add(jMenuSaveAs);
    jMenuFile.addSeparator();
    jMenuFile.add(jMenuFileExit);
    jMenuHelp.add(jMenuHelpAbout);
    jMenuBar1.add(jMenuFile);
    jMenuBar1.add(jMenuHelp);

    this.setJMenuBar(jMenuBar1);
    contentPane.add(jBtnModifier, null);
    contentPane.add(jLblNoeud, null);
    contentPane.add(ScrollPane, null);
    contentPane.add(jBtnSupp, null);
    jPanel3.add(jCheckBox3, null);
    jPanel3.add(jCheckBox1, null);
    jPanel3.add(jCheckBox2, null);
    contentPane.add(jPanel3, null);
    contentPane.add(jTxtIdentificateur, null);
    contentPane.add(jButton1, null);
    contentPane.add(jPaneLang, null);
    ScrollPane.add(Table);
    ScrollPane.getViewport().add(Table);
    ArrayList l = new ArrayList();
    l.add("Noeuds");
    l.add("Pères");
    l.add("Fils");
    l.add("Relation");
    Choix.add(francais);
    Choix.add(anglais);
    francais.setSelected(true);
    Table.setColumnsNames(l);
    //loadData();

    //ScrollPane.setBounds(19, 61, 350, 100);
    //ScrollPane.setBounds(17, 84, 347, 223);
    a = new Object[4];
    firstopen = true;
    initTable();
    jPaneLang.add(francais);
    jPaneLang.add(anglais);
    contentPane.add(jBtnAfficher, null);
    contentPane.add(jBtnUpDate, null);
    contentPane.add(jLblIdentificateur, null);
    contentPane.add(jLabel1, null);
    jBtnModifier.setVisible(false);
    jBtnSupp.setVisible(false);
    jBtnAfficher.setIcon(new ImageIcon(getClass().getResource("dn2.jpg")));
    jBtnAfficher.setRolloverIcon(new ImageIcon(getClass().getResource("dn1.jpg")));

  } //fin jbInit

  void initTable() {
    Table.clear();
    jLblNoeud.setText("");
    Table.setEditable(false);
    if (FentrePrincipale.graphe != null) {
      Iterator itr = graphe.graphe.noeuds.iterator();
      Noeud n;

      data = new ArrayList();
      while (itr.hasNext()) {
        n = (Noeud) itr.next();
        animal = (Bilingue) graphe.dico.get(n.getNom());
        if (francais.isSelected()) {
          a[0] = animal.Francais.getNom();
        }
        else {
          a[0] = animal.Anglais.getNom();
        }
        a[1] = new Boolean(false);
        a[2] = new Boolean(false);
        a[3] = "";
        data.add(a);
        Table.addRow(a);
        a = new Object[4];
      }
    }

  }

  /* void initTable() {
       Table.clear();
       jLblNoeud.setText("");
       Table.setEditable(false);
       if (FentrePrincipale.graphe != null) {
         Iterator itr = graphe.graphe.noeuds.iterator();
         Noeud n;

         data = new ArrayList();
         while (itr.hasNext()) {
           n = (Noeud) itr.next();
           animal=(Bilingue)graphe.dico.get(n.getNom());
           a[0] = n.getNom();
           a[1] = new Boolean(false);
           a[2] = new Boolean(false);
           a[3] = "";
           data.add(a);
           Table.addRow(a);
           a = new Object[4];
         }
       }

     }*/

  void affContenu(Noeud n) {
    animal = new Bilingue();
    sMod = new SaisieInfo();
    Dimension dlg=getSize();
      Point p=getLocation();

       sMod.setBounds(375, 330, 375, 330);


    sMod.setModal(true);
    sMod.jTxtFIdentificateur.setText(n.getNom());
    animal = getObjHash(n, graphe.dico);
    sMod.setUndecorated(true);
    if (francais.isSelected()) {
      sMod.jCmbxlangue.setSelectedIndex(0);
      if (animal != null) {
        sMod.jCmbxCatégorie.setSelectedItem(animal.Francais.Catégorie);
        sMod.jCmbxOrigine.setSelectedItem(animal.Francais.Origine);
        sMod.jCmbxRégimeAlimentaire.setSelectedItem(animal.Francais.RégimeAli);
        sMod.jTxtFDurée.setText(animal.Francais.DuréeIncub);
        sMod.jTxtFLongévité.setText(animal.Francais.Longévité);
        sMod.jTxtFVitesse.setText(animal.Francais.Vitesse);
      }
    }
    else {
      sMod.jCmbxlangue.setSelectedIndex(1);
      if (animal.Francais != null) {
        sMod.jCmbxCatégorie.setSelectedItem(animal.Anglais.Catégorie);
        sMod.jCmbxOrigine.setSelectedItem(animal.Anglais.Origine);
        sMod.jCmbxRégimeAlimentaire.setSelectedItem(animal.Anglais.RégimeAli);
        sMod.jTxtFDurée.setText(animal.Anglais.DuréeIncub);
        sMod.jTxtFLongévité.setText(animal.Anglais.Longévité);
        sMod.jTxtFVitesse.setText(animal.Anglais.Vitesse);
      }
    }
    sMod.show();

  }

  Bilingue getObjHash(Noeud n, Hashtable dico) {
    return (Bilingue) dico.get(n.getNom());
  }

  void initTable(String elm) {
    Table.clear();
    Table.setEditable(true);
    if (FentrePrincipale.graphe != null) {
      Noeud n1 = graphe.graphe.getNoeud(elm);
      clé=n1.getNom();
      affContenu(n1);

      Iterator itr = graphe.graphe.noeuds.iterator();
      Noeud n;
      Arête arr;
      data = new ArrayList();
      while (itr.hasNext()) {
        n = (Noeud) itr.next();
        if(francais.isSelected()){

          a[0] = ((Bilingue)graphe.dico.get(n.getNom())).Francais.getNom();
    }else{
      a[0] = ((Bilingue)graphe.dico.get(n.getNom())).Anglais.getNom();
    }
        /* if (n.isPeres(n1)) {
           JOptionPane.showMessageDialog(null,
         n.getNom() + "est perede" + n1.getNom());
         }*/
        a[1] = new Boolean( (boolean) n1.isPeres(n));
        a[2] = new Boolean(n1.isFils(n));
        if (n1.isPeres(n)) {
          Iterator itr2 = graphe.graphe.arêtes.iterator();
          while (itr2.hasNext()) {
            arr = (Arête) itr2.next();
            if ( ( (arr.début == n) && (arr.fin == n1)) ||
                ( (arr.début == n1) && (arr.fin == n))) {
              a[3] = arr.getNom();
              break;
            }
          }
        }
        else {
          if (n1.isFils(n)) {
            Iterator itr2 = graphe.graphe.arêtes.iterator();
            while (itr2.hasNext()) {
              arr = (Arête) itr2.next();
              if ( ( (arr.début == n) && (arr.fin == n1)) ||
                  ( (arr.début == n1) && (arr.fin == n))) {
                a[3] = arr.getNom();
                break;
              }
            }
          }
          else {

            a[3] = "";
          }

        }

        if ((a[0] !=  ((Bilingue)graphe.dico.get(n1.getNom())).Francais.getNom())&&(a[0] !=  ((Bilingue)graphe.dico.get(n1.getNom())).Anglais.getNom()) ){
          data.add(a);
          Table.addRow(a);
        }

        a = new Object[4];
      }
    /*  n = graphe.graphe.getNoeud(elm);
      a[0] = (String) n.getNom();
      a[1] = new Boolean(false);
      a[2] = new Boolean(false);
      a[3] = "";*/

    }

  }

  void modTrait() {
    initTable();
    jBtnModifier.setVisible(true);
    jBtnSupp.setVisible(true);
    jBtnUpDate.setVisible(false);
francais.setEnabled(true);
anglais.setEnabled(true);
  }

  void modSaisie() {
    jBtnModifier.setVisible(false);
    jBtnSupp.setVisible(false);
    jBtnUpDate.setVisible(true);
    francais.setEnabled(false);
anglais.setEnabled(false);
  }

  void open() {
    fileChooser.showOpenDialog(null);
    if (fileChooser.getSelectedFile() != null) {
      fichier = fileChooser.getSelectedFile();
      try {
        FileInputStream fis = new FileInputStream(fichier);
        ObjectInputStream ois = new ObjectInputStream(fis);
        graphe = (Multilingue) ois.readObject();
        ois.close();
        modTrait();
      }
      catch (Exception err) {
        System.out.println("Erreur" + err);
      }
    }
  }

  void save() {
    if (fichier != null) {
      try {
        FileOutputStream fis = new FileOutputStream(fichier);
        ObjectOutputStream ois = new ObjectOutputStream(fis);
        ois.writeObject(graphe);
        ois.close();
      }
      catch (Exception err) {
        System.out.println("Erreur" + err);
      }
    }
    else {
      saveAs();
    }
  }

  void saveAs() {
    fileChooser.showSaveDialog(null);
    if (fileChooser.getSelectedFile() != null) {
      fichier = fileChooser.getSelectedFile();
      try {
        FileOutputStream fis = new FileOutputStream(fichier);
        ObjectOutputStream ois = new ObjectOutputStream(fis);
        ois.writeObject(graphe);
        ois.close();
      }
      catch (Exception err) {
        System.out.println("Erreur" + err);
      }
    }
  }

//Opération Fichier | Quitter effectuée
  public void jMenuFileExit_actionPerformed(ActionEvent e) {
    if (graphe.graphe.modifié) {
         switch (JOptionPane.showConfirmDialog(null,
                                               "Voulez-vous sauvgarder le Graphe en cours ?",
                                               "Enregistrement", 1)) {
           case 0 :
             save();
             System.exit(0);
             case 1 :
            System.exit(0);
         }}


  }

//Opération Aide | A propos effectuée
  public void jMenuHelpAbout_actionPerformed(ActionEvent e) {
    FentrePrincipale_AboutBox dlg = new FentrePrincipale_AboutBox(this);
    Dimension dlgSize = dlg.getPreferredSize();
    Dimension frmSize = getSize();
    Point loc = getLocation();
    dlg.setLocation( (frmSize.width - dlgSize.width) / 2 + loc.x,
                    (frmSize.height - dlgSize.height) / 2 + loc.y);
    dlg.setModal(true);
    dlg.pack();
    dlg.show();
  }

//Redéfini, ainsi nous pouvons sortir quand la fenêtre est fermée
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      //jMenuFileExit_actionPerformed(null);
      System.exit(0);
    }
  }

  void jBtnManipulation_actionPerformed(ActionEvent e) {
    m = new Manipulation();
    m.setBounds(270, 200, 530, 400);
    m.repaint();
    m.setVisible(true);

  }

  void jMenuOuvrir_actionPerformed(ActionEvent e) {
    if (graphe.graphe.modifié) {
         switch (JOptionPane.showConfirmDialog(null,
                                               "Voulez-vous sauvgarder le Graphe en cours ?",
                                               "Enregistrement", 1)) {
           case 0 :
             save();
             open();
             case 1 :
            open();
         }}
else{open();
}

  }

  void jMenuSave_actionPerformed(ActionEvent e) {
    save();
  }

  JLabel jLblNoeud = new JLabel();
  JTextField jTxtIdentificateur = new JTextField();
  JLabel jLblIdentificateur = new JLabel();
  JButton jButton1 = new JButton();
  JButton jBtnModifier = new JButton();
  JButton jBtnSupp = new JButton();
  JButton jBtnUpDate = new JButton();

  Border border1;
  TitledBorder titledBorder1;
  JCheckBox jCheckBox2 = new JCheckBox();
  JCheckBox jCheckBox1 = new JCheckBox();
  JCheckBox jCheckBox3 = new JCheckBox();
  JPanel jPanel3 = new JPanel();
  Border border2;
  TitledBorder titledBorder2;
  JLabel jLabel1 = new JLabel();
  TitledBorder titledBorder3;
  JRadioButton francais = new JRadioButton();
  JRadioButton anglais = new JRadioButton();
  ButtonGroup Choix = new ButtonGroup();
  JPanel jPaneLang = new JPanel();
  Border border3;
  TitledBorder titledBorder4;
  Border border4;
  JMenuItem jMenuSaveAs = new JMenuItem();
  JMenuItem jMenuNew = new JMenuItem();
  JButton jBtnAfficher = new JButton();

  void jButton1_actionPerformed(ActionEvent e) {
    Table.setEditable(true);
    if (!jTxtIdentificateur.getText().equals("")) {
      Noeud n = new Noeud(jTxtIdentificateur.getText());
      if (graphe.graphe.contains(n.getNom())) {
        JOptionPane.showMessageDialog(null, "Le graphe contient déja ce noeud",
                                      "Noeud existant", 0);
      }
      else {
        animal = new Bilingue();
        SaisieInfo s = new SaisieInfo();
        Dimension dlg=getSize();
      Point p=getLocation();

       s.setBounds(375, 330, 375, 330);


        s.setModal(true);
        s.jTxtFIdentificateur.setText(n.getNom());
        s.setUndecorated(true);
        s.jBtnFermer.setEnabled(false);
        clé = n.getNom();
        if (francais.isSelected()) {
          s.jCmbxlangue.setSelectedIndex(0);
        }
        else {
          s.jCmbxlangue.setSelectedIndex(1);
        }

        s.show();
        //jLblNoeud.setText(s);
if (francais.isSelected()){
        jLblNoeud.setText(animal.Francais.getNom());
      }else{
        jLblNoeud.setText(animal.Anglais.getNom());
      }
        graphe.graphe.addNoeud(n);

        graphe.graphe.modifié = true;
        modSaisie();
        a = new Object[4];
        a[0] = jLblNoeud.getText();
        a[1] = new Boolean(false);
        a[2] = new Boolean(false);
        a[3] = "";
        data.add(a);

        if (firstopen != true) {
          if (data.size() > 1) {
           // Table.addRow( (Object[]) data.get(data.size() - 2));
initTable(getclé(jLblNoeud.getText()));
          }

        }
        firstopen = false;
      }
      jTxtIdentificateur.setText("");
    }

  }

  void jTxtIdentificateur_actionPerformed(ActionEvent e) {
    jButton1_actionPerformed(e);
  }
static String getclé(String s){
  Enumeration itr=graphe.dico.keys();
String  key;
  while(itr.hasMoreElements()){
  key=(String)itr.nextElement();
  animal=(Bilingue)graphe.dico.get(key);
  if((animal.Francais.getNom()==s)||(animal.Anglais.getNom()==s)){
        return key;
      }
    }return "";
}
  void jBtnModifier_actionPerformed(ActionEvent e) {

    int pos = Table.getSelectedRow();
    if (pos > -1) {
      String s = (String) ( (Object[]) data.get(pos))[0];
      jLblNoeud.setText(s);
      initTable(getclé(s));
      modSaisie();
      jPaneLang.setEnabled(false);
    }else{
      JOptionPane.showMessageDialog(null,"Vous devez selectionner un élément");
    }


  }

  void jBtnSupp_actionPerformed(ActionEvent e) {
    int pos = Table.getSelectedRow();
    /*Noeud n;
     n=FentrePrincipale.graphe.getNoeud( (String) ( (Object[]) data.get(pos))[
                                           0]);*/
    if (pos > -1) {
      a = (Object[]) data.get(pos);
      String s = getclé(a[0].toString());
      FentrePrincipale.graphe.removeAnimal(s);
      data.remove(pos);
      initTable();
    }
  }

  void jBtnUpDate_actionPerformed(ActionEvent e) {
   if (jLblNoeud.getText()!=""){
    for (int i = 0; i < data.size(); i++) {
      Noeud n;
      Noeud noeudAct;
      String s;
      n = FentrePrincipale.graphe.graphe.getNoeud( getclé((String) ( (Object[]) data.
          get(
          i))[0]));
     noeudAct = FentrePrincipale.graphe.graphe.getNoeud(getclé(jLblNoeud.getText()));

      a = (Object[]) data.get(i);
      s = a[1].toString();
      if (s.equals("true")) {

        if (! (noeudAct.isPeres(n))) {
          noeudAct.addPère(n);
          n.addFils(noeudAct);
          Arête arr = new Arête(n, noeudAct, a[3].toString());
          if (!graphe.graphe.arêtes.contains(arr)) {
            graphe.graphe.addArête(arr);
          }

//          JOptionPane.showMessageDialog(null, "Pére de +");
        }
      }
      else {
        if ( (noeudAct.isPeres(n))) {
          noeudAct.removePère(n);
          n.removeFils(noeudAct);
          if (!noeudAct.isFils(n)) {
            graphe.graphe.removeArrête(n, noeudAct);
          }
//          JOptionPane.showMessageDialog(null, "Pére de -");
        }

      }
      s = a[2].toString();
      if (s.equals("true")) {
        if (! (noeudAct.isFils(n))) {
          //JOptionPane.showMessageDialog(null, "Fils de +");
          noeudAct.addFils(n);
          n.addPère(noeudAct);
          Arête arr = new Arête(noeudAct, n, a[3].toString());
          if (!graphe.graphe.arêtes.contains(arr)) {
            graphe.graphe.addArête(arr);
          }
        }
      }
      else {
        if ( (noeudAct.isFils(n))) {
//          JOptionPane.showMessageDialog(null, "Fils de -");
          noeudAct.removeFils(n);
          n.removeFils(noeudAct);
          if (!n.isFils(noeudAct)) {
            graphe.graphe.removeArrête(noeudAct,n);
          }
        }

      }
    }
    if ( (data.size() > 0) || (jLblNoeud.getText() != null)) {
      initTable();
      modTrait();
    }

  }
  }
  void jMenuSaveAs_actionPerformed(ActionEvent e) {
    saveAs();
  }

  void jMenuNew_actionPerformed(ActionEvent e) {
    if (graphe.graphe.modifié) {
      switch (JOptionPane.showConfirmDialog(null,
                                            "Voulez-vous sauvgarder le Graphe en cours ?",
                                            "Enregistrement", 1)) {
        case 0:
          save();
          graphe = new Multilingue();

          break;
        case 1:
          graphe = new Multilingue();

      }
      fichier = null;
    }
    else {
      graphe = new Multilingue();
      fichier = null;
    }

    initTable();
    modSaisie();
  }

  void jButton6_actionPerformed(ActionEvent e) {
    int pos = Table.getSelectedRow();
    if (pos > -1) {
      String s = (String) ( (Object[]) data.get(pos))[0];
      jLblNoeud.setText(s);
      initTable(s);
      LinkedList list = new LinkedList();
      graphe.graphe.getAscendant(graphe.graphe.getNoeud(s), list);
      for (Iterator itr = list.iterator(); itr.hasNext(); ) {
        Noeud n = (Noeud) itr.next();

      }
    }

  }

  void francais_actionPerformed(ActionEvent e) {
    initTable();
  }

  void anglais_actionPerformed(ActionEvent e) {
    initTable();
  }

  void jBtnAfficher_actionPerformed(ActionEvent e) {

    int pos = Table.getSelectedRow();
    if (pos > -1) {

      String s = getclé((String) ( (Object[]) data.get(pos))[0]);
      AfficheInfo AI=new AfficheInfo();
      AI.setUndecorated(true);
      AI.setModal(true);
      AI.jList1=new JList(ListeNoeuds1);

       animal=(Bilingue)graphe.dico.get(s);
      if(francais.isSelected()){
        AI.jCmbxlangue.setSelectedIndex(0);
        AI.jTxtFIdentificateur.setText(animal.Francais.getNom());

      }
      else
      {
          AI.jCmbxlangue.setSelectedIndex(1);
        AI.jTxtFIdentificateur.setText(animal.Anglais.getNom());
      }
Dimension dlg=getSize();
      Point p=getLocation();

       AI.setBounds(572, 450, 572, 450);
AI.show();
    }else{
      JOptionPane.showMessageDialog(null,"Vous devez selectionner un élément");
    }


}
}

class FentrePrincipale_jMenuFileExit_ActionAdapter
    implements ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jMenuFileExit_ActionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuFileExit_actionPerformed(e);
  }
}

class FentrePrincipale_jMenuHelpAbout_ActionAdapter
    implements ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jMenuHelpAbout_ActionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuHelpAbout_actionPerformed(e);
  }
}

class FentrePrincipale_jMenuOuvrir_actionAdapter
    implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jMenuOuvrir_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuOuvrir_actionPerformed(e);
  }
}

class FentrePrincipale_jMenuSaveAs_actionAdapter
    implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jMenuSaveAs_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuSaveAs_actionPerformed(e);
  }
}

class FentrePrincipale_jMenuSave_actionAdapter
    implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jMenuSave_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuSave_actionPerformed(e);
  }
}

/*class FentrePrincipale_jButton1_actionAdapter
    implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jButton1_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}*/

class FentrePrincipale_jTxtIdentificateur_actionAdapter
    implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jTxtIdentificateur_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jTxtIdentificateur_actionPerformed(e);
  }
}

class FentrePrincipale_jBtnModifier_actionAdapter
    implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jBtnModifier_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnModifier_actionPerformed(e);
  }
}

class FentrePrincipale_jBtnSupp_actionAdapter
    implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jBtnSupp_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnSupp_actionPerformed(e);
  }
}

class FentrePrincipale_jBtnUpDate_actionAdapter
    implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jBtnUpDate_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {

      adaptee.jBtnUpDate_actionPerformed(e);


  }
}

/*class FentrePrincipale_jMenuItem1_actionAdapter implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jMenuItem1_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuItem1_actionPerformed(e);
  }
 }*/

class FentrePrincipale_jMenuNew_actionAdapter
    implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jMenuNew_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuNew_actionPerformed(e);
  }
}

class FentrePrincipale_francais_actionAdapter
    implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_francais_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.francais_actionPerformed(e);
  }
}

class FentrePrincipale_anglais_actionAdapter
    implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_anglais_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }

  public void actionPerformed(ActionEvent e) {
    adaptee.anglais_actionPerformed(e);
  }
}

class FentrePrincipale_jBtnAfficher_actionAdapter implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jBtnAfficher_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jBtnAfficher_actionPerformed(e);
  }
}

class FentrePrincipale_jButton1_actionAdapter implements java.awt.event.ActionListener {
  FentrePrincipale adaptee;

  FentrePrincipale_jButton1_actionAdapter(FentrePrincipale adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}
