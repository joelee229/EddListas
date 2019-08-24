import javax.swing.*;
import java.awt.*;
public class Lista013Bim extends JFrame {
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	JLabel jl1;
	JScrollPane scroll;
	JPanel jp;
	public Lista013Bim() {
		super("Lista 1 do 3º Bimestre");
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp.setPreferredSize(new Dimension(350,230));
		 scroll = new JScrollPane(jp, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		add(scroll);
		jl1 = new JLabel("Escolha uma das opções: ");
		jl1.setFont(new Font("Times new Roman",Font.BOLD, 14));
		jp.add(jl1);
		jb1 = new JButton("Qt01");
		//jb1.setBackground(Color.black );
		jp.add(jb1);
		jb2 = new JButton("Qt01");
		//jb1.setBackground(Color.black );
		jp.add(jb2);
		jb3 = new JButton("Qt01");
		//jb1.setBackground(Color.black );
		jp.add(jb3);
		jb4 = new JButton("Qt01");
		//jb1.setBackground(Color.black );
		jp.add(jb4);
		jb5 = new JButton("Qt01");
		//jb1.setBackground(Color.black );
		jp.add(jb5);
		jb6 = new JButton("Qt01");
		//jb1.setBackground(Color.black );
		jp.add(jb6);
		
	}

	public static void main(String[] args) {
		Lista013Bim jan = new Lista013Bim();
		//jan.setSize(350,230);
		jan.setVisible(true);
	}

}
