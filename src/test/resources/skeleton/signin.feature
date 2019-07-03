Feature: signin
Scenario Outline: Test signin with different sets of ip

Given User open Signin page
When User enters uname as "<username>"
And User enters pwd as "<password>"
And Click login


Examples:
|username|password|
|lalitha|password123|