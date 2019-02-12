import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;

import javax.swing.*;
public class ListeMeuble extends JPanel {
	private JComboBox boxPiece;
	private JLabel textComboBox;
	private JScrollPane scroll;
	private JPanelScrollList p;
	private List<String> elements;
	private ControleurListe controleListe;
	
	public ListeMeuble() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		elements = ModelInit.getPiece();
		elements.add(0, "- - -");
		textComboBox = new JLabel("Choisissez une piece");
		boxPiece = new JComboBox(elements.toArray());
		//scroll=new JPanelScrollList();
		scroll = new JScrollPane(p, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setPreferredSize(new Dimension(400,200));
		controleListe=new ControleurListe(this);
		boxPiece.addActionListener(controleListe);
		
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
		this.add(boxPiece,contrainte);
		
		contrainte.gridx=0; 
		contrainte.gridy=1; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.fill=GridBagConstraints.BOTH;
		contrainte.anchor=GridBagConstraints.CENTER;
		this.add(scroll,contrainte);
	}
	public JComboBox getBoxPiece() {
		return boxPiece;
	}
	public void setBoxPiece(JComboBox boxPiece) {
		this.boxPiece = boxPiece;
	}
	public JLabel getTextComboBox() {
		return textComboBox;
	}
	public void setTextComboBox(JLabel textComboBox) {
		this.textComboBox = textComboBox;
	}
	public JScrollPane getScroll() {
		return scroll;
	}
	public void setScrollPane(JScrollPane scrollPane) {
		this.scroll = scrollPane;
	}
	public JPanelScrollList getP() {
		return p;
	}
	public void setP(JPanelScrollList p) {
		this.p = p;
	}
	public List<String> getElements() {

		return elements;
	}
	public void setElements(List<String> elements) {
		this.elements = elements;
	}
}
