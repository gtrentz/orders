package src;
import org.json.JSONObject;

public class ItemLine {
    public String name;
    public int quantity;
    public float price;

    public ItemLine(int ID, int quantity) {
        this.quantity = quantity;

    }
}
