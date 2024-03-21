package basics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JSeparator;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.UIManager;

public class Settings extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings frame = new Settings();
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
	public Settings() {
		setTitle("SETTINGS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 917, 610);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(36, 341, 98, 24);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(36, 375, 177, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//button change username
		JButton changeUsername = new JButton("Change username");
		changeUsername.setForeground(new Color(102, 0, 102));
		changeUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		changeUsername.setBounds(246, 375, 159, 19);
		changeUsername.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		changeUsername.setBackground(new Color(248, 248, 255));
		contentPane.add(changeUsername);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(36, 270, 81, 13);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(36, 293, 177, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lbPassword = new JLabel("Password:");
		lbPassword.setForeground(new Color(255, 255, 255));
		lbPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbPassword.setBounds(36, 428, 98, 13);
		contentPane.add(lbPassword);
		
		//button change password
		JButton changePassword = new JButton("Change password");
		changePassword.setForeground(new Color(102, 0, 102));
		changePassword.setBackground(new Color(248, 248, 255));
		changePassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		changePassword.setBounds(36, 451, 181, 21);
		contentPane.add(changePassword);
		
		//button cancel
		JButton cancel = new JButton("Cancel");
		cancel.setForeground(new Color(102, 0, 102));
		cancel.setBackground(new Color(248, 248, 255));
		cancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		cancel.setBounds(592, 525, 98, 21);
		contentPane.add(cancel);
		
		//button save changes
		JButton save = new JButton("Save changes");
		save.setForeground(new Color(102, 0, 102));
		save.setBackground(new Color(248, 248, 255));
		save.setFont(new Font("Tahoma", Font.BOLD, 13));
		save.setBounds(713, 525, 159, 21);
		contentPane.add(save);
		
		JLabel lblDefaultSlika = new JLabel("default slika");
		//tu nesto ne dela
		/* Image defaultSlika = new ImageIcon(this.getClass().getResource("default.png")).getImage();
		lblDefaultSlika.setIcon(new ImageIcon(defaultSlika)); */
		lblDefaultSlika.setBounds(36, 49, 81, 102);
		contentPane.add(lblDefaultSlika);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblUsername, textField, changeUsername, lblEmail, textField_1, lbPassword, changePassword, btnOdustani, save, lblDefaultSlika}));
	}
}
