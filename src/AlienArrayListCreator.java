import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.util.ArrayList;

/**
 * Welcome to the AlienArrayListCreator Class! This is a top-level logic class
 * that creates,
 * organizes and calls methods on all of our Aliens. Its constructor takes in a
 * pane, and
 * the class has three methods - addFiveAliens(), makeAllGreen(), and
 * removeThreeAliens()
 * - that are called when there respective buttons are pressed in the program!
 */
public class AlienArrayListCreator {

    private Pane pane;
    private ArrayList<Alien> aliens = new ArrayList<Alien>(); // here's the declaration of the arraylist variable!

    /**
     * The constructor takes in a pane, assigns it to an instance variable and
     * initializes the aliens arrayList.
     */
    public AlienArrayListCreator(Pane pane) {
        this.pane = pane;

        // TODO initialize the aliens arraylist!
    }

    /**
     * This method adds five Aliens to the screen!
     */
    public void addFiveAliens() {
        for (int i = 0; i < 5; i++) {
            Alien alien = new Alien(pane);
            aliens.add(alien);
        }
        // TODO
        // 1. Create a for-loop that iterates from 0 to 4
        // 2. Inside the loop, instantiate a new Alien and add it to the arraylist
    }

    /**
     * Changes all of the aliens' color to green!
     */
    public void makeAllGreen() {
        for (Alien alien : this.aliens) {
            alien.setColor(Color.GREEN);
        }
        // TODO
        // 1. Create a for-each loop that iterates over all the aliens
        // 2. Inside the loop, change the Alien's color to green
    }

    /**
     * This method removes three Aliens from the screen!
     */
    public void removeThreeAliens() {
        if (this.aliens.isEmpty()) {
            return;
        }
        int index = (aliens.size() < 3 ? aliens.size() : 3);
        for (int i = 0; i < index; i++) {
            Alien alien = this.aliens.remove(0);
            alien.removeFromPane();
        }
        // TODO
        // 1. Create a for loop that iterates three times
        // 2. Inside the loop, remove the first Alien from the arraylist (index 0)
    }
}
