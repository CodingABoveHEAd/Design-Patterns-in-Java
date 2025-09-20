package singleton;

class color {
    private static color Color;
    private String col;
    private color(String col){
        this.col=col;
    };
    public static color getInstance(String Col){
        
        if(Color==null){
            Color=new color(Col);
        }
            return Color;
    }   
    public void display(){
        System.out.println("The color is "+col);
    }
}