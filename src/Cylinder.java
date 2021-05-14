import java.util.Scanner;

public class Cylinder {
    double radius;
    double height;
    final double PI = 3.14;

    public Cylinder() {
        this.height = height;
        this.radius = radius;
    }

    public double bottomArea() {
        return PI * (radius * radius);
    }

    public double cylindricalCircumference() {
        return PI * radius;
    }

    public double cylindricalVolume() {
        return PI * (radius * radius) * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.bottomArea());
    }
}
