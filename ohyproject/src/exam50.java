class person3 {
    String name;
    public person3(){
        //this.name = name;
    }
    public void print(){
        System.out.println(name);
    }
}
class student3 extends person3 {
    String grade;
    public student3(String name,String grade){
        this.name = name;
        this.grade = grade;
        
    }
    public void print(){
        System.out.println(name);
        System.out.println(grade);
    }
}
class preofesor3 extends person3 {
    String subject;
    
    public preofesor3(String name,String subject){
        this.name = name;
        this.subject = subject;
    }
    public void print(){
        super.print();
        System.out.println(subject);
    }
}
public class exam50 {
    static void print(person3 p){
        System.out.println(p.name);
        if(p instanceof student3){
            System.out.println(((student3)p).grade);
        }
        else if(p instanceof preofesor3){
            System.out.println(((preofesor3)p).subject);
        }
    }
    public static void main(String[] args) {
        person3 p1 = new student3("oh","grade3");

        person3 p2 = new preofesor3("oh2","java");

        p1.print();
        p2.print();
        //print(p1);
        //print(p2);
    }
}
