/**
 * 
 */
package cricketmatchdashboard.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cricketmatchdashboard.OverEndObservable;
import cricketmatchdashboard.OverEndStatsPrinter;
import cricketmatchdashboard.StrikeRotator;
import cricketmatchdashboard.enums.MatchStatus;

/**
 * @author VJ
 * 2 May 2022 21:53:23
 */
public class CricketMatch {

	String id;
	List<Team> teams = new ArrayList<>();
	int overs;
	MatchStatus matchStatus;
	String currentBattingTeam;
	String currentBowlingTeam;
	Player battingEnd;
	Player bowlingEnd;

	boolean overEnded;

	final private OverEndObservable overEndObservable = new OverEndObservable(this);
	final private OverEndStatsPrinter overEndStatsPrinter = new OverEndStatsPrinter(overEndObservable);
	final private StrikeRotator strikeRotator = new StrikeRotator(overEndObservable);

	public CricketMatch(int overs, int playersEachteam) {
		this.overs = overs;
		Team teamA = new Team("A", playersEachteam);
		Team teamB = new Team("B", playersEachteam);
		this.teams.add(teamA);
		this.teams.add(teamB);
		this.overEndObservable.addSubscriber(overEndStatsPrinter);
		this.overEndObservable.addSubscriber(strikeRotator);
	}

	public CricketMatch(int overs, Team team1, Team team2) {
		this.overs = overs;
		this.teams.add(team1);
		this.teams.add(team2);
		this.overEndObservable.addSubscriber(overEndStatsPrinter);
		this.overEndObservable.addSubscriber(strikeRotator);
	}

	public void start() {
		Scanner in = new Scanner(System.in);
		for (int i = 1; i <= this.overs; i++) {
			System.out.println("Over number: " + i);
			while (in.hasNext()) {
				String curr = in.next();
			}
			overEndObservable.overEnded(i);; // observer pattern
		}

		in.close();
	}

	public Player getBattingEnd() {
		return this.battingEnd;
	}

	public Player getBowlingEnd() {
		return this.bowlingEnd;
	}

	public void setBattingEnd(Player p) {
		this.battingEnd = p;
	}

	public void setBowlingEnd(Player p) {
		this.bowlingEnd = p;
	}
}
