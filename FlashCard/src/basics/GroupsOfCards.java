package basics;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class GroupsOfCards extends JFrame implements Template {

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
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setFont(new Font("Niagara Engraved", Font.PLAIN, 12));
		setForeground(SystemColor.activeCaption);
		setTitle("GROUPS OF CARDS");
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
    
		// Button edit
		JButton edit = new JButton("Edit");
		edit.setBackground(Color.PINK);
		buttonsPanel.add(edit);
		
		// Button add group
		JButton addGroup = new JButton("Add group");
		buttonsPanel.add(addGroup);
		addGroup.setBackground(new Color(216, 191, 216));
		addGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==addGroup) {
					//NewGroup ng = new NewGroup();
				}
			}
		});
		
		// Button settings
		JButton settings = new JButton("Settings");
		buttonsPanel.add(settings);
		settings.setBackground(new Color(255, 182, 193));
		
		// Button user
		JButton user = new JButton("User");
		buttonsPanel.add(user);
		user.setBackground(new Color(230, 230, 250));
		user.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		contentPane.add(buttonsPanel, BorderLayout.NORTH);
		
		/*  
        // Left part of the panel for logo and name
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
        leftPanel.setBackground(toolbarColor);
        leftPanel.setPreferredSize(new Dimension(getWidth(),50));
        
		
        // Name
        JLabel label = new JLabel("GROUP OF CARDS");
        leftPanel.add(label);
        
        // Logo
        ImageIcon icon = new ImageIcon("logo.png"); 
        JLabel imageLabel = new JLabel(icon);
        leftPanel.add(imageLabel);
        
        
        buttonsPanel.add(leftPanel, BorderLayout.WEST);
        */
	}
}
