package basics;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class NovaKartica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEnterNameOf;
	private JTextField txtEnterYourAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NovaKartica frame = new NovaKartica();
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
	public NovaKartica() {
		setTitle("NOVA KARTICA - RUČNO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPitanje = new JLabel("Question:");
		lblPitanje.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPitanje.setForeground(Color.WHITE);
		lblPitanje.setBounds(36, 60, 108, 25);
		contentPane.add(lblPitanje);
		
		JLabel lblPahuljica = new JLabel("*");
		lblPahuljica.setForeground(Color.PINK);
		lblPahuljica.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPahuljica.setBounds(25, 198, 19, 13);
		contentPane.add(lblPahuljica);
		
		txtEnterNameOf = new JTextField();
		txtEnterNameOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterNameOf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterNameOf.setForeground(Color.DARK_GRAY);
		txtEnterNameOf.setText("ENTER QUESTION FOR THIS CARD");
		txtEnterNameOf.setBounds(36, 95, 717, 71);
		contentPane.add(txtEnterNameOf);
		txtEnterNameOf.setColumns(10);
		
		JLabel lblOdgovor = new JLabel("Answer:");
		lblOdgovor.setForeground(Color.WHITE);
		lblOdgovor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOdgovor.setBounds(36, 176, 218, 57);
		contentPane.add(lblOdgovor);
		
		JLabel lblUpute = new JLabel("* this fields can not be empty");
		lblUpute.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUpute.setForeground(Color.PINK);
		lblUpute.setBounds(50, 438, 202, 13);
		contentPane.add(lblUpute);
		
		JButton btnOdustani = new JButton("Cancel");
		btnOdustani.setForeground(new Color(102, 0, 102));
		btnOdustani.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOdustani.setBounds(505, 419, 111, 32);
		contentPane.add(btnOdustani);
		
		JButton btnSpremi = new JButton("Save");
		btnSpremi.setForeground(new Color(102, 0, 102));
		btnSpremi.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSpremi.setBounds(642, 419, 111, 32);
		contentPane.add(btnSpremi);
		
		JLabel lblPahuljica2 = new JLabel("*");
		lblPahuljica2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPahuljica2.setForeground(Color.PINK);
		lblPahuljica2.setBounds(25, 66, 19, 13);
		contentPane.add(lblPahuljica2);
		
		txtEnterYourAnswer = new JTextField();
		txtEnterYourAnswer.setForeground(Color.DARK_GRAY);
		txtEnterYourAnswer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterYourAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterYourAnswer.setText("ENTER YOUR ANSWER");
		txtEnterYourAnswer.setBounds(36, 221, 717, 99);
		contentPane.add(txtEnterYourAnswer);
		txtEnterYourAnswer.setColumns(10);
		
		JLabel lblBoja = new JLabel("Color:");
		lblBoja.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBoja.setForeground(Color.WHITE);
		lblBoja.setBounds(36, 352, 80, 25);
		contentPane.add(lblBoja);
		
		JButton btnOdaberiBoju = new JButton("Choose color");
		btnOdaberiBoju.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnOdaberiBoju.setForeground(new Color(102, 0, 102));
		btnOdaberiBoju.setBounds(178, 352, 108, 25);
		contentPane.add(btnOdaberiBoju);
	}

}
