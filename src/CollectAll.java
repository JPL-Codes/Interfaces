import java.util.ArrayList;

public class CollectAll implements Filtery
{
    public static ArrayList<Object> collectAll(Object[] objects, Filtery filter)
    {
        ArrayList<Object> filteredObjects = new ArrayList<>();
        for (Object x : objects)
        {
            if (filter.accept(x))
            {
                filteredObjects.add(x);
            }
        }
        return filteredObjects;
    }

    @Override
    public boolean accept(Object x)
    {
      return true;
    }
}

