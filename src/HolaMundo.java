import javax.swing.*;

import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

public class HolaMundo {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "Com1o te llamas?",
                "¡Bienvenido!", PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Tu nombre es " + name, "Nombre del jefe",
        INFORMATION_MESSAGE);
    }
}