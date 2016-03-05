package Vue;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Point;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JComboBox;

import Controleur.CtrlAjoutEmploye;

public class FenAjoutEmpl extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel = null;
	private JButton jButtonEmploy� = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JTextField jTextFieldNom = null;
	private JTextField jTextFieldAdress = null;
	private JTextField jTextFieldCP = null;
	private JTextField jTextFieldVille = null;
	private JTextField jTextFieldPnom = null;
	private JLabel jLabel5 = null;
	private JComboBox jComboBoxAgence = null;
	private JLabel jLabel6 = null;
	private JComboBox jComboBoxCategorie = null;
	/**
	 * This is the default constructor
	 */
	public FenAjoutEmpl() {
		super();
		initialize();
		this.setLocation(400, 200);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(403, 266);
		this.setContentPane(getJPanel());
		this.setTitle("Ajouter un employ�");
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel6 = new JLabel();
			jLabel6.setText("Agence");
			jLabel6.setSize(new Dimension(70, 15));
			jLabel6.setLocation(new Point(20, 170));
			jLabel5 = new JLabel();
			jLabel5.setText("Categorie");
			jLabel5.setLocation(new Point(20, 145));
			jLabel5.setSize(new Dimension(70, 15));
			jLabel4 = new JLabel();
			jLabel4.setText("Adresse");
			jLabel4.setLocation(new Point(20, 70));
			jLabel4.setSize(new Dimension(70, 15));
			jLabel3 = new JLabel();
			jLabel3.setText("Ville");
			jLabel3.setLocation(new Point(20, 120));
			jLabel3.setSize(new Dimension(70, 15));
			jLabel2 = new JLabel();
			jLabel2.setText("Prenom");
			jLabel2.setLocation(new Point(20, 45));
			jLabel2.setSize(new Dimension(70, 15));
			jLabel1 = new JLabel();
			jLabel1.setText("Code Postal");
			jLabel1.setLocation(new Point(20, 95));
			jLabel1.setSize(new Dimension(70, 15));
			jLabel = new JLabel();
			jLabel.setText("Nom");
			jLabel.setLocation(new Point(20, 20));
			jLabel.setSize(new Dimension(70, 15));
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.add(getJButton(), null);
			jPanel.add(jLabel, null);
			jPanel.add(jLabel1, null);
			jPanel.add(jLabel2, null);
			jPanel.add(jLabel3, null);
			jPanel.add(jLabel4, null);
			jPanel.add(getJTextField(), null);
			jPanel.add(getJTextField1(), null);
			jPanel.add(getJTextField2(), null);
			jPanel.add(getJTextField3(), null);
			jPanel.add(getJTextField4(), null);
			jPanel.add(jLabel5, null);
			jPanel.add(getJComboBoxAgence(), null);
			jPanel.add(jLabel6, null);
			jPanel.add(getJComboBoxCategorie(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButtonEmploy� == null) {
			jButtonEmploy� = new JButton();
			jButtonEmploy�.setBounds(new Rectangle(154, 202, 197, 24));
			jButtonEmploy�.setText("Ajouter un employ�");
		}
		return jButtonEmploy�;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextFieldNom == null) {
			jTextFieldNom = new JTextField();
			jTextFieldNom.setSize(new Dimension(150, 20));
			jTextFieldNom.setLocation(new Point(130, 20));
		}
		return jTextFieldNom;
	}

	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField1() {
		if (jTextFieldAdress == null) {
			jTextFieldAdress = new JTextField();
			jTextFieldAdress.setSize(new Dimension(150, 20));
			jTextFieldAdress.setLocation(new Point(130, 70));
		}
		return jTextFieldAdress;
	}

	/**
	 * This method initializes jTextField2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField2() {
		if (jTextFieldCP == null) {
			jTextFieldCP = new JTextField();
			jTextFieldCP.setSize(new Dimension(150, 20));
			jTextFieldCP.setLocation(new Point(130, 95));
		}
		return jTextFieldCP;
	}

	/**
	 * This method initializes jTextField3	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField3() {
		if (jTextFieldVille == null) {
			jTextFieldVille = new JTextField();
			jTextFieldVille.setSize(new Dimension(150, 20));
			jTextFieldVille.setLocation(new Point(130, 120));
		}
		return jTextFieldVille;
	}

	/**
	 * This method initializes jTextField4	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField4() {
		if (jTextFieldPnom == null) {
			jTextFieldPnom = new JTextField();
			jTextFieldPnom.setSize(new Dimension(150, 20));
			jTextFieldPnom.setLocation(new Point(130, 45));
		}
		return jTextFieldPnom;
	}

	/**
	 * This method initializes jComboBoxAgence	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxAgence() {
		if (jComboBoxAgence == null) {
			jComboBoxAgence = new JComboBox();
			jComboBoxAgence.setPreferredSize(new Dimension(150, 20));
			jComboBoxAgence.setSize(new Dimension(150, 20));
			jComboBoxAgence.setLocation(new Point(130, 170));
		}
		return jComboBoxAgence;
	}
	/**
	 * This method initializes jComboBoxCategorie	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxCategorie() {
		if (jComboBoxCategorie == null) {
			jComboBoxCategorie = new JComboBox();
			jComboBoxCategorie.setSize(new Dimension(150, 20));
			jComboBoxCategorie.setLocation(new Point(130, 145));
		}
		return jComboBoxCategorie;
	}
	public String getNom()
	{
		return this.jTextFieldNom.getText();
	}
	public String getPNom()
	{
		return this.jTextFieldPnom.getText();
	}
	public String getAdresse()
	{
		return this.jTextFieldAdress.getText();
	}
	public String getCodePostal()
	{
		return this.jTextFieldCP.getText();
	}
	public String getVille()
	{
		return this.jTextFieldVille.getText();
	}
	public int getnumAgneceSelect()
	{
		return this.jComboBoxAgence.getSelectedIndex();
	}
	public int getCodeCategorie()
	{
		return this.jComboBoxCategorie.getSelectedIndex()+1;
	}
	public void setListAgence(Vector vect)
	{
		jComboBoxAgence.removeAllItems();
		for (int i = 0; i < vect.size(); i++)
		{
			jComboBoxAgence.addItem(vect.get(i));
			System.out.println(vect.get(i));
		}
	}

	public void setListCategorie(Vector vect)
	{
		jComboBoxCategorie.removeAllItems();
		for (int i = 0; i < vect.size(); i++)
		{
			jComboBoxCategorie.addItem(vect.get(i));
			System.out.println(vect.get(i));
		}
	}
	
	public void setControleur(CtrlAjoutEmploye ajout)
	{
		jButtonEmploy�.addActionListener(ajout);
	}
}  //  @jve:decl-index=0:visual-constraint="10,13"
