import javax.swing.*;

public class MyJFrame extends JFrame {
    //MyJFrame newFrame;
    
    public MyJFrame() {
        this.setBounds(100, 100, 700, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        GlobalList.list.add(new Operation.CreateFrame(this));
    }

   // @Override
    public void add(MyJPanel panel) {
        super.add(panel);
        GlobalList.list.add(new Operation.AddPanelToFrame(this, panel));
    }
    
    /*
    public MyJFrame Update()
    {
        MyJFrame newfr = this.newFrame;
        return newfr;
    }
    */
}
