package basics;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SubgroupsOfCards extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubgroupsOfCards frame = new SubgroupsOfCards();
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
	public SubgroupsOfCards() {
		setFont(new Font("Niagara Engraved", Font.PLAIN, 12));
		setForeground(SystemColor.activeCaption);
		setTitle("PODGRUPA KARTICA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1004, 604);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(12, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//button edit
		JButton edit = new JButton("Edit");
		edit.setBounds(585, 10, 69, 34);
		contentPane.add(edit);
		edit.setBackground(Color.PINK);
		
		//button add new subgroup
		JButton newSub = new JButton("Add subgroup");
		newSub.setBounds(664, 10, 117, 34);
		contentPane.add(newSub);
		newSub.setBackground(new Color(216, 191, 216));
		
		//button settings
		JButton settings = new JButton("Settings");
		settings.setBounds(888, 10, 92, 34);
		contentPane.add(settings);
		settings.setBackground(new Color(255, 182, 193));
		
		//button user
		JButton user = new JButton("User");
		user.setBounds(791, 10, 87, 34);
		contentPane.add(user);
		user.setBackground(new Color(230, 230, 250));
		
		//button go back
		JButton btnGoBack = new JButton("Go back");
		btnGoBack.setBackground(new Color(204, 102, 153));
		btnGoBack.setBounds(483, 10, 92, 34);
		contentPane.add(btnGoBack);
		settings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		newSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

}
