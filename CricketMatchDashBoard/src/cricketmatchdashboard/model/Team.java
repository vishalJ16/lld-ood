/**
 * 
 */
package cricketmatchdashboard.model;

import java.util.List;

/**
 * @author VJ
 *
 */
public class Team {

	String name;
	String numberOfOversPlayed;
	List<Player> players;
	BattingScore battingScore;
	BowlingScore bowlingScore;

	public Team(String name, String[] players) { 
		this.name = name;
		for(String p : players) {
			this.players.add(new Player(p));
		}
	}

	public Team(String name, int noOfPlayers) {
		
	}

	class BattingScore {
		int total;
		int wicketsFallen;
//		int oversPlayed;
		int extras;
		int ballsFaced;
		int fours;
		int sixes;
		int singles;
		int doubles;
		int triples;

		public String getOversPlayed() {
			return ballsFaced / 6 + (ballsFaced % 6 != 0 ? "." + ballsFaced % 6 : "");
		}
	}

	class BowlingScore {
//		private String overs;
		int bowlsBowled;
		int wickets;
//		private int extras; 
		int wides;
		int noBalls;

		public String getOvers() {
			return bowlsBowled / 6 + (bowlsBowled % 6 != 0 ? "." + bowlsBowled % 6 : "");
		}

		public int getExtras() {
			return wides + noBalls;
		}
	}
}
