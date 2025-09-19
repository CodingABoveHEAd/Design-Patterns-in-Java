package bridge;

class triangle extends shape {

    public triangle(color Color){
        super(Color);
    }
    
@Override
    public String draw(){
  return "Drawing a triangle with color: " + 
  Color.applyColor();
    }
     
}