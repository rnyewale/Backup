package looslycoupling.service.impl;

import looslycoupling.service.CheatService;

public class CheatServiceHandler {

	private CheatService cheatService;

	/*
	 * public void setCheatService(CheatService cheatService) { this.cheatService =
	 * cheatService; }
	 */
	
	public CheatServiceHandler(CheatService cheatService) {
		this.cheatService=cheatService;
	}

	public void displayCheat() {
		cheatService.cheatingSubject();
	}
}
