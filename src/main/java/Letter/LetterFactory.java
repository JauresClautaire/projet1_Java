package Letter;

import Point.Point2d;
import Shape.*;
import com.sun.jna.WString;


public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /**
     * TODO
     * Create the letter A graphically
     *
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A() {
        BaseShape A = new BaseShape();
        BaseShape verticalLeftBar = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape verticalRightBar =  new Rectangle(halfStripeThickness, maxHeight);
        verticalLeftBar.rotate(verticalLeftBar.getCoords(),Math.toRadians(10));
        verticalRightBar.translate(verticalRightBar.getCoords(),new Point2d(halfMaxWidth,3.0));
        verticalRightBar.rotate(verticalRightBar.getCoords(),Math.toRadians(350));
        BaseShape horizontalBar = new Rectangle(halfStripeThickness, halfMaxWidth);
        horizontalBar.rotate(horizontalBar.getCoords(), Math.toRadians(90));
        horizontalBar.translate(horizontalBar.getCoords(), new Point2d(halfMaxWidth/2,halfMaxHeight/4));
        A.add(verticalLeftBar);
        A.add(verticalRightBar);
        A.add(horizontalBar);
        return A;
    }


    /**
     * TODO
     * Create the letter B graphically
     *
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape b = new BaseShape();
        Circle circle1 = new Circle(halfMaxHeight);
        Circle internalCircle = new Circle(halfMaxHeight / 1.25);
        circle1.remove(internalCircle);
        circle1.translate(circle1.getCoords(), new Point2d(halfMaxWidth, halfMaxHeight / 2.0));
        Circle circle2 = new Circle(halfMaxHeight);
        circle2.remove(internalCircle);
        circle2.translate(circle2.getCoords(), new Point2d(halfMaxWidth, - halfMaxHeight / 2.0));
        Rectangle verticalBar = new Rectangle(stripeThickness, maxHeight);
        b.add(verticalBar);
        b.add(circle1);
        b.add(circle2);
        return b;
    }
    /**
     * TODO
     * Create the letter C graphically
     *
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape c = new BaseShape();
        Ellipse externalEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse internalEllipse = new Ellipse(halfMaxWidth * 1.5, halfMaxHeight * 1.5);
        externalEllipse.remove(internalEllipse);
        Rectangle vertical = new Rectangle(stripeThickness, halfMaxHeight);
        vertical.translate(vertical.getCoords(), new Point2d(25.0, 0.0));
        externalEllipse.remove(vertical);
        c.add(externalEllipse);
        return c;
    }

    /**
     * TODO
     * Create the letter E graphically
     *
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape e = new BaseShape();
        Rectangle horizontal1 = new Rectangle(maxWidth, halfStripeThickness);
        Rectangle horizontal2 = new Rectangle(maxWidth, halfStripeThickness);
        Rectangle horizontal3 = new Rectangle(maxWidth, halfStripeThickness);
        Rectangle vertical = new Rectangle(halfStripeThickness, maxHeight);
        horizontal2.translate(horizontal2.getCoords(), new Point2d(0.0, halfMaxHeight - 5.0));
        horizontal3.translate(horizontal3.getCoords(), new Point2d(0.0, -halfMaxHeight + 4.5));
        vertical.translate(vertical.getCoords(), new Point2d(-halfMaxWidth, 0.0));
        e.add(horizontal1);
        e.add(horizontal2);
        e.add(horizontal3);
        e.add(vertical);
        return e;
    }
    /**
     * TODO
     * Create the letter H graphically
     *
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape h = new BaseShape();
        Rectangle vertical1 = new Rectangle(stripeThickness, maxHeight);
        Rectangle vertical2 = new Rectangle(stripeThickness, maxHeight);
        Rectangle horizontal = new Rectangle(maxWidth, stripeThickness);
        vertical2.translate(vertical2.getCoords(), new Point2d(maxWidth, 0.0));
        horizontal.translate(horizontal.getCoords(), new Point2d(halfMaxWidth, 0.0));
        h.add(vertical1);
        h.add(vertical2);
        h.add(horizontal);
        return h;
    }

    /**
     * TODO
     * Create the letter N graphically
     *
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape letterN = new BaseShape();
        BaseShape firstVerticalBar = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape secondVerticalBar = new Rectangle(halfStripeThickness, maxHeight);
        BaseShape thirdVerticalBar = new Rectangle(halfStripeThickness, maxHeight);
        secondVerticalBar.translate(secondVerticalBar.getCoords(), new Point2d(halfMaxWidth-6, 0.0));
        secondVerticalBar.rotate(secondVerticalBar.getCoords(), Math.toRadians(342));
        thirdVerticalBar.translate(thirdVerticalBar.getCoords(), new Point2d(halfMaxWidth*2 -13,0.0));
        letterN.add(firstVerticalBar);
        letterN.add(secondVerticalBar);
        letterN.add(thirdVerticalBar);
        return letterN;
    }

    /**
     * TODO
     * Create the letter O graphically
     *
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape o = new BaseShape();
        Ellipse externalEllipse = new Ellipse(maxWidth, maxHeight);
        Ellipse internalEllipse = new Ellipse(halfMaxWidth * 1.5, halfMaxHeight * 1.5);
        externalEllipse.remove(internalEllipse);
        o.add(externalEllipse);
        return o;
    }
}