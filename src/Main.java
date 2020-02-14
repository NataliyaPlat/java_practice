public class Main {

    public static void main(String[] args) {
       // Create a loop that will print numbers from 1 to 10, except number 7
    for (int num=1; num<=10; num++){
        if (num==7){
            continue;
        }
        System.out.println(num);
    }
    //Create An Array of integers from 1 to 5, Call an integer on array using index and print it.
        int[] num = {1,2,3,4,5};
    for (int i = 0; i < num.length; i++){
        System.out.println(num[i]);
    }
    //Call index outside of the bound. Handle this exception printing “Outside of bound message.”
           try {
               int[] myNumbers = {1, 2, 3, 4};
               System.out.println(myNumbers[10]);
           }
            catch (Exception e){
               System.out.println ("Outside of the bound");

        }

    }
}
