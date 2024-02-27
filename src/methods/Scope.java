package methods;

public class Scope {
    public static void main(String[] args) {
        int a =10;
        int b= 20;
        values();

        {
          //  int a=15; // a is already initialized out of block, so can't initialize again
            a = 15; //we can reassign the value of a
            System.out.println(a); // value of a is changed to 15
            int c =30; // value initialized inside the block can only be accessed in the block
            System.out.println(c);
        } // scope of c = 30 will end in this block, so can be initialized again out of block as below
        int c = 50;
        System.out.println(a); // a value will be 10 only if inside block a is not reassigned to 15

    }

    static void values(){
        //value in a method can only be accessed inside the same method
        int c = 40;
        System.out.println(c); //this c value 40 will be printed when this method is called
      //  System.out.println(a); // cannot access reference of variable a
    }
}
