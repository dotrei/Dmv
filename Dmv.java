public class Dmv {
    public static void main(String[] args) {

        int randomint = (int) (Math.random() * 100);
        int plusOne = randomint + 1;
        int integerCopy = randomint;
        
        System.out.println("Hello to the DMV!");
        System.out.println("Your number is " + randomint);

        while (plusOne <= 100) {
            System.out.print("Number " + plusOne + "!, ");
            plusOne++;
        }
        while (integerCopy < randomint) {
            System.out.print("Number " + integerCopy + "!, ");
            integerCopy++;
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Please walk up number " + randomint);
        System.out.println("Sorry, but you don't have the proper documentation");

       
    }
}