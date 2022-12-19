package practs.pract_5.task_2;

import javax.swing.*;
import java.awt.*;

public class task_2 extends JFrame {
    /*
    20 случаных фигур случайного цвета
    Классы фигур наследуются от абстрактного класса Shape, в котором описаны цвет и позиция фигуры
     */
    int WINDOW_HEIGHT = 800;
    int WINDOW_WIDTH = 1000;
    task_2() {
        super("Figures"); //вызвали конструктор родительского класса
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1000, 800);
        setLocation(250, 20);
    }

    @Override
    public void paint(Graphics g2) {
        /*
        В методе paint размещается код, прорисовывающий компонент
        В данном случае компонент 1 - JFrame, на котором мы будем рисовать фигуры
         */
        Graphics2D g = (Graphics2D) g2;

        for (int i = 0; i < 20; i++) {
            int shape = (int)(Math.random() * 7);
            switch (shape) {
                case 1:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRect(
                            (int) (Math.random() * (WINDOW_WIDTH - 100)),
                            (int) (Math.random() * (WINDOW_HEIGHT - 100)),
                            (int) (Math.random() * 100 + 2),
                            (int) (Math.random() * 100 + 2));
                    break;
                case 2:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    double is_circle = Math.random();
                    if (is_circle > 0.5) {
                        g.fillOval(
                                (int) (Math.random() * (WINDOW_WIDTH - 100)),
                                (int) (Math.random() * (WINDOW_HEIGHT - 100)),
                                (int) (Math.random() * 100),
                                (int) (Math.random() * 100));
                    } else {
                        g.fillOval(
                                (int) (Math.random() * (WINDOW_WIDTH - 100)),
                                (int) (Math.random() * (WINDOW_HEIGHT - 100)),
                                100, 100);
                    }

                    break;
                case 3:
                    g.setColor(new Color((int) (Math.random() * 0x1000000)));
                    g.fillRoundRect(
                            (int) (Math.random() * (WINDOW_WIDTH - 100)),
                            (int) (Math.random() * (WINDOW_HEIGHT - 100)),
                            (int) (Math.random() * 100),
                            (int) (Math.random() * 100),
                            (int) (Math.random() * 100),
                            (int) (Math.random() * 100));
                    break;
            }
        }
    }

    public static void main(String[] args) {
        task_2 myApp = new task_2();
    }
}
