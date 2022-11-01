// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 7
// IDE Name: IntelliJ

import java.util.Scanner;

public class TestPQH {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;

        boolean firstRun = false;
        boolean data = true;

        String inputStr = "";

        PQ_heap<String> stringHeap = new PQ_heap<String>();
        PQ_heap<Integer> intHeap = new PQ_heap<Integer>();

        while (!firstRun) {

            printMenu();
            option = input.nextInt();

            if (option != 0) {
                System.out.println("Invalid Selection, first you must choose option 0!");
            } else {
                System.out.print("\nEnter the data type(integer/string): ");
                inputStr = input.next();

                if (inputStr.equals("integer") || inputStr.equals("Integer") ||
                        inputStr.equals("int") || inputStr.equals("Int") ||
                        inputStr.equals("i") || inputStr.equals("I")) {
                    data = false;
                } else if (inputStr.equals("string") || inputStr.equals("String") ||
                        inputStr.equals("str") || inputStr.equals("Str") ||
                        inputStr.equals("s") || inputStr.equals("S")) {
                    data = true;
                } else
                    System.out.println("Please select either integer or string.");
                firstRun = true;
            }
        }

        while (true) {

            printMenu();
            option = input.nextInt();

            switch (option) {

                case 0: // Enter Queue Type (integer or string)
                    System.out.print("\nEnter the data type(integer/string): ");
                    inputStr = input.next();

                    if (inputStr.equals("integer") || inputStr.equals("Integer") ||
                            inputStr.equals("int") || inputStr.equals("Int") ||
                            inputStr.equals("i") || inputStr.equals("I")) {
                        data = false;
                    } else if (inputStr.equals("string") || inputStr.equals("String") ||
                            inputStr.equals("str") || inputStr.equals("Str") ||
                            inputStr.equals("s") || inputStr.equals("S")) {
                        data = true;
                    }
                    else
                        System.out.println("Please select either integer or string.");
                    break;

                case 1: // Enqueue Element

                    if (data) { // String
                        System.out.print("Enter a string to enqueue: ");
                        stringHeap.enqueue(input.next());
                    } else { // Integer
                        System.out.print("Enter an integer to enqueue: ");
                        intHeap.enqueue(input.nextInt());
                    }
                    break;

                case 2: // Dequeue Element
                    if (data) // String
                        stringHeap.dequeue();
                    else // Integer
                        intHeap.dequeue();
                    break;

                case 3: // Check is_Full
                    if (data) // String
                        System.out.println("Is string Heap full? " + stringHeap.is_full());
                    else // integer
                        System.out.println("Is integer Heap full? " + intHeap.is_full());
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
