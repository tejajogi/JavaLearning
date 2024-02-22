package conditionsandloops;

public class Loops {
    public static void main(String[] args) {
        /*
        loops: for loop, while and do while
        do while loop will execute the statement atleast once eventhough condition is false
        initialize
        do{
            something;
        }
        while (condition)
*/
        /*for loop can be used when we know how many times loop should run
        for(initialization, condition, increment){
            body
        }*/
        for(int i = 0; i<= 10 ; i++){
            System.out.println(i);
        }


        /*while can be used when we don't know how many times loop should run
        initialize: int n = 1;
        while(condition){
            body;
            increment;
        }*/
        int n = 0;
        while(n<=10){
            System.out.println(n);
            n++;
        }
    }
}
