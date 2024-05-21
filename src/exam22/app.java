package exam22;

import java.io.File;

public class app {
    public static void main(String[] args) {
        File _path = new File(".\\");
        System.out.println(_path.getAbsolutePath());

        File[] subFiles = _path.listFiles();

        for (File file : subFiles){
            long t = file.lastModified();


            if(file.isDirectory()){
                System.out.println("[ "+ file.getName() +" ]");
            }
            else{
                System.out.printf("%tb %td %ta %tT \n",t,t,t,t);
                System.out.println(file.getName()+ "\t\t" +file.length() + " bytes");
            }

        }
    }
}
