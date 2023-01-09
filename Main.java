public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Circle c1= new Circle(3.0);
        Circle c2= new Circle(3.0,"blue",false);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
    }
}
