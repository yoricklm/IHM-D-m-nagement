import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ControleurAjoutCarton implements ActionListener {
	private Inventaire  vue;
	private Modele m;
	public ControleurAjoutCarton(Inventaire v){
		vue=v;
		m=new Modele();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Valider")){
			String type = (String) vue.getBoxCarton().getSelectedItem();
			String des = (String) vue.getTextAreaDescription().getText();
			String piece = (String) vue.getBoxDestination().getSelectedItem();
			String sBien = (String) vue.getBoxBien().getSelectedItem();
			int id=-1;
			if(!sBien.equals("- - -")) {
				id = vue.getMeuble()[vue.getBoxBien().getSelectedIndex()-1].getId();
			}
			if(!piece.equals("- - -")) {
				m.AjoutCarton(type, des, piece, id);
				JOptionPane.showMessageDialog(null, "Fait.");
			}else
				JOptionPane.showMessageDialog(null, "Choisissez une piece de destination");
		}
	}

}
