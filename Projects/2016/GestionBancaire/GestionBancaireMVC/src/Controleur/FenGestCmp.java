package Vue;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JTextField;
import javax.swing.JLabel;

import Controleur.CtrlDepotCmpt;
import Controleur.CtrlRetraitCmpt;

public class FenGestCmp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JButton jButtonDepot = null;
	private JButton jButtonRetrait = null;
	private JTextField jTextField = null;
	private JLabel jLabel = null;
	private JLabel jLabelNumCmpt = null;
	private JLabel jLabel1 = null;

	/**
	 * This is the default constructor
	 */
	public FenGestCmp() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		setSize(277, 181);
           setLocation(400, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("Gérer un compte");
		this.
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Compte");
			jLabel1.setBounds(50, 20, 15, 15);
			jLabel1.setLocation(new Point(15, 15));
			jLabelNumCmpt = new JLabel();
			jLabelNumCmpt.setText("JLabel");
			jLabelNumCmpt.setBounds(100, 20, 75, 15);
			jLabelNumCmpt.setLocation(new Point(75, 15));
			jLabel = new JLabel();
			jLabel.setText("Montant");
			jLabel.setBounds(100, 20, 44, 54);
			jLabel.setLocation(new Point(44, 54));
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJButton(), null);
			jContentPane.add(getJButton1(), null);
			jContentPane.add(getJTextField(), null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabelNumCmpt, null);
			jContentPane.add(jLabel1, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButtonDepot == null) {
			jButtonDepot = new JButton();
			jButtonDepot.setText("Deposer");
			jButtonDepot.setBounds(85, 29, 81, 114);
			jButtonDepot.setLocation(new Point(81, 114));
		}
		return jButtonDepot;
	}

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButtonRetrait == null) {
			jButtonRetrait = new JButton();
			jButtonRetrait.setPreferredSize(new Dimension(73, 23));
			jButtonRetrait(169, 114));
			jButtonRetrait.setBounds(85, 29, 169, 114);
			jButtonRetrait.setText("Retirer");
		}
		return jButtonRetrait;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(44, 78, 118, 30));
		}
		return jTextField;
	}
	public String getMontant()
	{
		return jTextField.getText().toString();
	}
	public void setLabelNumCompte(int num)
	{
		this.jLabelNumCmpt.setText(new Integer(num).toString());
	}

	public void setControleur(CtrlDepotCmpt depot, CtrlRetraitCmpt retr)
	{
		jButtonDepot.addActionListener(depot);
		jButtonRetrait.addActionListener(retr);
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"
