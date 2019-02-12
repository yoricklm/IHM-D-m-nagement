import javax.swing.*;
import java.util.List;
import java.awt.*; 
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout;


public class Identification extends JPanel{
	private JTextArea textAreaDescription;
	private JTextArea textAreaElement;
	private JTextArea textAreaLongueur;
	private JTextArea textAreaLargeur;
	private JTextArea textAreaHauteur;
	private JLabel textDimension;
	private JLabel textElement;
	private JLabel textComboBox;
	private JCheckBox checkBoxDemontable;
	private JComboBox comboBox;
	private JButton buttonValider;
	private JLabel panelImage;
	private ControleurIdentification controle;
	private JButton buttonAjouter;
	private JScrollPane scroll;
	private JPanelScroll p;
	private ControleurAjoutMeuble controleAjoutMeuble;
	public Identification(){
		super();
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		panelImage = new JLabel();
		panelImage.setPreferredSize(new Dimension(200,200));
		panelImage.setBackground(Color.WHITE);
		textAreaDescription = new JTextArea("Description",5,40);
		textDimension = new JLabel("Dimension (en cm):");
		textAreaElement = new JTextArea("",1,2);
		textElement = new JLabel("Nombre d'element");
		textAreaLongueur = new JTextArea("Longueur",1,5);
		textAreaLargeur = new JTextArea("Largeur",1,5);
		textAreaHauteur = new JTextArea("Hauteur",1,5);
		checkBoxDemontable = new JCheckBox("Demontable ?");
		textComboBox = new JLabel("Destination");
		
		List<String> elements = ModelInit.getPiece();
		elements.add(0, "- - -");
		comboBox = new JComboBox(elements.toArray());
		
		buttonValider = new JButton("Valider");
		buttonAjouter= new JButton("Ajouter element");
		controle = new ControleurIdentification(this);
		controleAjoutMeuble = new ControleurAjoutMeuble(this);
		scroll = new JScrollPane(p, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		
		buttonValider.addActionListener(controleAjoutMeuble);
		checkBoxDemontable.addItemListener(controle);
		buttonAjouter.addActionListener(controle);

		textAreaElement.setEnabled(false);	
		buttonAjouter.setEnabled(false);
		textElement.setEnabled(false);
		scroll.setVisible(false);
		scroll.setPreferredSize(new Dimension(50,50));
		
		contrainte.gridx=0; 
		contrainte.gridy=0; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.gridheight=1; 
		contrainte.anchor=GridBagConstraints.NORTH;
		contrainte.insets= new Insets(10,10,10,10);
		this.add(panelImage,contrainte);

		contrainte.gridx=0; 
		contrainte.gridy=1; 
		contrainte.fill=GridBagConstraints.BOTH;
		contrainte.anchor=GridBagConstraints.CENTER;
		this.add(textAreaDescription,contrainte);

		contrainte.gridx=0; 
		contrainte.gridy=2; 
		contrainte.gridwidth=1;
		contrainte.fill=GridBagConstraints.NONE;
		contrainte.anchor=GridBagConstraints.BASELINE_LEADING;
		this.add(textDimension,contrainte);
		contrainte.gridx=1; 
		contrainte.insets= new Insets(5,5,5,5);
		this.add(textAreaLongueur,contrainte);
		contrainte.gridx=2; 
		this.add(new JLabel("x"),contrainte);
		contrainte.gridx=3; 
		this.add(textAreaLargeur,contrainte);
		contrainte.gridx=4; 
		this.add(new JLabel("x"),contrainte);
		contrainte.gridx=5; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		this.add(textAreaHauteur,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=3; 
		contrainte.gridwidth=1; 
		this.add(checkBoxDemontable);//setBackground
		
		contrainte.gridx=1;
		contrainte.gridwidth=1;
		contrainte.fill=GridBagConstraints.HORIZONTAL;
		this.add(textAreaElement,contrainte);
		contrainte.gridx=2;
		contrainte.gridwidth=4;
		this.add(textElement,contrainte);
		contrainte.gridx=6;
		contrainte.gridwidth=GridBagConstraints.REMAINDER;
		this.add(buttonAjouter,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=5; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.fill=GridBagConstraints.BOTH;
		contrainte.anchor=GridBagConstraints.CENTER;
		this.add(scroll,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=6; 
		contrainte.gridwidth=1; 
		contrainte.fill=GridBagConstraints.NONE;
		contrainte.anchor=GridBagConstraints.BASELINE_LEADING;
		this.add(textComboBox,contrainte);

		contrainte.gridx=1; 
		contrainte.gridy=6; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		this.add(comboBox,contrainte);
		
		
		contrainte.gridx=0; 
		contrainte.gridy=7; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.anchor=GridBagConstraints.CENTER;
		this.add(buttonValider,contrainte);
	}

	public ControleurIdentification getControle() {
		return controle;
	}

	public void setControle(ControleurIdentification controle) {
		this.controle = controle;
	}

	public JButton getButtonAjouter() {
		return buttonAjouter;
	}

	public void setButtonAjouter(JButton buttonAjouter) {
		this.buttonAjouter = buttonAjouter;
	}

	public JScrollPane getScroll() {
		return scroll;
	}

	public void setScroll(JScrollPane scroll) {
		this.scroll = scroll;
	}

	public JPanelScroll getP() {
		return p;
	}

	public void setP(JPanelScroll p) {
		this.p = p;
	}

	public JLabel getTextDimension() {
		return textDimension;
	}

	public void setTextDimension(JLabel textDimension) {
		this.textDimension = textDimension;
	}

	public JLabel getTextElement() {
		return textElement;
	}

	public void setTextElement(JLabel textElement) {
		this.textElement = textElement;
	}

	public JLabel getTextComboBox() {
		return textComboBox;
	}

	public void setTextComboBox(JLabel textComboBox) {
		this.textComboBox = textComboBox;
	}

	public void setTextAreaDescription(JTextArea textAreaDescription) {
		this.textAreaDescription = textAreaDescription;
	}

	public void setTextAreaElement(JTextArea textAreaElement) {
		this.textAreaElement = textAreaElement;
	}

	public void setTextAreaLongueur(JTextArea textAreaLongueur) {
		this.textAreaLongueur = textAreaLongueur;
	}

	public void setTextAreaLargeur(JTextArea textAreaLargeur) {
		this.textAreaLargeur = textAreaLargeur;
	}

	public void setTextAreaHauteur(JTextArea textAreaHauteur) {
		this.textAreaHauteur = textAreaHauteur;
	}

	public void setButtonValider(JButton buttonValider) {
		this.buttonValider = buttonValider;
	}

	public JCheckBox getCheckBoxDemontable() {
		return checkBoxDemontable;
	}

	public void setCheckBoxDemontable(JCheckBox checkBoxDemontable) {
		this.checkBoxDemontable = checkBoxDemontable;
	}

	public JComboBox getComboBox() {
		return comboBox;
	}

	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}

	/*public JPanel getPanelImage() {
		return panelImage;
	}

	public void setPanelImage(JPanel panelImage) {
		this.panelImage = panelImage;
	}*/

	public JTextArea getTextAreaDescription() {
		return textAreaDescription;
	}

	public JTextArea getTextAreaElement() {
		return textAreaElement;
	}

	public JTextArea getTextAreaLongueur() {
		return textAreaLongueur;
	}

	public JTextArea getTextAreaLargeur() {
		return textAreaLargeur;
	}

	public JTextArea getTextAreaHauteur() {
		return textAreaHauteur;
	}

	public JButton getButtonValider() {
		return buttonValider;
	}
}