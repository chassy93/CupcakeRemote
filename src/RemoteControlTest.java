
public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		Oven oven = new Oven();
		Cupcake cupcake = new Cupcake();
		OvenOn ovenOn = new OvenOn(oven);
		OvenOff ovenOff = new OvenOff(oven);
		CupcakeBake bake = new CupcakeBake(cupcake);
		CupcakeDone done = new CupcakeDone(cupcake);
		
		remote.setCommand(ovenOn);
		remote.buttonWasPressed();
		remote.setCommand(bake);
		remote.buttonWasPressed();
		remote.setCommand(done);
		remote.buttonWasPressed();
		remote.setCommand(ovenOff);
		remote.buttonWasPressed();
	}
}
