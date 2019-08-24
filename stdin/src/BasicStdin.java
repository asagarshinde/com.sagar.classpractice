import java.util.Scanner;

public class BasicStdin {

    public  static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        double myDouble = scanner.nextDouble();
        String myString = scanner.next();
        myString += scanner.nextLine();
        scanner.close();
        System.out.println("my string is "+ myString + " and number is "+ myInt + "and my double is " + myDouble);
    }
}
