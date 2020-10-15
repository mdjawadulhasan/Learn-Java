package MultipicationTable;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Table extends JFrame {

    private Container c;
    private JLabel imgL, textL;
    private JTextArea ta;
    private JTextField tf;
    private JButton clrBtn;
    private ImageIcon img;
    private Font f;
    private Cursor cr;

    Table() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        Font f = new Font("Arial", Font.BOLD + Font.ITALIC, 25);

        img = new ImageIcon(getClass().getResource("download.jpg"));
        imgL = new JLabel(img);
        imgL.setBounds(20, 10, img.getIconWidth(), img.getIconHeight());
        c.add(imgL);

        textL = new JLabel("Enter Number :");
        textL.setBounds(20, 200, 250, 50);
        textL.setForeground(Color.black);
        textL.setFont(f);
        c.add(textL);

        tf = new JTextField();
        tf.setBounds(230, 200, 90, 50);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setForeground(Color.black);
        tf.setFont(f);
        c.add(tf);

        Font f1 = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        cr = new Cursor(Cursor.HAND_CURSOR);
        clrBtn = new JButton("Clear");
        clrBtn.setBounds(230, 260, 90, 50);
        clrBtn.setBackground(Color.RED);
        clrBtn.setCursor(cr);
        clrBtn.setFont(f1);
        c.add(clrBtn);

        ta = new JTextArea();
        ta.setBounds(20, 350, 300, 300);
        ta.setBackground(Color.WHITE);
        ta.setFont(f1);
        c.add(ta);

        tf.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                String value = tf.getText();
                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Why didint you put any number");
                } else {
                    ta.setText("");
                    int num = Integer.parseInt(tf.getText());

                    for (int i = 1; i <= 10; i++) {
                        int result = 0;
                        result = num * i;

                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String icr = String.valueOf(i);

                        ta.append(n + " x " + icr + " = " + result + " \n");

                    }
                }

            }

        });

        clrBtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                ta.setText(" ");

            }

        });

    }

    public static void main(String[] args) {

        Table frame = new Table();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 20, 360, 700);
        frame.setTitle("Multipication Table");

    }

}
