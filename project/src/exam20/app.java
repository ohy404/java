package exam20;

import java.io.*;

public class app {
    static void SaveTest(){
        byte _b[] = {7,51,3,4,-1,24};
        
        try{
            FileOutputStream fos = new FileOutputStream("text.out");
            for(int i=0;i<_b.length;i++){
                fos.write(_b[i]);
            }
            fos.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("save OK");
    }
    static void LoadTest(){
        byte _b[] = new byte[6];
        
        try{
            FileInputStream fis = new FileInputStream("text.out");
            for(int i=0;i<_b.length;i++){
                int _ch = fis.read();
                _b[i] = (byte)_ch;
            }
            fis.close();
            System.out.println("load OK");
            for(int i = 0; i<_b.length;i++){
                System.out.print(_b[i]);
                System.out.print(",");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        SaveTest();
        LoadTest();
    }
}
