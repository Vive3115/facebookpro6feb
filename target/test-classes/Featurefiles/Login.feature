@login
Feature:
  To Validate Login Functionality of Facebook Application
 
  Background:
Given User have enter facebook login page through edge browser

@smoke @sanity
  
  Scenario:
   To Validate Login using invalid username and invalid password
   
   
   When  User enter invalid username and invalid password
   |rajavivek667@gmail.com|vivek143|vivenith143@gmail.com|nithya143|
   And  User click the login button 
   Then User should be in invalid credential page 
  
   @smoke @regression
   Scenario:
   To Validate Login using valid username and invalid password
   
   
   When  User enter valid username and invalid password
   |selenium|selenium12@gmil.com|selenium12|
   |python|python@11566@gmail.com|puthon90|
   |vivek|vivenith143@gmail.com|viveknithya143|
   And  User click the login button 
   Then User should be in invalid credential page 