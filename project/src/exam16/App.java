package exam16;

import java.io.*;
public class App {
    public static void main(String[] args) {
        FileReader fin = null;

        try{
            fin = new FileReader(".\\src\\exam16\\test.txt"); //".\\src\\exam16\\test.txt"
            int c;
            while ((c = fin.read()) != -1) { //EOF까지 읽기
                System.out.print((char)c);
            }
            fin.close();
        }
        catch(IOException e){
            System.out.println("입축력 오류 : ");
            System.out.println(e.getMessage());

        }
    }
}
