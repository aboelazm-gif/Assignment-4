package Q2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(max(list));
        list.add(0);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(10);
        list.add(30);
        System.out.println(max(list));
    }

    public static Integer max(ArrayList<Integer> list)
    {
        int max=0;
        if(list==null||list.size()==0)
            return null;
        else
        {
            for(int i=0;i<list.size();i++)
            {
                if(list.get(i)>=max)
                    max= list.get(i);
            }
            return max;
        }
    }
}