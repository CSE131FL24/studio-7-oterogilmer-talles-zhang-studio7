package studio7;

public class Die {

	private int n;
	
	public Die(int initN)
	{
		n = initN;
	}
	
	public int toss() {
		return (int)(Math.random()*n +1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die1 = new Die(6);
		System.out.println(die1.toss());
	}

}
