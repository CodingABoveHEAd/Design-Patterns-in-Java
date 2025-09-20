package proxy;

class realimage implements image {

    String filename;

    public realimage(String filename){
        this.filename=filename;
        //System.out.println(3);
        diskload();
    }

    public void display(){
          System.out.println("Displaying " + filename);
         // System.out.println(5);
    }

    private void diskload(){
          System.out.println("loading from disk " + filename);
         // System.out.println(4);
    }
}