import java.awt.Color;
import java.awt.Point;

/**
 * 
 */

/**
 * @author adammccarthy
 *
 */
public abstract class Shape implements Drawable
{
    /**
     * Color of the shape
     */
    public Color color;
    
    /**
     * value indicating if shape should be filled
     */
    public boolean filled;
    
    /**
     * array that stores location coordinates
     */
    protected Point[] location;
    
    /**
     * constructor for shape
     * @param color color of the shape
     * @param filled boolean statement on whether or not the shape will be filled in
     */
    public Shape(Color color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }
    
    /**
     * get statement for the color
     * @return color of the shape
     */
    public Color getColor()
    {
       return this.color; 
    }
    
    /**
     * checks to see if the shape is filled with color
     * @return true if the shape is filled, false otherwise
     */
    public boolean isFilled()
    {
        if(filled == true)
        {
            return true;
        }
        
        else
        {
            return false;
        }
    }
    
    /**
     * get statement for the location of the shape
     * @return an array containing the shapes location
     */
    public Point[] getLocation()
    {
        return location;
    }

}
