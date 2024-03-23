package login;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.geom.RoundRectangle2D;
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

public class RegisterPage extends JFrame implements Template{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField user;
	private JTextField emailField;
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
		panel_1.setBounds(203, 29, 496, 464);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(69, 62, 130));
		panel_1.setLayout(null);
		
		//username:
		JLabel usernameText = new JLabel("Username:");
		usernameText.setFont(new Font("Tahoma", Font.BOLD, 12));
		usernameText.setForeground(Color.WHITE);
		usernameText.setBounds(82, 161, 160, 25);
		panel_1.add(usernameText);
		
		
		//password:
		JLabel textpass = new JLabel("Password:");
		textpass.setFont(new Font("Tahoma", Font.BOLD, 12));
		textpass.setForeground(Color.WHITE);
		textpass.setBounds(82, 276, 85, 13);
		panel_1.add(textpass);
		
		//message Already have an account?
		JLabel lblNewLabel_2 = new JLabel("Already have an account?");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(47, 396, 205, 13);
		panel_1.add(lblNewLabel_2);
		
		//login button function
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage login = new LoginPage();
				login.setVisible(true);
				dispose();
			}
		});
		loginBtn.setForeground(Color.BLACK);
		loginBtn.setFont(secFont);
		loginBtn.setBounds(270, 392, 85, 21);
		panel_1.add(loginBtn);
		
		//email:
		JLabel emailText = new JLabel("Email:");
		emailText.setFont(new Font("Tahoma", Font.BOLD, 12));
		emailText.setForeground(Color.WHITE);
		emailText.setForeground(new Color(255, 255, 255));
		emailText.setBounds(82, 224, 45, 13);
		panel_1.add(emailText);
		
		user = new JTextField();
		user.setColumns(10);
		user.setBounds(82, 195, 273, 19);
		panel_1.add(user);
		
		JLabel userPlaceholder = new JLabel("Enter your username");
		userPlaceholder.setForeground(Color.GRAY);
		userPlaceholder.setBounds(82, 195, 273, 19);
		panel_1.add(userPlaceholder); // Dodajemo labelu u panel

		// Postavljanje teksta "Enter your username" u polje za unos korisničkog imena
		user.setText("Enter your username");

		user.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		        if (user.getText().equals("Enter your username")) {
		            user.setText(""); // Briše tekst samo ako je "Enter your username" prisutno
		        }
		        userPlaceholder.setVisible(false); // Sakriva labelu kada je polje za unos korisničkog imena fokusirano
		    }

		    public void focusLost(FocusEvent e) {
		        if (user.getText().isEmpty()) {
		            user.setText("Enter your username"); // Postavljanje teksta samo ako nema unosa
		            userPlaceholder.setVisible(true); // Ponovno prikazuje labelu ako nema unosa u polju za korisničko ime
		        }
		    }
		});
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(82, 247, 273, 19);
		panel_1.add(emailField);
		
		JLabel emailPlaceholder = new JLabel("Enter your email");
		emailPlaceholder.setForeground(Color.GRAY);
		emailPlaceholder.setBounds(82, 247, 273, 19);
		panel_1.add(emailPlaceholder); 

		//text "Enter your email" in textfield
		emailField.setText("Enter your email");

		emailField.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		        if (emailField.getText().equals("Enter your email")) {
		            emailField.setText("");
		        }
		        emailPlaceholder.setVisible(false); 
		    }

		    public void focusLost(FocusEvent e) {
		        if (emailField.getText().isEmpty()) {
		            emailField.setText("Enter your email");
		            emailPlaceholder.setVisible(true); 
		        }
		    }
		});
		
		pass = new JPasswordField();
		pass.setBounds(82, 299, 273, 19);
		panel_1.add(pass);

		JLabel passPlaceholder = new JLabel("Enter your password");
		passPlaceholder.setForeground(Color.GRAY);
		passPlaceholder.setBounds(82, 299, 273, 19);
		panel_1.add(passPlaceholder); 
		
		// text "Enter your password" in textfield
		pass.setEchoChar((char) 0); 
		pass.setText("Enter your password");

		pass.addFocusListener(new FocusListener() {
		    public void focusGained(FocusEvent e) {
		        pass.setEchoChar('\u2022'); 
		        if (new String(pass.getPassword()).equals("Enter your password")) {
		            pass.setText(""); 
		        }
		        passPlaceholder.setVisible(false); 
		    }

		    public void focusLost(FocusEvent e) {
		        if (pass.getPassword().length == 0) {
		            pass.setEchoChar((char) 0);
		            pass.setText("Enter your password"); 
		            passPlaceholder.setVisible(true);
		        }
		    }
		});

		pass.getDocument().addDocumentListener(new DocumentListener() {
		    public void changedUpdate(DocumentEvent e) {
		        updatePasswordVisibility();
		    }

		    public void removeUpdate(DocumentEvent e) {
		        updatePasswordVisibility();
		    }

		    public void insertUpdate(DocumentEvent e) {
		        updatePasswordVisibility();
		    }

		    private void updatePasswordVisibility() {
		        if (new String(pass.getPassword()).isEmpty()) {
		            passPlaceholder.setVisible(true);
		        } else {
		            passPlaceholder.setVisible(false);
		        }
		    }
		});

		
		
		JLabel lblNewLabel = new JLabel("FLASH CARDS");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 54));
		lblNewLabel.setBounds(112, 30, 374, 81);
		panel_1.add(lblNewLabel);
		
		//added logo photo
		JLabel photoLabel = new JLabel("");
		Image IMG = new ImageIcon(this.getClass().getResource("/logo.png")).getImage().getScaledInstance(90, 90,Image.SCALE_DEFAULT);
		photoLabel.setIcon(new ImageIcon(IMG));
		photoLabel.setBounds(10, 30, 78, 81);
		panel_1.add(photoLabel);
		
		//message this fields can not be empty
		JLabel lblNewLabel_3 = new JLabel("* this fields can not be empty");
		lblNewLabel_3.setBounds(82, 330, 192, 25);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(textRed);
		
		//register button function
		JButton registerBtn = new JButton("Register");
		registerBtn.setBounds(270, 361, 85, 21);
		panel_1.add(registerBtn);
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		registerBtn.setForeground(Color.BLACK);
		registerBtn.setFont(new Font("Dialog", Font.PLAIN, 12));
	}
	}

