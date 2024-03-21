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

public class NovaPodgrupa extends JFrame {

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
					NovaPodgrupa frame = new NovaPodgrupa();
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
	public NovaPodgrupa() {
		setTitle("NOVA PODGRUPA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblImePodgrupe = new JLabel("Subgroup name:");
		lblImePodgrupe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblImePodgrupe.setForeground(Color.WHITE);
		lblImePodgrupe.setBounds(36, 60, 160, 25);
		contentPane.add(lblImePodgrupe);
		
		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(25, 66, 19, 13);
		contentPane.add(lblNewLabel_1);
		
		txtEnterNameOf = new JTextField();
		txtEnterNameOf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtEnterNameOf.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterNameOf.setForeground(Color.DARK_GRAY);
		txtEnterNameOf.setText("ENTER SUBGROUP NAME");
		txtEnterNameOf.setBounds(36, 106, 262, 25);
		contentPane.add(txtEnterNameOf);
		txtEnterNameOf.setColumns(10);
		
		JLabel lblOdaberiBoju = new JLabel("Choose subgroup color:");
		lblOdaberiBoju.setForeground(Color.WHITE);
		lblOdaberiBoju.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOdaberiBoju.setBounds(36, 162, 218, 57);
		contentPane.add(lblOdaberiBoju);
		
		JLabel lblNewLabel_3 = new JLabel("* this fields can not be empty");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setForeground(Color.PINK);
		lblNewLabel_3.setBounds(50, 438, 202, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnOdustani = new JButton("Cancel");
		btnOdustani.setForeground(new Color(102, 0, 102));
		btnOdustani.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOdustani.setBounds(505, 419, 111, 32);
		contentPane.add(btnOdustani);
		
		JButton btnSpremi = new JButton("Finish");
		btnSpremi.setForeground(new Color(102, 0, 102));
		btnSpremi.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSpremi.setBounds(642, 419, 111, 32);
		contentPane.add(btnSpremi);
		
		JLabel lblPodrugpaIzDatoteke = new JLabel("Automatic creation of subgroups from file:");
		lblPodrugpaIzDatoteke.setForeground(Color.WHITE);
		lblPodrugpaIzDatoteke.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPodrugpaIzDatoteke.setBounds(36, 275, 403, 39);
		contentPane.add(lblPodrugpaIzDatoteke);
		
		txtEnterFileName = new JTextField();
		txtEnterFileName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEnterFileName.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterFileName.setForeground(Color.DARK_GRAY);
		txtEnterFileName.setText("ENTER FILE NAME");
		txtEnterFileName.setBounds(36, 324, 492, 25);
		contentPane.add(txtEnterFileName);
		txtEnterFileName.setColumns(10);
		
		JButton btnUcitaj = new JButton("Load");
		btnUcitaj.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUcitaj.setForeground(new Color(102, 0, 102));
		btnUcitaj.setBounds(578, 322, 100, 30);
		contentPane.add(btnUcitaj);
	}

}
