public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

   public String verify() {
    if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
        return (" Not a triangle! ");
    }

    if (sideA == sideB && sideB == sideC) {
        return (" This is an Equilateral ");
    }

    if (sideA == sideB || sideB == sideC || sideC == sideA) {
        return (" This is an Isosceles ");
    }
        return " Scalene ";
    }

}
   
