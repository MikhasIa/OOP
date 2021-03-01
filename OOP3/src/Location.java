import java.util.Objects;

/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X координата данной локации. **/
    public int xCoord;

    /** Y координата данной локации. **/
    public int yCoord;

    /** Реализация метода equals() **/
	//@Override

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return xCoord == location.xCoord && yCoord == location.yCoord;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoord, yCoord);
    }

    /** Создание новой локации со специальными координатами. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Создание новой локации с координатами (0.0). **/
    public Location()
    {
        this(0, 0);
    }
}