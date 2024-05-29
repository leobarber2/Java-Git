// Demo for program.
import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Color color = null;

        System.out.println("Which color is better, red or blue? Enter 1 for red, or 2 for blue");
        int option = keyboard.nextInt();

        if (option == 1)
        {
            color = new Red();
        }
        else if (option == 2)
        {
            color = new Blue();
        }
        else
        {
            System.out.println("Invalid input, please enter 1 for Red or 2 for Blue.");
            option = keyboard.nextInt();
        }

        System.out.println(color.description());
        keyboard.close();
    }
}