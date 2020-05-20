package tudelft.sbst;

public class Triangle {

    private final int a, b, c;

    enum TriangleType {
        EQUILATERAL, ISOSCELES, SCALENE
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public TriangleType classify() {
        if (a == b && b == c)
            return TriangleType.EQUILATERAL;
        else if (a == b || b == c)
            return TriangleType.ISOSCELES;
        else
            return TriangleType.SCALENE;
    }
}
