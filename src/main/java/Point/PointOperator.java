package Point;

import java.util.*;

public final class PointOperator {

    /** TODO
     * Translates a vector of size N by another vector of size N
     * Similar to adding two vector of size N together
     * @param vector Vector to translate
     * @param translateVector Translation to apply
     */
    public static void translate(Double[] vector, Double[] translateVector) {
        for(int i = 0; i < vector.length; i++ )
            vector[i] += translateVector[i];
    }

    /** TODO
     * Rotates a vector of size N by a matrix of size N x N
     * Similar to a matrix vector multiplication
     * @param vector Vector to rotate
     * @param rotationMatrix Matrix by which to rotate
     */
    public static void rotate(Double[] vector, Double[][] rotationMatrix) {
        Double[] tab = new Double[vector.length];

        for(int i = 0; i < rotationMatrix.length; i++)
        {
            tab[i] = 0.0;
            for(int j =  0; j < vector.length; j++)
            {
                tab[i] +=  rotationMatrix[i][j] * vector[j];
            }
        }

        for(int i = 0; i < vector.length; i++)
            vector[i] = tab[i];
    }

    /** TODO
     * Divide a vector of size N by a scalar
     * @param vector Vector to divide
     * @param divider Scalar by which to divide
     */
    public static void divide(Double[] vector, Double divider) {
        if(divider == 0.0){
            System.out.println("divide by zero");
        }else{
            for(int i = 0; i < vector.length; i++)
                vector[i] /= divider;
        }
    }

    /** TODO
     * Multiply a vector of size N by a scalar
     * @param vector Vector to multiply
     * @param multiplier Scalar by which to multiply
     */
    public static void multiply(Double[] vector, Double multiplier) {
        for(int i = 0; i < vector.length; i++)
            vector[i] *= multiplier;
    }

    /** TODO
     * Add a scalar to a vector of size N
     * @param vector Vector that we have to add to
     * @param adder Scalar to add to vector
     */
    public static void add(Double[] vector, Double adder) {
        for(int i = 0; i < vector.length; i++)
            vector[i] += adder;
    }
}
