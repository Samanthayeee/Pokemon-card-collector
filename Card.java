import ecs100.*;
/**
 * Supporter class of Cards
 * A pokemon card list which contain the name, value and image 
 *
 * @author Samantha yee
 * @version 1; 18/05/2022
 */
public class Card
{
    // fields
    private int id;
    private String name;
    private int value; 
    private String image; 
    static final String DEFAULT_IMAGE = "Default.jpeg";
    
    private double imageX = 20;   // x pos of image 
    private double imageY = 200;   // y pos of image 
    private int imageSize = 200; //size of image 
    private int imageHeight = 200; //height of image 
    
    private double left;
    private double top;
    private double bottom;
    /**
     * Constructor for objects of class card
     */
    public Card(int key, String nm, int val, String img )
    {
        id = key;
        name = nm;
        value = val;
        if (img == null) {
            this.image = DEFAULT_IMAGE;     // add default img if user clicks cancel
        } else {
            this.image = img;
        }
        
    }
    
    /**
     * Constructor overloading
     * Set default image to obj
     */ 
    public Card  (int key,String nm, int val)
    {
          this(key, nm, val, DEFAULT_IMAGE);
    }
    
    /**
     * Display image on GUI
     */
    public void displayCard() {
        int locX = 100;
        int locY = 100;
        final double WIDTH = 300;
        final double HEIGHT = 300;
        
        UI.drawImage(this.image, locX, locY, WIDTH, HEIGHT);
    }
    
    /**
     * Getter for id
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Getter for name
     */
    public String getName() {
        return this.name;
    }
    
    /**
    * Getter for value
    */
    public int getValue() {
        return this.value;
    }
    
        
    /** 
     * erase a rectangle around the current object
     */
    public void erase(){
        UI.clearText();
        UI.clearGraphics();    
    }
}
