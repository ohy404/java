package exam09;

public class point {
    private int x,y;
    public point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void setPoint(int x,int y){
    this.x = x;
    this.y = y;
    }

    public String toString(){
        return "(" + x + ","+ y +")";
    }
}
