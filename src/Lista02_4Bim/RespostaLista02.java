package Lista02_4Bim;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class RespostaLista02 {
	public void qt01() {
		JOptionPane.showMessageDialog(null,"Serve para mostrar como os componentes da janela estarão posicionados");
	}
	public void qt02() {
		JOptionPane.showMessageDialog(null,"import javax.swing.*;\n" + 
				"public class Tentativa {\n" + 
				"public static void main(String[] args) {\n" + 
				"String palavra1 = JOptionPane.showInputDialog(\"Escreva a primeira palavra:\");\n" + 
				"String palavra2 = JOptionPane.showInputDialog(\"Escreva a segunda palavra:\");\n" + 
				"if(palavra1 == palavra2) {\n" + 
				"JOptionPane.showMessageDialog(null,\"As duas palavras s~ao iguais.\");\n" + 
				"} else if(palavra1 > palavra2) {\n" + 
				"JOptionPane.showMessageDialog(null,\"A primeira palavra vem antes.\");\n" + 
				"} else if(palavra1 < palavra2) {\n" + 
				"JOptionPane.showMessageDialog(null,\"A primeira palavra vem depois.\");\n" + 
				"}\n" + 
				"}\n" + 
				"}\n" + 
				"a( ) Compila e realiza com sucesso uma compara¸c˜ao entre as palavras com rela¸c˜ao a ordem alfab´etica.\n" + 
				"b( ) O c´odigo compila e executa, mas ao inv´es da ordem alfab´etica, ´e comparado o tamanho dos\n" + 
				"arrays.\n" + 
				"c(X) O c´odigo n˜ao compila pois objetos n˜ao podem ser comparados com os operadores >, <.\n" + 
				"d( ) O c´odigo n˜ao compila porque n˜ao pode ser realizada uma compara¸c˜ao entre strings de tamanhos\n" + 
				"diferentes.\n" + 
				"e( ) O c´odigo n˜ao compila porque, uma vez que strings s˜ao arrays, deve-se usar um la¸co do tipo\n" + 
				"for em torno do m´etodo JOptionPane.showInputDialog() para capturar as palavras.");
	}
	public void qt03() {
		String[] nomes = new String[10];
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog(null,"Digite 10 números:");
		}
		Arrays.sort(nomes);
		JOptionPane.showMessageDialog(null,"A primeira palavra em ordem alfabética é: "+nomes[0]); 
	}
	public void qt04() {
		TelaQt04 jay = new TelaQt04();
		jay.setVisible(true);
	}
	public void qt05() {
		TelaQt05 tea = new TelaQt05();
		tea.setVisible(true);
	}
	public void qt06() {
		String conteudo = null;
		JFileChooser jf= new JFileChooser();
		int opt = jf.showOpenDialog(null);
		File arquivo;
		if(opt==JFileChooser.APPROVE_OPTION) {
			arquivo = jf.getSelectedFile();
			byte[]arrayDeBytes = new byte[(int)arquivo.length()];
			try {
				FileInputStream fis = new FileInputStream(arquivo);
				fis.read(arrayDeBytes);
				conteudo = new String(arrayDeBytes);
			}catch(FileNotFoundException fnde) {
				fnde.printStackTrace();
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
		int contEs = 0;
		
		for (int i = 0; i < conteudo.length(); i++) {
			if(conteudo.charAt(i)==' ') {
				contEs++;
			}
		}
		
		char[] c = conteudo.toCharArray();
		int contLe = 0;
		int contNum = 0;

		for ( int i = 0; i < c.length; i++ ) {
		    // verifica se o char é um dígito
		    if ( Character.isDigit( c[ i ] ) ) {
		        contNum++;
		        	
		    }else {
		    	contLe++;
		    }
		    	
		}
		JOptionPane.showMessageDialog(null, "Existem "+conteudo.length()+" caracteres");
		JOptionPane.showMessageDialog(null, "Existem "+contEs+" espaços");
		JOptionPane.showMessageDialog(null,"Existem "+(contLe-contEs)+ " letras");
		JOptionPane.showMessageDialog(null, "Existem "+contNum+ " números");
		
	}
	public void qt07() {
		double real = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite uma quantia em dinheiro: "));
		//não consegui
		/*System.out.println("entrei");
		String resul = "";
		int c100=0,c50=0,c20=0,c10=0,c5=0,c2=0,c50cen=0,c25cen=0,c10cen=0,c5cen=0,c1cen=0;
		for(double i =real;i>0;i++) {
			System.out.println("entrou");
			if(real>=100) { 
				c100++;
				real= real - 100;
				
			}else if(real>=50 && real<100) {
				c50++;
				real = real - 50;
				
			}else if(real>=20 && real<50) {
				c20++;
				real= real - 20;
				
			}else if(real>=10 && real<20) {
				c10++;
				real = real - 10;
				
			}else if(real>=5 && real<10) {
				c5++;
				real = real - 5;
				
			}else if(real>=2 && real<5) {
				c2++;
				real = real - 2;
				
			}else if(real>=0.5 && real<2) {
				c50cen++;
				real = real - 0.5;
				
			}else if(real>=0.25 && real<0.5) {
				c25cen++;
				real = real - 0.25;
				
			}else if (real>=0.10 && real<0.25) {
				c10cen++;
				real = real - 0.10;
				
			}else if(real>=0.05 && real<0.10) {
				c5cen++;
				real = real - 0.05;
				
			}else if(real>=0.01 && real<0.05) {
				c1cen++;
				real = real - 0.01;
				
			}
		}
		System.out.println("foid");
		resul+= "R$ 100,00 "+c100+" nota(s).\nR$ 50,00 "+c50+" nota(s).\nR$ 20,00 "+c20+" nota(s).\nR$ 10,00 "+c10+" nota(s).\nR$ 5,00 "+c5+" nota(s)\nR$ 2,00 "+c2+" nota(s)";
		resul+= "\n\nR$ 0,50 "+c50cen+" moeada(s)\nR$ 0,25 "+c25cen+" moeda(s)\nR$ 0,10 "+c10cen+" moeda(s)\nR$ 0,05 "+c5cen+" moeda(s)\nR$ 0,01 "+c1cen+" moeda(s)";
		JOptionPane.showMessageDialog(null, resul);*/
	}

}
