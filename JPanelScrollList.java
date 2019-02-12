import java.awt.Dimension;
import java.util.Arrays;
import java.util.List;

import javax.swing.JPanel;

public class JPanelScrollList extends JPanel {
	private PanelListe[] p;
	public JPanelScrollList(int nbElement,String[] nom,List<String> piece){

		p=new PanelListe[nbElement];
		for(int i=0;i<nbElement;i++) {
			p[i]= new PanelListe(nom[i],piece);
			this.add(p[i]);
		}
		this.setPreferredSize(new Dimension(450,22*nbElement));
	}
	public JPanelScrollList(){
		super();
		this.setPreferredSize(new Dimension(450,400));
	}
}
