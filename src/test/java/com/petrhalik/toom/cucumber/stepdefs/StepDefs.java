package com.petrhalik.toom.cucumber.stepdefs;

import com.petrhalik.toom.ToomApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ToomApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
