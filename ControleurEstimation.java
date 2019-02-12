import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ControleurEstimation implements ActionListener {
	private Estimation  vue;
	private Modele m;
	public ControleurEstimation(Estimation v){
		vue=v;
		m=new Modele();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Valider")){
			String petit = vue.getTextAreaPetit().getText();
			String moyen =vue.getTextAreaMoyen().getText();
			String barrel =vue.getTextAreaBarrel().getText() ;
			String penderie = vue.getTextAreaPenderie().getText();
			String tableaux = vue.getTextAreaTableaux().getText();
			String piece = (String)vue.getComboBox().getSelectedItem();
			if(piece.equals("- - -"))
				JOptionPane.showMessageDialog(null, "Choisissez une piece de destination");
			if(Test.isInteger(petit)&&Test.isInteger(moyen)&&Test.isInteger(barrel)&&
					Test.isInteger(penderie)&&Test.isInteger(tableaux)) {
				if(!(Integer.parseInt(petit)==0&&Integer.parseInt(moyen)==0&&Integer.parseInt(barrel)==0
						&&Integer.parseInt(penderie)==0&&Integer.parseInt(tableaux)==0)) {
					m.AjoutCartonEstime(Integer.parseInt(petit),Integer.parseInt(moyen),Integer.parseInt(barrel),
							Integer.parseInt(penderie),Integer.parseInt(tableaux), piece);
					JOptionPane.showMessageDialog(null, "Fait.");
				}else
					JOptionPane.showMessageDialog(null, "Une des valeur doit etre a 1");

			}else
				JOptionPane.showMessageDialog(null, "Les saisie ne sont pas valable");

		}

	}

}
