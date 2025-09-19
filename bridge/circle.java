package bridge;

class circle extends shape {

    public circle(color Color){
        super(Color);
    }

@Override
    public String draw(){
  return "Drawing a circle with color: " + Color.applyColor();
    }
     
}