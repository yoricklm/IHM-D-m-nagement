import javax.swing.*;
import java.awt.*;

public class PanelDemontable extends JPanel{
	private	JTextArea textAreaLongueur;
	private	JTextArea textAreaLargeur;
	private	JTextArea textAreaHauteur;
	private	JTextArea textAreaDescription;
	private	JLabel textDimension;

	public JTextArea getTextAreaLongueur() {
		return textAreaLongueur;
	}

	public void setTextAreaLongueur(JTextArea textAreaLongueur) {
		this.textAreaLongueur = textAreaLongueur;
	}

	public JTextArea getTextAreaLargeur() {
		return textAreaLargeur;
	}

	public void setTextAreaLargeur(JTextArea textAreaLargeur) {
		this.textAreaLargeur = textAreaLargeur;
	}

	public JTextArea getTextAreaHauteur() {
		return textAreaHauteur;
	}

	public void setTextAreaHauteur(JTextArea textAreaHauteur) {
		this.textAreaHauteur = textAreaHauteur;
	}

	public JTextArea getTextAreaDescription() {
		return textAreaDescription;
	}

	public void setTextAreaDescription(JTextArea textAreaDescription) {
		this.textAreaDescription = textAreaDescription;
	}

	public JLabel getTextDimension() {
		return textDimension;
	}

	public void setTextDimension(JLabel textDimension) {
		this.textDimension = textDimension;
	}

	public PanelDemontable(){
		super();
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		textAreaDescription = new JTextArea("Description",1,10);
		textDimension = new JLabel("Dimension (en cm):");
		textAreaLongueur = new JTextArea("L",1,2);
		textAreaLargeur = new JTextArea("l",1,2);
		textAreaHauteur = new JTextArea("h",1,2);
		
		contrainte.gridx=0; 
		contrainte.gridy=0; 
		contrainte.gridwidth=1;
		contrainte.gridheight=1; 
		contrainte.anchor=GridBagConstraints.BASELINE_LEADING;
		contrainte.insets= new Insets(0,5,0,0);
		this.add(textAreaDescription,contrainte);
		contrainte.gridx=1; 
		this.add(textDimension,contrainte);
		contrainte.gridx=2; 
		this.add(textAreaLongueur,contrainte);
		contrainte.gridx=3; 
		this.add(new JLabel("x"),contrainte);
		contrainte.gridx=4; 
		this.add(textAreaLargeur,contrainte);
		contrainte.gridx=5; 
		this.add(new JLabel("x"),contrainte);
		contrainte.gridx=6; 
		this.add(textAreaHauteur,contrainte);



	}
}