package com.clasenoviembre.shapes;

public class Circle {
    // Atributos
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Métodos
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Getters y Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Método para calcular el área
    public double calcularArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}



