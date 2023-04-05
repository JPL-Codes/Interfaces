import java.awt.*;
import java.util.Scanner;

public class BigRectangleFilter implements Filtery {
        Scanner in = new Scanner(System.in);

        private double perim;


    public BigRectangleFilter(double perim)
        {
            this.perim = perim;
        }

    public double getPerim(Object x)
    {
        double myPerim = 0;
        Rectangle r = (Rectangle) x;
        myPerim = 2*(r.height * r.width);
        return myPerim;
    }

    @Override
        public boolean accept(Object x)
        {
            double myPerim = 0;
            Rectangle r = (Rectangle) x;
            double hit = r.height;
            double wid = r.width;
            myPerim = 2*(hit * wid);
            if(myPerim >= 10)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }



