import java.io.*;
import java.util.Scanner;


public class Application {
    String filename;
    String text;
    protected void writeData() throws IOException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter filename");
            filename = scanner.nextLine() + ".txt";
            PrintWriter pw = new PrintWriter(filename);
            System.out.println("Введите содержимое файла: ");
            text = scanner.nextLine();
            pw.write(text);
            pw.flush();
    }
    protected void readData() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        br.read(text.toCharArray());
    }
    public static void main(String[] args) throws IOException {
        Application application = new Application();
        application.writeData();
        application.readData();




    }
}