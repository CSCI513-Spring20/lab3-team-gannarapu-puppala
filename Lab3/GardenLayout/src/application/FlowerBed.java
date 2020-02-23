package application;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class FlowerBed {
	Rectangle flowerBed;
	
	public FlowerBed(Point2D point,int height,int width,Color color) {
		flowerBed = new Rectangle();
		flowerBed.setX(point.getX());
		flowerBed.setY(point.getY());
		flowerBed.setHeight(height);
		flowerBed.setWidth(width);
		flowerBed.setFill(color);
		flowerBed.setStroke(Color.BLACK);
		flowerBed.setStrokeWidth(1);
		
	}
	
	public Rectangle getFlowerBed() {
		return this.flowerBed;
	}

}
