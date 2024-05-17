package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Rectangle extends BaseShape {
    /**
     * TODO
     * Create a filled rectangle centered on (0, 0)
     *
     * @param width  Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        super(generateRectanglePoints(width, height, 0));
    }

    /**
     * TODO
     * Create a filled rectangle centered on (0, 0)
     *
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create a rectangle from a given collection of Points
     *
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super(coords);
    }

    /**
     * TODO
     *
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {
        return (Rectangle) super.clone();
    }

    public static Collection<Point2d> generateRectanglePoints(double width, double height, int numberOfPoints) {
        Collection<Point2d> coords = new ArrayList<>();
        if (numberOfPoints < 25) {
            numberOfPoints = 25;
            for (int i = 0; i < numberOfPoints; i++) {
                coords.add(new Point2d(-width / 2.0, -height / 2.0));
                coords.add(new Point2d(width / 2.0, -height / 2.0));
                coords.add(new Point2d(width / 2.0, height / 2.0));
                coords.add(new Point2d(-width / 2.0, height / 2.0));
            }
        }
        return coords;
    }
}
