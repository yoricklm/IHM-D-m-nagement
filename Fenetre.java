import javax.swing.*;
import java.util.List;
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
	private ControleurInit init;


	private CardLayout layout ;
	public Fenetre(){
		super("IHM");
		this.setSize(800, 600);
    	this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridBagLayout());
		GridBagConstraints contrainte = new GridBagConstraints();
		List<String> list;
		m = new Menu();
		c = new JPanel();
		//init=new ControleurInit(list);
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

		controleMenu = new ControleurMenu(c,layout);
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

		this.addWindowListener(init);
		m.getButtonEstimation().addActionListener(controleMenu);
		m.getButtonMeuble().addActionListener(controleMenu);
		m.getButtonDeclaration().addActionListener(controleMenu);
		m.getButtonInventaire().addActionListener(controleMenu);
		m.getButtonList().addActionListener(controleMenu);
	}



}
