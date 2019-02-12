import java.awt.*;


import javax.swing.*;

public class Declaration extends JPanel{
	private JLabel textValeur;
	private JLabel textFacture;
	private JLabel textComboBox;
	private JTextArea textAreaValeur;
	private JTextArea textAreaFacture;
	private JComboBox<String> comboBox;
	private JButton buttonValider;
	private Meuble[] meuble;
	private ControleurAjoutFacture controleFacture;
	public Declaration() {
		super();
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		controleFacture=new ControleurAjoutFacture(this);
		textValeur = new JLabel("Valeur");
		textFacture = new JLabel("Facture");
		textAreaValeur = new JTextArea("0",1,2);
		textAreaFacture = new JTextArea("facture.pdf",1,10);
		textComboBox = new JLabel("Selectionner un bien");
		buttonValider = new JButton("Valider");
		comboBox = new JComboBox<String>();
		buttonValider.addActionListener(controleFacture);
		
		contrainte.gridx=0; 
		contrainte.gridy=0; 
		contrainte.gridwidth=2; 
		contrainte.gridheight=1; 
		contrainte.anchor=GridBagConstraints.NORTH;
		contrainte.insets= new Insets(0,0,20,20);
		this.add(textComboBox,contrainte);
		
		contrainte.gridx=2; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		this.add(comboBox,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=1; 
		contrainte.gridwidth=1; 
		contrainte.anchor=GridBagConstraints.BASELINE_LEADING;
		contrainte.insets= new Insets(5,0,5,5);
		this.add(textAreaValeur,contrainte);
		contrainte.gridx=1; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		this.add(textValeur,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=2; 
		contrainte.gridwidth=2; 
		this.add(textAreaFacture,contrainte);
		contrainte.gridx=2; 
		contrainte.gridwidth=0; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		this.add(textFacture,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=3; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.gridheight=1; 
		contrainte.anchor=GridBagConstraints.SOUTH;
		contrainte.fill=GridBagConstraints.HORIZONTAL;
		contrainte.insets= new Insets(50,10,10,10);
		this.add(buttonValider,contrainte);

	}
	public Meuble[] getMeuble() {
		return meuble;
	}
	public void setMeuble(Meuble[] meuble) {
		this.meuble = meuble;
	}
	public JLabel getTextValeur() {
		return textValeur;
	}
	public void setTextValeur(JLabel textValeur) {
		this.textValeur = textValeur;
	}
	public JLabel getTextFacture() {
		return textFacture;
	}
	public void setTextFacture(JLabel textFacture) {
		this.textFacture = textFacture;
	}
	public JLabel getTextComboBox() {
		return textComboBox;
	}
	public void setTextComboBox(JLabel textComboBox) {
		this.textComboBox = textComboBox;
	}
	public JTextArea getTextAreaValeur() {
		return textAreaValeur;
	}
	public void setTextAreaValeur(JTextArea textAreaValeur) {
		this.textAreaValeur = textAreaValeur;
	}
	public JTextArea getTextAreaFacture() {
		return textAreaFacture;
	}
	public void setTextAreaFacture(JTextArea textAreaFacture) {
		this.textAreaFacture = textAreaFacture;
	}
	public JComboBox<String> getComboBox() {
		return comboBox;
	}
	public void setComboBox(List l) {
		this.comboBox.setModel(new DefaultComboBoxModel<String>(l.getItems()));;
		this.comboBox.revalidate();
	}
	public JButton getButtonValider() {
		return buttonValider;
	}
	public void setButtonValider(JButton buttonValider) {
		this.buttonValider = buttonValider;
	}
	
	
}
