public class StatePatternDemo
{
	public static void main(String[] args) 
	{
		Robot r = new Robot();
		System.out.println("Robot Boring State: ");
		r.setCurrentState(new BoringState());
		r.execute();

		System.out.println("Robot Happy State: ");
		r.setCurrentState(new HappyState());
		r.execute();
	}
}
