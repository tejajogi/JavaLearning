package methods;

import java.util.Arrays;

public class VarLengthArguments {
    public static void main(String[] args) {
        mutipleTypes(11,2,"teja","meghu","friends");
    }

    static void varArg(int ...v){ // internally it's creating array of integers
        System.out.println(Arrays.toString(v));
    }

    static void varArg1(String ...v){ // internally it's creating array of integers
        System.out.println(Arrays.toString(v));
    }

    static void mutipleTypes(int a, int b,String ...v){ // internally it's creating array of integers
        System.out.println(a);
        System.out.println(b);
        System.out.print(Arrays.toString(v));
    }
}
