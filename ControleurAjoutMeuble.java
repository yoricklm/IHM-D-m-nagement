import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ControleurAjoutMeuble implements ActionListener {
	private Identification vue;
	private int erreur;
	private int erreurModel;
	private Modele m;
	public ControleurAjoutMeuble(Identification i){
		vue=i;
		m=new Modele();
		erreur=0;
		erreurModel=0;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Valider")){
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
			if(Test.isInteger(longueur)&&Test.isInteger(longueur)&&Test.isInteger(longueur)) {
				if(vue.getCheckBoxDemontable().isSelected()) {
					nbElement = vue.getTextAreaElement().getText();
					p=vue.getP().getPanel();
					if(Test.isInteger(nbElement)) {
						n=Integer.parseInt(nbElement);
						for(int i=0;i<n;i++) {
							if(Test.isInteger(p[i].getTextAreaLongueur().getText()) &&
									Test.isInteger(p[i].getTextAreaLargeur().getText()) &&
									Test.isInteger(p[i].getTextAreaHauteur().getText())) {
							}else
								erreur=1;							
						}
					}else
						erreur=1;
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
					int id=m.ajoutMeuble(null,description,Integer.parseInt(longueur),
						Integer.parseInt(largeur),Integer.parseInt(hauteur),n,piece);
					if(vue.getCheckBoxDemontable().isSelected())
						m.ajoutElement(n,id,desElm,longueurElm,largeurElm,hauteurElm);
				
			}
		}
	}

}
