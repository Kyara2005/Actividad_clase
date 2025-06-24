import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formulario extends JFrame{
    private JTextField textNombre;
    private JTextField textApellido;
    private JTextField textEdad;
    private JTextField textCarrera;
    private JTextField textNota1;
    private JTextField textNota2;
    private JTextField textNota3;
    private JButton limpiarButton;
    private JButton calcularButton;
    private JPanel Panel;
    private JButton docenteButton;

    public formulario(){
        setTitle("CALIFICACIONES");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(Panel);
        setLocationRelativeTo(null);

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNombre.setText("");
                textApellido.setText("");
                textEdad.setText("");
                textCarrera.setText("");
                textNota1.setText("");
                textNota2.setText("");
                textNota3.setText("");
            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double nota1 = Double.parseDouble(textNota1.getText());  //Conversion de string a double
                Double nota2= Double.parseDouble(textNota2.getText());
                Double nota3= Double.parseDouble(textNota3.getText());

                if (nota1>=0 && nota1<=10 && nota2>=0 && nota2<=10 && nota3>=0 && nota3<=10){
                    Double promedio = (nota1+nota2+nota3)/3;
                    JOptionPane.showMessageDialog(null,promedio);
                }else {
                    JOptionPane.showMessageDialog(null,"Nota invalida, fuera de rango");
                }
            }
        });
        docenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Docente();
                dispose();
            }
        });
    }

}
