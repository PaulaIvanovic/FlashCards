package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
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
		
		user = new JTextField();
		user.setBounds(175, 138, 239, 19);
		panel_1.add(user);
		user.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String un = user.getText();
				String pas = pass.getText();
				
				if(un.equals("admin") && pass.equals("123")) {
					JOptionPane.showMessageDialog(null, "Login successful");
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Username or Password");
				}
			}
		});
		btnLogin.setBounds(329, 236, 85, 21);
		panel_1.add(btnLogin);
		
		pass = new JPasswordField();
		pass.setBounds(175, 180, 239, 19);
		panel_1.add(pass);
		
		JLabel lblNewLabel = new JLabel("UserName:");
		lblNewLabel.setBounds(25, 138, 85, 19);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setBounds(25, 183, 85, 13);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Do not have an account?");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(51, 294, 205, 13);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBounds(329, 290, 85, 21);
		panel_1.add(btnNewButton);
	}
}
