import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SignUp extends JFrame{

    JMenuBar menu = new JMenuBar();
    JMenu menu1 = new JMenu("Главная");
    JMenu menu2 = new JMenu("Тест");
    JMenuItem menuStart = new JMenuItem("Главная страница");
    JMenuItem menuTest = new JMenuItem("Пройти тестирование");

    JPanel JPanelName = new JPanel();
    JPanel JPanelAge = new JPanel();
    JPanel JPanelEmail = new JPanel();
    JPanel JPanelArgeements = new JPanel();
    JPanel JPanelButton = new JPanel();
    JPanel JPanelLevel = new JPanel();

    JTextField studentName = new JTextField(15);
    JTextField studentAge = new JTextField(15);
    JTextField studentEmail = new JTextField(15);

    JLabel labelName = new JLabel("ФИО:");
    JLabel labelAge = new JLabel("Возраст:");
    JLabel labelEmail = new JLabel("email:");
    JLabel labelLevel = new JLabel("Ваш уровень английского сейчас:");

    JRadioButton level0 = new JRadioButton("Нулевой");
    JRadioButton level1 = new JRadioButton("Начинающий");
    JRadioButton level2 = new JRadioButton("Средний");
    JRadioButton level3 = new JRadioButton("Продвинутый");
    ButtonGroup levelsGroup = new ButtonGroup();

    JCheckBox advertising = new JCheckBox("Я согласен получать рекламные письма на указанный адрес электронной почты", true);
    JCheckBox agreement = new JCheckBox("Я согласен на обработку персональных данных", false);

    JButton button = new JButton("Записаться на занятие");

    public SignUp() {
        super();

        this.setBounds(100, 100, 700, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(11, 1));
        this.isResizable();

        menu1.add(menuStart);
        menu2.add(menuTest);
        menu.add(menu1);
        menu.add(menu2);
        this.setJMenuBar(menu);
        menuStart.addActionListener(new ReturnStartPageListener());
        menuTest.addActionListener(new TestListener());

        agreement.addActionListener(new AgreementListener());
        button.setEnabled(false);
        button.addActionListener(new ButtonListener());

        levelsGroup.add(level0);
        levelsGroup.add(level1);
        levelsGroup.add(level2);
        levelsGroup.add(level3);

        JPanelName.add(labelName);
        JPanelName.add(studentName);

        JPanelAge.add(labelAge);
        JPanelAge.add(studentAge);

        JPanelEmail.add(labelEmail);
        JPanelEmail.add(studentEmail);

        JPanelArgeements.add(advertising);
        JPanelArgeements.add(agreement);

        JPanelButton.add(button);

        this.add(JPanelName);
        this.add(JPanelAge);
        this.add(JPanelEmail);

        JPanelLevel.add(labelLevel);
        this.add(JPanelLevel);
        levelsGroup.add(level0);
        levelsGroup.add(level1);
        levelsGroup.add(level2);
        levelsGroup.add(level3);
        this.add(level0);
        this.add(level1);
        this.add(level2);
        this.add(level3);

        this.add(JPanelArgeements);

        this.add(JPanelButton);
    }

    class AgreementListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
                if (!studentName.getText().equals("")) {
                    button.setEnabled(true);
                }
        }
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = studentName.getText() + "," + "заявка отправлена!";
            JOptionPane.showMessageDialog(null, message, "Успешно", JOptionPane.PLAIN_MESSAGE);
        }
    }
    class ReturnStartPageListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            StartPage event = new StartPage();
            event.setVisible(true);
        }
    }

    class TestListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            LevelTesting event = new LevelTesting();
            event.setVisible(true);
        }
    }
}
