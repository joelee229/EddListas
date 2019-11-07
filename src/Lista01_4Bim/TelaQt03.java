package Lista01_4Bim;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class TelaQt03 extends JFrame {
	private JTextField textField;

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
	public TelaQt03() {
		setTitle("Raio");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 69, 19));
		panel.setBounds(0, 0, 434, 135);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblDigiteORaio = new JLabel("Digite o raio:");
		lblDigiteORaio.setForeground(new Color(255, 255, 255));
		lblDigiteORaio.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblDigiteORaio.setBounds(10, 24, 128, 14);
		panel.add(lblDigiteORaio);
		
		textField = new JTextField();
		textField.setBounds(10, 44, 128, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(255, 218, 185));
		textArea.setBounds(0, 136, 434, 125);
		getContentPane().add(textArea);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBackground(new Color(233, 150, 122));
		btnOk.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		btnOk.setBounds(259, 11, 165, 113);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				DecimalFormat df = new DecimalFormat(".##");
				double raio = Double.parseDouble(textField.getText());
				double area= Math.PI * Math.pow(raio, 2);
				double peri = 2* Math.PI * raio;
				textArea.setText("  A �rea desse c�rculo � "+df.format(area)+"m�\n  O per�metro desse c�rculo � "+df.format(peri)+"m");
			}
		});
		panel.add(btnOk);

	}
}
