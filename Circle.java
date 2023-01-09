public class Circle {
    private double radius =1.0;
    public final double pi =3.14;
    private String color = " blue ";
    private boolean filled =true;
    public Circle(){};
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled)
    {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public void setColor (String color)
    {
        this.color=color;
    }
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public String getColor()
    {
        return this.color;
    }
    public boolean isFilled()
    {
        return this.filled;
    }
    public double getArea()
    {
        return Math.pow(this.radius,2)*this.pi;
    }
    @Override
    public String toString()
    {
        return "A circle with radius :"
                +getRadius()+" "
                +"color of : "
                +getColor()+" "
                +"and "
                +(isFilled()?"filled ":"not filled ")
                +"and area of : "
                +getArea();
    }
}
