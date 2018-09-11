package hittingtargets;

public class Circle 
{
    int x;
    int y;
    int r;
    
    public Circle(int x, int y, int r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    
    boolean checkHit(int x, int y)
    {
        double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        if(distance <= r)
        {
            return true;
        }
        return false;
    }
}
