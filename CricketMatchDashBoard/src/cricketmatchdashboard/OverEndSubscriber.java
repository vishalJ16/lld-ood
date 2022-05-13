/**
 * 
 */
package cricketmatchdashboard;

/**
 * @author VJ
 * 3 May 2022 12:35:51
 */
public interface OverEndSubscriber {

	void performOverEndAction();
	
	void overEnded(boolean value, String cricketMatchId);
}
