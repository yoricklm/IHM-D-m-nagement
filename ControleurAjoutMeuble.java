import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class ControleurAjoutMeuble implements ActionListener {
	private Identification vue;
	private int erreur;
	private Modele m;
	public ControleurAjoutMeuble(Identification i){
		vue=i;
		m=new Modele();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		erreur=0;
		if(e.getActionCommand().equals("Valider")){
			String nom = vue.getTextAreaNom().getText();
			String description = vue.getTextAreaDescription().getText();
			String longueur =vue.getTextAreaLongueur().getText();
			String largeur =vue.getTextAreaLargeur().getText() ;
			String hauteur = vue.getTextAreaHauteur().getText();
			String[] desElm = null;
			int[] longueurElm=null;
			int[] largeurElm = null;
			int[] hauteurElm = null;
			int n=0;
			String piece = (String)vue.getComboBox().getSelectedItem();
			String nbElement;
			PanelDemontable[] p = null;
			if(piece.equals("- - -")) {
				JOptionPane.showMessageDialog(null, "Choisissez une piece de destination");
				erreur=1;
			}else if(!(Test.isInteger(longueur)&&Test.isInteger(longueur)&&Test.isInteger(longueur))) {
				JOptionPane.showMessageDialog(null, "Les Dimensions ne sont pas valable");
				erreur=1;
			}else if(vue.getCheckBoxDemontable().isSelected()) {
				nbElement = vue.getTextAreaElement().getText();
				if(Test.isInteger(nbElement)) {
					n=Integer.parseInt(nbElement);
						p=vue.getP().getPanel();
						for(int i=0;i<n;i++) {
							if(Test.isInteger(p[i].getTextAreaLongueur().getText()) &&
								Test.isInteger(p[i].getTextAreaLargeur().getText()) &&
								Test.isInteger(p[i].getTextAreaHauteur().getText())) {
							}else
								erreur=1;							
						}
						if(erreur==1) {
							JOptionPane.showMessageDialog(null, "Les Dimensions ne sont pas valable");
						}
				}else{
					erreur=1;
					JOptionPane.showMessageDialog(null, "Le nombre d'element n est pas valable");
				}
			}
			if(vue.getCheckBoxDemontable().isSelected()&&erreur!=1) {
					longueurElm = new int[n];
					largeurElm = new int[n];
					hauteurElm = new int[n];
					desElm=new String[n];

					for(int i=0;i<n;i++) {
						desElm[i]=p[i].getTextAreaDescription().getText();
						longueurElm[i]=Integer.parseInt(p[i].getTextAreaLongueur().getText());
						largeurElm[i]=Integer.parseInt(p[i].getTextAreaLargeur().getText());
						hauteurElm[i]=Integer.parseInt(p[i].getTextAreaHauteur().getText());
					}
				}
				if(erreur!=1) {
					int id=m.ajoutMeuble(null,nom,description,Integer.parseInt(longueur),
						Integer.parseInt(largeur),Integer.parseInt(hauteur),n,piece);
					JOptionPane.showMessageDialog(null, "Fait.");
					if(vue.getCheckBoxDemontable().isSelected()&&n!=0&&erreur!=1)
						m.ajoutElement(n,id,desElm,longueurElm,largeurElm,hauteurElm);
				}
		}
	}

}
