import javax.swing.*;

public class Operation {
    public Operation() {
    }

    public MyJPanel runPan() {
        throw new RuntimeException("don't call me");
    }
    public MyJButton runBut() {
        throw new RuntimeException("don't call me");
    }
    public MyJFrame runFr() {
        throw new RuntimeException("don't call me");
    }
    public void runAddPan(MyJFrame f, MyJPanel p) {throw new RuntimeException("don't call me");}
    public void runAddBut(MyJPanel p, MyJButton b) {throw new RuntimeException("don't call me");}
    
    
    public static class CreatePanel extends Operation {
        MyJPanel arg0;
        public CreatePanel(MyJPanel arg0) {
            this.arg0 = arg0;
        }

        public MyJPanel runPan() {
            MyJPanel p = new MyJPanel();
            this.arg0 = p;
            return this.arg0;
        }
    }

    public static class CreateButton extends Operation {
        MyJButton arg0;
        public CreateButton(MyJButton arg0) {
            this.arg0 = arg0;
        }

        public MyJButton runBut() {
            MyJButton b = new MyJButton();
            this.arg0 = b;
            return this.arg0;
        }
    }
    public static class CreateFrame extends Operation {
        MyJFrame arg0;
        public CreateFrame(MyJFrame arg0) {
            this.arg0 = arg0;
        }

        public MyJFrame runFr() {
            MyJFrame f = new MyJFrame();
            this.arg0 = f;
            return this.arg0;
        }
    }

/*
    public static class Create extends Operation {
        Class cls;
        public Create(Class cls) {
            this.cls = cls;
        }
        public void run() {
            try {
                cls.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
 */

    public static class AddButtonToPanel extends Operation {
        MyJPanel arg0;
        MyJButton arg1;

        public AddButtonToPanel(MyJPanel arg0, MyJButton arg1) {
            this.arg0 = arg0;
            this.arg1 = arg1;
        }

        public void runAddBut(MyJPanel p, MyJButton b) {
            /*
            MyJPanel newpanel = this.arg0.newPanel;
            MyJButton newbutton = this.arg1.newButton;
            if (newpanel != null && newbutton != null) {
                newpanel.add(newbutton);
            }
            */
            p.add(b);
        }
    }

    public static class AddPanelToFrame extends Operation {
        MyJFrame arg0;
        MyJPanel arg1;

        public AddPanelToFrame(MyJFrame arg0, MyJPanel arg1) {
            this.arg0 = arg0;
            this.arg1 = arg1;
        }

        public void runAddPan(MyJFrame f, MyJPanel p) {

            /*
            MyJFrame newframe = this.arg0.newFrame;
            MyJPanel newpanel = this.arg1.newPanel;
            if (newpanel != null && newframe != null) {
                newframe.add(newpanel);
            }
            */

            f.add(p);
        }
    }
}
