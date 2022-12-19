Feature: Register Test Senaryo Outline

  Scenario Outline: Create An Account

    Given Navigate to Website
    And click Sign in button
    And type firstname "<firstname>"
    And  type email "<Email>"
    And click on Create an Account button
    And close all the windows



    Examples:
      |firstname | Email|

      |omer| ozdemir@hotmail.com |
      |faruk| frk@hotmail.com |
      |harun| kisi2soyisim@hotmail.com|