package practs.pract_5.task_3;

import practs.pract_5.task_2.task_2;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class task_3 extends JFrame{
    /*
    Отображение картинки, путь к которой указан в аргументе
     */
    int WINDOW_HEIGHT = 800;
    int WINDOW_WIDTH = 1000;
    String imagePath;
    task_3(String imagePath) {
        super("Figures"); //вызвали конструктор родительского класса
        this.imagePath = imagePath;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(1000, 800);
        setLocation(250, 20);
    }

    @Override
    public void paint(Graphics g) {
        Image img = Toolkit.getDefaultToolkit().getImage(this.imagePath);
        g.drawImage(img, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        task_3 myApp = new task_3(path);
    }
}
