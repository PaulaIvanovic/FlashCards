package login;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class LoginPage extends JFrame implements Template{

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

    class RoundButton extends JButton {
        public RoundButton(String label) {
            super(label);
            Dimension size = getPreferredSize();
            size.width = size.height = Math.max(size.width, size.height);
            setPreferredSize(size);
            setContentAreaFilled(false);
        }

        protected void paintComponent(Graphics g) {
            if (getModel().isArmed()) {
                g.setColor(Color.lightGray);
            } else {
                g.setColor(getBackground());
            }
            g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            super.paintComponent(g);
        }

        protected void paintBorder(Graphics g) {
            g.setColor(getForeground());
            g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        }

        Shape shape;

        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            }
            return shape.contains(x, y);
        }
    }

    class RoundTextField extends JTextField {
        private Shape shape;
        private Color borderColor = Color.BLACK;

        public RoundTextField(int size) {
            super(size);
            setOpaque(false); // da se boja pozadine ne crta ispod teksta
            setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // postavljanje praznog ruba kako bi tekst bio pomaknut od ruba
        }

        protected void paintComponent(Graphics g) {
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            super.paintComponent(g);
        }

        protected void paintBorder(Graphics g) {
            g.setColor(borderColor);
            g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        }

        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            }
            return shape.contains(x, y);
        }

        public void setBorderColor(Color color) {
            this.borderColor = color;
            repaint();
        }
    }

    class RoundPasswordField extends JPasswordField {
        private Shape shape;
        private Color borderColor = Color.BLACK;

        public RoundPasswordField(int size) {
            super(size);
            setOpaque(false);
            setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        }

        protected void paintComponent(Graphics g) {
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            super.paintComponent(g);
        }

        protected void paintBorder(Graphics g) {
            g.setColor(borderColor);
            g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
        }

        public boolean contains(int x, int y) {
            if (shape == null || !shape.getBounds().equals(getBounds())) {
                shape = new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, 20, 20);
            }
            return shape.contains(x, y);
        }

        public void setBorderColor(Color color) {
            this.borderColor = color;
            repaint();
        }
    }

    public LoginPage() {
        setTitle("REGISTER PAGE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 530);

        contentPane = new JPanel();
        contentPane = (JPanel) getContentPane(); // Dodajte ovu liniju
        contentPane.setBackground(new Color(69, 62, 130));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); // Postavite layout ovdje
        setContentPane(contentPane);
       
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(159, 19, 496, 464);
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
        lblNewLabel_2.setBounds(46, 391, 207, 13);
        panel_1.add(lblNewLabel_2);
        
        RoundButton loginBtn = new RoundButton("Login");
        loginBtn.setForeground(Color.BLACK);
        loginBtn.setFont(secFont);
        loginBtn.setBounds(283, 330, 85, 21);
        panel_1.add(loginBtn);
        
        RoundButton registerBtn = new RoundButton("Register");
        registerBtn.setForeground(Color.BLACK);
        registerBtn.setFont(secFont);
        registerBtn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                RegisterPage register = new RegisterPage();
                register.setVisible(true);
                dispose();
            }
        });
        registerBtn.setBounds(283, 388, 85, 21);
        panel_1.add(registerBtn);
        
        user = new RoundTextField(10);
        user.setBounds(82, 195, 273, 25);
        user.setText("Enter your name");
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
        
        RoundPasswordField pass = new RoundPasswordField(10);
        pass.setBounds(82, 252, 273, 25);
        pass.setEchoChar('\u2022');
        panel_1.add(pass);

        passPlaceholder = new JLabel("Enter your password");
        passPlaceholder.setForeground(Color.GRAY);
        passPlaceholder.setBounds(82, 252, 273, 19);
        panel_1.add(passPlaceholder); 

        // "Enter your password" in text field
        pass.setEchoChar((char) 0); 
        pass.setText("Enter your password");

        pass.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                pass.setEchoChar('\u2022'); 
                if (new String(pass.getPassword()).equals("Enter your password")) {
                    pass.setText(""); 
                }
                passPlaceholder.setVisible(false); 
            }

            public void focusLost(FocusEvent e) {
                if (pass.getPassword().length == 0) {
                    pass.setEchoChar((char) 0); 
                    pass.setText("Enter your password"); 
                    passPlaceholder.setVisible(true); 
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
        Image IMG = new ImageIcon(this.getClass().getResource("/logo.png")).getImage().getScaledInstance(90, 90,Image.SCALE_DEFAULT);
		photoLabel.setIcon(new ImageIcon(IMG));
        photoLabel.setBounds(10, 30, 78, 81);
        panel_1.add(photoLabel);
        
        centerFrame(this);
    }
    
    private static void centerFrame(Window window) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension windowSize = window.getSize();
        int x = (screenSize.width - windowSize.width) / 2;
        int y = (screenSize.height - windowSize.height) / 2;
        window.setLocation(x, y);
    }
    
}

