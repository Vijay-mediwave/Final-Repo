package com.RunnerHere;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Featurehere_file\\Problem_Tracker.feature",
glue="com.herestep_Definition",dryRun=false ,monochrome = false, plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }  )
public class Runner_Hereworcs {
	

}
