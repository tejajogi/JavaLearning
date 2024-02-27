package methods;

public class Shadowing {
    //scope of this variable is class level, can be accessed from anywhere inside class
    static int a = 10; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(a); // a will be 10
        int a; // this variable is shadowing the value of a from line 4
        //System.out.println(a); // scope will begin only value is initialised, means from below line
        a=20;
        System.out.println(a); //20
        show(); //a=10 show is out of main scope so class level value will be printed
    }

    static void show(){
        System.out.println(a);
    }
}
