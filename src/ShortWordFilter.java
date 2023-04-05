import java.util.Scanner;

public class ShortWordFilter implements Filtery
{
    Scanner in = new Scanner(System.in);
    private String myList;

    public ShortWordFilter(String myList)
    {
        this.myList = myList;
    }

    public boolean isShort(String myList)
    {
        String readThis = myList;

        if(readThis.length() <= 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean accept(Object x)
    {

        return false;
    }
}
