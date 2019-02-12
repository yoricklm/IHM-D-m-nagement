import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ControleurMenu implements ActionListener {
	private JPanel contenu;
	private CardLayout layout;
	private Menu m;
	public ControleurMenu(JPanel c, CardLayout l,Menu menu){
		this.contenu=c;
		this.layout= l;
		this.m=menu;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Identifier Meuble")){ 
			layout.show(contenu,"identification");
			m.colorButton();
			m.getButtonMeuble().setBackground(Color.LIGHT_GRAY);
		}else if(e.getActionCommand().equals("Estimation Carton")){
			layout.show(contenu,"estimation");
			m.colorButton();
			m.getButtonEstimation().setBackground(Color.LIGHT_GRAY);
		}else if(e.getActionCommand().equals("Declaration Valeur")){
			layout.show(contenu,"declaration");
			m.colorButton();
			m.getButtonDeclaration().setBackground(Color.LIGHT_GRAY);
		}else if(e.getActionCommand().equals("Inventaire")){
		layout.show(contenu,"inventaire");
		m.colorButton();
		m.getButtonInventaire().setBackground(Color.LIGHT_GRAY);
		}else if(e.getActionCommand().equals("Liste")){
			layout.show(contenu,"listMeuble");
			m.colorButton();
			m.getButtonList().setBackground(Color.LIGHT_GRAY);
		}
	}

}
