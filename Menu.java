import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel{
	private JButton buttonMeuble;
	private JButton buttonEstimation;
	private JButton buttonDeclaration;
	private JButton buttonInventaire;
	private JButton buttonList;

	public Menu(){
		super();
		this.setBackground(Color.GRAY);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		buttonMeuble = new JButton("Identifier Meuble");
		buttonEstimation = new JButton("Estimation Carton");
		buttonDeclaration = new JButton("Declaration Valeur");
		buttonInventaire = new JButton("Inventaire");
		buttonList= new JButton("Liste");

		contrainte.gridx=0; 
		contrainte.gridy=0; 
		contrainte.fill=GridBagConstraints.HORIZONTAL;
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.gridheight=1; 
		contrainte.anchor=GridBagConstraints.NORTH;
		contrainte.insets= new Insets(10,0,0,0);
		this.add(buttonList,contrainte);
		contrainte.gridx=0; 
		contrainte.gridy=1; 
		this.add(buttonEstimation,contrainte);
		contrainte.gridx=0; 
		contrainte.gridy=2; 
		this.add(buttonMeuble,contrainte);
		contrainte.gridx=0; 
		contrainte.gridy=3; 
		this.add(buttonInventaire,contrainte);
		contrainte.gridx=0; 
		contrainte.gridy=4; 
		this.add(buttonDeclaration,contrainte);

	}
	public JButton getButtonList() {
		return buttonList;
	}
	public void setButtonList(JButton buttonList) {
		this.buttonList = buttonList;
	}
	public JButton getButtonInventaire() {
		return buttonInventaire;
	}
	public void setButtonInventaire(JButton buttonInventaire) {
		this.buttonInventaire = buttonInventaire;
	}
	public JButton getButtonDeclaration() {
		return buttonDeclaration;
	}
	public void setButtonDeclaration(JButton buttonDeclaration) {
		this.buttonDeclaration = buttonDeclaration;
	}
	public JButton getButtonMeuble() {
		return buttonMeuble;
	}
	public void setButtonMeuble(JButton buttonMeuble) {
		this.buttonMeuble = buttonMeuble;
	}
	public JButton getButtonEstimation() {
		return buttonEstimation;
	}
	public void setButtonEstimation(JButton buttonEstimation) {
		this.buttonEstimation = buttonEstimation;
	}
}