import java.util.Scanner;

public class ex1{
    public int min=1;
    public int maxi=12;

    public ex1(){

    }

    public ex1 (int n,int m){
        min=n;
        maxi=m;

    }

    public int getmax(){
        return this.maxi;
    }

    public int getmin(){
        return this.min;
    }
    public void setmax(int newsp){
        this.maxi= newsp;
    }

    public void upgrmac(){
        setmax(getmax()+20);
    }

    public void getvar(){
        System.out.println(this.maxi);
        System.out.println(this.min);
    }
    public static void main(String[] args) {
        ex1 one = new ex1();
        int a =one.getmax();
        // System.out.println(a);
        one.getvar();
        one.setmax(30);
        one.getvar();
        System.out.println("after up grade");
        one.upgrmac();
        one.getvar();
    }
}
