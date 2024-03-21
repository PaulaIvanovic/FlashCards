package basics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
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

public class GroupsOfCards extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GroupsOfCards frame = new GroupsOfCards();
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
	public GroupsOfCards() {
		setFont(new Font("Niagara Engraved", Font.PLAIN, 12));
		setForeground(SystemColor.activeCaption);
		setTitle("GRUPA KARTICA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1004, 604);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(12, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//button edit
		JButton edit = new JButton("Edit");
		edit.setBounds(597, 10, 69, 34);
		contentPane.add(edit);
		edit.setBackground(Color.PINK);
		
		//button add group
		JButton addGroup = new JButton("Add group");
		addGroup.setBounds(676, 10, 105, 34);
		contentPane.add(addGroup);
		addGroup.setBackground(new Color(216, 191, 216));
		
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
		user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
