/**
 * 
 */
package cricketmatchdashboard.model;

import cricketmatchdashboard.enums.WicketType;

/**
 * @author v0j008y
 * 2 May 2022 23:31:33
 */
public class Wicket {

	Player batsman;
	Player bowler;
	Player fielder;
	WicketType type;
	
	Wicket(Player batsman, WicketType type) {
		this.batsman = batsman;
		this.type = type;
	}
	
	Wicket(String playerName, WicketType type) {
		this.type = type;
	}
}
