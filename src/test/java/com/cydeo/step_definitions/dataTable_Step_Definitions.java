package com.cydeo.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class dataTable_Step_Definitions {

    @Then("user should see fruits I like")
    public void user_should_see_fruits_i_like(List<String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(3));

    }


}
