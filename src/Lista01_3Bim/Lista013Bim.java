package Lista01_3Bim;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Lista013Bim extends JFrame {
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;
	JLabel jl1,jl7,jlt, jldfm,jltr,jlqtdm,jlesp1, jlM,jlesp2,jldev;
	JScrollPane scroll;
	JPanel jp;
	JTextField dfm,tr,qtdm,jtfres;
	JTextArea jta1;
	public Lista013Bim() {
		super("Lista 1 do 3º Bimestre");
		ResList01_3Bim opa = new ResList01_3Bim();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp.setPreferredSize(new Dimension(200,350));
		add(jp);
		scroll = new JScrollPane(jp);
		scroll.setVerticalScrollBarPolicy ( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED );
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scroll);
		jl1 = new JLabel("Escolha uma das opções: ");
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
		jl7 = new JLabel("Questão 07:         ");
		jl7.setFont(new Font("Consolas",Font.BOLD,15));
		jp.add(jl7);
		jlesp1 = new JLabel("                       ");
		jp.add(jlesp1);
		jldfm = new JLabel("Depósito fixo mensal:      ");
		jp.add(jldfm);
		dfm = new JTextField(8);
		jp.add(dfm);
		jltr = new JLabel("Taxa de rendimento:         ");
		jp.add(jltr);
		tr = new JTextField(8);
		jp.add(tr);
		jlqtdm = new JLabel("Quantidade de meses:      ");
		jp.add(jlqtdm);
		qtdm = new JTextField(8);
		jp.add(qtdm); 
		jlesp2 = new JLabel("             ");
		jp.add(jlesp2);
		jlM = new JLabel("Montante final =  R$");
		jp.add(jlM);
		jtfres = new JTextField(8);
		jp.add(jtfres);
		jb7 = new JButton("Calcular");
		jb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double dep = Integer.parseInt(dfm.getText());
					double juros = Integer.parseInt(tr.getText());
					double quanti = Integer.parseInt(qtdm.getText());
					juros = juros/100;
					double mont = (1+juros)*(Math.pow(1+juros, quanti)-1/juros)*dep;
					jtfres.setText(mont+"");
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
	public static void main(String[] args) {
		Lista013Bim jan = new Lista013Bim();
		jan.setSize(300,190);
		jan.setLocationRelativeTo(null);
		jan.setVisible(true);
	}

}
