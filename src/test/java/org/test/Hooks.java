package org.test;

import org.base.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass{
	
	@Before
	private void bef() {
		launchBrowser();
		maximize();
		
}
	
	@Before (order=3)
	private void befsec2() {
		System.out.println("bef sec2");

	}
	@Before(order=2)
	private void befsec1() {
		System.out.println("bef sec1");

	}@Before(order=1)
	private void befsec3() {
		System.out.println("bef sec3");

	}
	
	
	@After(order=1)
	private void aftcse2() {
		System.out.println("aft sec2");
		}
	@After(order=2)
	private void aftcse3() {
		System.out.println("aft sec3");
		}
	@After(order=3)
	private void aftcse1() {
		System.out.println("aft sec1");
		}
	@After
	private void aft() {
	 toQuit();

	}
	
	
	
	
	
	
	

}
