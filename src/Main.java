import processing.core.PApplet;

public class Main extends PApplet {
	Cuadrado[][] matri;
	int num1 = 30;
	int num2 = 20;
	int area = 20;
	int posX = 0;
	int posY = 0;

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(600, 400);
	}

	public void setup() {
		matri = new Cuadrado[20][30];
		
		for (int columnas = 0; columnas < num1; columnas++) {
			for (int filas = 0; filas < num2; filas++) {

				if (filas % 2 == 0) {
					if (columnas % 2 == 0) {
						matri[filas][columnas] = new Cuadrado(20 * columnas, 20 * filas, 0, this);
					} else {
						matri[filas][columnas] = new Cuadrado(20 * columnas, 20 * filas, 255, this);
					}
				} else {

					if (columnas % 2 != 0) {
						matri[filas][columnas] = new Cuadrado(20 * columnas, 20 * filas, 0, this);
					} else {
						matri[filas][columnas] = new Cuadrado(20 * columnas, 20 * filas, 255, this);
					}

				}
			}
			System.out.println(matri[0][0]);
		}
	}

	public void draw() { // no profe me embollé perdon
		background(155);

		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				rect(matri[i][j].getPosX(),matri[i][j].getPosY(),matri[i][j].getArea(),matri[i][j].getArea());
			}
		}

	}

}
