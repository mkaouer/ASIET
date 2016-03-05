package Vue;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Point;
import java.util.Vector;

import javax.swing.JTextField;
import javax.swing.JComboBox;

import Controleur.CtrlAjoutSte;

public class FenAjoutSociete extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jPanel = null;
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
	private JTextField jTextField5 = null;
	private JComboBox jComboBox = null;
	private JLabel jLabel6 = null;
	private JButton jButtonValider = null;
	/**
	 * This is the default constructor
	 */
	public FenAjoutSociete() {
		super();
		initialize();
		setLocation(400, 200);
           setSize(403, 266);
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
             
		this.setContentPane(getJPanel());
		this.setTitle("Ajouter un Client");
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
			jLabel6.setBounds(70, 15, 20, 170);
			jLabel6.setLocation(new Point(20, 170));
			jLabel5 = new JLabel();
			jLabel5.setText("Societe");
			jLabel5.setLocation(new Point(20, 145));
			jLabel5.setBounds(70, 15, 20, 145);
			jLabel4 = new JLabel();
			jLabel4.setText("Adresse");
			jLabel4.setLocation(new Point(20, 70));
			jLabel4.setBounds(70, 15, 20, 70);
			jLabel3 = new JLabel();
			jLabel3.setText("Ville");
			jLabel3.setLocation(new Point(20, 120));
			jLabel3.setBounds(70, 15, 20, 120);
			jLabel2 = new JLabel();
			jLabel2.setText("Prenom");
			jLabel2.setLocation(new Point(20, 45));
			jLabel2.setBounds(70, 15, 20, 45);
			jLabel1 = new JLabel();
			jLabel1.setText("Code Postal");
			jLabel1.setLocation(new Point(20, 95));
			jLabel1.setBounds(70, 15, 20, 95);
			jLabel = new JLabel();
			jLabel.setText("Nom");
			jLabel.setLocation(new Point(20, 20));
			jLabel.setBounds(70, 15, 20, 20);
			jPanel = new JPanel();
			jPanel.setLayout(null);
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
			jPanel.add(getJTextField5(), null);
			jPanel.add(getJComboBox(), null);
			jPanel.add(jLabel6, null);
			jPanel.add(getJButtonValider(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextFieldNom == null) {
			jTextFieldNom = new JTextField();
			jTextFieldNom.setBounds(150, 20, 130, 20);
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
			jTextFieldAdress.setBounds(150, 20, 130, 70);
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
			jTextFieldCP.setBounds(150, 20, 130, 95);
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
			jTextFieldVille.setBounds(150, 20, 130, 120);
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
			jTextFieldPnom.setBounds(150, 20, 130, 45);
			jTextFieldPnom.setLocation(new Point(130, 45));
		}
		return jTextFieldPnom;
	}

	/**
	 * This method initializes jTextField5	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField5() {
		if (jTextField5 == null) {
			jTextField5 = new JTextField();
			jTextField5.setBounds(150, 20, 130, 145);
			jTextField5.setLocation(new Point(130, 145));
		}
		return jTextField5;
	}

	/**
	 * This method initializes jComboBox	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBox() {
		if (jComboBox == null) {
			jComboBox = new JComboBox();
			jComboBox.setPreferredSize(new Dimension(100, 20));
			jComboBox.setBounds(150, 20, 130, 170);
			jComboBox.setLocation(new Point(130, 170));
		}
		return jComboBox;
	}
	
	/**
	 * This method initializes jButtonValider	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonValider() {
		if (jButtonValider == null) {
			jButtonValider = new JButton();
			jButtonValider.setPreferredSize(new Dimension(70, 25));
			jButtonValider.setLocation(new Point(295, 200));
			jButtonValider.setBounds(80, 25, 295, 200);
			jButtonValider.setText("Valider");
		}
		return jButtonValider;
	}
	public void setControleurs(CtrlAjoutSte ste)
	{
		jButtonValider.addActionListener(ste);
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
	public String getSociete()
	{
		return this.jTextField5.getText();
	}
	public int getnumAgneceSelect()
	{
		return this.jComboBox.getSelectedIndex();
	}
	public void setListAgence(Vector vect)
	{
		jComboBox.removeAllItems();
		for (int i = 0; i < vect.size(); i++)
		{
			jComboBox.addItem(vect.get(i));
			System.out.println(vect.get(i));
		}
	}
	
}  //  @jve:decl-index=0:visual-constraint="10,13"
