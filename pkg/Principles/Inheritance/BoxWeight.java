package pkg.Principles.Inheritance;

public class BoxWeight extends Box {
    int ola;
    int weight;

    BoxWeight(int o){
        this.ola = o;
    }
    BoxWeight(int l,int h,int w,int ola){
        System.out.println(super.weight);  //thgis will refer to the box class field weight
        System.out.println(this.weight);  //this is refer to the boxWeight calss field weight
//        super(l,h,w);

        //if we do not write this super(l,w,h) then the default one will be called; => Box(){}
        this.ola = ola;
    }



    BoxWeight(BoxWeight other){     //this is the same thing as=>   Box obj = new BoxWeight();
        super(other);
        this.ola = other.ola;  //we are passing obj as BoxWeight type and in Box class we are acceptiug it as Box type 
    }

    public static void main(String[] args) {
//        Box obj =  new Box();

        BoxWeight obj2 = new BoxWeight(1,2,3,4);

        Box obj3 = new BoxWeight(1,2,3,4);
        System.out.println(obj2.l);
//        System.out.println(obj3.ola);   we will get error

        //It is the type of the refernce variable (not the object type) that decides what fields u can access
        //In above example object is of type BoxWeight but obj3 is of tyoe VBox and we cant access ola which is variable oif BoxWeight calss

//        BoxWeight obj4 = new Box(1,2,3);  This will give erorr
        //if we can access the variable of BoxWeight calss via obj4 then we shoud also initialize the variable but how can we call the constructor when parent does not have any clue of BoxWeight class fields

        //Super keyword hash two uses
        //1= Super keyWord is use dto call constructor of the just above parent class;
        //2= Super keyword can also be used in plae of this keyword used for referencing parent calss fields

        //multilevel and heirarchical ho jayga
        //multiple inheritance can be achieved by interfaces only
    }
}
