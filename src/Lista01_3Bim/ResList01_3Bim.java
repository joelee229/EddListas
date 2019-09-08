package Lista01_3Bim;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class ResList01_3Bim {
	public void qt01(){
		JOptionPane.showMessageDialog(null, "O que são sementes na geração de números aleatórios? Porque um programador\n" + 
				"pode ter interesse em definir uma semente específica?\n\nA semente aleatória é um número (ou vetor) usado para \n"
				+ "iniciar o algoritmo gerador de números pseudo-aleatórios. Computacionalmente as sementes aleatórias são muitas vezes \n"
				+ "geradas a partir de um valor que não se repetirá.","Questão 01", JOptionPane.INFORMATION_MESSAGE);
	}
	public void qt02() {
		JOptionPane.showMessageDialog(null,"\nimport java.util.*;\n" + 
				"public class ArrayAleatorio {\n" + 
				"public static void main(String[] args) {\n" + 
				"Random r = new Random();\n" + 
				"int[] array = new int[10];\n" + 
				"for(int i = 1; i <= 10; i++) {\n" + 
				"array[i] = r.nextInt(100);\n" + 
				"}\n" + 
				"for(int i = 1; i <= 10; i++) {\n" + 
				"System.out.print(array[i]+\" \");\n" + 
				"}\n" + 
				"}\n" + 
				"}\n" + 
				"a( ) O código não compila por falta do import da classe Random.\n" + 
				"b( ) não existe nenhum erro neste código, portanto compilará e executar´a sem nenhuma chance de\n" + 
				"erro.\n" + 
				"c( ) O código não compila porque a variável i não pode ser declarada novamente no segundo for.\n" + 
				"d(x) O código compila, mas o acesso ao elemento de ´ındice 10 do array faz o programa ser encerrado\n" + 
				"pois este elemento não existe no array.\n" + 
				"e( ) O código não compila porque array é uma palavra reservada do Java e não pode ser usada\n" + 
				"como nome de vari´avel.","Questão 02",JOptionPane.INFORMATION_MESSAGE);
	}
	public void qt03() {
		try {
		int ts = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o tempo (em segundos)","Questão 03",JOptionPane.QUESTION_MESSAGE));
		int seg = ts%60;
		int min = (ts/60)%60;
		int hora = ts/3600;
		String hms = String.format("%02d:%02d:%02d", hora,min,seg);
		JOptionPane.showMessageDialog(null,"São: "+ hms,"Questão 03",JOptionPane.QUESTION_MESSAGE);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"ERROR- Digite antes!!!","Error!!!",JOptionPane.ERROR_MESSAGE);
		}
	}
	public void qt04() {
		try {
		int n =2;
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ","Questão 04",JOptionPane.QUESTION_MESSAGE));
		String nums = "";
		while(num !=1) {
			while(num%n !=0) {
				n++;
			}
			if(num%n ==0) {
				num = num/n;
			}
			nums += n+" ";
		}
		JOptionPane.showMessageDialog(null, "Os seus primos são: "+ nums, "Questão 04", JOptionPane.QUESTION_MESSAGE);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR- Digite antes!!!","Error!!!",JOptionPane.ERROR_MESSAGE);
		}
	}
	public void qt05() {
		double pi = 0;
		for (int i = 0; i < 1000000; i++) {
			pi += ((i%2==1)? -1.0 : 1.0)/(2.0*i+1.0);
		}
		String piRes = String.format("%.6f", pi*4);
		JOptionPane.showMessageDialog(null, "Pi igual: "+piRes,"Questão 05",JOptionPane.INFORMATION_MESSAGE);
	}
	public void qt06() {
		try {
		DecimalFormat df = new DecimalFormat("#0.00");
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o A da equação  =>  ax²+bx+c=0","Questão 06",JOptionPane.QUESTION_MESSAGE));
		int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o B da equação  =>  "+a+"x²+bx+c=0","Questão 06",JOptionPane.QUESTION_MESSAGE));
		int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o C da equação  =>  "+a+"x²+"+b+"x+c=0","Questão 06",JOptionPane.QUESTION_MESSAGE));
		double del  = Math.pow(b, 2) - 4*a*c;
		if(del<0) {
			JOptionPane.showMessageDialog(null, "A equação "+a+"x²+"+b+"x+"+c+"=0   Não tem raíz.","Questão 06",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(del==0) {
			double x = -1*b/2*a;
			JOptionPane.showMessageDialog(null, "A equação "+a+"x²+"+b+"x+"+c+"=0   Tem uma raíz.\n\nx = "+df.format(x),"Questão 06",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(del >0) {
			double x1 = -1*b + Math.sqrt(del)/2*a; 
			double x2 = -1*b - Math.sqrt(del)/2*a;
			JOptionPane.showMessageDialog(null, "A equação "+a+"x²+"+b+"x+"+c+"=0   Tem duas raízes.\n\nx1 = "+df.format(x1)+"\nx2 = "+df.format(x2),"Questão 06",JOptionPane.INFORMATION_MESSAGE);
		}
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,"ERROR- Digite antes!!!","Error!!!",JOptionPane.ERROR_MESSAGE);
		}
	
	}
}
