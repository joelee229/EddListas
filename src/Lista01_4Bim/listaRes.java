package Lista01_4Bim;

import java.util.Random;

import javax.swing.JOptionPane;

public class listaRes {
	TelaQt03 tela = new TelaQt03();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listaRes lr = new listaRes();
		Object[] quet = {"qt01","qt02","qt03","qt04","qt05","qt06","qt07"};
		int x=0;
		while(x==0) {
			int opt = JOptionPane.showOptionDialog(null,"Escolha uma das questões: ","Lista 01",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,quet,null);
			if(opt==0) {
				lr.qt01();
			}else if(opt==1) {
				lr.qt02();
			}else if(opt==2) {
				lr.qt03();
				x++;
			}
			else if(opt==3) {
				lr.qt04();
			}
			else if(opt==4) {
				lr.qt05();
			}
			else if(opt==5) {
				lr.qt06();
			}
			else if(opt==6) {
				lr.qt07();
			}else {
				x++;
			}

		}

	}

	public void qt01() {
		JOptionPane.showMessageDialog(null,"String é uma cadeia de caracteres que possui funções especiais");
	}

	public void qt02() {
		JOptionPane.showMessageDialog(null, "Quest˜ao 2: [1.0 ponto] Quais dos itens a seguir s˜ao verdadeiros? Justifique.\r\n" + 
				"a(x) Todo comando em Java deve terminar com ponto e v´ırgula (;).\r\n" + 
				"b(x) Em Java, existe o tipo boolean, que assume apenas dois valores: ‘true’ e ‘false’.\r\n" + 
				"c( ) Arrays s˜ao conjunto de vari´aveis que recebem vari´aveis de diferentes tipos ao mesmo tempo.\r\n" + 
				"d( ) Vari´aveis locais n˜ao inicializadas explicitamente recebem o valor padr˜ao zero.\r\n" + 
				"e( ) Todo m´etodo em Java ´e obrigado a ter pelo menos um argumento de entrada.");
	}

	public void qt03() {
		tela.setVisible(true);
		//tela.setLocationRelativeTo(null);
	}
	public void qt04() {
		String letra= "";
		Random r = new Random();
		for (int i = 0; i < 3; i++) {
			char b = (char) ((char)r.nextInt(26)+'A');
			letra += b;
		}
		letra += "-";

		for (int i = 0; i < 4; i++) {
			letra += r.nextInt(10);
		}

		JOptionPane.showMessageDialog(null, "A sua placa pode ser: "+letra);
	}

	public void qt05() {
		String[] array = new String[10];
		array[0] = "Joel";
		array[1] = "Joina";
		array[2] = "Arthur";
		array[3] = "Felipe";
		array[4] = "Beatriz";
		array[5] = "Gabriel";
		array[6] = "Israel";
		array[7] = "Cristhian";
		array[8] = "Lucas";
		array[9] = "Heitor";
		boolean state = false;
		String nome = JOptionPane.showInputDialog(null,"Digite um nome para ver se existe na tabela: ");
		for (int i = 0; i < array.length; i++) {
			if(nome.equalsIgnoreCase(array[i])) {
				state = true;
			}else {
				state = false;
			}
		}
		if(state==true) {
			JOptionPane.showMessageDialog(null, "O nome "+nome+" existe!!!");
		}else {
			JOptionPane.showMessageDialog(null,"O nome "+nome+" não existe");
		}
	}

	public void qt06() {
		String pala = JOptionPane.showInputDialog(null,"Digite uma palavra: ");
		String nomeInver= "";
		char[] letra = new char[pala.length()];
		char[] letraInver = new char[letra.length];
		for (int i = 0, j = letraInver.length-1; i < letra.length && j >=0; i++, j--) {
			letra[i] = pala.charAt(i);
			letraInver[j] = letra[i];
		}
		nomeInver = new String(letraInver);
		if(pala.equals(nomeInver)) {
			JOptionPane.showMessageDialog(null, "A palavra é um palíndromo");
		}else {
			JOptionPane.showMessageDialog(null,"A palavra não é um palíndromo");
		}
	}

	public void qt07() {
		String palavra = JOptionPane.showInputDialog(null,"Digite uma palavra");
		palavra.toUpperCase();
		String convertido = "";
		for (int i = 0; i < palavra.length(); i++) {
			switch(palavra.toUpperCase().charAt(i)){
			case 'A':
				convertido+=".- ";
				break;
			case 'B':
				convertido+="-... ";
				break;
			case 'C':
				convertido+="-.-. ";
				break;
			case 'D':
				convertido+="-.. ";
				break;
			case 'E':
				convertido+=". ";
				break;
			case 'F':
				convertido+="..-. ";
				break;
			case 'G':
				convertido+="--. ";
				break;
			case 'H':
				convertido+=".... ";
				break;
			case 'I':
				convertido+=".. ";
				break;
			case 'J':
				convertido+=".--- ";
				break;
			case 'K':
				convertido+="-.- ";
				break;
			case 'L':
				convertido+=".-.. ";
				break;
			case 'M':
				convertido+="-- ";
				break;
			case 'N':
				convertido+="-. ";
				break;
			case 'O':
				convertido+="--- ";
				break;
			case 'P':
				convertido+=".--. ";
				break;
			case 'Q':
				convertido+="--.- ";
				break;
			case 'R':
				convertido+=".-. ";
				break;
			case 'S':
				convertido+="... ";
				break;
			case 'T':
				convertido+="- ";
				break;
			case 'U':
				convertido+="..- ";
				break;
			case 'V':
				convertido+="...- ";
				break;
			case 'W':
				convertido+=".-- ";
				break;
			case 'X':
				convertido+="-..- ";
				break;
			case 'Z':
				convertido+="--.. ";
				break;
			case '1':
				convertido+=".---- ";
				break;
			case '2':
				convertido+="..--- ";
				break;
			case '3':
				convertido+="...-- ";
				break;
			case '4':
				convertido+="....- ";
				break;
			case '5':
				convertido+="..... ";
				break;
			case '6':
				convertido+="-.... ";
				break;
			case '7':
				convertido+="--... ";
				break;
			case '8':
				convertido+="---.. ";
				break;
			case '9':
				convertido+="----. ";
				break;
			case '0':
				convertido+="----- ";
				break;
			case ' ':
				convertido+="\n";
				break;
				
			default:
				System.out.println("Não deu certo");
			}
			
				
		}
		JOptionPane.showMessageDialog(null, "O correspondente em morse é :\n"+convertido);
	}

}
