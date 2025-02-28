public class Dmv {
    public static void main(String[] args) {

        int randomint = (int) (Math.random() * 100);
        int plusOne = randomint + 1;
        int i = 1;
        
        System.out.println("Hello to the DMV!");
        System.out.println("Your number is " + randomint);
        System.out.println(" ");

        while (plusOne <= 200) {
            System.out.print("Number " + plusOne + "!, ");
            plusOne++;
        }
        while (i < randomint) {
            System.out.print("Number " + i + "!, ");
            i++;
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Please walk up number " + randomint);
        System.out.println("TAKE YOUR STUPID DOCUMENTS AND GET OUTTA HERE RAHHHH");
       
    }
}