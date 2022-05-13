package cricketmatchdashboard;

import cricketmatchdashboard.model.CricketMatch;
import cricketmatchdashboard.model.Team;

/**
 * @author VJ
 *
 */
public class CricketMatchDashBoard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int noOfPlayersEachTeam = 5;
		int noOfOvers = 2;

		Team teamA = new Team("A", new String[] { "P1", "P2", "P3", "P4", "P5" });
		Team teamB = new Team("B", new String[] { "P1", "P2", "P3", "P4", "P5" });
		CricketMatch match = new CricketMatch(noOfOvers, teamA, teamB);
		match.start(); // facade pattern
	}

}
