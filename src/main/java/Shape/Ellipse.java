package Shape;

import Point.Point2d;

import java.util.ArrayList;
import java.util.Collection;

public class Ellipse extends BaseShape {
    /**
     * TODO
     * Create a filled Ellipse that is centered on (0, 0)
     *
     * @param widthDiameter  Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */

    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super(generateEllipsePoints(widthDiameter, heightDiameter, 0));
    }

    /**
     * TODO
     * Create a filled Ellipse that is centered on (0,0)
     *
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     *
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /**
     * TODO
     *
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return (Ellipse) super.clone();
    }

    public static Collection<Point2d> generateEllipsePoints(double widthDiameter, double heightDiameter, int numberOfPoints) {
        Collection<Point2d> coords = new ArrayList<>();
        if (numberOfPoints < 4) {
            numberOfPoints = 4;
            for (int i = 0; i < numberOfPoints; i++) {
                coords.add(new Point2d(-widthDiameter / 2.0, 0.0));
                coords.add(new Point2d(widthDiameter / 2.0, 0.0));
                coords.add(new Point2d(0.0, -heightDiameter / 2.0));
                coords.add(new Point2d(0.0, heightDiameter / 2.0));
            }
        }
        return coords;
    }
}