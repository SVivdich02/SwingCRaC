import javax.swing.*;

public class Operation {
    protected Operation() {
    }

    public void run() {
        throw new RuntimeException("don't call me");
    }

    public static class CreatePanel extends Operation {
        public void run() {
            new MyJPanel();
        }
    }

    public static class CreateButton extends Operation {
        public void run() {
            new MyJButton();
        }
    }
    public static class CreateFrame extends Operation {
        public void run() {
            new MyJFrame();
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
            //super();
            this.arg0 = arg0;
            this.arg1 = arg1;
        }

        public void run() {
            this.arg0.add(this.arg1);
        }
    }

    public static class AddPanelToFrame extends Operation {
        MyJFrame arg0;
        MyJPanel arg1;

        public AddPanelToFrame(MyJFrame arg0, MyJPanel arg1) {
            //super();
            this.arg0 = arg0;
            this.arg1 = arg1;
        }

        public void run() {
            this.arg0.add((this.arg1));
        }
    }
}
