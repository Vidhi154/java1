import java.util.Arrays;

class Student{
    private int rollno;
    private String name;
    private String adress;

    public Student(int rollno, String name, String adress) {
        this.rollno = rollno;
        this.name = name;
    }

    Student(){

    }

    


    public void setroll(int roll){
        this.rollno=roll;
    }

    public void setname(String namee){
        this.name=namee;
    }

    public int getroll(){
        return this.rollno;
    }

    public String getname(){
        return this.name;
    }

    // public int getRollno() {
    //     return rollno;
    // }

    // public void setRollno(int rollno) {
    //     this.rollno = rollno;
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public String toString(){
        return this.name + " " + this.rollno + " " + this.adress;
    }

}

public class arys {
    public static void main(String[] args) {

        Student st = new Student();
        Student[] str = {new Student(110,"disha","suadma"),new Student(1102,"vidhi","vhhiya"),new Student(123,"chintu","mumbai")};
        System.out.println(Arrays.toString(str));
        st.setname("vidhi");
        st.setroll(2206098);
        System.out.println(st.getAdress());
        System.out.println(st.getroll());
        System.out.println(st.getname());

        System.out.println(st.getClass());
        System.out.println(st.hashCode());
        // System.out.println(st.notify());
        
    }
    
}
