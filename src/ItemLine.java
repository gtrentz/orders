package src;

public class ItemLine {
    public String name;
    public int quantity;
    public float price;
    public int ID;

    public ItemLine(String n, float price, int ID) {
        this.name = n;
        this.price = price;
        this.ID = ID;
    }
}
