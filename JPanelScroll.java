import java.awt.Dimension;

import javax.swing.JPanel;

public class JPanelScroll extends JPanel {
	private PanelDemontable[] p;
	public JPanelScroll(int nbElement){
		p=new PanelDemontable[nbElement];
		for(int i=0;i<nbElement;i++) {
			p[i]= new PanelDemontable();
			this.add(p[i]);
		}
		this.setPreferredSize(new Dimension(200,22*nbElement));
	}

	public PanelDemontable[] getPanel(){
		return p;
	}
}
