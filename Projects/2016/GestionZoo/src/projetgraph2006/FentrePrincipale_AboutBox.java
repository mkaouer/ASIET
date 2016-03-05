package projetgraph2006;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class FentrePrincipale_AboutBox extends JDialog implements ActionListener {

  JPanel panel1 = new JPanel();
  JPanel panel2 = new JPanel();
  JPanel insetsPanel1 = new JPanel();
  JPanel insetsPanel2 = new JPanel();
  JPanel insetsPanel3 = new JPanel();
  JButton button1 = new JButton();
  JLabel imageLabel = new JLabel();
  JLabel label1 = new JLabel();
  JLabel label2 = new JLabel();
  JLabel label3 = new JLabel();
  JLabel label4 = new JLabel();
  ImageIcon image1 = new ImageIcon();
  BorderLayout borderLayout2 = new BorderLayout();
  FlowLayout flowLayout1 = new FlowLayout();
  GridLayout gridLayout1 = new GridLayout();
  String product = "";
  String version = "1.0";
  String copyright = "Copyright (c) 2006";
  String comments = "";
  JLabel jLabel1 = new JLabel();

  public FentrePrincipale_AboutBox(Frame parent) {
    super(parent);
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  FentrePrincipale_AboutBox() {
    this(null);
  }

  //Initialiser le composant
  private void jbInit() throws Exception  {
    image1 = new ImageIcon(projetgraph2006.FentrePrincipale.class.getResource("about.png"));
    imageLabel.setIcon(image1);
    this.setTitle("A propos");
    panel1.setLayout(null);
    panel2.setLayout(borderLayout2);
    insetsPanel1.setLayout(flowLayout1);
    insetsPanel2.setLayout(flowLayout1);
    insetsPanel2.setBounds(10, 10, 10, 10);
    gridLayout1.setRows(4);
    gridLayout1.setColumns(1);
    label1.setText(product);
    label2.setText(version);
    label3.setText(copyright);
    label4.setText(comments);
    insetsPanel3.setLayout(gridLayout1);
    insetsPanel3.setBounds(10, 60, 10, 10);
    button1.setText("Ok");
    button1.addActionListener(new FentrePrincipale_AboutBox_button1_actionAdapter(this));
    button1.addActionListener(this);
    insetsPanel1.setBounds(0, 267, 400, 33);
    panel2.setBounds(0, 0, 400, 80);
    jLabel1.setIcon(new ImageIcon(getClass().getResource("apropos.jpg")));
    jLabel1.setText("");
    jLabel1.addMouseListener(new FentrePrincipale_AboutBox_jLabel1_mouseAdapter(this));
    insetsPanel2.add(imageLabel, null);
    panel2.add(insetsPanel2, BorderLayout.WEST);
    this.getContentPane().add(panel1, null);
    insetsPanel3.add(label1, null);
    insetsPanel3.add(label2, null);
    insetsPanel3.add(label3, null);
    insetsPanel3.add(label4, null);
    this.getContentPane().add(jLabel1, BorderLayout.CENTER);
    panel2.add(insetsPanel3, BorderLayout.CENTER);
    insetsPanel1.add(button1, null);
    panel1.add(insetsPanel1, null);
    panel1.add(panel2, null);
    setResizable(true);
  }

  //Redéfini, ainsi nous pouvons sortir quand la fenêtre est fermée
  protected void processWindowEvent(WindowEvent e) {
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      cancel();
    }
    super.processWindowEvent(e);
  }

  //Fermer le dialogue
  void cancel() {
    dispose();
  }

  //Fermer le dialogue sur un événement bouton
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button1) {
      cancel();
    }
  }

  void button1_actionPerformed(ActionEvent e) {

  }


  void jLabel1_mouseClicked(MouseEvent e) {
cancel();
  }
}

class FentrePrincipale_AboutBox_button1_actionAdapter implements java.awt.event.ActionListener {
  FentrePrincipale_AboutBox adaptee;

  FentrePrincipale_AboutBox_button1_actionAdapter(FentrePrincipale_AboutBox adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.button1_actionPerformed(e);
  }
}

class FentrePrincipale_AboutBox_jLabel1_mouseAdapter extends java.awt.event.MouseAdapter {
  FentrePrincipale_AboutBox adaptee;

  FentrePrincipale_AboutBox_jLabel1_mouseAdapter(FentrePrincipale_AboutBox adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.jLabel1_mouseClicked(e);
  }
}
