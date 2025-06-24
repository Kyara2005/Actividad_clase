import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Docente extends JFrame {
    private JButton limpiarButton;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JPanel PanelDocente;
    private JButton estudianteButton;

    public Docente(){
        setTitle("Docente");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(PanelDocente);
        setLocationRelativeTo(null);

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
            }
        });
        estudianteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new formulario();
                dispose();
            }
        });
    }
}
