// Samuel Subra

import java.util.Scanner;

public class MyTestBST
{
    public static void main(String[] args)
    {
        // SET UP
        boolean userEntered = false;
        int intData = 0;
        int option = 0;
        int userChoice = 0;
        String stringData = "";
        Scanner s1 = new Scanner(System.in);
        BST<Integer> myIntegerTree = new BST<Integer>();
        BST<String> myStringTree = new BST<String>();

        // MAIN MENU LOOP
        do
        {
            System.out.println();
            System.out.println("----------------MAIN MENU---------------");
            System.out.println("0.  Enter Tree Data Type (integer or string)");
            System.out.println("1.  Insert Data Element");
            System.out.println("2.  Delete Data Element");
            System.out.println("3.  Search for Data Element");
            System.out.println("4.  Print Tree Size");
            System.out.println("5.  Path from Root to Data Element");
            System.out.println("6.  Check if Empty Tree");
            System.out.println("7.  Print Preorder Traversal");
            System.out.println("8.  Print Inorder Traversal");
            System.out.println("9.  Print Postorder Traversal");
            System.out.println("10. Exit program");
            System.out.println();
            System.out.print("Enter option number: ");
            option = s1.nextInt();
            s1.nextLine();

            // MAIN MENU SWITCH
            switch (option)
            {
                // 0 ENTER DATA TYPE
                case 0:
                    System.out.println("Please enter data type (1 for integer or 2 for string)");
                    try
                    {
                        userChoice = s1.nextInt();
                        s1.nextLine();
                        if (userChoice == 1) // Integer
                        {
                            myIntegerTree = new BST<Integer>();
                        }
                        if (userChoice == 2) // String
                        {
                            myStringTree = new BST<String>();
                        }
                        userEntered = true;
                    }
                    catch (Exception e)
                    {
                        System.out.println("Please enter an integer.");
                        s1.nextLine();
                    }
                    break;

                // 1 INSERT DATA ELEMENT
                case 1:
                    if (!userEntered)
                    {
                        System.out.println("Please select Option 0 first");
                        break;
                    }
                    System.out.print("Enter data element to insert: ");
                    if (userChoice == 1) // Integer
                    {
                        try
                        {
                            intData = s1.nextInt();
                            s1.nextLine();
                            System.out.print("BST before inserting " + intData + " (Inorder):  ");
                            myIntegerTree.inorder();
                            System.out.println();

                            myIntegerTree.insert(intData);

                            System.out.print("BST after inserting " + intData + " (Inorder):   ");
                            myIntegerTree.inorder();
                            System.out.println();
                        }
                        catch (Exception e)
                        {
                            System.out.println("Please enter an integer.");
                            s1.nextLine();
                        }
                    }
                    if (userChoice == 2) // String
                    {
                        try
                        {
                            stringData = s1.nextLine();
                            System.out.print("BST before inserting " + stringData + " (Inorder):  ");
                            myStringTree.inorder();
                            System.out.println();

                            myStringTree.insert(stringData);

                            System.out.print("BST after inserting " + stringData + " (Inorder):   ");
                            myStringTree.inorder();
                            System.out.println();
                        }
                        catch (Exception e)
                        {
                            System.out.println("Please enter a string.");
                            s1.nextLine();
                        }
                    }
                    break;

                // 2 DELETE DATA ELEMENT
                case 2:
                    if (!userEntered)
                    {
                        System.out.println("Please select Option 0 first");
                        break;
                    }
                    System.out.print("Enter data element to be deleted: ");
                    if (userChoice == 1) // Integer
                    {
                        try
                        {
                            intData = s1.nextInt();
                            s1.nextLine();
                            System.out.print("BST before deleting " + intData + " (Inorder):  ");
                            myIntegerTree.inorder();
                            System.out.println();

                            myIntegerTree.delete(intData);

                            System.out.print("BST after deleting " + intData + " (Inorder):   ");
                            myIntegerTree.inorder();
                            System.out.println();
                        }
                        catch (Exception e)
                        {
                            System.out.println("Please enter an integer.");
                            s1.nextLine();
                        }
                    }
                    if (userChoice == 2) // String
                    {
                        try
                        {
                            stringData = s1.nextLine();
                            System.out.print("BST before deleting " + stringData + " (Inorder):  ");
                            myStringTree.inorder();
                            System.out.println();

                            myStringTree.delete(stringData);

                            System.out.print("BST after deleting " + stringData + " (Inorder):   ");
                            myStringTree.inorder();
                            System.out.println();
                        }
                        catch (Exception e)
                        {
                            System.out.println("Please enter a string.");
                            s1.nextLine();
                        }
                    }
                    break;

                // 3 SEARCH FOR DATA ELEMENT
                case 3:
                    if (!userEntered)
                    {
                        System.out.println("Please select Option 0 first");
                        break;
                    }
                    if (userChoice == 1) // Integer
                    {
                        System.out.print("Enter data element to search for: ");
                        try
                        {
                            intData = s1.nextInt();
                            s1.nextLine();
                            if (myIntegerTree.search(intData))
                            {
                                System.out.println("Search for " + intData + "? True");
                            }
                            else
                            {
                                System.out.println("Search for " + intData + "? False");
                            }
                        }
                        catch (Exception e)
                        {
                            System.out.println("Please enter an integer.");
                            s1.nextLine();
                        }
                    }
                    if (userChoice == 2) // String
                    {
                        System.out.print("Enter data to search for: ");
                        try
                        {
                            stringData = s1.nextLine();
                            if (myStringTree.search(stringData))
                            {
                                System.out.println("Search for " + stringData + "? True");
                            }
                            else
                            {
                                System.out.println("Search for " + stringData + "? False");
                            }
                        }
                        catch (Exception e)
                        {
                            System.out.println("Please enter a string.");
                            s1.nextLine();
                        }
                    }
                    break;

                // 4 SIZE
                case 4:
                    if (!userEntered)
                    {
                        System.out.println("Please select Option 0 first");
                        break;
                    }
                    if (userChoice == 1) // Integer
                    {
                        System.out.print("Tree size: " + myIntegerTree.getSize());
                        System.out.println();
                    }
                    if (userChoice == 2) // String
                    {
                        System.out.print("Tree size: " + myStringTree.getSize());
                        System.out.println();
                    }
                    break;

                // 5 PATH FROM ROOT
                case 5:
                    if (!userEntered)
                    {
                        System.out.println("Please select Option 0 first");
                        break;
                    }
                    if (userChoice == 1) // Integer
                    {
                        System.out.print("Enter data element to find path to: ");
                        try
                        {
                            intData = s1.nextInt();
                            s1.nextLine();
                            java.util.ArrayList<BST.TreeNode<Integer>> path = myIntegerTree.path(intData);
                            System.out.print("Path from root to " + intData + ": ");
                            for (int i = 0; path != null && i < path.size(); i++)
                            {
                                System.out.print(path.get(i).element + " ");
                            }
                            System.out.println();
                        }
                        catch (Exception e)
                        {
                            System.out.println("Please enter an integer.");
                            s1.nextLine();
                        }
                    }
                    if (userChoice == 2) // String
                    {
                        System.out.print("Enter data element to find path to: ");
                        try
                        {
                            stringData = s1.nextLine();
                            java.util.ArrayList<BST.TreeNode<String>> path = myStringTree.path(stringData);
                            System.out.print("Path from root to " + stringData + ": ");
                            for (int i = 0; path != null && i < path.size(); i++)
                            {
                                System.out.print(path.get(i).element + " ");
                            }
                            System.out.println();
                        }
                        catch (Exception e)
                        {
                            System.out.println("Please enter a string.");
                            s1.nextLine();
                        }
                    }
                    break;

                // 6 IS EMPTY?
                case 6:
                    if (!userEntered)
                    {
                        System.out.println("Please select Option 0 first");
                        break;
                    }
                    if (userChoice == 1) // Integer
                    {
                        if (myIntegerTree.getSize() == 0)
                        {
                            System.out.println("Is empty tree? " + "True");
                        }
                        else
                        {
                            System.out.println("Is empty tree? " + "False");
                        }
                    }
                    if (userChoice == 2) // String
                    {
                        if (myStringTree.getSize() == 0)
                        {
                            System.out.println("Is empty tree? " + "True");
                        }
                        else
                        {
                            System.out.println("Is empty tree? " + "False");
                        }
                    }
                    break;

                // 7 PRINT PREORDER
                case 7:
                    if (!userEntered)
                    {
                        System.out.println("Please select Option 0 first");
                        break;
                    }
                    if (userChoice == 1) // Integer
                    {
                        System.out.print("Preorder: ");
                        myIntegerTree.preorder();
                        System.out.println();
                    }
                    if (userChoice == 2) // String
                    {
                        System.out.print("Preorder: ");
                        myStringTree.preorder();
                        System.out.println();
                    }
                    break;

                // 8 PRINT INORDER
                case 8:
                    if (!userEntered)
                    {
                        System.out.println("Please select Option 0 first");
                        break;
                    }
                    if (userChoice == 1) // Integer
                    {
                        System.out.print("Inorder: ");
                        myIntegerTree.inorder();
                        System.out.println();
                    }
                    if (userChoice == 2) // String
                    {
                        System.out.print("Inorder: ");
                        myStringTree.inorder();
                        System.out.println();
                    }
                    break;

                // 9 PRINT POSTORDER
                case 9:
                    if (!userEntered)
                    {
                        System.out.println("Please select Option 0 first");
                        break;
                    }
                    if (userChoice == 1) // Integer
                    {
                        System.out.print("Postorder: ");
                        myIntegerTree.postorder();
                        System.out.println();
                    }
                    if (userChoice == 2) // String
                    {
                        System.out.print("Postorder: ");
                        myStringTree.postorder();
                        System.out.println();
                    }
                    break;

                // 10 EXIT
                case 10:
                    break;

                // EXCEPTIONS
                default:
                    System.out.println();
                    System.out.println("Invalid option, try again");
                    break;
            }
        } while (option != 10);
    }
}
