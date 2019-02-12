import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelScrollList extends JPanel {
	private PanelListe[] p;
	private JLabel textPiece;
	private int nb;

	public JPanelScrollList(){
		super();
		this.setPreferredSize(new Dimension(450,400));
	}
	public void addMeuble(String piece, Meuble[] m, int[] carton) {
		textPiece = new JLabel(piece);
		textPiece.setPreferredSize(new Dimension(450,40));
		this.add(textPiece);
		p=new PanelListe[m.length];
		for(int i=0;i<m.length;i++) {
			p[i]= new PanelListe(1,m[i].getNom());
			this.add(p[i]);
		}
		if(carton[0]==1) {
			this.add(new PanelListe(carton[0],"Petit carton"));
		}else if(carton[0]>1) {
			this.add(new PanelListe(carton[0],"Petit(s) carton(s)"));
		}
		if(carton[1]==1) {
			this.add(new PanelListe(carton[1],"Carton moyen"));
		}else if(carton[1]>1) {
			this.add(new PanelListe(carton[1],"Carton(s) moyen(s)"));
		}
		if(carton[2]==1) {
			this.add(new PanelListe(carton[2],"Carton(s) barrel"));
		}else if(carton[2]>1) {
			this.add(new PanelListe(carton[2],"Carton(s) barrel"));
		}
		if(carton[3]==1) {
			this.add(new PanelListe(carton[3],"Carton penderie"));
		}else if(carton[3]>1) {
			this.add(new PanelListe(carton[3],"Carton(s) penderie(s)"));
		}
		if(carton[4]==1) {
			this.add(new PanelListe(carton[4],"Carton Tableaux"));
		}else if(carton[4]>1) {
			this.add(new PanelListe(carton[4],"Carton(s) Tableaux"));
		}
		
		this.nb=this.nb+m.length+5;
		this.setPreferredSize(new Dimension(450,30*nb));
	}
}
