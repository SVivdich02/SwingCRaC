import javax.swing.*;

public class MyJFrame extends JFrame {
    public MyJFrame() {
        super.setBounds(100, 100, 700, 700);
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        GlobalList.list.add(new Operation.CreateFrame());
    }

   // @Override
    public void add(MyJPanel panel) {
        super.add(panel);
        GlobalList.list.add(new Operation.AddPanelToFrame(this, panel));
    }
}
