package Letter;

import Point.Point2d;
import Point.PointOperator;
import Shape.*;

import java.util.Collections;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        return null;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape b = new BaseShape();
        Rectangle vertical = new Rectangle(stripeThickness, maxHeight);
        Circle circle1 = new Circle(halfMaxWidth);
        Circle circle2 = new Circle(halfMaxWidth);
        Circle internalCircle = new Circle(halfMaxWidth - 25.0);
        circle1.remove(internalCircle);
        circle2.remove(internalCircle);
        vertical.translate(vertical.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        circle1.translate(circle1.getCoords(), new Point2d(0.0, halfMaxHeight));
        circle2.translate(circle2.getCoords(), new Point2d(0.0, -halfMaxHeight));
        b.add(vertical);
        b.add(circle1);
        b.add(circle2);
        return b;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape c = new BaseShape();
        Ellipse externalEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse internalEllipse = new Ellipse(halfMaxWidth, halfMaxHeight);
        externalEllipse.remove(internalEllipse);
        Rectangle vertical = new Rectangle(stripeThickness, maxHeight);
        vertical.translate(vertical.getCoords(), new Point2d(halfMaxWidth, 0.0));
        externalEllipse.remove(vertical);
        c.add(externalEllipse);
        return c;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape e = new BaseShape();
        Rectangle horizontal1 = new Rectangle(maxWidth, stripeThickness);
        Rectangle horizontal2 = new Rectangle(maxWidth, stripeThickness);
        Rectangle horizontal3 = new Rectangle(maxWidth, stripeThickness);
        Rectangle vertical = new Rectangle(stripeThickness, maxHeight);
        horizontal2.translate(horizontal2.getCoords(), new Point2d(0.0, halfMaxHeight));
        horizontal3.translate(horizontal3.getCoords(), new Point2d(0.0, -halfMaxHeight));
        vertical.translate(vertical.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        e.add(horizontal1);
        e.add(horizontal2);
        e.add(horizontal3);
        e.add(vertical);
        return e;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape h = new BaseShape();
        Rectangle vertical1 = new Rectangle(stripeThickness, maxHeight);
        Rectangle vertical2 = new Rectangle(stripeThickness, maxHeight);
        Rectangle horizontal = new Rectangle(maxWidth, stripeThickness);
        vertical2.translate(vertical2.getCoords(), new Point2d(maxWidth, 0.0));
        h.add(vertical1);
        h.add(vertical2);
        h.add(horizontal);
        return h;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        return null;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape o = new BaseShape();
        Ellipse externalEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse internalEllipse = new Ellipse(halfMaxWidth, halfMaxHeight);
        externalEllipse.remove(internalEllipse);
        o.add(externalEllipse);
        return o;
    }

}
