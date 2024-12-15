
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p36 {
    public static void main(String[] args) {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));

            String str1 = br.readLine();
            String str2 = br.readLine();

            System.out.println("寫入到檔案中的兩個字串:");
            System.out.println(str1);
            System.out.println(str2);

            br.close();
        }
        catch(IOException e)
        {
            System.out.println("輸出入錯誤");
        }
    }
}
