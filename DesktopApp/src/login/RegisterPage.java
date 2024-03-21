package login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RegisterPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField name;
	private JTextField user;
	private JTextField textField_3;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 534);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(1, 89, 254));
		panel.setBounds(10, 10, 770, 477);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(128, 207, 255));
		panel_1.setBounds(220, 0, 550, 477);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel text = new JLabel("UserName:");
		text.setBounds(25, 101, 85, 19);
		panel_1.add(text);
		
		JLabel textpass = new JLabel("Password:");
		textpass.setBounds(25, 137, 85, 13);
		panel_1.add(textpass);
		
		JLabel lblNewLabel_2 = new JLabel("Already have an account?");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(51, 294, 205, 13);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(329, 290, 85, 21);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setBounds(25, 71, 45, 13);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(25, 171, 45, 13);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBounds(342, 197, 85, 21);
		panel_1.add(btnNewButton_1);
		
		name = new JTextField();
		name.setBounds(154, 68, 273, 19);
		panel_1.add(name);
		name.setColumns(10);
		
		user = new JTextField();
		user.setColumns(10);
		user.setBounds(154, 101, 273, 19);
		panel_1.add(user);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(154, 168, 273, 19);
		panel_1.add(textField_3);
		
		pass = new JPasswordField();
		pass.setBounds(154, 134, 273, 19);
		panel_1.add(pass);
	}
	}

