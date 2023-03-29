package Q6;

import java.util.ArrayList;

public class GroceryList {
    ArrayList<GroceryItemOrder>gList=new ArrayList<>();

    public GroceryList()
    {}
    public void add(GroceryItemOrder item)
    {
        if(gList.size()<10)
            gList.add(item);
        else
            System.out.println("You have reached the grocery list limit of 10");
    }

    public double getTotalCost()
    {
        int sum=0;
        for(int i=0;i<gList.size();i++)
        {
            sum+=gList.get(i).pricePerUnit;
        }
        return sum;
    }
}
