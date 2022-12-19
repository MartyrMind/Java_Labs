package practs.pract_21;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class task_2 extends SimpleFileVisitor<Path> {
    private ArrayList<Path> files = new ArrayList<>();
    int count = 0;
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        files.add(file);
        if (count < 5) {
            System.out.println(file);
            count++;
        }
        return FileVisitResult.CONTINUE;
    }

    public ArrayList<Path> getFiles() {
        return files;
    }

    public static void main(String[] args) throws IOException {
        task_2 walker = new task_2();
        Files.walkFileTree(new File("src").toPath(), walker);

        System.out.println(walker.getFiles().size());



    }
}
