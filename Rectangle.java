import java.util.*;

public class Rectangle extends Shape implements Resizable{
    private double wide;
    private double hight;
    
    public Rectangle(String name,float wide,float hight){
        super(name);
        this.wide = wide;
        this.hight = hight;
        factor = 1;
    }

    public double getArea(){
        return wide*hight;
    }

    public void resize(double factor){
        this.factor = factor;
    }

    public void reset(){
        factor = 1;
    }

    public static double sumAreaIfResize(List<Shape> shapes, double factor){
        double sum = 0;
        for(Shape s: shapes){
            s.resize(factor);
            sum += s.getArea();
        }
        return sum;
        
    }

    public static void main(String[] args){
        double sum = 0;
        sum = sumAreaIfResize(shapes, 0.5);
    }
}