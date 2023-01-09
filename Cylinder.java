public class Cylinder extends Circle{
    private double height = 1.0;
    public Cylinder()
    {};
    public Cylinder(double radius)
    {
        super(radius);
    }
    public Cylinder(double radius , String color ,boolean filled)
    {
        super(radius, color, filled);
    }
    public double getHeight()
    {
        return height;
    }
    public void setHeight(double height)
    {
        this.height=height;
    }
    public double volume ()
    {
        return this.height*super.getArea();
    }
    @Override
    public String toString()
    {
        return "A Cylinder with height of : "+getHeight()+" "
                +" radius of : "+this.getRadius()+" and volume of : "
                +volume()+" and a subclass of : "+super.toString();
    }


}
