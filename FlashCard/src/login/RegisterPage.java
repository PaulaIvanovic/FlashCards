package login;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JTextField;

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
import javax.swing.JTextPane;

public class RegisterPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
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

	public RegisterPage() {
		
		setTitle("REGISTER PAGE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(69, 62, 130));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(188, 29, 496, 464);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(69, 62, 130));
		panel_1.setLayout(null);
		
		JLabel usernameText = new JLabel("Username:");
		usernameText.setFont(new Font("Tahoma", Font.BOLD, 12));
		usernameText.setForeground(Color.WHITE);
		usernameText.setBounds(82, 161, 160, 25);
		panel_1.add(usernameText);
		
		JLabel textpass = new JLabel("Password:");
		textpass.setFont(new Font("Tahoma", Font.BOLD, 12));
		textpass.setForeground(Color.WHITE);
		textpass.setBounds(82, 276, 85, 13);
		panel_1.add(textpass);
		
		JLabel lblNewLabel_2 = new JLabel("Already have an account?");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(47, 396, 205, 13);
		panel_1.add(lblNewLabel_2);
		
		//funkcionalnost login buttona
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage login = new LoginPage();
				login.setVisible(true);
				dispose();
			}
		});
		loginBtn.setBounds(284, 392, 85, 21);
		panel_1.add(loginBtn);
		
		JLabel emailText = new JLabel("Email:");
		emailText.setFont(new Font("Tahoma", Font.BOLD, 12));
		emailText.setForeground(Color.WHITE);
		emailText.setForeground(new Color(255, 255, 255));
		emailText.setBounds(82, 224, 45, 13);
		panel_1.add(emailText);
		
		JButton registerBtn = new JButton("Register");
		registerBtn.setBounds(284, 339, 85, 21);
		panel_1.add(registerBtn);
		
		user = new JTextField();
		user.setColumns(10);
		user.setBounds(82, 195, 273, 19);
		panel_1.add(user);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(82, 247, 273, 19);
		panel_1.add(textField_3);
		
		pass = new JPasswordField();
		pass.setBounds(82, 299, 273, 19);
		panel_1.add(pass);
		
		JLabel lblNewLabel = new JLabel("FLASH CARDS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 54));
		lblNewLabel.setBounds(112, 30, 374, 81);
		panel_1.add(lblNewLabel);
		
		JLabel photoLabel = new JLabel("");
		Image IMG = new ImageIcon(this.getClass().getResource("/logo.png")).getImage().getScaledInstance(90, 90,Image.SCALE_DEFAULT);
		photoLabel.setIcon(new ImageIcon(IMG));
		photoLabel.setBounds(10, 30, 78, 81);
		panel_1.add(photoLabel);
	}
	}

