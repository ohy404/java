interface PhoneInterface {
    void printLogo();

}
public class exam52 implements PhoneInterface {
    @Override
    public void printLogo(){
        // TODO Auto-generated method stub
        System.out.println("it is exam52 phone");
    }
    public static void main(String[] args) {
        exam52 myPhone = new exam52();

        myPhone.printLogo();
    }
}
