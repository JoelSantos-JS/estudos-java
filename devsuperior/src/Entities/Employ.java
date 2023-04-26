package Entities;
public class Employ {
    private String name;
    private double grossSalary;
    public Employ(String name, double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGrossSalary() {
        return grossSalary;
    }
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
    @Override
    public String toString() {
        return "Employ [name=" + name + ", grossSalary=" + grossSalary + "]";
    }
    

    
    
}
