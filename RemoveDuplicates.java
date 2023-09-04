// Samuel Subra

import java.util.Scanner;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        // SET UP
        int option = 0;
        String stringData = "";
        Scanner s1 = new Scanner(System.in);
        BST<String> myStringTree = new BST<String>();

        // MAIN MENU LOOP
        do
        {
            System.out.println();
            System.out.println("-----------------MAIN MENU---------------");
            System.out.println("1. Read input string");
            System.out.println("2. Remove duplicates and display outputs");
            System.out.println("3. Exit program");
            System.out.println();
            System.out.print("Enter option number: ");
            option = s1.nextInt();
            s1.nextLine();

            // MAIN MENU SWITCH
            switch (option)
            {
                // 1 READ INPUT STRING
                case 1:
                    System.out.print("Enter input string: ");
                    stringData = s1.nextLine();
                    break;

                // 2 REMOVE DUPLICATES AND DISPLAY OUTPUTS
                case 2:
                    System.out.println();
                    String[] myStringArray = stringData.split(" ");
                    for (String s : myStringArray)
                    {
                        myStringTree.insert(s);
                    }
                    System.out.println("Original Text:");
                    System.out.println(stringData);
                    System.out.println();
                    System.out.println("Processed Text:");
                    myStringTree.inorder();
                    System.out.println();
                    break;

                // 3 EXIT
                case 3:
                    break;

                // EXCEPTIONS
                default:
                    System.out.println();
                    System.out.println("Invalid option, try again");
                    break;
            }
        } while (option != 3);
    }
}
