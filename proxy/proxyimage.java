package proxy;

class proxyimage implements image {

String filename;
public realimage Realimage;

public proxyimage(String filename){
    this.filename=filename;
   // System.out.println(1);
    
}

public void display(){
    if(Realimage==null){
        Realimage=new realimage(filename);
       // System.out.println(2);
    }
    Realimage.display();
}
     
}