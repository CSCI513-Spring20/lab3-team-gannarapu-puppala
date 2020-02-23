package application;

import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Flower {
	
	Circle circle;

		public Flower(Point2D point,int radius,Color color) {
			circle = new Circle();
			circle.setCenterX(point.getX());
			circle.setCenterY(point.getY());
			circle.setRadius(radius);
			circle.setFill(color);
			circle.setStroke(Color.BLACK);
			circle.setStrokeWidth(1);		
		}
		
		public Circle getFlower() {
			return this.circle;
		}
		public void move(double dx, double dy) {
			circle.setCenterX(circle.getCenterX()+dx);
			circle.setCenterY(circle.getCenterY()+dy);

		}
		
	}
	
