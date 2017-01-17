package com.sample.jbehave.steps;

import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.ThucydidesSystemProperty;

public class JbehaveScenario1StoriesRunner extends SerenityStories {

	public JbehaveScenario1StoriesRunner() {
		super();
		findStoriesCalled("stories/bbc/sports/validate_links1.story");

		String browserType = System.getProperty("au.basket.test.browser");
		if (browserType == null) {
			browserType = "chrome";
		}
		runSerenity().withDriver(browserType);

		if (browserType.equalsIgnoreCase("chrome")) {
			String browserExecutable = System.getProperty("webdriver.chrome.driver");
			if (browserExecutable == null) {
				throw new RuntimeException("Please provide 'webdriver.chrome.driver' property");
			}
			runSerenity().withProperty(ThucydidesSystemProperty.WEBDRIVER_CHROME_DRIVER).setTo(browserExecutable);
		}

	}
}
