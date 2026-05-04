import java.util.*;
public class Main {
    public static void main(String[] args) {
        File file1 = new File("resume.pdf");
        File file2 = new File("photo.jpg");
        Folder folder = new Folder("Documents");
        folder.add(file1);
        folder.add(file2);
        folder.showDetails();
    }
}
