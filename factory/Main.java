package factory;

public class Main {
public static void main(String[] args) {

        Factory obj1=new Factory();
        Shape shp1=obj1.shapeType("Triangle");
        Shape shp2=obj1.shapeType("Rectangle");

        shp1.draw();
        shp2.draw();
    }
}
