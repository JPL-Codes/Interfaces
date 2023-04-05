import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BigRectLister
{
    public static void main(String[] args)
    {
        int count = 0;
        double perim = 0;
        BigRectangleFilter rMeasure = new BigRectangleFilter(perim);
        ArrayList<Object> rectangles = new ArrayList<>();
        Object[] objects ={new Rectangle(2,6),new Rectangle(1,5),new Rectangle(2,2),new Rectangle(1,1),
                new Rectangle(1,8),new Rectangle(1,3),new Rectangle(1,6),new Rectangle(1,2),
                new Rectangle(4,5),new Rectangle(9,2),new Rectangle(3,2)};

        System.out.println("Filtered Rectangles:");
        ArrayList<Object> filteredObjects = CollectAll.collectAll(objects, rMeasure);
        for (Object obj : filteredObjects)
        {
            System.out.println("Rectangle " + (1+filteredObjects.indexOf(obj)) + ": " + rMeasure.getPerim(obj));
        }

    }
}
