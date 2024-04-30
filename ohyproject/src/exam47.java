 class student extends exam46{
    public void set(){
        setWeight(99);
        height = 190;
        name = "oh";
        age = 20;
    }
}

public class exam47 {
    public static void main(String[] args) throws Exception {
        //System.out.println("hello word");
        student _obj = new student();
        _obj.set();

        System.out.printf("name : %s , height : %d , age : %d \n",
        
        _obj.name,_obj.height,
        _obj.age
        );
    }
}

