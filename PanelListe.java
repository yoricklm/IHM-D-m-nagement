import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PanelListe extends JPanel {
	private JLabel textMeuble;
	private JComboBox box;
	public PanelListe(String meuble,List<String> piece) {
		super();
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		textMeuble = new JLabel(meuble);
		box = new JComboBox(piece.toArray());
		contrainte.gridx=0; 
		contrainte.gridy=0; 
		contrainte.gridwidth=2;
		contrainte.gridheight=1; 
		contrainte.anchor=GridBagConstraints.BASELINE_LEADING;
		contrainte.insets= new Insets(0,5,0,0);
		this.add(textMeuble,contrainte);
		contrainte.gridx=2; 
		this.add(box,contrainte);
	}
	public JLabel getTextMeuble() {
		return textMeuble;
	}
	public void setTextMeuble(JLabel textMeuble) {
		this.textMeuble = textMeuble;
	}
	public JComboBox getBox() {
		return box;
	}
	public void setBox(JComboBox box) {
		this.box = box;
	}
}
