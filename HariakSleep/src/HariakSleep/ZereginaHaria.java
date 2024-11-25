package HariakSleep;

import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class ZereginaHaria.
 */
public class ZereginaHaria extends Thread {

	/** Hariaren izena. */
	private final String izena;

	/** Lo egongo den denbora. */
	private final Random random;

	/**
	 * Instantiates a new zeregina haria.
	 *
	 * @param nombre the nombre
	 */
	public ZereginaHaria(String nombre) {
		this.izena = nombre;
		this.random = new Random();
	}

	/**
	 * Run.
	 */
	@Override
	public void run() {
		try {

			int Denborasleep = random.nextInt(5000);

			Thread.sleep(Denborasleep);

			System.out.println("Hari " + izena + " lo egon da " + Denborasleep + " ms.");
		} catch (InterruptedException e) {
			System.out.println("Hari " + izena + " interrupzioa gertatu da.");
		}
	}
}
