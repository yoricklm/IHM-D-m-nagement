import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;

import javax.swing.*;

public class Declaration extends JPanel{
	private JLabel textValeur;
	private JLabel textFacture;
	private JLabel textComboBox;
	private JTextArea textAreaValeur;
	private JTextArea textAreaFacture;
	private JComboBox comboBox;
	private JButton buttonValider;
	public Declaration() {
		super();
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		textValeur = new JLabel("Valeur");
		textFacture = new JLabel("Facture");
		textAreaValeur = new JTextArea("0",1,2);
		textAreaFacture = new JTextArea("facture.pdf",1,10);
		textComboBox = new JLabel("Selectionner un bien");
		buttonValider = new JButton("Valider");
		List<String> elements = ModelInit.getPiece();
		elements.add(0, "- - -");
		comboBox = new JComboBox(elements.toArray());
		
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
	
	
}
