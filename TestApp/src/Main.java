import javax.swing.*;
import java.awt.*;

public class Main{

    public static void main(String[] args) {
        MyJFrame app = new MyJFrame();

        /*
        app.setBounds(100, 100, 700, 700);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        */

        MyJButton button = new MyJButton();
        MyJPanel panel = new MyJPanel();

        panel.add(button);
        app.add(panel);

        GlobalList.RunList();
    }
}
