/**
 * 
 */
package cricketmatchdashboard.model;

import java.util.ArrayList;
import java.util.List;

import cricketmatchdashboard.enums.BallType;
import cricketmatchdashboard.enums.BattingStatus;
import cricketmatchdashboard.enums.WicketType;

/**
 * @author VJ
 *
 */
public class Player {
	class BattingScore {
		int runs;
		int numberOfBallsFaced;
		int fours;
		int sixes;
		int singles;
		int doubles;
		int triples;
		BattingStatus battingStatus;
	}

	class BowlingScore {
//		private String overs;
		int ballsBowled;
//		private int extras; 
		int wides;
		int noBalls;
		List<Wicket> wickets;
		
		BowlingScore() {
			this.wickets = new ArrayList<>();
		}

		public String getOvers() {
			return ballsBowled / 6 + (ballsBowled % 6 != 0 ? "." + ballsBowled % 6 : "");
		}

		public int getExtras() {
			return wides + noBalls;
		}

		public int getNumberOfWickets() {
			return wickets == null ? 0 : this.wickets.size();
		}
	}

	String id;
	String name;
	String team;
	BattingScore battingScore;
	BowlingScore bowlingScore;

	public Player(String name) {
		this.battingScore = new BattingScore();
		this.bowlingScore = new BowlingScore();
	}

	public void updateBattingScore(int runs) {
		this.battingScore.runs += runs;
		this.battingScore.numberOfBallsFaced++;
		switch (runs) {
		case 1:
			this.battingScore.singles++;
			break;
		case 2:
			this.battingScore.doubles++;
			break;
		case 3:
			this.battingScore.triples++;
			break;
		case 4:
			this.battingScore.fours++;
			break;
		case 6:
			this.battingScore.sixes++;
			break;
		}
	}

	public void updateBowlingScore(String playerName, WicketType wicketType) {
		this.bowlingScore.wickets.add(new Wicket(playerName, wicketType));
		this.bowlingScore.ballsBowled++;
	}

	public void updateBowlingScore(BallType ballType) {
		this.bowlingScore.ballsBowled++;
		switch (ballType) {
		case NO_BALL:
			this.bowlingScore.noBalls++;
			break;
		case WIDE_BALL:
			this.bowlingScore.wides++;
		default:
			break;
		}
	}
}
