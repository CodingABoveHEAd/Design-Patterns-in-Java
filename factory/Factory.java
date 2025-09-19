package factory;

public class Factory {
    public Shape shapeType(String shape){
        if(shape==null)return null;
        if(shape=="Triangle")return new Triangle();
        else if(shape=="Rectangle")return new Rectangle();
        else return null;
    }
}
