package Trab_4Bim;

import java.text.DecimalFormat;
import java.util.Random;

public class Trab4Bim {
	public static void main(String []args) {
		menorMaior();
	}
	static void menorMaior() {
		DecimalFormat df = new DecimalFormat(".##");
		int soma=0,menor=10,maior=0,somaCalc=0;
		int media = 0;
		double desvio = 0, var = 0;
		Random r = new Random();
		int num[] = new int[100];
		int amost[]=  new int[101];
		double [] calc = new double [100];
		System.out.println("Array: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(101);
			soma+= num[i];
			if(num[i]>maior) {
				maior=num[i];
			}else if(menor>num[i]) {
				menor= num[i];
			}
			System.out.print(num[i] + " ");
		}

		media = soma/num.length;

		for (int i = 0; i < calc.length; i++) {
			calc[i] = Math.pow(num[i] - media, 2);
			somaCalc+= calc[i];
		}
		int maiorAmost = 0,modo = 0;

		for (int i = 0; i < num.length; i++) {
			amost[num[i]]++;
			// System.out.println(amost[i]);
		}



		for (int i = 0; i < num.length; i++) {
			if(amost[i]>maiorAmost) {
				maiorAmost=amost[i];
				modo =i;
			}
		}

		desvio  = Math.sqrt(somaCalc/(calc.length-1));
		var = Math.pow(desvio, 2);
		System.out.println("\n"+ num[49]);
		antesDoSelectionSort(num);

		System.out.println("\nMaior: "+maior + "\nMenor: " +menor+ "\nSoma: "+ soma+ "\nMédia: "+ media +"\nDesvio padrão: "+ df.format(desvio)+ "\nVariância: "+ df.format(var)+ "\nMediana: " + num[49]+ "\nModo: O número " +modo+" É o que mais aparece, com "+maiorAmost +" ocorrências"  );
	}

	static void antesDoSelectionSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int swap = array[i];
					array[i] = array[j];
					array[j] = swap;
				}
			}
		}
	}





}


