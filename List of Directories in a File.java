import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {

    public static void main(String[] args) throws IOException {
        printFileContents();
    }

    public static void printFileContents() {
        File targetFolder = new File("E:/file");
        String contents[] = targetFolder.list();
        System.out.println("List of directories:");
        for (int i = 0; i < contents.length; i++) {
            System.out.println(contents[i]);
        }
    }
}
