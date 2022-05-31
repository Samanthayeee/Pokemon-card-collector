import ecs100.*;
/**
 * Write a description of class GUI here.
 *
 * Samantha yee
 * 02/05/22
 */
public class GUI
{
    // instance variables
    private Cards cards;        // declare books instance
    private Card card;          // declare book instance

    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // initialise instance variables
        cards = new Cards();       // instantiate the card object
        UI.initialise();
        UI.addButton("Print All", cards::printAll);
        UI.addButton("Add", this::addCard);
        UI.addButton("Find", this::findCard);
        UI.addButton("Hide", this::hideCard);
        UI.addButton("Quit", UI::quit);
        //setup mouse 
        UI.setMouseListener (this::doMouse);
    }

    /**
     * Add a card to collection
     */
    public void addCard()
    {
        final int MAX_QUANTITY = 9999999;
        final int INCREMENT = 1;
        int value;
        
        // Ask the user for details
        String name = UI.askString("Card Name: ");
 
        // Check boundaries for the number of booksl added
        do {
            value = UI.askInt("Monetary value: ");
            if ((value > 0) && (value <= MAX_QUANTITY)) {
                UI.println("Added");
            } else if (value > MAX_QUANTITY) {
                UI.println("Must be less than 100");
            } else if (value < 1) {
                UI.println("Must be greater than 0");
            } else {
                UI.println("Must be a number!");
            }
            } while (0 >= value || value > MAX_QUANTITY);
            
            // add a book image for display in the GUI
            String imgFileName = UIFileChooser.open("Choose Image File: ");
            
            // Increment the book ID count and add to hashmap
            cards.setCardId();  // increment the id by 1
            cards.addCard(name, value,imgFileName);
        }
    /**
     * Finds book based on name
     * Prints out the author and qty if found
     */
    public void findCard(){
        String cardName = UI.askString("Name of card: ");
        if (cards.findCard(cardName.toLowerCase())) {
            UI.println("Found Book!");
            card = cards.getCard();
            UI.println("Monetary Value: " + card.getValue());
        } else {
            UI.println("That card does not exist!");
            findCard();
        }
    }
        /**
     * clears all information currently displayed
     */
    public void hideCard(){
        UI.clearText();
        UI.clearGraphics();
    }
    
    /**
     * select object based on where the user clicks
     */
    private void doMouse(String action, double x, double y){
        if (action.equals ("clicked")) {
            // if check the loc of the x and y against loc of obj
            card.erase();
        }
    }
}
