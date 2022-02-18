import javax.swing.JButton;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class MyJButton extends JButton{
    public MyJButton() {
        super();
        GlobalList.list.add(new Operation.CreateButton());
    }
}
