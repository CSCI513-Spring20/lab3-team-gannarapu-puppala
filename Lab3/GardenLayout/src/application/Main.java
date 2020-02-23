package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class Main extends Application {
	Pane root;
	Scene scene;
	Point2D lastPosition =null;
	Flower f1,f2,f3,f4,f5;
	FlowerBed fb1;
	
	
	
	@Override
	public void start(Stage primaryStage) {
		
		// Creating Flower
		f1 = new Flower(new Point2D(20,20),10,Color.BURLYWOOD);
		f2 = new Flower(new Point2D(50,20),10,Color.BLUE);
		f3 = new Flower(new Point2D(80,20),10,Color.AQUA);
		f4 = new Flower(new Point2D(110,20),10,Color.BEIGE);
		f5 = new Flower(new Point2D(140,20),10,Color.BLUEVIOLET);
		
		//Creating FlowerBeds
		fb1 = new FlowerBed(new Point2D(12,80), 200,150,Color.GREEN);
		
		
		root = new Pane();
	    
	    root.getChildren().add(f1.getFlower());
	    root.getChildren().add(f2.getFlower());
	    root.getChildren().add(f3.getFlower());
	    root.getChildren().add(f4.getFlower());
	    root.getChildren().add(f5.getFlower());
	    root.getChildren().add(fb1.getFlowerBed());
	    
	    scene =new Scene(root,600,600);
	    scene.setFill(Color.BROWN);
	    
	    primaryStage.setScene(scene);
	    primaryStage.show();
	   
	    
	    scene.setOnMouseDragged(mouseHandler); 
	    scene.setOnMouseDragged(mouseHandler);
	    scene.setOnMouseDragged(mouseHandler);
	    scene.setOnMouseDragged(mouseHandler);
		
		
		
	}
	
EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
		
		public void handle(MouseEvent mouseEvent) {
			
			Point2D clickpoint = new Point2D(mouseEvent.getX(),mouseEvent.getY());
			String eventName = mouseEvent.getEventType().getName();

			switch(eventName) {
			
			case("MOUSE_DRAGGED"):
				if(lastPosition != null) {
				double xCells =clickpoint.getX()-lastPosition.getX();
				double yCells =clickpoint.getY()-lastPosition.getY();
				f1.move(xCells,yCells);
			}
			break;
			}
			lastPosition = clickpoint;
		}
	};

	public static void main(String[] args) {
		launch(args);
	}
}
