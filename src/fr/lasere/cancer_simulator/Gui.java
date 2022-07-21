package fr.lasere.cancer_simulator;

import java.util.Random;

import fr.lasere.cancer_simulator.Circle.CustomCircle;
import fr.lasere.cancer_simulator.Thread.MainThread;
import fr.lasere.cancer_simulator.Thread.TimeThread;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gui extends Application {	
	//simulator
	private CustomCircle cells = new CustomCircle();
	private Circle ref_cell = new Circle();
	private Circle ref_defective_cell = new Circle();
	private Circle ref_cancer = new Circle();
	private Circle ref_death_cell = new Circle();
	
	private Random rand= new Random();
	
	//prog
	private double width = 1080;
	private double height = 720;
	private boolean running;
	@SuppressWarnings("unused")
	private boolean his_stoped = false;
	
	@SuppressWarnings("unused")
	private TimeThread timeur = new TimeThread();
	
	//Thread
	private MainThread main_Thread = new MainThread();
	private TimeThread th_time = new TimeThread();
	
	public static void main(String[] args) throws InterruptedException {
		launch();
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Group gui = new Group();
		Scene scene = new Scene(gui, Color.BLACK);
		Image icon = new Image("img/index.jpg");
		
		stage.setWidth(width);
		stage.setHeight(height);
		stage.getIcons().add(icon);
		stage.setTitle("cancer simulator");
		
		ref_cell.setFill(Color.LIME);
		ref_cell.setCenterX(50);
		ref_cell.setCenterY(5);
		ref_cell.setRadius(5);
		
		ref_defective_cell.setFill(Color.ORANGE);
		ref_defective_cell.setCenterX(50);
		ref_defective_cell.setCenterY(20);
		ref_defective_cell.setRadius(5);
		
		ref_cancer.setFill(Color.RED);
		ref_cancer.setCenterX(50);
		ref_cancer.setCenterY(35);
		ref_cancer.setRadius(5);
		
		ref_death_cell.setFill(Color.PURPLE);
		ref_death_cell.setCenterX(50);
		ref_death_cell.setCenterY(50);
		ref_death_cell.setRadius(5);
		
		Text title = new Text();
		title.setText("cancer simulator");
		title.setX(width / 2 - 56);
		title.setY(40);
		title.setFont(Font.font("verdana", 15));
		title.setFill(Color.WHITE);
		
		Line bottom_frame = bottomFrame();
		Line right_frame = rightFrame();
		Line left_frame = leftFrame();
		gui.getChildren().addAll(bottom_frame, right_frame , left_frame);
		
		Text time = new Text();
		//time.setText("votre simulation a durré : " + String.valueOf(timeur.time()) + " seconde");
		time.setX(0);
		time.setY(60);
		time.setFont(Font.font("verdana", 10));
		time.setFill(Color.WHITE);
		
		Button start_button = new Button();
		start_button.setText("start");

		start_button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				running = true;
				System.out.println(running);
				main_Thread.start();
				th_time.start();
				//display bottom cells
				for (int i = 0; i != cells.init_bottom_cells().length; i++) {
					//System.out.println("génération des cellules du bat");
					Circle display_bottom_cells = cells.init_bottom_cells()[i];
					gui.getChildren().add(display_bottom_cells);
				}
				//display top cells
				for (int i = 0; i != cells.init_top_cells().length; i++) {
					System.out.println("cell generation");
					Circle display_top_cells = cells.init_top_cells()[i];
					gui.getChildren().add(display_top_cells);
				}
			}
		});
		
		Button stop_button = new Button();
		stop_button.setText("stop");
		stop_button.setLayoutX(0);
		stop_button.setLayoutY(25);
		stop_button.setOnAction(new EventHandler<ActionEvent>() {
			@SuppressWarnings("deprecation")
			@Override
			public void handle(ActionEvent arg0) {
				gui.getChildren().add(time);
				running = false;
				his_stoped = true;
				System.out.println(running);
				gui.getChildren().addAll(main_Thread.end(), main_Thread.text_death);
				th_time.stop();
				main_Thread.stop();
			}
		});
	
		Text text_cell = new Text();
		text_cell.setText("= healthy cells");
		text_cell.setX(60);
		text_cell.setY(10);
		text_cell.setFont(Font.font("verdana", 10));
		text_cell.setFill(Color.WHITE);
		
		Text text_defective_cell = new Text();
		text_defective_cell.setText("= defective cell");
		text_defective_cell.setX(60);
		text_defective_cell.setY(25);
		text_defective_cell.setFont(Font.font("verdana", 10));
		text_defective_cell.setFill(Color.WHITE);
		
		Text text_cancer_cell = new Text();
		text_cancer_cell.setText("= cancer cell");
		text_cancer_cell.setX(60);
		text_cancer_cell.setY(37);
		text_cancer_cell.setFont(Font.font("verdana", 10));
		text_cancer_cell.setFill(Color.WHITE);
		
		Text text_death_cell = new Text();
		text_death_cell.setText("= death cell");
		text_death_cell.setX(60);
		text_death_cell.setY(53);
		text_death_cell.setFont(Font.font("verdana", 10));
		text_death_cell.setFill(Color.WHITE);
		
		Text scale = new Text();
		scale.setText("1 second = 1 year");
		scale.setX(width / 2 + 430);
		scale.setY(10);
		scale.setFont(Font.font("verdana", 10));
		scale.setFill(Color.WHITE);
		
		/*
		if (circle.getFill() == cell.getFill()) {
			System.out.println("cell");
		}else if (circle.getFill() == cancer.getFill()) {
			System.out.println("cancer");
		}else{
			System.out.println("not a cell....");
		}
		a reffaire dans le turfut quand tout cessara prêt
		*/
		
		//gui.getChildren().add(main_Thread.update());
		
		gui.getChildren().addAll(title, ref_cell, text_cell, ref_defective_cell, text_defective_cell, ref_cancer, text_cancer_cell, ref_death_cell, text_death_cell, scale,start_button, stop_button);
		stage.setScene(scene);
		stage.show();
	}
	
	private Line bottomFrame() {
		Line line = new Line();
		line.setStartX(width / 2 - 70);
		line.setEndX(width / 2 + 80);
		line.setStartY(60);
		line.setEndY(60);
		line.setStyle("-fx-stroke: white;");
		return line;
	}
	private Line rightFrame() {
		Line right_line_frame = new Line();
		right_line_frame.setStartX(width / 2 + 85);
		right_line_frame.setEndX(width / 2 + 85);
		right_line_frame.setStartY(20);
		right_line_frame.setEndY(60);
		right_line_frame.setStyle("-fx-stroke: white;");
		return right_line_frame;
	}
	private Line leftFrame() {
		Line left_line_frame = new Line();
		left_line_frame.setStartX(width / 2 - 75);
		left_line_frame.setEndX(width / 2 - 75);
		left_line_frame.setStartY(20);
		left_line_frame.setEndY(60);
		left_line_frame.setStyle("-fx-stroke: white;");
		return left_line_frame;
	}
}
