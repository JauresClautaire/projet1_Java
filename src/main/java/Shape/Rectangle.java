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
        super();
        double spaceBetweenPoints = 0.5;
        double halfWidth = width/2;
        double halfheight = height/2;
        for(double startX = -halfWidth; startX <= halfWidth; startX += spaceBetweenPoints){
            for(double startY = -halfheight; startY <= halfheight; startY += spaceBetweenPoints)
                add(new Point2d(startX,startY));}
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
        return new Rectangle(getCoords());

    }

}
