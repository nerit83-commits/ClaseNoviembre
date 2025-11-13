
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

    Scanner scanner = new Scanner(System.in);

    double totalArea = 0;

    System.out.println("Cuantas habitaciones tiene la casa?");
    int numRooms = scanner.nextInt();

    //while (numRooms <= 0) { (bloque de instrucciones)   numRooms--;}

    for (int i = 1; i <= numRooms; i++){
       System.out.println("Ingrese la forma de la habitacion (c)uadrado, (r)ectangulo, (t)riangulo, (o)irculo:");
         String shape = scanner.next();
         char shapeType = shape.charAt(0);
         if (shapeType == 'c') {
            System.out.println("Ingrese el lado del cuadrado:");
            double lado = scanner.nextDouble();
            Square cuadrado = new Square(lado);
            double areaCuadrado = cuadrado.calcularArea();
            System.out.println("El area del cuadrado es: " + areaCuadrado);
             //totalArea = totalArea + areaCuadrado;
            totalArea += areaCuadrado;
           } else if (shapeType == 'r') {
            System.out.println("Ingrese el largo del rectangulo:");
            double length = scanner.nextDouble();
            System.out.println("Ingrese el ancho del rectangulo:");
            double width = scanner.nextDouble();
            Rectangle rectangulo = new Rectangle(length, width);
            double areaRectangulo = rectangulo.calcularArea();
            System.out.println("El area del rectangulo es: " + areaRectangulo);
            totalArea += areaRectangulo;
         } else if (shapeType == 't') {
            System.out.println("Ingrese la base del triangulo:");
            double base = scanner.nextDouble();
            System.out.println("Ingrese la altura del triangulo:");
            double height = scanner.nextDouble();
            Triangle triangulo = new Triangle(base, height);
            double areaTriangulo = triangulo.calcularArea();
            System.out.println("El area del triangulo es: " + areaTriangulo);
            totalArea += areaTriangulo;
         } else if (shapeType == 'o') {
            System.out.println("Ingrese el radio del circulo:");
            double radius = scanner.nextDouble();
            Circle circulo = new Circle(radius);
            double areaCirculo = circulo.calcularArea();
            System.out.println("El area del circulo es: " + areaCirculo);
            totalArea += areaCirculo;
         } else {
            System.out.println("Forma no valida. Intente de nuevo.");
            i--; // Decrementar i para repetir esta iteracion
         }

        }

        System.out.println("El area total de la casa es: " + totalArea);


        scanner.close();
    }

}

      