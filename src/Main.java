public class Main {

    public static void main(String[] args) {
<<<<<<< Updated upstream
    System.out.println("hello world");
=======

    //Create a method that will check if a given string is a palindrome. If it is it should print “This string is a palindrome” if not print “This string is not a palindrome”
        String original = "racecar";
        String reverse = "";
        for (int i = original.length()-1; i>=0; i--){
            reverse+= original.charAt(i);

        }
        boolean palindrome = true;
        for(int i = 0; i < original.length(); i++){
            if(original.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }
        if(palindrome){
            System.out.println("this is palindrome");
        }
        else{
            System.out.println("this is not a palindrome");
        }

>>>>>>> Stashed changes
    }

}
