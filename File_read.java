
import java.io.FileInputStream;


public class File_read {
    public static void main(String[] args) {
        try{
        FileInputStream fos = new FileInputStream("output.txt");

        int i=0; 
        while((i=fos.read())!=-1){    
            System.out.print((char)i);    
           }
        fos.close();
        }catch(Exception e){
            System.out.println(e);
        }

}
}
