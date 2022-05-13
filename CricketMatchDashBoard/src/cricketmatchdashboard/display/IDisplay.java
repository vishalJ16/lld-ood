/**
 * 
 */
package cricketmatchdashboard.display;

/**
 * @author VJ
 *
 */
public interface IDisplay {
	
	void displayAllScores(String cricketMatchId);

	void displayMatchScore(String cricketMatchId);
	
	void displayPlayerBattingScore(String playerId);
	
	void displayPlayerBowlingScore(String playerId);
	
	void displayTeamBattingScore(String teamId);
	
	void displayTeamBowlingScore(String teamId);
}
