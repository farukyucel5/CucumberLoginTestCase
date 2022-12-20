Feature: Register test

  Background:
    Given Navigate to Website
    And click Sign in button

    Scenario: Kişi 1
      And type firstname "ismail demir"
      And  type email "ism@gmail.com"


      Scenario: Kişi 2
        And type firstname "Ayse ot"
        And  type email "ot@gmail.com"



        Scenario Outline: Create An Account
          And type firstname "<firstname>"
          And  type email "<Email>"
          And click on Create an Account button
          Examples:
            |firstname | Email|

            |omer| ozdemir@hotmail.com |
            |faruk| frk@hotmail.com |
            |harun| kisi2soyisim@hotmail.com|















































