import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LevelTesting extends JFrame {
    int result = 0;

    JMenuBar menu = new JMenuBar();
    JMenu menu1 = new JMenu("Главная");
    JMenu menu2 = new JMenu("Запись");
    JMenuItem menuStart = new JMenuItem("Главная страница");
    JMenuItem menuSignUp = new JMenuItem("Записаться на занятие");

    JPanel JPanelWelcome = new JPanel();
    JPanel JPanelQuestion1 = new JPanel();
    JPanel JPanelQuestion2 = new JPanel();
    JPanel JPanelQuestion3 = new JPanel();
    JPanel JPanelQuestion4 = new JPanel();
    JPanel JPanelButtonResult = new JPanel();

    JLabel labelWelcome = new JLabel("Пройди тест и узнай уровень своего английского прямо сейчас!");
    JLabel labelQuestion1 = new JLabel("How old is your ___ ? He is nineteen.");
    JLabel labelQuestion2 = new JLabel("Tom ___ a teacher.");
    JLabel labelQuestion3 = new JLabel("We usually ___ at home.");
    JLabel labelQuestion4 = new JLabel("I take an umbrella ___ it rains.");

    JRadioButton question1Opt1 = new JRadioButton("sister");
    JRadioButton question1Opt2 = new JRadioButton("son");
    JRadioButton question2Opt1 = new JRadioButton("are");
    JRadioButton question2Opt2 = new JRadioButton("is");
    JRadioButton question3Opt1 = new JRadioButton("eat");
    JRadioButton question3Opt2 = new JRadioButton("eating");
    JRadioButton question4Opt1 = new JRadioButton("in case");
    JRadioButton question4Opt2 = new JRadioButton("when");

    ButtonGroup group1 = new ButtonGroup();
    ButtonGroup group2 = new ButtonGroup();
    ButtonGroup group3 = new ButtonGroup();
    ButtonGroup group4 = new ButtonGroup();

    JButton buttonResult = new JButton("Узнать результат");

    public LevelTesting() {
        super();

        this.setBounds(100, 100, 700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(15, 2));
        this.isResizable();

        menu1.add(menuStart);
        menu2.add(menuSignUp);
        menu.add(menu1);
        menu.add(menu2);
        this.setJMenuBar(menu);
        menuStart.addActionListener(new ReturnStartPageListener());
        menuSignUp.addActionListener(new SignUpListener());

        question1Opt2.addActionListener(new RightAnswer());
        question2Opt2.addActionListener(new RightAnswer());
        question3Opt1.addActionListener(new RightAnswer());
        question4Opt1.addActionListener(new RightAnswer());

        JPanelWelcome.setBackground(Color.cyan);

        buttonResult.addActionListener(new ButtonResultListener());

        JPanelWelcome.add(labelWelcome);
        this.add(JPanelWelcome);

        JPanelQuestion1.add(labelQuestion1);
        this.add(JPanelQuestion1);
        group1.add(question1Opt1);
        group1.add(question1Opt2);
        this.add(question1Opt1);
        this.add(question1Opt2);

        JPanelQuestion2.add(labelQuestion2);
        this.add(JPanelQuestion2);
        group2.add(question2Opt1);
        group2.add(question2Opt2);
        this.add(question2Opt1);
        this.add(question2Opt2);

        JPanelQuestion3.add(labelQuestion3);
        this.add(JPanelQuestion3);
        group3.add(question3Opt1);
        group3.add(question3Opt2);
        this.add(question3Opt1);
        this.add(question3Opt2);

        JPanelQuestion4.add(labelQuestion4);
        this.add(JPanelQuestion4);
        group4.add(question4Opt1);
        group4.add(question4Opt2);
        this.add(question4Opt1);
        this.add(question4Opt2);

        JPanelButtonResult.add(buttonResult);
        this.add(JPanelButtonResult);
    }

    class RightAnswer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            result ++;
        }
    }

    class ButtonResultListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "Ваш результат: " + result + " / 4";
            JOptionPane.showMessageDialog(null, message, "Успешно", JOptionPane.PLAIN_MESSAGE);
        }
    }

    class ReturnStartPageListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            StartPage event = new StartPage();
            event.setVisible(true);
        }
    }

    class SignUpListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SignUp event = new SignUp();
            event.setVisible(true);
        }
    }
}
