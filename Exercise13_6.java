

public class Exercise13_6
{
    public static void main(String[] args)
    {
        ComparableCircle circle1 = new ComparableCircle(2.0, "circle1");
        ComparableCircle circle2 = new ComparableCircle(3.0, "circle2");

        System.out.println("The bigger circle is:");
        System.out.println(MaxCircle.max(circle1, circle2).getName());
    }
}

class MaxCircle
{
    public static ComparableCircle max(ComparableCircle c1, ComparableCircle c2)
    {
        if (c1.compareTo(c2) > 0)
            return c1;
        else
            return c2;
    }
}


abstract class Circle
{
    private double radius;
    private String name;

    Circle()
    {

    }

    Circle(double newRadius, String newName)
    {
        this.radius = newRadius;
        this.name = newName;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public String getName()
    {
        return name;
    }
}


class ComparableCircle extends Circle
        implements Comparable<ComparableCircle>
{

        ComparableCircle()
        {
        super();
        }

        ComparableCircle(double newRadius, String newName)
        {
        super(newRadius, newName);
        }



    @Override
    public int compareTo(ComparableCircle o)
    {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }


}

