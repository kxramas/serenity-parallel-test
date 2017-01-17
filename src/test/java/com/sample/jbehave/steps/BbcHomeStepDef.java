package com.sample.jbehave.steps;

import org.jbehave.core.annotations.Given;

import com.sample.serenity.steps.BbcHomeUserSteps;

import net.thucydides.core.annotations.Steps;

public class BbcHomeStepDef {

	@Steps
	BbcHomeUserSteps bbcHomeUser;

	@Given("a user on bbc home page")
	public void userIsOnBbcHomePage() {
		bbcHomeUser.navigates_to_bbc_home_page();
	}

}
