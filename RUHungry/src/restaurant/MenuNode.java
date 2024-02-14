package restaurant;

/**
 * This file is the "node" in the linkedlist at each index in the Menu "hashtable"
 * 
 * @author Kushi Sharma
 * @author Mary Buist
*/

public class MenuNode{
    private Dish dish; // data portion of node
    private MenuNode next; // link to next node

    // Constructor
    public MenuNode (Dish dish, MenuNode next) {
        this.dish = dish;
        this.next = next;
    }
    
    // Getter/Setter methods
    public Dish getDish() { return dish; }
    public void setDish(Dish dish) { this.dish = dish; }

    public MenuNode getNextMenuNode() { return next; }
    public void setNextMenuNode(MenuNode next) { this.next = next; }
}