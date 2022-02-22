import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GlobalList {
    public static List<Operation> list = new ArrayList<Operation>();

    public static void RunList()
    {
        int correctlySize = list.size();
        
        MyJFrame restoreFrame = new MyJFrame();
        MyJButton restoreButton = new MyJButton();
        MyJPanel restorePanel = new MyJPanel();

        for (int i = 0; i < correctlySize; i++)
        {
            if (list.get(i).getClass() == Operation.CreateFrame.class)
            {
                restoreFrame.dispose();
                restoreFrame = list.get(i).runFr();
            }
            if (list.get(i).getClass() == Operation.CreateButton.class)
            {
                restoreButton = list.get(i).runBut();
            }
            if (list.get(i).getClass() == Operation.CreatePanel.class)
            {
                restorePanel = list.get(i).runPan();
            }
            if (list.get(i).getClass() == Operation.AddButtonToPanel.class)
            {
                list.get(i).runAddBut(restorePanel, restoreButton);
            }
            if (list.get(i).getClass() == Operation.AddPanelToFrame.class)
            {
                list.get(i).runAddPan(restoreFrame, restorePanel);
            }
        }
    }
}
