package com.sample.serenity.steps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.sample.serenity.pages.SportsPage;

import net.thucydides.core.annotations.Step;

public class SportsUserSteps {

	SportsPage sportsPage;

	@Step
	public void navigates_to_sports_page() {
		sportsPage.open("sport", new String[0]);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Step
	public void should_see_number_of_links_as(int count) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		assertThat("Number of navigation links dont Match", sportsPage.numberOfNavigationLinks(), equalTo(count));
	}

}
