package pachydermpeanutpacking;

public class Box 
{
    double x1;
    double y1;
    double x2;
    double y2;
    String size;
    
    Box(double x1, double y1, double x2, double y2, String size)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.size = size;
    }
    
    public boolean checkContains(double x, double y)
    {
        return x >= x1 && y >= y1 && x <= x2 && y <= y2;
    }
    
    public String getSize()
    {
        return size;
    }
}
