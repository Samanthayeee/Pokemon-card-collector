import ecs100.*;
/**
 * Supporter class of Cards
 * A pokemon card list which contain the name, value and image 
 *
 * @author Samantha yee
 * @version 2
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
     * @param key for cards
     * @param val for cards
     * @param nm for cards
     * @param img for cards
     */
    public Card(int key, String nm, int val, String img )
    {
        id = key;
        name = nm;
        value = val;
        if (img == null) {
            // add default img if user clicks cancel
            this.image = DEFAULT_IMAGE;     
        } 
        else {
            this.image = img;
        }
        
    }
    
    /**
     * Constructor overloading
     * Set default image to obj
     * @param key for cards
     * @param nm for cards
     * @param val for cards
     */ 
    public Card  (int key, String nm, int val)
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
     * @return id for cards
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * Getter for name
     * @return name for cards
     */
    public String getName() {
        return this.name;
    }
    
    /**
    * Getter for value
    * @return value for cards
    */
    public int getValue() {
        return this.value;
    }
    
        
    /** 
     * erase a rectangle around the current object
     */
    public void erase() {
        UI.clearText();
        UI.clearGraphics();    
    }
}