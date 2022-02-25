import javax.swing.JButton;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class MyJButton extends JButton{
    MyJButton newButton;
    
    public MyJButton() {
        GlobalList.list.add(new Operation.CreateButton(this));
        this.newButton = this;
    }
    
}
