package ca.mcgill.ecse321.designpatterns.abstractfactory;

public class AndroidMenuBar implements AbstractMenuBar {
	@Override
	public String getType() {
		return "Android Studio";
	}
}