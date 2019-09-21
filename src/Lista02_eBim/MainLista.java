package Lista02_eBim;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Lista01_3Bim.ResList01_3Bim;

public class MainLista extends JFrame {

	private JPanel contentPane;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;
	JLabel jl1,jl7,jlt, jldfm,jltr,jlqtdm,jlesp1, jlM,jlesp2,jldev;
	JScrollPane scroll;
	JPanel jp;
	JTextField dfm,tr,qtdm,jtfres;
	JTextArea jta1;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainLista frame = new MainLista();
					frame.setSize(680,250);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainLista() {
		super("Lista 2 do 3º Bimestre");
		ResLista02_3Bim opa = new ResLista02_3Bim();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp.setPreferredSize(new Dimension(200,440));
		add(jp);
		scroll = new JScrollPane(jp);
		scroll.setVerticalScrollBarPolicy ( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED );
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scroll);
		jl1 = new JLabel("Escolha uma das opções:                                                               ");
		jl1.setFont(new Font("Times new Roman",Font.BOLD, 15));
		jp.add(jl1);
		jb1 = new JButton("Qt01");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opa.qt01();
			}
		});
		jb1.setFont(new Font("Times new Roman",Font.BOLD, 13));
		jp.add(jb1);
		jb2 = new JButton("Qt02");
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opa.qt02();
			}
		});
		jb2.setFont(new Font("Times new Roman",Font.BOLD, 13));
		jp.add(jb2);
		jb3 = new JButton("Qt03");
		jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opa.qt03();
			}
		});
		jb3.setFont(new Font("Times new Roman",Font.BOLD, 13));
		jp.add(jb3);
		jb4 = new JButton("Qt04");
		jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opa.qt04();
			}
		});
		jb4.setFont(new Font("Times new Roman",Font.BOLD, 13));
		jp.add(jb4);
		jb5 = new JButton("Qt05");
		jb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opa.qt05();
			}
		});
		jb5.setFont(new Font("Times new Roman",Font.BOLD, 13));
		jp.add(jb5);
		jb6 = new JButton("Qt06");
		jb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opa.qt06();
			}
		});
		jb6.setFont(new Font("Times new Roman",Font.BOLD, 13));
		jp.add(jb6);
		
		jl7 = new JLabel("Questão 07:                                               ");
		jl7.setFont(new Font("Consolas",Font.BOLD,15));
		jp.add(jl7);
		
		jlesp1 = new JLabel("                       ");
		jp.add(jlesp1);
		
		jldfm = new JLabel(" Valor a ser financiado:    ");
		jp.add(jldfm);
		
		dfm = new JTextField(8);
		jp.add(dfm);
		 
		
		jlesp2 = new JLabel("     ");
		jp.add(jlesp2);
		
		jlM = new JLabel("Taxa de juros ao mês:    ");
		jp.add(jlM);
		
		jtfres = new JTextField(8);
		jp.add(jtfres);
		
		jta1 = new JTextArea(13,50);
		jp.add(jta1);
		jb7 = new JButton("Calcular");
		jb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String res = "";
					double[] valPar = new double[10];
					double valFin = Double.parseDouble(dfm.getText());
					double juros = Double.parseDouble(jtfres.getText())/100;
					int[] mes = new int [10]; 
					for (int i = 0; i < 10; i++) {
						valPar[i] = valFin*juros/1-Math.pow(1/1+juros, i);
						mes[i] = i;
						res+=(i+1)+"ª parcela que é igual a "+valPar[i]+"R$ deve ser pago em "+(i+1)+" meses\n";
					}
					jta1.setText(res);
				}catch(Exception ae){
					JOptionPane.showMessageDialog(null,"ERROR- Preencha os campos!!!","Error!!!",JOptionPane.ERROR_MESSAGE);
				} 
			}
		});
		jb7.setFont(new Font("Times new Roman",Font.BOLD, 13));
		jp.add(jb7);
		jldev = new JLabel("by @joelee229               ");
		jldev.setFont(new Font("Times new Roman",Font.ITALIC, 15));
		jp.add(jldev);
	}

}
