package swt.mobileball;

import org.eclipse.swt.widgets.Display;

/**
 * Main program for executing the mobile ball using SWT for the interface.
 * @author Imar Abreu Diaz
 * @since 5-9-2018
 */
public class MobileBall {

	public static void main(String[] args) {
		final Display display = new Display();
		@SuppressWarnings("unused")
		GraphicBallWindow shell = new GraphicBallWindow(display);
		
		display.dispose();
	}
}
