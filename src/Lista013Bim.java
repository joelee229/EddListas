import javax.swing.JScrollPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Lista013Bim extends JFrame {
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	JLabel jl1,jl7,jlt;
	JScrollPane scroll;
	JPanel jp;
	public Lista013Bim() {
		super("Lista 1 do 3º Bimestre");
		ResList01_3Bim opa = new ResList01_3Bim();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp.setPreferredSize(new Dimension(200,260));
		add(jp);
		scroll = new JScrollPane(jp);
		scroll.setVerticalScrollBarPolicy ( JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED );
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scroll);
		jl1 = new JLabel("Escolha uma das opções: ");
		jl1.setFont(new Font("Times new Roman",Font.BOLD, 14));
		jp.add(jl1);
		jb1 = new JButton("Qt01");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opa.qt01();
			}
		});
		jp.add(jb1);
		jb2 = new JButton("Qt02");
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opa.qt02();
			}
		});
		jp.add(jb2);
		jb3 = new JButton("Qt03");
		jb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opa.qt03();
			}
		});
		jp.add(jb3);
		jb4 = new JButton("Qt04");
		jb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opa.qt04();
			}
		});
		jp.add(jb4);
		jb5 = new JButton("Qt05");
		jb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opa.qt05();
			}
		});
		jp.add(jb5);
		jb6 = new JButton("Qt06");
		jb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				opa.qt06();
			}
		});
		jp.add(jb6);
		jl7 = new JLabel("Questão 07");
		jl7.setFont(new Font("Consolas",Font.BOLD,15));
		jp.add(jl7);
		
	}
	public static void main(String[] args) {
		Lista013Bim jan = new Lista013Bim();
		jan.setSize(300,190);
		jan.setVisible(true);
	}

}
