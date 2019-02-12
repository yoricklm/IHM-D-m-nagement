import java.awt.*;

import java.awt.event.*;

public class ControleurInit implements ComponentListener{
	private ModelInit m;
	private Fenetre vue;
	public ControleurInit(Fenetre v){
		m=new ModelInit();
		vue=v;
		List list=m.getPiece();
		list.add("- - -",0);
		vue.getPanelIdentification().setComboBox(list);
	}
	public void componentShown(ComponentEvent e){
		
		if(e.getComponent().equals(vue.getPanelIdentification())){
			List list=m.getPiece();
			list.add("- - -",0);
			vue.getPanelIdentification().setComboBox(list);
		}else if(e.getComponent().equals(vue.getPanelEstimation())){
			List list=m.getPiece();
			list.add("- - -",0);
			vue.getPanelEstimation().setComboBox(list);
		}else if(e.getComponent().equals(vue.getPanelList())){
			
			List list=m.getPiece();
			String[] piece=list.getItems();
			Meuble[] meuble =null;
			int[] i ;
			JPanelScrollList p =new JPanelScrollList();
			for(int x=0;x<piece.length;x++) {
				meuble=m.getBienPiece(piece[x]);
				i=m.getCartonPiece(piece[x]);
				p.addMeuble(piece[x],meuble,i);
			}
			vue.getPanelList().setP(p);
			vue.getPanelList().getScroll().setViewportView(vue.getPanelList().getP());
			vue.getPanelList().getScroll().repaint();
			
		}else if(e.getComponent().equals(vue.getPanelDeclaration())){
			Meuble[] meuble=m.getBien();
			List list = new List();
			list.add("- - -",0);
			for(int i =0; i<meuble.length;i++)
				list.add(meuble[i].getNom());
			vue.getPanelDeclaration().setMeuble(meuble);
			vue.getPanelDeclaration().setComboBox(list);
		}else if(e.getComponent().equals(vue.getPanelInventaire())){
			Meuble[] meuble=m.getBien();
			List list = new List();
			list.add("- - -",0);
			for(int i =0; i<meuble.length;i++)
				list.add(meuble[i].getNom());
			vue.getPanelInventaire().setMeuble(meuble);
			vue.getPanelInventaire().setBoxBien(list);
			list=m.getPiece();
			list.add("- - -",0);
			vue.getPanelInventaire().setBoxDestination(list);		
		}
	}
	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void componentResized(ComponentEvent arg0) {
		// TODO Auto-generated method stub
		
	} 
	
}
