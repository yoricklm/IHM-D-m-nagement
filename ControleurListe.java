import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

public class ControleurListe implements ActionListener {
	private ListeMeuble vue;
	public ControleurListe(ListeMeuble v) {
		vue=v;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JComboBox combo = (JComboBox)e.getSource();
		String piece = (String)combo.getSelectedItem();
		Object[] o =vue.getElements().toArray();
		String[] s = new String[o.length];
	    for (int i = 0; i < o.length; i++)
	        s[i] = String.valueOf(o[i]);
		vue.setP(new JPanelScrollList(4,s,vue.getElements()));
		vue.getScroll().setViewportView(vue.getP());
		vue.getScroll().repaint();
	}

}
