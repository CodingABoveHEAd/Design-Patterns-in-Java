package singleton;

public class Main{
    public static void main(String[] args) {
        color col1=color.getInstance("red");
        color col2=color.getInstance("blue");

        col1.display();
        col2.display();
    }
}