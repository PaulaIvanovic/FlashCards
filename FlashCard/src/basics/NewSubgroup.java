package basics;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class NewSubgroup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEnterNameOf;
	private JTextField txtEnterFileName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewSubgroup frame = new NewSubgroup();
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
	public NewSubgroup() {
		setTitle("NEW SUBGROUP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel name = new JLabel("Subgroup name:");
		name.setFont(new Font("Tahoma", Font.PLAIN, 18));
		name.setForeground(Color.WHITE);
		name.setBounds(36, 60, 160, 25);
		contentPane.add(name);
		
		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(25, 66, 19, 13);
		contentPane.add(lblNewLabel_1);
		
		//enter subgroup name
		txtEnterNameOf = new JTextField();
		txtEnterNameOf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterNameOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterNameOf.setForeground(Color.DARK_GRAY);
		txtEnterNameOf.setText("ENTER SUBGROUP NAME");
		txtEnterNameOf.setBounds(36, 106, 262, 25);
		contentPane.add(txtEnterNameOf);
		txtEnterNameOf.setColumns(10);
		
		JLabel color = new JLabel("Choose subgroup color:");
		color.setForeground(Color.WHITE);
		color.setFont(new Font("Tahoma", Font.PLAIN, 18));
		color.setBounds(36, 162, 218, 57);
		contentPane.add(color);
		
		JLabel lblNewLabel_3 = new JLabel("* this fields can not be empty");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(Color.PINK);
		lblNewLabel_3.setBounds(50, 438, 202, 13);
		contentPane.add(lblNewLabel_3);
		
		//button cancel
		JButton cancel = new JButton("Cancel");
		cancel.setForeground(new Color(102, 0, 102));
		cancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		cancel.setBounds(505, 419, 111, 32);
		contentPane.add(cancel);
		
		//button finish
		JButton finish = new JButton("Finish");
		finish.setForeground(new Color(102, 0, 102));
		finish.setFont(new Font("Tahoma", Font.BOLD, 13));
		finish.setBounds(642, 419, 111, 32);
		contentPane.add(finish);
		
		JLabel text = new JLabel("Automatic creation of subgroups from file:");
		text.setForeground(Color.WHITE);
		text.setFont(new Font("Tahoma", Font.PLAIN, 18));
		text.setBounds(36, 275, 403, 39);
		contentPane.add(text);
		
		//enter file name
		txtEnterFileName = new JTextField();
		txtEnterFileName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEnterFileName.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterFileName.setForeground(Color.DARK_GRAY);
		txtEnterFileName.setText("ENTER FILE NAME");
		txtEnterFileName.setBounds(36, 324, 492, 25);
		contentPane.add(txtEnterFileName);
		txtEnterFileName.setColumns(10);
		
		//button load
		JButton load = new JButton("Load");
		load.setFont(new Font("Tahoma", Font.BOLD, 12));
		load.setForeground(new Color(102, 0, 102));
		load.setBounds(578, 322, 100, 30);
		contentPane.add(load);
	}

}
