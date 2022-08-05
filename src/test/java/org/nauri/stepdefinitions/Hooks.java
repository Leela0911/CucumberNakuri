package org.nauri.stepdefinitions;

import org.nakuri.resources.Commonactionnakuri;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactionnakuri {

	Commonactionnakuri c = new Commonactionnakuri();
	@Before
	public void beforeScenario()
	{
		c.launch();
	}
	@After
	public void afterScenario()
	{
		driver.quit();
	}
}
