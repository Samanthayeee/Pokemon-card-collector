import java.util.HashMap;
import ecs100.*;
/**
 * Holds a collection of pokemon cards in a hash map 
 * Allows a user to add, print and find a pokemon card in the
 * lbirary aswell as seeing monetary value 
 * 
 * @author Samantha yee 
 * @version 3
 */
public class Cards
{
    // instance variables
    private HashMap<Integer, Card> library;     // declaring the hashmap
    private int currCardId;         // store the current id of card being added
    private Card currCard;          // Store the instance of the current card
    /**
     * Constructor for objects of class Cards
     */
    public Cards()
    {
        // initialise instance variables
        library = new HashMap<Integer, Card>();     // initialise hashmap
        // Creating card
        Card c1 = new Card(1, "Pikachu", 20, "Pikachu.jpeg");
        Card c2 = new Card(2, "Jiggly puff", 5, "Jigglypuff.jpeg" );
        Card c3 = new Card(3, "Dragonite", 76, "Dragonite.jpeg");

        // Add cards to collection
        library.put(1, c1);
        library.put(2, c2);
        library.put(3, c3);

        this.currCardId = 3;
    }
    /**
     * Set CardId
     */
    public void setCardId() {
        this.currCardId += 1;
    }
    /**
    * Add a card to the map
    * @param nm for cards
    * @param val for cards 
    * @param img for cards
    */
    public void addCard(String nm, int val, String img) {
        library.put(currCardId, new Card(currCardId, nm, val , img));
    }

     /**
     * Finds a pokemon card based on name
     * Sets the current card instance if found
     * @param name for cards
     * @return boolean false if not found
     */
    public boolean findCard(String name) {
        // Search for contact
        for (int cardId : library.keySet()) {
            if (library.get(cardId).getName()
            .toLowerCase().equals(name.toLowerCase())) {
                currCard = library.get(cardId); // set the current card
                library.get(cardId).displayCard();  // Show card cover on Canvas
                return true;
            }
        }
        return false;
    }

    /**
     * Getter for the current card instance
     * @return for curr card
     */
    public Card getCard() {
        return this.currCard;
    }

    /**
     * Print detail of all card
     */
    public void printAll() {
        // Traverse Map
        for (int cardId : library.keySet()) {
            UI.println(cardId + " Details:");
            UI.println(library.get(cardId).getName() + " "
                        + library.get(cardId).getValue());
        }
    }
}

