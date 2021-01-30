package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
	public static  Shape create (RegularShapeType shape) {
		switch (shape) {
            case Quadrilateral:
				return new Quadrilateral();
            case Pentagon:
				return new Pentagon();
			case Hexagon:
				return new Hexagon();
			case Triangle:
				return new Triangle();
			default :
				return null;
		}
		
		
	}
	
}