package Lista02_4Bim;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Lista01_4Bim.TelaQt03;

public class TelaQt05 extends JFrame{
	private JTextField x;

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
	public TelaQt05() {
		setTitle("Pagamento");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 69, 19));
		panel.setBounds(0, 0, 434, 135);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel dX = new JLabel("Digite o valor de X1:");
		dX.setForeground(new Color(255, 255, 255));
		dX.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		dX.setBounds(10, 24, 190, 14);
		panel.add(dX);
		
		x = new JTextField();
		x.setBounds(10, 44, 128, 27);
		panel.add(x);
		x.setColumns(10);
		
		JLabel dY = new JLabel("Digite o valor de Y1: ");
		dY.setForeground(new Color(255, 255, 255));
		dY.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		dY.setBounds(10, 84, 170, 14);
		panel.add(dY);
		
		JTextField y = new JTextField();
		y.setBounds(10, 104, 128, 27);
		panel.add(y);
		y.setColumns(10);
		
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
				double vx = Double.parseDouble(x.getText());
				double vy= Double.parseDouble(y.getText());
				double x2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de X2: "));
				double y2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de Y2: "));

				double distancia = Math.sqrt(Math.pow(x2-vx, 2) + Math.pow(y2-vy, 2));
				rotulo.setText("distancia entre esses pares de pontos é: "+distancia);
				
			}
		});
		panel.add(btnOk);

	}
}
