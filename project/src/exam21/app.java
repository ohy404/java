package exam21;

import java.io.*;
public class app {
    public static void main(String[] args) {
        FileReader fin = null;

        try{
            fin = new FileReader("test2.txt"); //".\\src\\exam16\\test.txt"
            int c;
            int _count = 0;
            BufferedOutputStream out = new BufferedOutputStream(System.out,3);

            while ((c = fin.read()) != -1) { //EOF까지 읽기
                out.write(c);
                //System.out.print((char)c);
                //_count++;
                //if(_count>4) break;
            }
            System.out.println("--------------------------");
            fin.close();
            out.flush();
            out.close();
        }
        catch(IOException e){
            System.out.println("입축력 오류 : ");
            System.out.println(e.getMessage());

        }
    }
}
