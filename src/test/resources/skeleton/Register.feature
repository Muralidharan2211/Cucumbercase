Feature: Register into testme app

Scenario: Register with valid credentials

Given user opens signup page in newtour application
When user enters username as "dfinaaa"
And user enters firstname as "dfinaaa"
And user enters lastname as "dhoniaaa"
And user enters password as "Msdhoni123"
And user enters confirmpassword as "Msdhoni123"
And user selects gender as "Male"
And user enters email as "Msdhoni123@gmail.com"
And user enters mobno as "1234567890"
And user enters dob as "22-11-1997"
And user enters address as "Alex12345"
And user enters answer as "chennai"
Then click register button

