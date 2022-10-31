import java.util.Scanner;

public class TestPQH {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;

        while (true) {

            printMenu();
            option = input.nextInt();

            switch (option) {

                case 0: // Enter Queue Type (integer or string)
                    break;
                case 1: // Enqueue Element
                    break;
                case 2: // Dequeue Element
                    break;
                case 3: // Check is_Full
                    break;
                case 4: // Check is_Empty
                    break;
                case 5: // Print PQueue Size
                    break;
                case 6: // Display Front Element
                    break;
                case 7: // Print PQueue Elements
                    break;
                case 8: // Exit
                    System.exit(255);
                    break;
            }
        }
    }

    public static void printMenu() {

        System.out.println("\n----------------MAIN MENU---------------");

        System.out.println("0. Enter Queue Type (integer or string)");
        System.out.println("1. Enqueue Element");
        System.out.println("2. Dequeue Element");
        System.out.println("3. Check is_Full");
        System.out.println("4. Check is_Empty");
        System.out.println("5. Print PQueue Size");
        System.out.println("6. Display Front Element");
        System.out.println("7. Print PQueue Elements");
        System.out.println("8. Exit program");

        System.out.print("\nEnter option number: ");
    }
}
