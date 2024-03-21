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

public class NewCard extends JFrame {

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
					NewCard frame = new NewCard();
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
	public NewCard() {
		setTitle("NEW CARD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel q = new JLabel("Question:");
		q.setFont(new Font("Tahoma", Font.PLAIN, 18));
		q.setForeground(Color.WHITE);
		q.setBounds(36, 60, 108, 25);
		contentPane.add(q);
		
		JLabel x = new JLabel("*");
		x.setForeground(Color.PINK);
		x.setFont(new Font("Tahoma", Font.PLAIN, 18));
		x.setBounds(25, 198, 19, 13);
		contentPane.add(x);
		
		txtEnterNameOf = new JTextField();
		txtEnterNameOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterNameOf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterNameOf.setForeground(Color.DARK_GRAY);
		txtEnterNameOf.setText("ENTER QUESTION FOR THIS CARD");
		txtEnterNameOf.setBounds(36, 95, 717, 71);
		contentPane.add(txtEnterNameOf);
		txtEnterNameOf.setColumns(10);
		
		JLabel a = new JLabel("Answer:");
		a.setForeground(Color.WHITE);
		a.setFont(new Font("Tahoma", Font.PLAIN, 18));
		a.setBounds(36, 176, 218, 57);
		contentPane.add(a);
		
		JLabel lblU = new JLabel("* this fields can not be empty");
		lblU.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblU.setForeground(Color.PINK);
		lblU.setBounds(50, 438, 202, 13);
		contentPane.add(lblU);
		
		//button cancel
		JButton cancel = new JButton("Cancel");
		cancel.setForeground(new Color(102, 0, 102));
		cancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		cancel.setBounds(505, 419, 111, 32);
		contentPane.add(cancel);
		
		//button save
		JButton save = new JButton("Save");
		save.setForeground(new Color(102, 0, 102));
		save.setFont(new Font("Tahoma", Font.BOLD, 13));
		save.setBounds(642, 419, 111, 32);
		contentPane.add(save);
		
		JLabel lbl2 = new JLabel("*");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl2.setForeground(Color.PINK);
		lbl2.setBounds(25, 66, 19, 13);
		contentPane.add(lbl2);
		
		txtEnterYourAnswer = new JTextField();
		txtEnterYourAnswer.setForeground(Color.DARK_GRAY);
		txtEnterYourAnswer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterYourAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterYourAnswer.setText("ENTER YOUR ANSWER");
		txtEnterYourAnswer.setBounds(36, 221, 717, 99);
		contentPane.add(txtEnterYourAnswer);
		txtEnterYourAnswer.setColumns(10);
		
		JLabel lblB = new JLabel("Color:");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblB.setForeground(Color.WHITE);
		lblB.setBounds(36, 352, 80, 25);
		contentPane.add(lblB);
		
		//button change color
		JButton changeColor = new JButton("Choose color");
		changeColor.setFont(new Font("Tahoma", Font.BOLD, 10));
		changeColor.setForeground(new Color(102, 0, 102));
		changeColor.setBounds(178, 352, 108, 25);
		contentPane.add(changeColor);
	}

}
