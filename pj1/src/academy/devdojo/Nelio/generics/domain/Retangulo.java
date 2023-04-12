package academy.devdojo.Nelio.generics.domain;

public class Retangulo implements Shap {
    private double width;
    private double height;
    public Retangulo(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area() {
        // TODO Auto-generated method stub
       return width * height;
    }

    

    
}
