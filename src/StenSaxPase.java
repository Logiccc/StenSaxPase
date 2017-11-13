import javax.swing.*;
import java.util.Random;

public class StenSaxPase {
    public static void main(String[]args) {
        Random r = new Random();
        JOptionPane.showMessageDialog(null, "Sten Sax Pase \n"
                + "Sten = 1 \n" + "Sax = 2 \n" + "Pase = 3");
        int Spelare = Integer.parseInt(JOptionPane.showInputDialog(null, "Gör ditt val"));
        r.nextInt(3);

        if (r == Spelare)
            JOptionPane.showMessageDialog(null, "Det Blev Lika!");

        if (r == 2 && Spelare == 3)
            JOptionPane.showMessageDialog(null, "Du förlorade!");

        if (r == 3 && Spelare == 2)
            JOptionPane.showMessageDialog(null, "Du van!");

        if (r == 1 && Spelare == 2)
            JOptionPane.showMessageDialog(null, "Du Förlorade!");

        if (r == 2 && Spelare == 1)
            JOptionPane.showMessageDialog(null, "Du Van!");

        if (r == 3 && Spelare == 1)
            JOptionPane.showMessageDialog(null, "Du Förlorade!");

        if (r == 1 && Spelare == 3)
            JOptionPane.showMessageDialog(null, "Du Van!");
        
        if (r == )



    }
}
