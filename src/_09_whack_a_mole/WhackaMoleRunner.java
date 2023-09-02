package _09_whack_a_mole;

import java.util.Random;

public class WhackaMoleRunner {
public static void main(String[] args) {
	WhackAMole whack = new WhackAMole();
	whack.setup();
	whack.drawButtons(new Random().nextInt(24));
}
}