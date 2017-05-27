package com.cucumber.test;

import cucumber.api.java.en.Given;

public class Login {
@Given("Open Browser")

public static void launch(){
	System.out.println("Browser launched");
}
}
