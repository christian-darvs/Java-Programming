import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.println(number + " is Even");
        }else {
            System.out.println(number + " is Odd");
        }
    }
}
