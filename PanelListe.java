import javax.swing.*;
import java.awt.*;


public class PanelListe extends JPanel {
	private JLabel textQuantite;
	private JLabel textNom;

	public PanelListe(int n,String nom) {
		super();
		this.setBackground(Color.WHITE);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		textQuantite = new JLabel(""+n);
		textNom = new JLabel(nom);
		contrainte.gridx=0; 
		contrainte.gridy=0; 
		contrainte.gridwidth=1;
		contrainte.gridheight=1; 
		contrainte.anchor=GridBagConstraints.BASELINE_LEADING;
		contrainte.insets= new Insets(0,10,0,0);
		this.add(textQuantite,contrainte);
		contrainte.insets= new Insets(0,3,0,0);
		contrainte.gridx=1; 
		this.add(textNom,contrainte);
		this.setPreferredSize(new Dimension(450,20));
	}

}
