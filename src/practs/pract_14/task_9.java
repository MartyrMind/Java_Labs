package practs.pract_14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class task_9 {
    public static void main(String[] args) throws IOException {
        //будем строить частотный словарь букв о, т, с, р, г, ж, д, я, э
        int[] letters = new int[9];
        int size = 0;
        Path path = Path.of("C:\\WorkFolder\\Java&Kotlin\\Projects\\Java\\src\\practs\\pract_14\\source.txt");
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            size += line.length();
            for (int i = 0; i < line.length(); i++) {
                char letter = line.toLowerCase().charAt(i);
                if (letter == 'о') {
                    letters[0]++;
                } else if (letter == 'т') {
                    letters[1]++;
                } else if (letter == 'с') {
                    letters[2]++;
                } else if (letter == 'р') {
                    letters[3]++;
                } else if (letter == 'г') {
                    letters[4]++;
                } else if (letter == 'ж') {
                    letters[5]++;
                } else if (letter == 'д') {
                    letters[6]++;
                } else if (letter == 'я') {
                    letters[7]++;
                } else if (letter == 'э') {
                    letters[8]++;
                }
            }
        }

        System.out.println("Частотный словарь букв о, т, с, р, г, ж, д, я, э:");
        System.out.println("о: " + letters[0] + " (" + (double) letters[0] / size + ")");
        System.out.println("т: " + letters[1] + " (" + (double) letters[1] / size + ")");
        System.out.println("с: " + letters[2] + " (" + (double) letters[2] / size + ")");
        System.out.println("р: " + letters[3] + " (" + (double) letters[3] / size + ")");
        System.out.println("г: " + letters[4] + " (" + (double) letters[4] / size + ")");
        System.out.println("ж: " + letters[5] + " (" + (double) letters[5] / size + ")");
        System.out.println("д: " + letters[6] + " (" + (double) letters[6] / size + ")");
        System.out.println("я: " + letters[7] + " (" + (double) letters[7] / size + ")");
        System.out.println("э: " + letters[8] + " (" + (double) letters[8] / size + ")");
    }
}
