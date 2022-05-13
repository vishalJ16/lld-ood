/**
 * 
 */
package cricketmatchdashboard;

import cricketmatchdashboard.display.DisplayImpl;

/**
 * @author VJ
 * 3 May 2022 12:37:20
 */
public class OverEndStatsPrinter implements OverEndSubscriber {

	private OverEndObservable observable;
	private boolean overEndedStatus;
	private String cricketMatchId;
	
	private DisplayImpl displayImpl;
	
	public OverEndStatsPrinter(OverEndObservable o) {
		this.observable = o;
	}

	@Override
	public void performOverEndAction() {
//		if (overEndedStatus) {
		int overNumber = this.observable.getOverNumber();
			this.printOverEndStats();
//		}
	}

	void printOverEndStats() {
		this.displayImpl.displayAllScores(this.cricketMatchId);
	}

	@Override
	public void overEnded(boolean value, String cricketMatchId) {
		this.overEndedStatus = value;
		this.cricketMatchId = cricketMatchId;
		performOverEndAction();
	}
}
