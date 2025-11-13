package com.clasenoviembre.shapes;

public class Triangle {
    // Attributes
    private double base;
    private double height;

    // Constructor: metodo de acceso - nombre igual que la clase y (parametros)
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Method to calculate the area of the triangle
    public double getArea() {
        return (base * height) / 2;
    }

    // get and set methods
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    //Método para calcular el área
    public double calcularArea() {
        return (base * height) / 2;
    }
    
}
