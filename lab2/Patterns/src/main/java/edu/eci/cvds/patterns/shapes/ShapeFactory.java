package edu.eci.cvds.patterns.shapes;

import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
    public static Shape create(RegularShapeType shapeType){
        System.out.println(shapeType);
        Shape shape = null;
        switch (shapeType) {
            case Triangle:
                shape = new Triangle();
             case Quadrilateral:
                shape = new Quadrilateral();
             case Pentagon:
                shape = new Pentagon();
             case Hexagon:
                shape = new Hexagon();

            default:
                break;
        }
        return shape;
    }
}
