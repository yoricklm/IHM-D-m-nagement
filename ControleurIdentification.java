import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;




public class ControleurIdentification implements ActionListener,ItemListener{
	private Identification vue;
	public ControleurIdentification(Identification i){
		vue=i;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Ajouter element")) {
			if(Test.isInteger(vue.getTextAreaElement().getText())){
				int i= Integer.parseInt(vue.getTextAreaElement().getText());
				vue.setP(new JPanelScroll(i));
				vue.getScroll().setViewportView(vue.getP());
				vue.repaint();
			}else{
			}

		}
	}
	@Override
	public void itemStateChanged(ItemEvent e){
		if(e.getStateChange()==ItemEvent.SELECTED){
			vue.getTextAreaElement().setEnabled(true);
			vue.getTextElement().setEnabled(true);
			vue.getButtonAjouter().setEnabled(true);
			vue.getScroll().setVisible(true);
			vue.getTextAreaElement().setText("0");
		}else{
			vue.getTextAreaElement().setEnabled(false);
			vue.getTextElement().setEnabled(false);
			vue.getButtonAjouter().setEnabled(false);
			vue.getScroll().setVisible(false);
		}
	}

}
