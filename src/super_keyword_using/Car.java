
package super_keyword_using;


public class Car extends Vehical {
    //color,weight, attribute()
    int gear;
    Car(String c,double w, int g){
        super(c,w);
        gear=g;
    
    }
    @Override
    void attribut(){
        super.attribut();
        System.out.println("Gear :"+gear);
    
    }
}
