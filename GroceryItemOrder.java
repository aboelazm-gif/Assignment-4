package Q6;

public class GroceryItemOrder {
    public String name;
    public double pricePerUnit;
    public int quantity;

    public GroceryItemOrder(String N, double PPU)
    {
        name = N;
        pricePerUnit=PPU;
    }
    public double getCost()
    {
        return pricePerUnit*quantity;
    }
    public void setQuantity(int Q)
    {
        this.quantity=Q;
    }
}
