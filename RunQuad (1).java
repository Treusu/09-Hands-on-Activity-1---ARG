import java.util.Scanner;

class Quadrilateral {
    public void showDescription() {
        System.out.println("- is quadrilateral");
    }
}

class Parallelogram extends Quadrilateral {
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 2 pairs of parallel sides");
    }
}

class Rectangle extends Parallelogram {
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

class Rhombus extends Parallelogram {
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 4 congruent sides");
    }
}

class Trapezoid extends Quadrilateral {
    public void showDescription() {
        super.showDescription();
        System.out.println("- has 1 pair of parallel sides");
    }
}

public class RunQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select from the following:");
        System.out.println("R - Rectangle");
        System.out.println("S - Square");
        System.out.println("P - Parallelogram");
        System.out.println("H - Rhombus");
        System.out.println("T - Trapezoid");

        System.out.print("Enter your choice: ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'R':
                Rectangle rectangle = new Rectangle();
                System.out.println("\nA rectangle:");
                rectangle.showDescription();
                break;
            case 'S':
                Square square = new Square();
                System.out.println("\nA square:");
                square.showDescription();
                break;
            case 'P':
                Parallelogram parallelogram = new Parallelogram();
                System.out.println("\nA parallelogram:");
                parallelogram.showDescription();
                break;
            case 'H':
                Rhombus rhombus = new Rhombus();
                System.out.println("\nA rhombus:");
                rhombus.showDescription();
                break;
            case 'T':
                Trapezoid trapezoid = new Trapezoid();
                System.out.println("\nA trapezoid:");
                trapezoid.showDescription();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}