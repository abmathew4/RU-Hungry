package restaurant;

/**
 * This file is the data portion of the TransactionNode.
 * 
 * @author Mary Buist
 * @author Kushi Sharma
*/

public class TransactionData {
    
    private String  type;    // one of three: order, donation, restock
    private String  item;    // either food order or ingredient donation request/ restock
    private int     amount;  // integer amount of food being purchased/donated/restocked
    private double  profit;  // profit? (+/-)
    private boolean success; // true if successfull transaction, false otherwise 

    // Constructor
    public TransactionData (){
        type = null;
        item = null;
        amount = 0;
        profit = 0;
        success = false;
    }
    
    // Constructor
    public TransactionData (String type, String item, int amount, double profit, boolean success){
        this.type = type;
        this.item = item;
        this.amount = amount;
        this.profit = profit;
        this.success = success;
    }

    // Getter/Setter Methods
    public String getType() { return type;}
    public String getItem() { return item;}
    public int getAmount() { return amount;}
    public Double getProfit() { return profit;}
    public boolean getSuccess() { return success;}

    public void setType(String typeInput) {type = typeInput;}
    public void setItem(String itemInput) {item = itemInput;}
    public void setProfit(double profitInput) {profit = profitInput;}
    public void setSuccess(boolean successInput) {success = successInput;}
}
