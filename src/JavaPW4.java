import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}

class Triangle extends Shape {
    double side1, side2, side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

class Pentagon extends Shape {
    double side;

    Pentagon(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * side * side;
    }

    @Override
    double calculatePerimeter() {
        return 5 * side;
    }
}

class Trapezoid extends Shape {
    double base1, base2, height, side1, side2;

    Trapezoid(double base1, double base2, double height, double side1, double side2) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double calculateArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    double calculatePerimeter() {
        return base1 + base2 + side1 + side2;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Parallelogram extends Shape {
    double base, height, side;

    Parallelogram(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    @Override
    double calculateArea() {
        return base * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (base + side);
    }
}

class Parallelepiped extends Shape {
    double length, width, height;

    Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Cylinder extends Shape {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Sphere extends Shape {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        // Периметр сферы не имеет смысла, поэтому возвращаем ноль
        return 0;
    }
}

class Rhombus extends Shape {
    double side, diagonal1, diagonal2;

    Rhombus(double side, double diagonal1, double diagonal2) {
        this.side = side;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    double calculateArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}

class Cone extends Shape {
    double radius, height, slantHeight;

    Cone(double radius, double height, double slantHeight) {
        this.radius = radius;
        this.height = height;
        this.slantHeight = slantHeight;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double calculatePerimeter() {
        // Периметр конуса не имеет смысла, поэтому возвращаем ноль
        return 0;
    }
}

public class JavaPW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите фигуру:");
        System.out.println("1. Круг");
        System.out.println("2. Квадрат");
        System.out.println("3. Треугольник");
        System.out.println("4. Пятиугольник");
        System.out.println("5. Трапеция");
        System.out.println("6. Прямоугольник");
        System.out.println("7. Параллелограмм");
        System.out.println("8. Параллелепипед");
        System.out.println("9. Цилиндр");
        System.out.println("10. Сфера");
        System.out.println("11. Ромб");
        System.out.println("12. Конус");
        System.out.print("Напишите номер фигуры:");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Введите радиус круга: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Площадь круга: " + circle.calculateArea());
                System.out.println("Периметр круга: " + circle.calculatePerimeter());
                break;
            case 2:
                System.out.print("Введите длину стороны квадрата: ");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                System.out.println("Площадь квадрата: " + square.calculateArea());
                System.out.println("Периметр квадрата: " + square.calculatePerimeter());
                break;
            case 3:
                System.out.print("Введите длины сторон треугольника через пробел: ");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                System.out.println("Площадь треугольника: " + triangle.calculateArea());
                System.out.println("Периметр треугольника: " + triangle.calculatePerimeter());
                break;
            case 4:
                System.out.print("Введите длину стороны пятиугольника: ");
                double sidePentagon = scanner.nextDouble();
                Pentagon pentagon = new Pentagon(sidePentagon);
                System.out.println("Площадь пятиугольника: " + pentagon.calculateArea());
                System.out.println("Периметр пятиугольника: " + pentagon.calculatePerimeter());
                break;
            case 5:
                System.out.print("Введите длины оснований трапеции, высоту и длины боковых сторон через пробел: ");
                double base1 = scanner.nextDouble();
                double base2 = scanner.nextDouble();
                double heightTrap = scanner.nextDouble();
                double side1Trap = scanner.nextDouble();
                double side2Trap = scanner.nextDouble();
                Trapezoid trapezoid = new Trapezoid(base1, base2, heightTrap, side1Trap, side2Trap);
                System.out.println("Площадь трапеции: " + trapezoid.calculateArea());
                System.out.println("Периметр трапеции: " + trapezoid.calculatePerimeter());
                break;
            case 6:
                System.out.print("Введите длину и ширину прямоугольника через пробел: ");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
                System.out.println("Периметр прямоугольника: " + rectangle.calculatePerimeter());
                break;
            case 7:
                System.out.print("Введите длину основания, высоту и длину боковой стороны параллелограмма через пробел: ");
                double basePar = scanner.nextDouble();
                double heightPar = scanner.nextDouble();
                double sidePar = scanner.nextDouble();
                Parallelogram parallelogram = new Parallelogram(basePar, heightPar, sidePar);
                System.out.println("Площадь параллелограмма: " + parallelogram.calculateArea());
                System.out.println("Периметр параллелограмма: " + parallelogram.calculatePerimeter());
                break;
            case 8:
                System.out.print("Введите длину, ширину и высоту параллелепипеда через пробел: ");
                double lengthPara = scanner.nextDouble();
                double widthPara = scanner.nextDouble();
                double heightPara = scanner.nextDouble();
                Parallelepiped parallelepiped = new Parallelepiped(lengthPara, widthPara, heightPara);
                System.out.println("Площадь параллелепипеда: " + parallelepiped.calculateArea());
                System.out.println("Периметр параллелепипеда: " + parallelepiped.calculatePerimeter());
                break;
            case 9:
                System.out.print("Введите радиус и высоту цилиндра через пробел: ");
                double radiusCylinder = scanner.nextDouble();
                double heightCylinder = scanner.nextDouble();
                Cylinder cylinder = new Cylinder(radiusCylinder, heightCylinder);
                System.out.println("Площадь цилиндра: " + cylinder.calculateArea());
                System.out.println("Периметр цилиндра: " + cylinder.calculatePerimeter());
                break;
            case 10:
                System.out.print("Введите радиус сферы: ");
                double radiusSphere = scanner.nextDouble();
                Sphere sphere = new Sphere(radiusSphere);
                System.out.println("Площадь сферы: " + sphere.calculateArea());
                // В данном случае периметр сферы не имеет смысла, так как сфера не имеет границы, поэтому не выводим его
                break;
            case 11:
                System.out.print("Введите длину стороны и длины диагоналей ромба через пробел: ");
                double sideRhombus = scanner.nextDouble();
                double diagonal1Rhombus = scanner.nextDouble();
                double diagonal2Rhombus = scanner.nextDouble();
                Rhombus rhombus = new Rhombus(sideRhombus, diagonal1Rhombus, diagonal2Rhombus);
                System.out.println("Площадь ромба: " + rhombus.calculateArea());
                System.out.println("Периметр ромба: " + rhombus.calculatePerimeter());
                break;
            case 12:
                System.out.print("Введите радиус основания, высоту и длину образующей конуса через пробел: ");
                double radiusCone = scanner.nextDouble();
                double heightCone = scanner.nextDouble();
                double slantHeightCone = scanner.nextDouble();
                Cone cone = new Cone(radiusCone, heightCone, slantHeightCone);
                System.out.println("Площадь конуса: " + cone.calculateArea());
                // В данном случае периметр конуса не имеет смысла, так как конус не имеет границы, поэтому не выводим его
                break;
            default:
                System.out.println("Некорректный выбор");
        }

        scanner.close();
    }
}