package com.sample.jbehave.steps;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.sample.serenity.steps.SportsUserSteps;

import net.thucydides.core.annotations.Steps;

public class SportsStepDef {

	@Steps
	SportsUserSteps sportsUser;

	@When("user navigates to sports page")
	public void userNavigatesToSportsPage() {
		sportsUser.navigates_to_sports_page();
	}

	@Then("<count> number of navigation links should be displayed")
	public void numberOfNavigationLinksShouldBeDisplayed(@Named("count") String count) {
		sportsUser.should_see_number_of_links_as(Integer.parseInt(count));
	}

}
