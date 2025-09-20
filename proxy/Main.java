package proxy;


public class Main{
    public static void main(String[] args) {
        proxyimage p1=new proxyimage("river.jpg");
        proxyimage p2=new proxyimage("flower.png");

        p1.display();
        p2.display();

    }
}