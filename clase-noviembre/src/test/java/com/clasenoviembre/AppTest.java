package com.clasenoviembre;

import com.clasenoviembre.shapes.Circle;
import com.clasenoviembre.shapes.Rectangle;
import com.clasenoviembre.shapes.Square;
import com.clasenoviembre.shapes.Triangle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
    
public class AppTest {
 
    @Test
    void AreaSquareTest() {
        Square sqr = new Square(42.4);
        double areasquare = sqr.calcularArea();
        
        assertEquals(Math.pow(42.4, 2), areasquare);
    }  

    @Test
    void AreaSquareTestNot() {
        Square sqr = new Square(42.4);
        double areasquare = sqr.calcularArea();
        
        assertNotEquals(Math.pow(42.4, 5), areasquare);
    }  


   @Test
    void AreaRectangleTest() {
        Rectangle rect = new Rectangle(10.0, 5.0);
        double arearectangle = rect.calcularArea();
        
        assertEquals(50, arearectangle);
    }  


   @Test //esto es la anotación de JUnit
    void AreaCircleTest() {  //nombre del método de prueba
        Circle circ = new Circle(2);  //creo un objeto de la clase Circle
        double areacircle = circ.calcularArea(); //llamo al método calcularArea
        
        assertEquals(4*Math.PI, areacircle); //verifico que el área calculada es correcta
    }  


    @Test
    void AreaTrianguleTest() {
        Triangle trian = new Triangle(10,   12);
        double areatriangle = trian.calcularArea();
        
        assertEquals(60, areatriangle);
    }  

    @Test
    void AreaTotalTest() {
        Square sqr = new Square(4);
        Rectangle rect = new Rectangle(3, 6);
        Circle circ = new Circle(2);
        Triangle trian = new Triangle(3, 4);

        double totalArea = sqr.calcularArea() + rect.calcularArea() + circ.calcularArea() + trian.calcularArea();

        double expectedTotalArea = 16 + 18 + (4 * Math.PI) + 6;

        assertEquals(expectedTotalArea, totalArea);
    }

    @Test
    void getSetRadiusTest() {  //esto es la anotación de JUnit get y set del radio junto con su prueba
        Circle c1 = new Circle(5);
        c1.setRadius(15);  //establezco el nuevo valor del radio

       assertEquals(15, c1.getRadius()); //verifico que el valor del radio es el esperado
    }


    @Test
    void getSetRectTest() {
        Rectangle r1 = new Rectangle(8, 4);
        r1.setHeight(10);
        r1.setWidth(5);

        assertTrue(r1.getHeight() == 10 && r1.getWidth() == 5); //verifico que los valores son los verdaderos para altura y ancho
    }

}
