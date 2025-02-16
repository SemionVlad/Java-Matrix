/**
 * The Matrix class represents a two-dimensional image in black and white.
 * It manages a 2D array of integers in the range 0-255, where each value
 * represents a shade of gray (0 being white and 255 being black).
 * 
 * The class provides functionality for:
 * - Image creation and manipulation
 * - Vertical and horizontal flipping
 * - Clockwise and counter-clockwise rotation
 * - String representation of the image
 *
 * @author Shimon Esterkin (207972258)
 * @version Maman14.2023b
 */
public class Matrix {
    
    // ------------------ Constants ------------------
    private static final int WHITE = 0;
    private static final int BLACK = 255;
    
    // ------------------ Instance Variables ------------------
    private int[][] _mat;
    
    // ------------------ Constructors ------------------
    /**
     * Constructs a matrix from a two-dimensional array.
     * Creates a deep copy of the input array, preserving the dimensions
     * and values of the original array.
     *
     * @param array the source two-dimensional array to copy
     */
    public Matrix(int[][] array) {
        _mat = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                _mat[i][j] = array[i][j];
            }
        }
    }
    
    /**
     * Constructs an empty matrix with specified dimensions.
     * All values are initialized to 0 (white).
     *
     * @param rows number of rows in the matrix
     * @param cols number of columns in the matrix
     */
    public Matrix(int rows, int cols) {
        _mat = new int[rows][cols];
        // No need to initialize elements as they default to 0
    }
    
    // ------------------ Image Operations ------------------
    /**
     * Creates a vertically flipped copy of the matrix.
     * First column becomes last, second becomes second-last, etc.
     *
     * @return new Matrix object with flipped image
     */
    public Matrix flipVertically() {
        int[][] flippedMat = new int[_mat.length][_mat[0].length];
        for (int i = 0; i < _mat.length; i++) {
            for (int j = 0; j < _mat[0].length; j++) {
                flippedMat[i][_mat[0].length - 1 - j] = _mat[i][j];
            }
        }
        return new Matrix(flippedMat);
    }
    
    /**
     * Creates a horizontally flipped copy of the matrix.
     * First row becomes last, second becomes second-last, etc.
     *
     * @return new Matrix object with flipped image
     */
    public Matrix flipHorizontally() {
        int[][] flippedMat = new int[_mat.length][_mat[0].length];
        for (int i = 0; i < _mat.length; i++) {
            for (int j = 0; j < _mat[0].length; j++) {
                flippedMat[_mat.length - 1 - i][j] = _mat[i][j];
            }
        }
        return new Matrix(flippedMat);
    }
    
    /**
     * Creates a clockwise rotated (90 degrees) copy of the matrix.
     * Dimensions are swapped in the resulting matrix.
     *
     * @return new Matrix object with rotated image
     */
    public Matrix rotateClockwise() {
        int[][] rotatedMat = new int[_mat[0].length][_mat.length];
        for (int i = 0; i < _mat.length; i++) {
            for (int j = 0; j < _mat[0].length; j++) {
                rotatedMat[j][_mat.length - 1 - i] = _mat[i][j];
            }
        }
        return new Matrix(rotatedMat);
    }
    
    /**
     * Creates a counter-clockwise rotated (90 degrees) copy of the matrix.
     * Dimensions are swapped in the resulting matrix.
     *
     * @return new Matrix object with rotated image
     */
    public Matrix rotateCounterClockwise() {
        int[][] rotatedMat = new int[_mat[0].length][_mat.length];
        for (int i = 0; i < _mat.length; i++) {
            for (int j = 0; j < _mat[0].length; j++) {
                rotatedMat[_mat[0].length - 1 - j][i] = _mat[i][j];
            }
        }
        return new Matrix(rotatedMat);
    }
    
    // ------------------ Utility Methods ------------------
    /**
     * Returns a string representation of the matrix.
     * Elements are tab-separated and rows end with newlines.
     *
     * @return formatted string representation of the matrix
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(_mat.length * _mat[0].length * 4);
        
        for (int i = 0; i < _mat.length; i++) {
            for (int j = 0; j < _mat[0].length; j++) {
                sb.append(_mat[i][j]);
                if (j < _mat[0].length - 1) {
                    sb.append('\t');
                }
            }
            sb.append('\n');
        }
        
        return sb.toString();
    }
}