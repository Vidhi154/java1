import java.util.Scanner;

public class mad {
    Scanner sc= new Scanner(System.in);
    String story ;
    String name;
    String ad1;
    String ad2;
    String noun1;
    String noun2;
    String adverb;
    String noun3;
    String randomnum;
    Random rand = new Random();


    //getters

    public String getstory(){
        return story;
    }

    public String getadd1(){
        return ad1;
    }

    public String getname(){
        return name;
    }

    public String getad2(){
        return ad2;
    }

    public String getnoun1(){
        return noun1;
    }

    public String getnoun2(){
        return noun2;
    }

    public String getnoun3(){
        return noun3;
    }

    public String getadverb(){
        return adverb;
    }

    public String getrandom(){
        return randomnum;
    }

    //setters

    public void setstory(String newstory){
        this.story= newstory;
    }
    public void setname(String newname){
        this.name= newname;
    }

    public void setad1(String newad1){
        this.ad1= newad1;
    }
    public void setad2(String newad2){
        this.ad2= newad2;
    }
    public void setnoun1(String newnoun1){
        this.noun1= newnoun1;
    }
    public void setnoun2(String newnoun2){
        this.noun2= newnoun2;
    }
    public void setnoun3(String newnoun3){
        this.noun3= newnoun3;
    }
    public void setadverb(String newadverb){
        this.adverb= newadverb;
    }
    public void setrandomnum(String newrandom){
        this.randomnum= newrandom;
    }

    public void enternum(){
        setname(sc.nextLine());
    }

    public void printinstu(){
        System.out.println("welcome to the pklay game");
    }
    public void putto(){
        String sto="jeesika has set a some family program of name" + getname() + "after reaching there some " + getnoun1() + 
        "fest for dinner and eat" + getadverb() + " i have guess the number" + getrandom() + ".";
        setstory(st0);
    }

    public static void main(String[] args) {
        mad madli = new mad();
        madli.printinstu();
        String noun= madli.noun1;
        setname();
    }





}
