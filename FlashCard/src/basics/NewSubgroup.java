package basics;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class NewSubgroup extends JFrame implements Template{

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
		contentPane.setBackground(backgroundColor);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel name = new JLabel("Subgroup name:");
		name.setFont(mainFont);
		name.setForeground(Color.WHITE);
		name.setBounds(36, 60, 238, 32);
		contentPane.add(name);
		
		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setForeground(textRed);
		lblNewLabel_1.setFont(mainFont);
		lblNewLabel_1.setBounds(25, 60, 19, 19);
		contentPane.add(lblNewLabel_1);
		
		//enter subgroup name
		txtEnterNameOf = new JTextField();
		txtEnterNameOf.setFont(secFont);
		txtEnterNameOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterNameOf.setForeground(textEnter);
		txtEnterNameOf.setText("Enter subgroup name");
		txtEnterNameOf.setBounds(36, 106, 289, 32);
		contentPane.add(txtEnterNameOf);
		txtEnterNameOf.setColumns(10);
		
		JLabel color = new JLabel("Choose subgroup color:");
		color.setForeground(Color.WHITE);
		color.setFont(mainFont);
		color.setBounds(36, 162, 279, 57);
		contentPane.add(color);
		
		JLabel lblNewLabel_3 = new JLabel("* this fields can not be empty");
		lblNewLabel_3.setFont(secFont);
		lblNewLabel_3.setForeground(textRed);
		lblNewLabel_3.setBounds(50, 419, 248, 32);
		contentPane.add(lblNewLabel_3);
		
		//button cancel
		JButton cancel = new JButton("Cancel");
		cancel.setForeground(Color.BLACK);
		cancel.setFont(secFont);
		cancel.setBounds(505, 419, 111, 32);
		contentPane.add(cancel);
		
		//button finish
		JButton finish = new JButton("Finish");
		finish.setForeground(Color.BLACK);
		finish.setFont(secFont);
		finish.setBounds(642, 419, 111, 32);
		contentPane.add(finish);
		
		JLabel text = new JLabel("Automatic creation of subgroups from file:");
		text.setForeground(Color.WHITE);
		text.setFont(mainFont);
		text.setBounds(36, 275, 492, 39);
		contentPane.add(text);
		
		//enter file name
		txtEnterFileName = new JTextField();
		txtEnterFileName.setFont(secFont);
		txtEnterFileName.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterFileName.setForeground(textEnter);
		txtEnterFileName.setText("Enter file name");
		txtEnterFileName.setBounds(36, 324, 492, 25);
		contentPane.add(txtEnterFileName);
		txtEnterFileName.setColumns(10);
		
		//button load
		JButton load = new JButton("Load");
		load.setFont(secFont);
		load.setForeground(Color.BLACK);
		load.setBounds(578, 322, 100, 30);
		contentPane.add(load);
	}

}
