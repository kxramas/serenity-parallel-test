package com.sample.serenity.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;

@At(urls = { "#HOST/sport" })
@NamedUrls({ @NamedUrl(name = "sport", url = "/sport") })
public class SportsPage extends PageObject {

	@FindBy(css = "nav.primary-nav ul.primary-nav__items")
	WebElementFacade sportsNavigationMenu;

	public int numberOfNavigationLinks() {
		return sportsNavigationMenu.findElements(By.xpath("./li")).size();
	}
}
