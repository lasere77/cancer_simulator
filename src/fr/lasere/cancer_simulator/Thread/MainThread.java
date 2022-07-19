package fr.lasere.cancer_simulator.Thread;

import java.util.Random;

import fr.lasere.cancer_simulator.Circle.CustomCircle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MainThread extends Thread{
	
	private double width = 1080;
	TimeThread time = new TimeThread();
	CustomCircle cells = new CustomCircle();
	Random rand = new Random();
	int random_cell = rand.nextInt(cells.init_bottom_cells().length);
	private boolean running = true;
	
	
	double random = rand.nextDouble(101);
	
	//simulator 
	private int age = 0;
	private final int death = 70; //average life span in the world
	private int set_probability = 0;
	
	//property
	private final boolean smoke = true;
	private final boolean drinker = false;   //drink alcohol
	private final boolean contentInflammation = false;  //amiente, résine...
	private final boolean obese = false;
	private final boolean radiation = false;//sun exposure / radiation etc...
	@SuppressWarnings("unused")
	private final boolean cytokine = true;
	private final boolean g_p53 = rand.nextBoolean();//14%
	
	private double probability = 0;
	private final double max_probability = 100;
	
	public Text text_death = new Text();
	
	public void run() {
		System.out.println("main Thread launched!!!");
		System.out.println("random = " + random);
		while (running) {
			if(age >= death) {
				System.out.println("death of your person");
				text_death.setText("death of your person");
				running = false;
			}
			if(set_probability == 0) {
				if(smoke) {
					double probability_smoke = rand.nextDouble(27);
					//System.out.println(probability_smoke);
					if(probability_smoke <= 13) {
						probability_smoke = rand.nextInt(27);
						//System.out.println(probability_smoke);
					}
					probability+=probability_smoke;
					System.out.println("probability smoke" + probability_smoke);
				}
				if(drinker) {
					probability+=11;
				}
				if (contentInflammation) {
					
				}
				if(obese) {
					probability+=1.9;
				}
				if(radiation) {
					
				}
				if(g_p53) {
					probability += 50;
					System.out.println("you have matation of the p53 gene");
				}
				set_probability++;
				System.out.println(probability);
			}
			if(age == 55) {
				probability+=5;
				System.out.println("your character is over 55 years old" + probability);
			}
			if(age == 65) {
				probability+=10;
				System.out.println("your character is over 65 years old" + probability);
			}
			
			if(probability >= random) {
				System.out.println("want character has a new cancer cell");
				update();
			}
			
			
			if(probability > max_probability) {
				probability = max_probability;
			}
			try {
				Thread.sleep(1000);
				age++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Circle update() {
		Circle cell = cells.init_bottom_cells()[random_cell];
		cell.setFill(Color.ORANGE);
		return cell;
	}
	
	public Text end() {
		Text end = new Text();
		end.setText("end of the simulation.");
		end.setX(width / 2 - 73);
		end.setY(110);
		end.setFill(Color.WHITE);
		end.setFont(Font.font("verdana", 15));
		return end;
	}

	public Text death() {
		text_death.setX(width / 2 - 70);
		text_death.setY(80);
		text_death.setFill(Color.WHITE);
		text_death.setFont(Font.font("verdana", 15));
		return text_death;
	}
}
