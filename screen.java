import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Usando o extends JFrame não é preciso reescrever JFrame para os comandos
// EX: jFrame.setVisible = apenas "setVisible(true);"
public class screen extends JFrame implements ActionListener {
    public screen() {
        setVisible(true);
        setSize(800, 500);
        setTitle("Aula 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        setLayout(null);

        JButton jButton = new JButton("Clique aqui");
        jButton.setBounds(200, 200, 260, 100);
        jButton.setFont(new Font("Arial", Font.BOLD, 40));
        jButton.setForeground(new Color(147, 5, 177));
        jButton.setBackground(new Color(255, 255, 255));
        add(jButton);

        jButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "error", "teste", JOptionPane.WARNING_MESSAGE);

    }
}
