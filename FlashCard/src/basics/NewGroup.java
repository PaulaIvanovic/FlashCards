package basics;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class NewGroup extends JFrame implements Template {

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
					NewGroup frame = new NewGroup();
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
	
	
	public NewGroup() {
		setTitle("NEW GROUP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 530);
		contentPane = new JPanel();
		contentPane.setBackground(backgroundColor);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel GroupName = new JLabel("Group name:");
		GroupName.setFont(mainFont);
		GroupName.setForeground(Color.WHITE);
		GroupName.setBounds(35, 60, 285, 25);
		contentPane.add(GroupName);
		
		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setForeground(textRed);
		lblNewLabel_1.setFont(mainFont);
		lblNewLabel_1.setBounds(25, 60, 19, 19);
		contentPane.add(lblNewLabel_1);
		
		txtEnterNameOf = new JTextField();
		txtEnterNameOf.setFont(secFont);
		txtEnterNameOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterNameOf.setForeground(textEnter);
		txtEnterNameOf.setText("Enter group name");
		txtEnterNameOf.setBounds(36, 106, 262, 32);
		contentPane.add(txtEnterNameOf);
		txtEnterNameOf.setColumns(10);
		
		JLabel color = new JLabel("Choose group color:");
		color.setForeground(Color.WHITE);
		color.setFont(mainFont);
		color.setBounds(36, 176, 218, 57);
		contentPane.add(color);
		
		JLabel lblNewLabel_3 = new JLabel("* this fields can not be empty");
		lblNewLabel_3.setFont(secFont);
		lblNewLabel_3.setForeground(textRed);
		lblNewLabel_3.setBounds(50, 419, 248, 32);
		contentPane.add(lblNewLabel_3);
		
		// button cancel
		JButton cancel = new JButton("Cancel");
		cancel.setForeground(Color.BLACK);
		cancel.setFont(secFont);
		cancel.setBounds(505, 419, 111, 32);
		contentPane.add(cancel);
		
		// button save
		JButton save = new JButton("Finish");
		save.setForeground(Color.BLACK);
		save.setFont(secFont);
		save.setBounds(642, 419, 111, 32);
		contentPane.add(save);
	}
}
