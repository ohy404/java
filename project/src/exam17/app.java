package exam17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class app {
    public static void main(String[] args) {
        
        InputStreamReader in = null;
        FileInputStream fin = null;

        try{
            fin = new FileInputStream("test.txt");
            in = new InputStreamReader(fin,"UTF-8");
            //in = new InputStreamReader(fin,"MS949");
            int _ch;
            System.out.println("encoding set : " + in.getEncoding());
            while ((_ch = in.read()) != -1) {
                System.out.print((char)_ch);
                
            }
            in.close();
            fin.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}