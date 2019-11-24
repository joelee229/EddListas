package Lista02_4Bim;

import javax.swing.JOptionPane;

public class Lista02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RespostaLista02 res = new RespostaLista02();
		Object[] quet = {"qt01","qt02","qt03","qt04","qt05","qt06","qt07"};
		int x=0;
		while(x==0) {
			int opt = JOptionPane.showOptionDialog(null,"Escolha uma das questões: ","Lista 01",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,quet,null);
			if(opt==0) {
				res.qt01();
			}else if(opt==1) {
				res.qt02();
			}else if(opt==2) {
				res.qt03();
				x++;
			}
			else if(opt==3) {
				res.qt04();
			}
			else if(opt==4) {
				res.qt05();
			}
			else if(opt==5) {
				res.qt06();
			}
			else if(opt==6) {
				res.qt07();
			}else {
				x++;
			}

		}
	}

}
