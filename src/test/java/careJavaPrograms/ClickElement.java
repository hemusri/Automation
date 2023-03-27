package careJavaPrograms;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class ClickElement//chatGPT 
{
	public static void main(String[] args)
	{
		// Coordinates of the element you want to click
		int x = 100;
		int y = 200;

		try 
		{
			// Create a new Robot instance
			Robot robot = new Robot();

			// Move the mouse cursor to the desired screen coordinates
			robot.mouseMove(x,y);

			// Simulate a mouse click
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		}
		catch (Exception e) 
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
}