package com.clasenoviembre.shapes;

public class Square {
    // Atributos
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Métodos
    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    // Getters y Setters
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //Método para calcular el área
    public double calcularArea() {
        return Math.pow(side, 2);
    }
}
