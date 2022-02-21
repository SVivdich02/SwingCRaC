import javax.swing.*;
import java.awt.*;

public class Main{

    public static void main(String[] args) {
        MyJFrame app = new MyJFrame();

        MyJButton button = new MyJButton();
        MyJPanel panel = new MyJPanel();

        panel.add(button);
        app.add(panel);

        GlobalList.RunList();
    }
}
