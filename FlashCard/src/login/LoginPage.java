package login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class LoginPage extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField user;
    private JPasswordField pass;
    private JLabel passPlaceholder; 

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginPage frame = new LoginPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LoginPage() {
        setTitle("REGISTER PAGE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 530);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(69, 62, 130));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(188, 29, 496, 464);
        contentPane.add(panel_1);
        panel_1.setBackground(new Color(69, 62, 130));
        panel_1.setLayout(null);
        
        JLabel usernameText = new JLabel("Username:");
        usernameText.setFont(new Font("Tahoma", Font.BOLD, 12));
        usernameText.setForeground(Color.WHITE);
        usernameText.setBounds(82, 161, 160, 25);
        panel_1.add(usernameText);
        
        JLabel textpass = new JLabel("Password:");
        textpass.setFont(new Font("Tahoma", Font.BOLD, 12));
        textpass.setForeground(Color.WHITE);
        textpass.setBounds(82, 224, 85, 13);
        panel_1.add(textpass);
        
        JLabel lblNewLabel_2 = new JLabel("Already have an account?");
        lblNewLabel_2.setForeground(new Color(255, 0, 0));
        lblNewLabel_2.setBounds(47, 396, 205, 13);
        panel_1.add(lblNewLabel_2);
        
        JButton loginBtn = new JButton("Login");
        loginBtn.setForeground(Color.BLACK);
        loginBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
        loginBtn.setBounds(283, 330, 85, 21);
        panel_1.add(loginBtn);
        
        JButton registerBtn = new JButton("Register");
        registerBtn.setForeground(Color.BLACK);
        registerBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
        registerBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                RegisterPage register = new RegisterPage();
                register.setVisible(true);
                dispose();
            }
        });
        registerBtn.setBounds(283, 388, 85, 21);
        panel_1.add(registerBtn);
        
        user = new JTextField("Enter your name");
        user.setColumns(10);
        user.setBounds(82, 195, 273, 19);
        user.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                if (user.getText().equals("Enter your name")) {
                    user.setText(""); // Briše tekst samo ako je "Upiši svoje ime" prisutno
                }
            }

            public void focusLost(FocusEvent e) {
                if (user.getText().isEmpty()) {
                    user.setText("Enter your name"); // Postavlja tekst samo ako nema unosa
                }
            }
        });
        panel_1.add(user);
        
        pass = new JPasswordField();
        pass.setBounds(82, 252, 273, 19);
        pass.setEchoChar('\u2022');
        panel_1.add(pass);

        // Dodano: labela za prikaz teksta prije unosa lozinke
        passPlaceholder = new JLabel("Enter your password");
        passPlaceholder.setForeground(Color.GRAY);
        passPlaceholder.setBounds(82, 252, 273, 19);
        panel_1.add(passPlaceholder); // Dodajemo labelu u panel

        // Postavljanje teksta "Enter your password" u polju za unos lozinke
        pass.setEchoChar((char) 0); // Omogućuje prikazivanje teksta umjesto zvjezdica
        pass.setText("Enter your password");

        pass.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                pass.setEchoChar('\u2022'); // Postavljanje natrag zvjezdica prilikom fokusa
                if (new String(pass.getPassword()).equals("Enter your password")) {
                    pass.setText(""); // Briše tekst samo ako je "Enter your password" prisutno
                }
                passPlaceholder.setVisible(false); // Sakriva labelu kada je polje za unos lozinke fokusirano
            }

            public void focusLost(FocusEvent e) {
                if (pass.getPassword().length == 0) {
                    pass.setEchoChar((char) 0); // Omogućuje prikazivanje teksta umjesto zvjezdica
                    pass.setText("Enter your password"); // Postavljanje teksta samo ako nema unosa
                    passPlaceholder.setVisible(true); // Ponovno prikazuje labelu ako nema unosa u polju za lozinku
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
        
        JLabel photoLabel = new JLabel("");
        photoLabel.setBounds(10, 30, 78, 81);
        panel_1.add(photoLabel);
        
        //rounded corners on button
        loginBtn.setBorder(new RoundedBorder(20));
        registerBtn.setBorder(new RoundedBorder(20));
    }
    
    //class for rounded buttons
    class RoundedBorder implements Border {
        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
        }
    }
}
