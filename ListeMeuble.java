import java.awt.*;

import javax.swing.*;
public class ListeMeuble extends JPanel {

	private JScrollPane scroll;
	private JPanelScrollList p;
	private List elements;
	
	public ListeMeuble() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		scroll = new JScrollPane(p, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setPreferredSize(new Dimension(400,500));

		
		contrainte.gridx=0; 
		contrainte.gridy=0; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.fill=GridBagConstraints.BOTH;
		contrainte.anchor=GridBagConstraints.CENTER;
		this.add(scroll,contrainte);
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
	public List getElements() {

		return elements;
	}
	public void setElements(List elements) {
		this.elements = elements;
	}
}
