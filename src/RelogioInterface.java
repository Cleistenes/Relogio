import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RelogioInterface extends JFrame {
    private static final long serialVersionUID = 1l;
    private static JLabel labelHora;

    public RelogioInterface() {
        super("Relógio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        labelHora = new JLabel();
        labelHora.setFont(new Font("Arial", Font.BOLD, 80));
        panel.add(labelHora, BorderLayout.CENTER);

        add(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void atualizarHora() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String hora = format.format(date);
        labelHora.setText(hora);
    }


}