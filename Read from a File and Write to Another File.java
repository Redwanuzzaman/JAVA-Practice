import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {

    public static void main(String[] args) throws IOException {
        writeToAnotherFile();
    }

    public static void writeToAnotherFile() throws IOException {
        File inFile = new File("E:/file/new.txt");
        File outFile = new File("E:/file/CopyOfNew.txt");
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader(inFile);
            fw = new FileWriter(outFile);
            int ch;
            while((ch = fr.read()) != -1){
                fw.write(ch);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        }
        fr.close();
        fw.close();
    }
}
