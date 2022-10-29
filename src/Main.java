import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("TakeItEazy");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UI ui = new UI();
        f.add(ui);
        f.setSize(1000, 1000);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);


    }


}
