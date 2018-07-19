Feature: : Testing UI AutoRia

  Scenario: №1 Registration
    Given Get the Home Page
    When Click Enter cabinet
    Then Click Register
    When Click Enter with Google
    And Enter email and password
      | test.for.ria@gmail.com |
      | test.for.ria123        |
    Then See bug for First Test

  Scenario: №2 Default search by Search Field at Home Page
    Given Get the Home Page
    When At Search Form enter parameters
    Then Click Search button second test
    When Click at fifth result on page
    Then See result for Second Test

  Scenario: №3 Extended search from Home Page
    Given Get the Home Page
    When Click Advanced Search button at Search Field
    And At Advanced Search Form enter detailed parameters
      | 2010 |
      | 2015 |
    Then Click Search button third test
    When Click at First result on page
    Then See result for Third Test

  Scenario: №4 New car Search
    Given Get the Home Page
    When Click at header’s link New cars
    Then Choose Chevrolet brand at Catalog of new cars
    And Choose Suburban model at Lineup block
    When Click at the image
    Then Click at Offers, where to buy
    And See result for Fourth Test

  Scenario: №5 Searching Bulldozer with search adjustment
    When Search Form enter parameter
    Then Click on Special equipment at types of vehicles block
    And Choose Bulldozer at drop down list
    And Enter parameters in search block
      | 40000 |
      | 70000 |
    When Click Search button fifth test
    Then Click at the first element at the list
    And See result for Fifth Test

  Scenario: №6 Searching Service station from Home Page header’s menu
    When Hover the link All for cars
    And Click at drop down list at link Service station catalog
    Then Enter parameters at search field
      | Vinnitsa |
    And Click Search button sixth test
    When Click on tick Official at options block
    And Click Submit button
    And Click on Show the phone of first element at the list
    Then Copy the phone to clipboard

  Scenario: №7 Asking questions from footer menu Any questions?
    When Scroll down the page to the end
    And Click at link Any questions?
    Then Enter How to register at input search field
    And Click Search button seventh test
    When Click at second link of the list
    Then See result for Seventh Test

  Scenario: №8 Checking other sites of Ria company, using headers menu
    When Click at link Ria.com at headers menu
    Then Check the address of URL Ria, copy it
    And Get back to the Home Page
    When Click at link Realty at headers menu
    Then Check the address of URL Realty, copy it
    And Get back to Home Page
    When Click at link Car goods at headers menu
    Then Check the address of URL Car goods, copy it
    And Get back to Home Page
    When Click at link Auto parts at headers menu
    Then Check the address of URL Auto parts, copy it

  Scenario: №9 Searching Car from abroad
    When Scroll down to see the AutoRia recommends you
    And Click at link Car from abroad
    Then Scroll down to see the block Cars from Europe
    And Click at link Cars from Lithuania
    When At the left filters panel enter parameters:
      | Passenger car |
      | BMW           |
      | X5M           |
    Then Scroll down to see filtered results
    And See result for Nineth Test

  Scenario: №10 Searching car with some parameters, then changing parameters for other car type
    When Click at Tractor car at types of vehicle block
    And Choose a Tank type from drop down list
    Then Enter parameters at Search block
      | MAN  |
      | 2015 |
      | 2018 |
    When Click Search button tenth test
    Then Check for results for Tenth Test
