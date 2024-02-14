package restaurant;

/**
 * PICK UP LINE (FOR FUN):
 * *are you a hash table? cuz you’re the key that gives value to my life*
 * 
 * ************
 * This file is the "node" in the linkedlist at each index in the stock hashtable.
 * 
 * @author Kushi Sharma
 * @author Mary Buist
*/

public class StockNode {
    private Ingredient item; // data portion of node
    private StockNode  next; // link to next node

    // Constructor
    public StockNode(Ingredient item, StockNode next) {
        this.item = item;
        this.next = next;
    }

    // Getter/Setter methods
    public Ingredient getIngredient() { return item; }
    public void setIngredient(Ingredient item) { this.item = item; }
    
    public StockNode getNextStockNode() { return next; }
    public void setNextStockNode(StockNode next) { this.next = next; }
}
