Feature: Contact us test

  Scenario: Go to the website and test Contact us page

    Given navigate to the website
    And click on contact us button
    And type in your firstname
    And type in your lastname
    And type in your email
    And write a message
    When click on the send button
    Then verify confirmation message
    Then close it


