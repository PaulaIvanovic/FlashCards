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

public class NewGroup extends JFrame {

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
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel GroupName = new JLabel("Group name:");
		GroupName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupName.setForeground(Color.WHITE);
		GroupName.setBounds(36, 60, 108, 25);
		contentPane.add(GroupName);
		
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
		
		JLabel color = new JLabel("Choose group color:");
		color.setForeground(Color.WHITE);
		color.setFont(new Font("Tahoma", Font.PLAIN, 18));
		color.setBounds(36, 176, 218, 57);
		contentPane.add(color);
		
		JLabel lblNewLabel_3 = new JLabel("* this fields can not be empty");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(Color.PINK);
		lblNewLabel_3.setBounds(50, 438, 202, 13);
		contentPane.add(lblNewLabel_3);
		
		// button cancel
		JButton cancel = new JButton("Cancel");
		cancel.setForeground(new Color(102, 0, 102));
		cancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		cancel.setBounds(505, 419, 111, 32);
		contentPane.add(cancel);
		
		// button save
		JButton save = new JButton("Finish");
		save.setForeground(new Color(102, 0, 102));
		save.setFont(new Font("Tahoma", Font.BOLD, 13));
		save.setBounds(642, 419, 111, 32);
		contentPane.add(save);
	}
}
