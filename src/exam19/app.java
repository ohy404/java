package exam19;

import java.io.*;
import java.util.*;
public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileWriter fout = null;
        int _ch;

        try{
            fout = new FileWriter("out.txt");
            while (true) {
                String line = scanner.nextLine();
                if(line.length() == 0) break;
                fout.write(line,0,line.length());
            }
            fout.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
    
}
