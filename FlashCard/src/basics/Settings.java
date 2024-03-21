package basics;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JTextField;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;


public class Settings extends JFrame implements Template{

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
		contentPane.setBackground(backgroundColor);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(new Color(255, 255, 255));
		lblUsername.setFont(mainFont);
		lblUsername.setBounds(36, 341, 197, 24);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setFont(secFont);
		textField.setBounds(36, 369, 228, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//button change username
		JButton changeUsername = new JButton("Change username");
		changeUsername.setForeground(Color.BLACK);
		changeUsername.setFont(secFont);
		changeUsername.setBounds(317, 369, 203, 33);
		changeUsername.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		changeUsername.setBackground(new Color(248, 248, 255));
		contentPane.add(changeUsername);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(mainFont);
		lblEmail.setBounds(36, 259, 98, 24);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(36, 293, 330, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lbPassword = new JLabel("Password:");
		lbPassword.setForeground(new Color(255, 255, 255));
		lbPassword.setFont(mainFont);
		lbPassword.setBounds(36, 412, 177, 24);
		contentPane.add(lbPassword);
		
		//button change password
		JButton changePassword = new JButton("Change password");
		changePassword.setForeground(Color.BLACK);
		changePassword.setBackground(new Color(248, 248, 255));
		changePassword.setFont(secFont);
		changePassword.setBounds(36, 446, 203, 33);
		contentPane.add(changePassword);
		
		//button cancel
		JButton cancel = new JButton("Cancel");
		cancel.setForeground(Color.BLACK);
		cancel.setBackground(new Color(248, 248, 255));
		cancel.setFont(secFont);
		cancel.setBounds(592, 513, 98, 33);
		contentPane.add(cancel);
		
		//button save changes
		JButton save = new JButton("Save changes");
		save.setForeground(Color.BLACK);
		save.setBackground(new Color(248, 248, 255));
		save.setFont(secFont);
		save.setBounds(713, 513, 159, 33);
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
