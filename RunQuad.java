/*
Cubia, Richard L.
BSIT-307

This is the part 1 of the activity
*/
import java.util.Scanner;

class Quadrilateral {
    public void showDescription() {
        System.out.println("- is quadrilateral");
    }
}

class Rectangle extends Quadrilateral {
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 right angles");
    }
}

class Square extends Rectangle {
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 equal sides");
    }
}

public class RunQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Press R for Rectangle or S for Square: ");
        char choice = scanner.next().charAt(0);

        if (choice == 'R') {
            Rectangle rectangle = new Rectangle();
            System.out.println("A rectangle:");
            rectangle.showDescription();
        } else if (choice == 'S') {
            Square square = new Square();
            System.out.println("A square:");
            square.showDescription();
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
