import javax.swing.*;

public class UI01 {
    private JButton button1;
    private JPanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyForm");
        frame.setContentPane(new UI01().button1);
        frame.setContentPane(new UI01().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

