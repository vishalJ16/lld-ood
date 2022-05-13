/**
 * 
 */
package cricketmatchdashboard;

import cricketmatchdashboard.model.CricketMatch;
import cricketmatchdashboard.model.Player;

/**
 * @author VJ
 * 3 May 2022 15:13:19
 */
public class StrikeRotator implements OverEndSubscriber {

	private OverEndObservable observable;
	private CricketMatch match;

	public StrikeRotator(OverEndObservable overEndObservable) {
		this.observable = overEndObservable;
	}

	@Override
	public void performOverEndAction() {
		this.rotateStrike();
	}

	@Override
	public void overEnded(boolean value, String cricketMatchId) {
		this.match = this.observable.getMatch();
	}

	private void rotateStrike() {
		System.out.println("Rotating strike after over number: " + this.observable.getOverNumber());
		Player curr = this.match.getBattingEnd();
		this.match.setBattingEnd(this.match.getBowlingEnd());
		this.match.setBowlingEnd(curr);
	}

}
