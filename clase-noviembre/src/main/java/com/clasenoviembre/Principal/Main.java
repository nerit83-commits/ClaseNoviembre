
package com.clasenoviembre.Principal;

import java.util.*;

// primera opcion para importar todas las clases del paquete shapes
import com.clasenoviembre.shapes.*;

/* segunda opcion para importar las clases una por una
import shapes.Circle;
import shapes.Rectangle;
import shapes.Square;
import shapes.Triangle; 
*/

public class Main {
    public static void main(String[] args) {
        // Crear instancias de todas las formas
        Rectangle rectangulo = new Rectangle(5, 3);
        Triangle triangulo = new Triangle(4, 6);
        Circle circulo = new Circle(3);
        Square cuadrado = new Square(4);

        // Calcular y mostrar areas
        System.out.println("Area del rectangulo: " + rectangulo.getArea());
        System.out.println("Area del triangulo: " + triangulo.getArea());
        System.out.println("Area del circulo: " + circulo.getArea());
        System.out.println("Area del cuadrado: " + cuadrado.getArea());

        // Mostrar perimetros
        System.out.println("\nPerimetro del rectangulo: " + rectangulo.getPerimeter());
        System.out.println("Perimetro del circulo: " + circulo.getPerimeter());
        System.out.println("Perimetro del cuadrado: " + cuadrado.getPerimeter());
    }
}
