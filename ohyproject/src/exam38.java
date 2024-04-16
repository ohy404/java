class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
        // this.name = name;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
public class exam38 {


    public static void main(String[] args) {

        Circle[] circleArray;
        circleArray = new Circle[5];

        for (int i = 0; i < 5; i++) 
            circleArray[i]  = new Circle(i);
        
        for (int i = 0; i < 5; i++) 
            System.out.printf("%f \n", circleArray[i].getArea());
        
    }
}

