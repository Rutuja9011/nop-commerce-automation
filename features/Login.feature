Feature:Login Funcality
Scenario: User is able to login valid crendinals
Given  User is on nopcommerce site
When User click on login
And User enter username and password
And  User click on login button
Then User should successful login
