package studio7;

public class HockeyPlayer {

	private String name;
	private int jerseyNumber;
	private boolean rightHanded;
	private boolean both;
	private int goals;
	private int assists;
	private int points;
	private int games;
	
	public HockeyPlayer(String iName, int iJerseyNumber, boolean iRightHanded, boolean iBoth, int iGoals, int iAssists, int iPoints, int iGames)
	{
		name = iName;
		jerseyNumber = iJerseyNumber;
		rightHanded = iRightHanded;
		both = iBoth;
		goals = iGoals;
		assists = iAssists;
		points = iPoints;
		games = iGames;
	}
	
	public void completedGame(int newGoals, int newAssists) {
		goals = goals + newGoals;
		assists = assists + newAssists;
		points = points + newGoals + newAssists;
		games++;
	}
	
	public String toString()
	{
		return "name: " + name + ", jersey number: "+ jerseyNumber + ", goals: "+goals+", assists: "+assists + ", points: " + points + "games: "+games;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
