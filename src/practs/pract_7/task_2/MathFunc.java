package practs.pract_7.task_2;

import static java.lang.Math.max;
import static java.lang.Math.sqrt;

public class MathFunc implements MathCalculable{
    @Override
    public ComplexNumber pow(ComplexNumber number, int n) {
        //z = z1*z2 = (x1*x2 - y1*y2) + i*(x1*y2 + x2*y1)
        ComplexNumber out = new ComplexNumber(number.getX(), number.getY());
        for (int i = 1; i < n; i++) {
            out = new ComplexNumber(out.getX()*number.getX() - out.getY()*number.getY(),
                    out.getX()*number.getY() + out.getY()*number.getX());
        }
        return out;
    }

    @Override
    public double abs(ComplexNumber number) {
        return sqrt(Math.pow(number.getX(), 2) + Math.pow(number.getY(), 2));
    }

    double circleLength(double radius) {
        return 2 * PI * radius;
    }

    double circleArea(double radius) {
        return PI * radius * radius;
    }
}
