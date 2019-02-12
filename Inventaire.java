import java.awt.*;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Inventaire extends JPanel{

	private JLabel textCarton;
	private JLabel textDestination;
	private JTextArea textAreaDescription;
	private JComboBox<String> boxCarton;
	private JComboBox<String> boxBien;
	private JComboBox<String> boxDestination;
	private JLabel textAjouter;
	private JButton buttonValider;
	private Meuble[] m;
	private ControleurAjoutCarton controleCarton;
	
	public Inventaire(){
		super();
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		controleCarton = new ControleurAjoutCarton(this);
		List elements = new List();

		elements.add("PETIT");
		elements.add("MOYEN");
		elements.add("BARREL");
		elements.add("PENDERIE");
		elements.add("TABLEAUX");

		textCarton = new JLabel("Choisissez un carton");
		textDestination = new JLabel("Destination");
		textAreaDescription = new JTextArea("Description",5,10);
		boxCarton = new JComboBox<String>(elements.getItems());
		boxBien = new JComboBox<String>();
		textAjouter = new JLabel("Choisissez un bien");
		buttonValider = new JButton("Valider");
		boxDestination = new JComboBox<String>();
		buttonValider.addActionListener(controleCarton);
		
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
		this.add(textAjouter,contrainte);
		contrainte.gridx=1; 
		contrainte.gridy=2; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.fill=GridBagConstraints.NONE;
		this.add(boxBien,contrainte);
		
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
	public JLabel getTextCarton() {
		return textCarton;
	}
	public void setTextCarton(JLabel textCarton) {
		this.textCarton = textCarton;
	}
	public JLabel getTextDestination() {
		return textDestination;
	}
	public void setTextDestination(JLabel textDestination) {
		this.textDestination = textDestination;
	}
	public JTextArea getTextAreaDescription() {
		return textAreaDescription;
	}
	public void setTextAreaDescription(JTextArea textAreaDescription) {
		this.textAreaDescription = textAreaDescription;
	}
	public JComboBox<String> getBoxCarton() {
		return boxCarton;
	}
	public void setBoxCarton(JComboBox<String> boxCarton) {
		this.boxCarton = boxCarton;
	}
	public JComboBox<String> getBoxBien() {
		return boxBien;
	}
	public void setBoxBien(List l) {
		this.boxBien.setModel(new DefaultComboBoxModel<String>(l.getItems()));;
		this.boxBien.revalidate();
	}
	public JComboBox<String> getBoxDestination() {
		return boxDestination;
	}
	public void setBoxDestination(List l) {
		this.boxDestination.setModel(new DefaultComboBoxModel<String>(l.getItems()));;
		this.boxDestination.revalidate();
	}

	public JButton getButtonValider() {
		return buttonValider;
	}
	public void setButtonValider(JButton buttonValider) {
		this.buttonValider = buttonValider;
	}
	public Meuble[] getMeuble() {
		return m;
	}
	public void setMeuble(Meuble[] m) {
		this.m = m;
	}
}
