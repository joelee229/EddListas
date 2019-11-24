package Lista02_4Bim;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Lista01_4Bim.TelaQt03;

public class TelaQt04 extends JFrame{
	private JTextField horas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaQt03 frame = new TelaQt03();
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
	public TelaQt04() {
		setTitle("Pagamento");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 69, 19));
		panel.setBounds(0, 0, 434, 135);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel dHoras = new JLabel("Digite as horas trabalhadas:");
		dHoras.setForeground(new Color(255, 255, 255));
		dHoras.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		dHoras.setBounds(10, 24, 190, 14);
		panel.add(dHoras);
		
		horas = new JTextField();
		horas.setBounds(10, 44, 128, 27);
		panel.add(horas);
		horas.setColumns(10);
		
		JLabel dValor = new JLabel("Digite o valor da hora: ");
		dValor.setForeground(new Color(255, 255, 255));
		dValor.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		dValor.setBounds(10, 84, 170, 14);
		panel.add(dValor);
		
		JTextField valor = new JTextField();
		valor.setBounds(10, 104, 128, 27);
		panel.add(valor);
		valor.setColumns(10);
		
		JTextArea rotulo = new JTextArea();
		rotulo.setBackground(new Color(255, 218, 185));
		rotulo.setBounds(0, 136, 434, 125);
		getContentPane().add(rotulo);
		
		JButton btnOk = new JButton("Calcular");
		btnOk.setBackground(new Color(233, 150, 122));
		btnOk.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		btnOk.setBounds(259, 11, 165, 113);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				double horastra = Double.parseDouble(horas.getText());
				double horaValor= Double.parseDouble(valor.getText());
				if(horastra>40) {
					 double resultado1 =((horastra-40)*horaValor)*2;
					 double resultado2 = ((horastra-40)-horastra)*horaValor*-1;
					 rotulo.setText("O valor a pagar será R$"+resultado2+" com o acrescimo  da hora extra: R$"+resultado1+"\nAssim ficando com R$"+(resultado1+resultado2));
				}else {
					double resultado = horaValor*horastra;
					rotulo.setText("O valor a pagar será R$"+resultado);
				}
				
				
			}
		});
		panel.add(btnOk);

	}
}
