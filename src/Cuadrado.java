import processing.core.PApplet;

public class Cuadrado implements Runnable{
	
	private int posX;
	private int posY;
	private int color;
	private PApplet app;
	private int area;
	
	public Cuadrado(int posX, int posY,int color, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.color = color;
		this.app = app;
		this.area = 20;
	}
	public void draw() {
		if(color==255) {
			app.fill(0);
		}else {
			app.fill(255);
		}
		app.rect(posX, posY, area, area);
	}
	
	public void run() {
		move();
		try {
			
		} catch (Exception e) {
			
		}
	}
	public void move() {
		posX += 20;
	//	posY += ;
	}

}
