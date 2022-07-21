package fr.lasere.cancer_simulator;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Reference {
	
	public Circle ref_cell = new Circle();
	public Circle ref_defective_cell = new Circle();
	public Circle ref_cancer = new Circle();
	public Circle ref_death_cell = new Circle();
	
	public void reference() {
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
	}
}
