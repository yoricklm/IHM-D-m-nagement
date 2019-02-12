import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ControleurAjoutFacture implements ActionListener {
	private Declaration  vue;
	private Modele m;
	public ControleurAjoutFacture(Declaration v){
		vue=v;
		m=new Modele();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int id=0;
		if(e.getActionCommand().equals("Valider")){
			if(!vue.getComboBox().getSelectedItem().equals("- - -")) {
				id = vue.getMeuble()[vue.getComboBox().getSelectedIndex()-1].getId();
				String v = vue.getTextAreaValeur().getText();
				String facture = vue.getTextAreaFacture().getText();
				if(Test.isInteger(v)) {
					if(Integer.parseInt(v)>199) {
						m.ajoutFacture(id, Integer.parseInt(v), facture);
						JOptionPane.showMessageDialog(null, "Fait.");
					}else
						JOptionPane.showMessageDialog(null, "La valeur doit étre supérieur a 199");
				}else
					JOptionPane.showMessageDialog(null, "Saisissez une valeur valable");
			}else {
				JOptionPane.showMessageDialog(null, "Choisissez une piece de destination");

			}

		}
	}

}
