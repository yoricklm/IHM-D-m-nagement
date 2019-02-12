import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ControleurMenu implements ActionListener {
	private JPanel contenu;
	private CardLayout layout;
	public ControleurMenu(JPanel c, CardLayout l){
		this.contenu=c;
		this.layout= l;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Identifier Meuble")){
			layout.show(contenu,"identification");
		}else if(e.getActionCommand().equals("Estimation Carton")){
			layout.show(contenu,"estimation");
		}else if(e.getActionCommand().equals("Declaration Valeur")){
			layout.show(contenu,"declaration");
		}else if(e.getActionCommand().equals("Inventaire")){
		layout.show(contenu,"inventaire");
		}else if(e.getActionCommand().equals("Liste")){
			layout.show(contenu,"listMeuble");
			}
	}

}
