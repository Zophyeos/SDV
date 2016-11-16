import java.awt.Color;

public class Main {

	public static void main(String[] args) {
		EZ.initialize(1920, 1112);
		// EZ.initialize(1920, 1112);

		EZ.setBackgroundColor(new Color(0, 0, 0)); // Make the background black.

		EZImage Farm = EZ.addImage("FarmTemp.png", 960, 560);
		EZImage KentN = EZ.addImage("KentD0.png", 1350, 600);

		EZImage KentU0 = EZ.addImage("KentU0.png", 100, 300);

		EZImage KentD0 = EZ.addImage("KentD0.png", 100, 400);

		EZImage KentL0 = EZ.addImage("KentL0.png", 100, 200);

		EZImage KentR0 = EZ.addImage("KentR0.png", 100, 100);

		KentN.scaleTo(4.3f);
		KentU0.scaleTo(4.3f);
		KentD0.scaleTo(4.3f);
		KentL0.scaleTo(4.3f);
		KentR0.scaleTo(4.3f);
		//EZSound bgMusic = EZ.addSound("BGMusic.wave");
		//bgMusic.play();
		/*
		 * EZSound saberSound = EZ.addSound("saberhum.wav"); EZSound clashSound
		 * = EZ.addSound("clash.wav"); EZSound impressiveSound =
		 * EZ.addSound("impressive.wav"); saberSound.loop();
		 */

		int playerX = 1350; // X position of player
		int playerY = 600; // Y position of player

		while (true) {

			String fileName[] = new String[3];
			int i = 0;

			for (i = 0; i < 3; i++) {
				fileName[i] = new String("KentD" + i + ".png");
				//EZ.addImage(fileName[0], 275, 200).hide();
				
				if (EZInteraction.isKeyDown('s')) {
					KentN.hide();
					playerY += 1;
					
					KentN = KentD0;
					KentD0.show();
					// for (i = 0; i < 3; i++) {
					// EZ.addImage(fileName[0], 275, 200).hide();
					// EZ.addImage(fileName[1], 275, 200);
					// EZ.addImage(fileName[2], 275, 200);
					// EZ.addImage(fileName[3], 275, 200);

				}
				if (EZInteraction.isKeyDown('w')) {
					KentN.hide();
					playerY -= 1;
					KentL0.hide();
					KentD0.hide();
					KentR0.hide();
					KentN = KentU0;
					KentU0.show();
				}
				if (EZInteraction.isKeyDown('d')) {
					KentN.hide();
					playerX += 1;
					KentL0.hide();
					KentD0.hide();
					KentU0.hide();
					KentN = KentR0;
					KentR0.show();
				}
				if (EZInteraction.isKeyDown('a')) {
					KentN.hide();
					playerX -= 1;
					KentR0.hide();
					KentD0.hide();
					KentU0.hide();
					KentN = KentL0;
					KentL0.show();
				}
			}

			KentN.translateTo(playerX, playerY);

			EZ.refreshScreen();
		}
	}
}
