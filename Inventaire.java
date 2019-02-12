import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Inventaire extends JPanel{
	private JLabel textCarton;
	private JLabel textDestination;
	private JTextArea textAreaDescription;
	private JComboBox boxCarton;
	private JComboBox boxBien;
	private JComboBox boxDestination;
	private JButton buttonAjouter;
	private JButton buttonValider;
	public Inventaire(){
		super();
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		List<String> elements = ModelInit.getPiece();
		elements.add(0, "- - -");
		textCarton = new JLabel("Choisissez un carton");
		textDestination = new JLabel("Destination");
		textAreaDescription = new JTextArea("Description",5,10);
		boxCarton = new JComboBox(elements.toArray());
		boxBien = new JComboBox(elements.toArray());
		buttonAjouter = new JButton("Ajouter");
		buttonValider = new JButton("Valider");

		boxDestination = new JComboBox(elements.toArray());
		
		contrainte.gridx=0; 
		contrainte.gridy=0; 
		contrainte.gridwidth=2; 
		contrainte.gridheight=1; 
		contrainte.anchor=GridBagConstraints.NORTH;
		contrainte.insets= new Insets(0,0,20,20);
		this.add(textCarton,contrainte);
		
		contrainte.gridx=2; 
		contrainte.gridy=0; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		this.add(boxCarton,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=1; 
		contrainte.fill=GridBagConstraints.BOTH;
		contrainte.anchor=GridBagConstraints.CENTER;
		this.add(textAreaDescription,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=2; 
		contrainte.gridwidth=1; 
		contrainte.fill=GridBagConstraints.HORIZONTAL;
		contrainte.anchor=GridBagConstraints.BASELINE_LEADING;
		this.add(boxBien,contrainte);
		contrainte.gridx=1; 
		contrainte.gridy=2; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.fill=GridBagConstraints.NONE;
		this.add(buttonAjouter,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=3; 
		contrainte.gridwidth=1; 
		contrainte.fill=GridBagConstraints.NONE;
		contrainte.anchor=GridBagConstraints.BASELINE_LEADING;
		this.add(textDestination,contrainte);

		contrainte.gridx=1; 
		contrainte.gridy=3; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		this.add(boxDestination,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=4; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.anchor=GridBagConstraints.CENTER;
		this.add(buttonValider,contrainte);
	}
}
