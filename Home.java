// import.java.utill.*;
public class Home {
    Home(int s,int t){
        System.out.println(s+t);
    }
    void display (int i){
        System.out.println("Int paramitar pass");
    }
    void display(){
        System.out.println("No paramitar Pass");
    }
    void display(float k){
        System.out.println("float parameter pass");
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("saikat");
        Home ho =new Home(4 , 6);
        ho.display(0.00f);
    }
}