package basics;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class NovaGrupa extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEnterNameOf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovaGrupa frame = new NovaGrupa();
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
	public NovaGrupa() {
		setTitle("NOVA GRUPA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImeGrupe = new JLabel("Group name:");
		lblImeGrupe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblImeGrupe.setForeground(Color.WHITE);
		lblImeGrupe.setBounds(36, 60, 108, 25);
		contentPane.add(lblImeGrupe);
		
		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(25, 66, 19, 13);
		contentPane.add(lblNewLabel_1);
		
		txtEnterNameOf = new JTextField();
		txtEnterNameOf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterNameOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterNameOf.setForeground(Color.DARK_GRAY);
		txtEnterNameOf.setText("ENTER GROUP NAME");
		txtEnterNameOf.setBounds(36, 106, 262, 25);
		contentPane.add(txtEnterNameOf);
		txtEnterNameOf.setColumns(10);
		
		JLabel lblBojaGrupe = new JLabel("Choose group color:");
		lblBojaGrupe.setForeground(Color.WHITE);
		lblBojaGrupe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBojaGrupe.setBounds(36, 176, 218, 57);
		contentPane.add(lblBojaGrupe);
		
		JLabel lblNewLabel_3 = new JLabel("* this fields can not be empty");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(Color.PINK);
		lblNewLabel_3.setBounds(50, 438, 202, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnOdustani = new JButton("Cancel");
		btnOdustani.setForeground(new Color(102, 0, 102));
		btnOdustani.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOdustani.setBounds(505, 419, 111, 32);
		contentPane.add(btnOdustani);
		
		JButton btnSpremi = new JButton("Finish");
		btnSpremi.setForeground(new Color(102, 0, 102));
		btnSpremi.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSpremi.setBounds(642, 419, 111, 32);
		contentPane.add(btnSpremi);
	}
}
