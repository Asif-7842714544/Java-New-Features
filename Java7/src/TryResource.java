import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryResource {
    public static void main(String[] args) throws IOException {
       try(BufferedReader br=new BufferedReader(new FileReader("C:/Users/hp/Desktop/Asif-springboot/Java New Features/Test.txt"));){
         String currentLine;
         while((currentLine=br.readLine())!=null){
             System.out.println(currentLine);
         }
       }
    }
}
