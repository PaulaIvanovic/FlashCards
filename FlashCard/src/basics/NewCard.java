package basics;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class NewCard extends JFrame implements Template {

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
		contentPane.setBackground(backgroundColor);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel q = new JLabel("Question:");
		q.setFont(mainFont);
		q.setForeground(Color.WHITE);
		q.setBounds(36, 60, 108, 25);
		contentPane.add(q);
		
		JLabel x = new JLabel("*");
		x.setForeground(textRed);
		x.setFont(mainFont);
		x.setBounds(25, 192, 19, 25);
		contentPane.add(x);
		
		txtEnterNameOf = new JTextField();
		txtEnterNameOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterNameOf.setFont(secFont);
		txtEnterNameOf.setForeground(textEnter);
		txtEnterNameOf.setText("Enter question for this card");
		txtEnterNameOf.setBounds(36, 95, 717, 71);
		contentPane.add(txtEnterNameOf);
		txtEnterNameOf.setColumns(10);
		
		JLabel a = new JLabel("Answer:");
		a.setForeground(Color.WHITE);
		a.setFont(mainFont);
		a.setBounds(36, 176, 218, 57);
		contentPane.add(a);
		
		JLabel lblU = new JLabel("* this fields can not be empty");
		lblU.setFont(secFont);
		lblU.setForeground(textRed);
		lblU.setBounds(50, 427, 301, 24);
		contentPane.add(lblU);
		
		//button cancel
		JButton cancel = new JButton("Cancel");
		cancel.setForeground(Color.BLACK);
		cancel.setFont(secFont);
		cancel.setBounds(505, 419, 111, 32);
		contentPane.add(cancel);
		
		//button save
		JButton save = new JButton("Save");
		save.setForeground(Color.BLACK);
		save.setFont(secFont);
		save.setBounds(642, 419, 111, 32);
		contentPane.add(save);
		
		JLabel lbl2 = new JLabel("*");
		lbl2.setFont(mainFont);
		lbl2.setForeground(textRed);
		lbl2.setBounds(25, 60, 33, 19);
		contentPane.add(lbl2);
		
		txtEnterYourAnswer = new JTextField();
		txtEnterYourAnswer.setForeground(textEnter);
		txtEnterYourAnswer.setFont(secFont);
		txtEnterYourAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterYourAnswer.setText("Enter your answer");
		txtEnterYourAnswer.setBounds(36, 221, 717, 99);
		contentPane.add(txtEnterYourAnswer);
		txtEnterYourAnswer.setColumns(10);
		
		JLabel lblB = new JLabel("Color:");
		lblB.setFont(mainFont);
		lblB.setForeground(Color.WHITE);
		lblB.setBounds(36, 352, 80, 25);
		contentPane.add(lblB);
		
		//button change color
		JButton changeColor = new JButton("Choose color");
		changeColor.setFont(secFont);
		changeColor.setForeground(Color.BLACK);
		changeColor.setBounds(178, 352, 141, 25);
		contentPane.add(changeColor);
	}

}
