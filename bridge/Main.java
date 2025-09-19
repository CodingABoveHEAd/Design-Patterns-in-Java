package bridge;

public class Main {

    public static void main(String[] args) {
        color redColor=new red();
        color blueColor=new blue();

        circle Circle=new circle(blueColor);
        triangle Triangle=new triangle(redColor);

       System.out.println( Circle.draw());
       System.out.println( Triangle.draw());
    }
}