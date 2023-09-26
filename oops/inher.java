package oops;

class bicycle{

    // String name;
    public int geer;
    public int speed;
    
    public bicycle(int ger , int speed){
        this.geer=ger;
        this.speed=speed;
    }

    bicycle(){

    }

    public void brek(int dec){
        speed = speed - dec;

    }

    public void spup(int inc){
        speed += inc;
    }

    public String toString(){
        return ("no. of geer are" + geer + "\n" + " the spped is " + speed);
    }

    class mountainbike extends bicycle{
        public int setheight;

        public mountainbike(int geer , int spped,int height){
            super(geer, height);
            setheight=height;

        }

        public void setheight(int value){
            this.setheight=value;
        }

        public String toString(){
            return (super.toString() + "\n seat height is" + this.setheight);
        }
    }

}

public class inher {
    public static void main(String[] args) {
        bicycle bi = new bicycle();
        bicycle.mountainbike my = bi.new mountainbike(300, 20, 50);
        // System.out.println(my);S
        System.out.println(my.toString());
    }
    
}
