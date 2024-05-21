package exam01;


class Point1{
    private int x,y;
    public Point1(int x,int y)
    {
    this.x = x;
    this.y = y;
    }
    @Override
    public String toString(){
        return "point (" + this.x + "," + this.y + ")";
    }
}

public class exam1_1 {
    public static void main(String[] args) {
        Point p = new Point(3,4);
        System.out.println(p.getClass().getName());
        System.out.println(p.hashCode());
        System.out.println(p.toString());
        System.out.println(p);
    }
}
