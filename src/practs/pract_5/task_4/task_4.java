package practs.pract_5.task_4;

import practs.pract_5.task_3.task_3;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class task_4 extends JFrame {
    /*
    Анимация
     */
    int WINDOW_HEIGHT = 200;
    int WINDOW_WIDTH = 480;
    String imagePath;
    task_4(String animatePath) {
        super("Figures"); //вызвали конструктор родительского класса
        this.imagePath = animatePath;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(250, 20);
    }

    void animate(String imagesPath, Graphics g) {
        File dir = new File(imagesPath);
        while (true) {
            for (File file : dir.listFiles()) {
                Image frame = Toolkit.getDefaultToolkit().getImage(file.getPath());
                g.drawImage(frame, 0, 0, WINDOW_WIDTH, WINDOW_HEIGHT, this);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        }

    }
    @Override
    public void paint(Graphics g) {
        animate(this.imagePath, g);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        task_4 myApp = new task_4(path);
    }

}
