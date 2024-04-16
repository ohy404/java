class Triangle {
    int w,h;
    void set(int w, int h){
        this.w = w;
        this.h = h;
    }
    int getArea(){
        return (w*h)/2;
    }
}
class Rectangle extends Triangle{
    int getArea(){
        return w*h;
    }
}
public class exam45 {
    public static void main(String[] args) {
        Triangle _tri = new Triangle();
        Rectangle _rec = new Rectangle();
        
        _tri.set(3,4);
        _rec.set(5,10);
        System.out.println("삼각형의 밑 변은 "+ _tri.w +" 이며 높이는 " + _tri.h + " 이며 삼각형의 넓이는 " +_tri.getArea());
        System.out.println("사각형의 밑 변은 "+ _rec.w +" 이며 높이는 " + _rec.h + " 이며 사각형의 넓이는 " +_rec.getArea());
        

    }
}
