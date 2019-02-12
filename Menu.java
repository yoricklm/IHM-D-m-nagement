import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel{
	private JButton buttonMeuble;
	private JButton buttonEstimation;
	private JButton buttonDeclaration;
	private JButton buttonInventaire;
	private JButton buttonList;
	private JLabel textCom;
	private JLabel textClient;

	public Menu(){
		super();
		this.setBackground(Color.GRAY);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		buttonMeuble = new JButton("Identifier Meuble");
		buttonEstimation = new JButton("Estimation Carton");
		buttonDeclaration = new JButton("Declaration Valeur");
		buttonInventaire = new JButton("Inventaire");
		textCom=new JLabel("Commercial");
		textClient=new JLabel("Client");

		buttonList= new JButton("Liste");
		buttonMeuble.setBackground(Color.LIGHT_GRAY);

		contrainte.gridx=0; 
		contrainte.gridy=0; 
		contrainte.fill=GridBagConstraints.HORIZONTAL;
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.gridheight=1; 
		contrainte.anchor=GridBagConstraints.CENTER;
		contrainte.insets= new Insets(10,0,0,0);
		this.add(buttonList,contrainte);

		contrainte.gridy=1; 
		this.add(textCom,contrainte);
		
	
		contrainte.gridy=2; 
		this.add(buttonEstimation,contrainte);
		

		contrainte.gridy=3; 
		this.add(buttonMeuble,contrainte);
	

		contrainte.gridy=4; 
		this.add(textClient);
		
		contrainte.gridy=5; 
		this.add(buttonInventaire,contrainte);
		
		contrainte.gridy=6; 
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
	public void colorButton() {
		JButton b=new JButton();
		Color c=b.getBackground();
		buttonMeuble.setBackground(c);;
		buttonEstimation.setBackground(c);;
		buttonDeclaration.setBackground(c);;
		buttonInventaire.setBackground(c);;
		buttonList.setBackground(c);;
		this.repaint();
	}
}