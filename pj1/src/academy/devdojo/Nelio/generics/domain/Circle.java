package academy.devdojo.Nelio.generics.domain;

public class Circle implements Shap {

    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        return Math.PI * radius * radius;
    }
    
    
}
