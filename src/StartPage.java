import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartPage extends JFrame{

    JLabel labelWelcome = new JLabel("Пройдите тестирование, чтобы узнать свой уровень, или запишитесь на пробное занятие");
    JMenuBar menu = new JMenuBar();
    JMenu menu1 = new JMenu("Тест");
    JMenu menu2 = new JMenu("Запись");
    JMenuItem menuTest = new JMenuItem("Пройти тестирование");
    JMenuItem menuSignUp = new JMenuItem("Записаться на занятие");

    JPanel PanelStart = new JPanel();

    public StartPage() {
        super("Добро пожаловать");

        this.setBounds(100, 100, 700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PanelStart.add(labelWelcome);
        PanelStart.setBackground(Color.LIGHT_GRAY);
        this.add(PanelStart);

        menu1.add(menuTest);
        menu2.add(menuSignUp);
        menu.add(menu1);
        menu.add(menu2);
        this.setJMenuBar(menu);

        menuTest.addActionListener(new GetTested());
        menuSignUp.addActionListener(new SignUpLesson());
    }

    class GetTested implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            LevelTesting event = new LevelTesting();
            event.setVisible(true);
        }
    }

    class SignUpLesson implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SignUp event = new SignUp();
            event.setVisible(true);
        }
    }

}
