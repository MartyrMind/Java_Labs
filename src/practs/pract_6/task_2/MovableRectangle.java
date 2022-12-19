package practs.pract_6.task_2;

public class MovableRectangle implements Movable{

    MovablePoint topLeft;
    MovablePoint topRight;

    public MovableRectangle(MovablePoint topLeft, MovablePoint topRight) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        if (topLeft.getxSpeed() != topRight.getxSpeed() || topLeft.getySpeed() != topRight.getySpeed()) {
            System.out.println("У точек разные скорости. Прямоугольник останется неподвижным");
        }
        topLeft.setSpeeds(0, 0);
        topRight.setSpeeds(0, 0);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        topRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        topRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        topRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        topRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", topRight=" + topRight +
                '}';
    }
}
