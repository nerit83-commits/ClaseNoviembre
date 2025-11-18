package com.clasenoviembre;

import com.clasenoviembre.shapes.Circle;
import com.clasenoviembre.shapes.Rectangle;
import com.clasenoviembre.shapes.Square;
import com.clasenoviembre.shapes.Triangle;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
    

//Refactorizamos codigo utilizando anotaciones de ParametizeredTest
/*CsvSource - ValueSource */


public class AppTest {

    private Square sqr;
    private Rectangle rct;
    private Circle cr;
    private Triangle tr;

 @ParameterizedTest
    @ValueSource(doubles = {12.5 , 24.3 , 3.14 , 8.3})
    void AreaSquareTest(double side) {
        Square sqr = new Square(side);
        double areasquare = sqr.calcularArea();

        assertEquals(Math.pow(side, 2), areasquare );
    }


 /* 
    @Test
    void AreaSquareTest() {
        Square sqr = new Square(42.4);
        double areasquare = sqr.calcularArea();
        
        assertEquals(Math.pow(42.4, 2), areasquare);
    }  
*/
/* 
    @Test
    void AreaSquareTestNot() {
        Square sqr = new Square(42.4);
        double areasquare = sqr.calcularArea();
        
        assertNotEquals(Math.pow(42.4, 5), areasquare);
    }  
    */

    @ParameterizedTest
    @CsvSource({
    /*length , width*/
        "7   ,   4",
        "10  ,   5",
        "15  ,   7",
        "25   ,   2"
    })
    void AreaRectangleTest(double length, double width) {
        System.out.println(length + " " + width);
        Rectangle rect = new Rectangle(length, width );
        double arearectangle = rect.calcularArea();

        assertEquals(length  * width   , arearectangle );
    }

    /* 
   @Test
    void AreaRectangleTest() {
        Rectangle rect = new Rectangle(10.0, 5.0);
        double arearectangle = rect.calcularArea();
        
        assertEquals(50, arearectangle);
    }  
    */

    @ParameterizedTest
    @ValueSource(doubles = {6.4 , 10.5 , 13.1, 50.0})
        void AreaCircleTest(double radius) {
            Circle circ = new Circle(radius);
            double areacircle = circ.calcularArea();
    
            assertEquals(Math.PI * Math.pow(radius, 2), areacircle );  //verifico que el área calculada es correcta usando math.pi
        }

/* 
   @Test //esto es la anotación de JUnit
    void AreaCircleTest() {  //nombre del método de prueba
        Circle circ = new Circle(2);  //creo un objeto de la clase Circle
        double areacircle = circ.calcularArea(); //llamo al método calcularArea
        
        assertEquals(4*Math.PI, areacircle); //verifico que el área calculada es correcta
    }  
*/

    @ParameterizedTest
    @CsvSource({
    /*base , height*/
        "2   ,   5",
        "8   ,   4",
        "6   ,   12",
        "18  ,   10"
    })
    void AreaTriangleTest(double base, double height) {  // nombre del método de prueba
        Triangle trian = new Triangle(base, height); // creo un objeto de la clase Triangle con los datos base y height que estan en el CsvSource
        double areatriangle = trian.calcularArea();

        assertEquals((base * height) / 2, areatriangle );  //verifico que el área calculada es correcta
    }

    /* 
    @Test
    void AreaTrianguleTest() {
        Triangle trian = new Triangle(10,   12);
        double areatriangle = trian.calcularArea();
        
        assertEquals(60, areatriangle);
    }  
    */

    @ParameterizedTest  //parametrizamos el test de area total
    @CsvSource({  //triangle base, triangle height, circle radius, rectangle length, rectangle width, square side
        "2   ,   5   ,   10   ,   8   ,   4   ,   7",
        "10  ,  105  ,   200  ,   48  ,  78   ,   53",
        "12  ,   23  ,   20   ,   60  ,  65   ,   78",
        "45  ,   54   ,   5   ,   2   ,   7   ,  15",
        "53  ,   60   ,  90   ,  100  ,  47   ,   1"
    })
    void AreaTotalTest(double triBase, double triHeight, double circleRadius, double rectLength, double rectWidth, double squareSide) {
        Triangle trian = new Triangle(triBase, triHeight);
        Circle circ = new Circle(circleRadius);
        Rectangle rect = new Rectangle(rectLength, rectWidth);
        Square sqr = new Square(squareSide);
        

        double totalArea = sqr.calcularArea() + rect.calcularArea() + circ.calcularArea() + trian.calcularArea();

        assertEquals((triBase * triHeight) / 2 + Math.PI * Math.pow(circleRadius, 2) + rectLength * rectWidth + Math.pow(squareSide, 2), totalArea, 0.0001);
    }
  
    /* 
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
    */

    @ParameterizedTest
    @CsvSource({
    /* radius, radiusSet */  //valores para el radio inicial y el radio modificado
        "2  , 5",
        "8  , 4",
        "6  , 12",
        "18 , 10",
        "20 , 30"
    })
    void getSetRadiusTest(double radius, double radiusSet) {  //esto es la anotación de JUnit get y set del radio junto con su prueba
        Circle c1 = new Circle(radius);  // creo un objeto de la clase Circle
        c1.setRadius(radiusSet);  //establezco el nuevo valor del radio para cada iteración por eso uso CsvSource

       assertEquals(radiusSet, c1.getRadius()); //verifico que el valor del radio es el esperado con el valor modificado
    }

    /* 
    @Test
    void getSetRadiusTest() {  //esto es la anotación de JUnit get y set del radio junto con su prueba
        Circle c1 = new Circle(5);
        c1.setRadius(15);  //establezco el nuevo valor del radio

       assertEquals(15, c1.getRadius()); //verifico que el valor del radio es el esperado
    }
    */

    @ParameterizedTest
    @CsvSource({  // metodo parametrizado para get y set de altura y ancho del rectangulo
    /* getheight , getwidth , setheight , setwidth */
            "2   ,   5   ,   10   ,   8   ",
            "10  ,  105  ,   200  ,   48  ",
            "12  ,   23  ,   20   ,   60  ",
            "45  ,   54   ,   5   ,   2   ",
            "53  ,   60   ,  90   ,  100  "
    })
   void getSetRectTest(double getheight, double getwidth, double setheight, double setwidth) {  
        Rectangle r1 = new Rectangle(getheight, getwidth);  // creo un objeto de la clase Rectangle
        r1.setHeight(setheight);  //establezco el nuevo valor de la altura
        r1.setWidth(setwidth); //establezco el nuevo valor del ancho

        assertTrue(r1.getHeight() == setheight && r1.getWidth() == setwidth); //verifico que los valores son los verdaderos para altura y ancho
                                                                            // == compara valores primitivos con true si son iguales
                                                                            // && combina dos condiciones booleanas como true solo si ambas son verdaderas
    }

    /* 
    @Test
    void getSetRectTest() {
        Rectangle r1 = new Rectangle(8, 4);
        r1.setHeight(10);
        r1.setWidth(5);

        assertTrue(r1.getHeight() == 10 && r1.getWidth() == 5); //verifico que los valores son los verdaderos para altura y ancho
    }
    */

    @ParameterizedTest
    @CsvSource({  // metodo parametrizado para get y set de base y altura del triangulo
        /* getbase , getheight , setbase , setheight */
            "2   ,   5   ,   10   ,   8   ",
            "10  ,  105  ,   200  ,   48  ",
            "12  ,   23  ,   20   ,   60  ",
            "45  ,   54   ,   5   ,   2   ",
            "53  ,   60   ,  90   ,  100  "
    })
    void getSetTriangule(double getbase, double getheight, double setbase, double setheight) {  
          Triangle t1 = new Triangle(getbase, getheight);  // creo un objeto de la clase Triangle
          t1.setBase(setbase);  //establezco el nuevo valor de la base
          t1.setHeight(setheight); //establezco el nuevo valor de la altura
    
          assertTrue(t1.getBase() == setbase && t1.getHeight() == setheight); //verifico que los valores son los verdaderos para base y altura donde == compara valores primitivos con true si son iguales
                                                                              // && combina dos condiciones booleanas como true solo si ambas son verdaderas
     }

    /* 
    @Test
    void getSetTriangule() {
        Triangle t1 = new Triangle(6, 8);  // creo un objeto de la clase Triangle
        t1.setBase(12);  //establezco el nuevo valor de la base
        t1.setHeight(16); //establezco el nuevo valor de la altura

        assertTrue(t1.getBase() == 12 && t1.getHeight() == 16); //verifico que los valores son los verdaderos para base y altura
    }
    */
}
