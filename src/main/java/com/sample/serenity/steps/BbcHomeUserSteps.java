package com.sample.serenity.steps;

import com.sample.serenity.pages.BbcHomePage;

import net.thucydides.core.annotations.Step;

public class BbcHomeUserSteps {

	BbcHomePage bbcHomePage;

	@Step
	public void navigates_to_bbc_home_page() {
		bbcHomePage.open();
	}

}
