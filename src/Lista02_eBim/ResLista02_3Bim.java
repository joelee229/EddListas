package Lista02_eBim;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class ResLista02_3Bim {
	
	public static double mdc (double dividendo, double divisor){
		if ((dividendo % divisor == 0 )){
			return divisor;
		}else{
			return mdc(divisor,(dividendo % divisor));
		} 
	}
	public static int calculaMmc(int numero1, int numero2) {
		int resultado = 1;
		int n = 2;
		while (numero1 != 1 || numero2 != 1) {
			while (numero1 % n != 0 && numero2 % n != 0) {
				n++;
			}
			if (numero1 % n == 0) {
				numero1 = numero1 / n;
			}
			if (numero2 % n == 0) {
				numero2 = numero2 / n;
			}
			resultado *= n;
		}
		return resultado;
	}
	
	public void qt01() {
		JOptionPane.showMessageDialog(null, "Questão 1: [1.0 ponto] O que é um método recursivo?\n\nÉ um método que chama ele mesmo, criando uma repetição.","Questão 01", JOptionPane.INFORMATION_MESSAGE);
	}
	public void qt02() {
		JOptionPane.showMessageDialog(null, "Questão 2: [1.0 ponto] Quais dos códigos a seguir s˜ao legais? Justifique.\n" + 
				"				1. 1. while (int i < 7) {\n" + 
				"				2. i++;\n" + 
				"				3. System.out.println(\"i is \" + i);\n" + 
				"				4. }\n" + 
				"				2. 2. int i = 3;\n" + 
				"				2. while (i) {\n" + 
				"				3. System.out.println(\"i is \" + i);\n" + 
				"				4. }\n" + 
				"				3. 3. int j = 0;\n" + 
				"				2. for (int k = 0; j + k != 10; j++, k++) {\n" + 
				"				3. System.out.println(\"j is \" + j + \" k is \" + k);\n" + 
				"				4. }\n" + 
				"				4. 4. int j = 0;\n" + 
				"				2. do {\n" + 
				"				3. System.out.println(\"j is \" + j++);\n" + 
				"				4. if (j == 3) { continue; }\n" + 
				"				5. } while (j < 10);\n\nOs código 3 e 4. Porque os dois estão sintaticamente corretos","Questão 02", JOptionPane.INFORMATION_MESSAGE);

	}
	public void qt03() {
		try {
			double[] n = new double[3]; 
			for (int i = 0; i < n.length; i++) {
				n[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do "+(i+1)+"º lado do triângulo: ", "Questão 03", JOptionPane.QUESTION_MESSAGE));
			}
			Arrays.sort(n);
			if((n[0]>0 && n[1]>0 && n[2]>0) && n[2]<(n[1]+n[0]) ) {
				double cats = Math.pow(n[0], 2)+Math.pow(n[1], 2);
				if((n[0]==n[1] && n[0]==n[2]) && (n[1]==n[0] && n[1]==n[02]) && (n[2]==n[0] && n[2]==n[1])) {
					JOptionPane.showMessageDialog(null, "É um triângulo equilátero!!!", "Questão 03", JOptionPane.INFORMATION_MESSAGE);
				}
				else if(n[0]==n[1] || n[0]==n[2]){
					JOptionPane.showMessageDialog(null, "É um triângulo isóceles!!!", "Questão 03", JOptionPane.INFORMATION_MESSAGE);
				}
				else if((n[0]!=n[1] && n[0]!=n[2]) && (n[1]!=n[0] && n[1]!=n[2]) && (n[2]!=n[0] && n[2]!=n[1])) {
					JOptionPane.showMessageDialog(null, "É um triângulo escaleno!!!", "Questão 03", JOptionPane.INFORMATION_MESSAGE);
				}if(Math.pow(n[2],2)==cats) {
					JOptionPane.showMessageDialog(null, "É um triângulo retângulo!!!", "Questão 03", JOptionPane.INFORMATION_MESSAGE);
				}


			}else {
				JOptionPane.showMessageDialog(null, "Não é um triângulo!!!", "Questão 03", JOptionPane.INFORMATION_MESSAGE);

			}
		}catch(Exception e) {}
	}
	public void qt04() {
		Random r = new Random();
		int[] vet = new int [10];
		String vetsh = "";
		double med  = 0;
		for (int i = 0; i < vet.length; i++) {
			vet[i] = r.nextInt(99)+1;
			vetsh+="["+vet[i]+"] ";
			med+=vet[i];
		}
		med = med/10;
		String res = "";
		for (int i = 0; i < vet.length; i++) {
			if(vet[i]>med) {
				res+=vet[i]+" É maior que a média\n";
			}
		}
		JOptionPane.showMessageDialog(null, "Dos números:\n "+vetsh+"\nCom média = "+med+"\n\n"+res, "Questão 04", JOptionPane.INFORMATION_MESSAGE);


	}
	public void qt05() {
		try {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: ","Questão 05",JOptionPane.QUESTION_MESSAGE));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número: ","Questão 05",JOptionPane.QUESTION_MESSAGE));
		double fat = mdc(n1,n2);
		String res = String.format("%.0f", fat);
		JOptionPane.showMessageDialog(null, "O MDC entre "+n1+" e "+n2+" é igual a: "+res);
		}catch(Exception ae){
			JOptionPane.showMessageDialog(null,"ERROR- Preencha os campos!!!","Error!!!",JOptionPane.ERROR_MESSAGE);
		}
	}
	public void qt06() {
		try {
		//ResLista02_3Bim f = new ResLista02_3Bim();
		int n1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número: ","Questão 05",JOptionPane.QUESTION_MESSAGE));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro número: ","Questão 05",JOptionPane.QUESTION_MESSAGE));
		int res = calculaMmc(n1,n2);
		
		JOptionPane.showMessageDialog(null, "O mmc entre "+n1+" e "+n2+" é igual a: "+res);
		}catch(Exception ae){
			JOptionPane.showMessageDialog(null,"ERROR- Preencha os campos!!!","Error!!!",JOptionPane.ERROR_MESSAGE);
		}
	}

}
