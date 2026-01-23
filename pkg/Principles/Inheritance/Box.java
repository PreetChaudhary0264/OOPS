package pkg.Principles.Inheritance;

public class Box {
    int l;
    int w;
    int h;
    int weight;

    Box(){
       this.l = -1;
       this.w = -1;
       this.h = -1;
    }
    Box(int l,int w,int h){
        super();  //evry calss has a superclass which is Object class
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box box){
        this.l = box.l;
    }
}
