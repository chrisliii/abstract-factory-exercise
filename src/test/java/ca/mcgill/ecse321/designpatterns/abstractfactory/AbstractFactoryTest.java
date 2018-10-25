package ca.mcgill.ecse321.designpatterns.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class AbstractFactoryTest {
	@Test
	public void testOSX() {
		testExpectedValues(new OSXFactory(), "Nice looking button", "Cocoa");
	}
	
	@Test
	public void testWindows() {
		testExpectedValues(new WindowsFactory(), "Ugly button", "Qt");
	}
	
	@Test
	public void testAndroid() {
		testExpectedValues(new AndroidFactory(), "Android button", "Android Studio");
	}
	
	private void testExpectedValues(AbstractFactory factory, String buttonDesc, String menuType) {
		AbstractButton button = factory.createButton();
		AbstractMenuBar menuBar = factory.createMenuBar();
		
		assertEquals(button.getDescription(), buttonDesc);
		assertEquals(menuBar.getType(), menuType);
	}
}
