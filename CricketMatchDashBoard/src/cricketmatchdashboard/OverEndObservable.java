/**
 * 
 */
package cricketmatchdashboard;

import java.util.ArrayList;
import java.util.List;

import cricketmatchdashboard.model.CricketMatch;

/**
 * @author VJ
 * 3 May 2022 12:33:01
 */
public class OverEndObservable {

	private CricketMatch match;
	private int overNumber;

	final List<OverEndSubscriber> subscribers = new ArrayList<>();

	public OverEndObservable(CricketMatch cricketMatch) {
		this.match = cricketMatch;
	}

	public void addSubscriber(OverEndSubscriber e) {
		this.subscribers.add(e);
	}

	public void removeSubscriber(OverEndSubscriber e) {
		this.subscribers.remove(e);
	}

	private void notifySubscribers() {
		for (OverEndSubscriber e : subscribers) {
//			e.setOverEnded(true);
			e.performOverEndAction();
		}
	}

	public void overEnded(int overNumber) {
		this.overNumber = overNumber;
		this.notifySubscribers();
	}

	public int getOverNumber() {
		return this.overNumber;
	}

	public CricketMatch getMatch() {
		return this.match;
	}
}
