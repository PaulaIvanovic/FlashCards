package basics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SubgroupsOfCards extends JFrame  implements Template {

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
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setFont(new Font("Niagara Engraved", Font.PLAIN, 12));
		setForeground(SystemColor.activeCaption);
		setTitle("SUBGROUPS OF CARDS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		contentPane.setBackground(backgroundColor);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		
		// Buttons panel
		 JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		 buttonsPanel.setBackground(toolbarColor);
	     buttonsPanel.setPreferredSize(new Dimension(getWidth(),50));
	        
		//button edit
		JButton edit = new JButton("Edit");
		buttonsPanel.add(edit);
		edit.setBackground(Color.PINK);
		
		//button add new subgroup
		JButton newSub = new JButton("Add subgroup");
		buttonsPanel.add(newSub);
		newSub.setBackground(new Color(216, 191, 216));
		
		//button settings
		JButton settings = new JButton("Settings");
		buttonsPanel.add(settings);
		settings.setBackground(new Color(255, 182, 193));
		
		//button user
		JButton user = new JButton("User");
		buttonsPanel.add(user);
		user.setBackground(new Color(230, 230, 250));
		
		//button go back
		JButton btnGoBack = new JButton("Go back");
		btnGoBack.setBackground(new Color(204, 102, 153));
		buttonsPanel.add(btnGoBack);
		settings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		newSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		contentPane.add(buttonsPanel, BorderLayout.NORTH);
		
	}

}
