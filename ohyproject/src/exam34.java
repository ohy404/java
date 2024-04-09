public class exam34 {
        int radius;
        String name;
        int _radius;
        String _name;
        public exam34() {
            radius = 1;
            name = "none";
        }
        public exam34(int radius,String name){
            this.radius = radius;
            this.name = name;
        }
        public double getArea() {
            return 3.14 * radius * radius;
        }

        public static void main(String[] args) {
            exam34 pizza;
            pizza = new exam34();
            pizza.radius = 10;
            pizza.name = "자바피자";
            double area = pizza.getArea();
            System.out.println(pizza.name + " 의 면적은 " + area);

            exam34 donut;
            donut = new exam34();
            donut.radius = 2;
            donut.name = "자바도넛";
            area = donut.getArea();
            System.out.println(pizza.name + " 의 면적은 " + area);
        }
}
