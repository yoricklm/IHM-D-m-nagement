import javax.swing.*;
import java.util.List;
import java.awt.CardLayout; 
import java.awt.GridBagConstraints; 
import java.awt.GridBagLayout;
import java.awt.event.*;

public class ControleurInit implements WindowListener{
	private ModelInit m;
	private List list;
	public ControleurInit(List l){
		m=new ModelInit();
		list=l;
	}
	public void windowOpened(WindowEvent e){
		list=m.getPiece();

	} 
	public void windowClosing(WindowEvent evenement){}     
	public void windowDeactivated(WindowEvent evenement){}    // arrière-plan
	public void windowDeiconified(WindowEvent evenement){}    // restauration
	public void windowIconified(WindowEvent evenement){}      // minimisation        // après ouverture
	public void windowActivated(WindowEvent evenement){}      // premier plan
	public void windowClosed(WindowEvent evenement){}         // après fermeture
}
