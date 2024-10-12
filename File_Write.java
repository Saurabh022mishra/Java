import java.io.FileOutputStream;
import java.io.IOException;

public class File_Write {
    public static void main(String[] args) {
        try {
            String data="My Name is Saurabh Kumar Mishra";
            FileOutputStream foi = new FileOutputStream("output.txt");
            byte[] array = data.getBytes();
            foi.write(array);
            System.out.println("Data is Write into the file");
            foi.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
