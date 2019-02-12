import javax.swing.*;
import java.awt.*;

public class Estimation extends JPanel{
	private JLabel textComboBox;
	private JComboBox<String> comboBox;
	private JTextArea textAreaPetit;
	private JTextArea textAreaMoyen;
	private JTextArea textAreaBarrel;
	private JTextArea textAreaPenderie;
	private JTextArea textAreaTableaux;
	private JLabel textPetit;
	private JLabel textMoyen;
	private JLabel textBarrel;
	private JLabel textPenderie;
	private JLabel textTableaux;
	private JButton buttonValider;
	private ControleurEstimation controle;
	
	public Estimation(){
		super();
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		textComboBox = new JLabel("Selectionner une piece");
		comboBox = new JComboBox<String>();
		controle=new ControleurEstimation(this);
		textAreaPetit = new JTextArea("0",1,2);
		textAreaMoyen = new JTextArea("0",1,2);
		textAreaBarrel = new JTextArea("0",1,2);
		textAreaPenderie = new JTextArea("0",1,2);
		textAreaTableaux = new JTextArea("0",1,2);
		textPetit = new JLabel("Petit carton  (35x27x30 cm)");
		textMoyen = new JLabel("Carton moyen  (55x35x30 cm)");
		textBarrel = new JLabel("Carton Barrel  (45x45x75 cm)");
		textPenderie = new JLabel("Carton penderie  (120x50x50 cm)");
		textTableaux = new JLabel("Carton pour Tableaux  (100x15x90 cm)");
		buttonValider = new JButton("Valider");
		buttonValider.addActionListener(controle);
		
		contrainte.gridx=0; 
		contrainte.gridy=0; 
		contrainte.gridwidth=2; 
		contrainte.gridheight=1; 
		contrainte.anchor=GridBagConstraints.NORTH;
		contrainte.insets= new Insets(0,0,20,20);
		this.add(textComboBox,contrainte);
		
		contrainte.gridx=2; 
		contrainte.gridy=0; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		this.add(comboBox,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=1; 
		contrainte.gridwidth=1; 
		contrainte.anchor=GridBagConstraints.BASELINE_LEADING;
		contrainte.insets= new Insets(5,0,5,5);
		this.add(textAreaPetit,contrainte);
		contrainte.gridy=2; 
		this.add(textAreaMoyen,contrainte);
		contrainte.gridy=3; 
		this.add(textAreaBarrel,contrainte);
		contrainte.gridy=4; 
		this.add(textAreaPenderie,contrainte);
		contrainte.gridy=5; 
		this.add(textAreaTableaux,contrainte);
		
		contrainte.gridx=1; 
		contrainte.gridy=1; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		this.add(textPetit,contrainte);
		contrainte.gridy=2; 
		this.add(textMoyen,contrainte);
		contrainte.gridy=3; 
		this.add(textBarrel,contrainte);
		contrainte.gridy=4; 
		this.add(textPenderie,contrainte);
		contrainte.gridy=5; 
		this.add(textTableaux,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=6; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.gridheight=1; 
		contrainte.anchor=GridBagConstraints.SOUTH;
		contrainte.fill=GridBagConstraints.HORIZONTAL;
		contrainte.insets= new Insets(50,10,10,10);
		this.add(buttonValider,contrainte);

		
	}

	public JLabel getTextComboBox() {
		return textComboBox;
	}

	public void setTextComboBox(JLabel textComboBox) {
		this.textComboBox = textComboBox;
	}

	public JLabel getTextPetit() {
		return textPetit;
	}

	public void setTextPetit(JLabel textPetit) {
		this.textPetit = textPetit;
	}

	public JLabel getTextMoyen() {
		return textMoyen;
	}

	public void setTextMoyen(JLabel textMoyen) {
		this.textMoyen = textMoyen;
	}

	public JLabel getTextBarrel() {
		return textBarrel;
	}

	public void setTextBarrel(JLabel textBarrel) {
		this.textBarrel = textBarrel;
	}

	public JLabel getTextPenderie() {
		return textPenderie;
	}

	public void setTextPenderie(JLabel textPenderie) {
		this.textPenderie = textPenderie;
	}

	public JLabel getTextTableaux() {
		return textTableaux;
	}

	public void setTextTableaux(JLabel textTableaux) {
		this.textTableaux = textTableaux;
	}

	public void setComboBox(List l) {
		this.comboBox.setModel(new DefaultComboBoxModel<String>(l.getItems()));;
		this.comboBox.revalidate();
	}

	public void setTextAreaPetit(JTextArea textAreaPetit) {
		this.textAreaPetit = textAreaPetit;
	}

	public void setTextAreaMoyen(JTextArea textAreaMoyen) {
		this.textAreaMoyen = textAreaMoyen;
	}

	public void setTextAreaBarrel(JTextArea textAreaBarrel) {
		this.textAreaBarrel = textAreaBarrel;
	}

	public void setTextAreaPenderie(JTextArea textAreaPenderie) {
		this.textAreaPenderie = textAreaPenderie;
	}

	public void setTextAreaTableaux(JTextArea textAreaTableaux) {
		this.textAreaTableaux = textAreaTableaux;
	}

	public void setButtonValider(JButton buttonValider) {
		this.buttonValider = buttonValider;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public JTextArea getTextAreaPetit() {
		return textAreaPetit;
	}

	public JTextArea getTextAreaMoyen() {
		return textAreaMoyen;
	}

	public JTextArea getTextAreaBarrel() {
		return textAreaBarrel;
	}

	public JTextArea getTextAreaPenderie() {
		return textAreaPenderie;
	}

	public JTextArea getTextAreaTableaux() {
		return textAreaTableaux;
	}

	public JButton getButtonValider() {
		return buttonValider;
	}
}