import javax.swing.*;
import java.awt.*;

public class Fenetre extends JFrame{
	private Menu m;
	private JPanel c;
	private ControleurMenu controleMenu;
	private Estimation panelEstimation;
	private Identification panelIdentification;
	private Declaration panelDeclaration;
	private Inventaire panelInventaire;
	private ListeMeuble panelList;
	private ControleurInit controleComponent;


	private CardLayout layout ;
	public Fenetre(){
		super("IHM");
		this.setSize(800, 600);
    	this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		m = new Menu();
		c = new JPanel();

		layout = new CardLayout();
		panelEstimation = new Estimation();
		panelIdentification = new Identification();
		
		panelDeclaration = new Declaration();
		panelInventaire = new Inventaire();
		panelList = new ListeMeuble();
		c.setLayout(layout);
		c.add(panelIdentification,"identification");
		c.add(panelEstimation,"estimation");
		c.add(panelDeclaration,"declaration");
		c.add(panelInventaire,"inventaire");
		c.add(panelList,"listMeuble");

		controleMenu = new ControleurMenu(c,layout,m);
		controleComponent=new ControleurInit(this);
		contrainte.gridx=0; 
		contrainte.gridy=0; 
		contrainte.gridwidth=1; 
		contrainte.weighty=1;
		contrainte.weightx=1;
		contrainte.fill=GridBagConstraints.BOTH;
		this.add(m,contrainte);

		contrainte.gridx=1; 
		contrainte.gridwidth=GridBagConstraints.REMAINDER; 
		contrainte.weightx=6;
		contrainte.fill=GridBagConstraints.BOTH;
		this.add(c,contrainte);
		layout.show(c,"identification");
		panelIdentification.addComponentListener(controleComponent);
		panelEstimation.addComponentListener(controleComponent);
		panelList .addComponentListener(controleComponent);
		panelDeclaration.addComponentListener(controleComponent);
		panelInventaire.addComponentListener(controleComponent);

		m.getButtonEstimation().addActionListener(controleMenu);
		m.getButtonMeuble().addActionListener(controleMenu);
		m.getButtonDeclaration().addActionListener(controleMenu);
		m.getButtonInventaire().addActionListener(controleMenu);
		m.getButtonList().addActionListener(controleMenu);

	}
	public Menu getM() {
		return m;
	}
	public void setM(Menu m) {
		this.m = m;
	}
	public JPanel getC() {
		return c;
	}
	public void setC(JPanel c) {
		this.c = c;
	}
	public ControleurMenu getControleMenu() {
		return controleMenu;
	}
	public void setControleMenu(ControleurMenu controleMenu) {
		this.controleMenu = controleMenu;
	}
	public Estimation getPanelEstimation() {
		return panelEstimation;
	}
	public void setPanelEstimation(Estimation panelEstimation) {
		this.panelEstimation = panelEstimation;
	}
	public Identification getPanelIdentification() {
		return panelIdentification;
	}
	public void setPanelIdentification(Identification panelIdentification) {
		this.panelIdentification = panelIdentification;
	}
	public Declaration getPanelDeclaration() {
		return panelDeclaration;
	}
	public void setPanelDeclaration(Declaration panelDeclaration) {
		this.panelDeclaration = panelDeclaration;
	}
	public Inventaire getPanelInventaire() {
		return panelInventaire;
	}
	public void setPanelInventaire(Inventaire panelInventaire) {
		this.panelInventaire = panelInventaire;
	}
	public ListeMeuble getPanelList() {
		return panelList;
	}
	public void setPanelList(ListeMeuble panelList) {
		this.panelList = panelList;
	}

	public CardLayout getLayout() {
		return layout;
	}
	public void setLayout(CardLayout layout) {
		this.layout = layout;
	}



}
