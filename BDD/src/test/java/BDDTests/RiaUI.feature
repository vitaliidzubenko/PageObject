Feature: : Testing UI AutoRia

  Scenario: №1 Registration
    Given Get the Home Page
    When Click Enter cabinet
    Then Click Register
    When Click Enter with Google
    And Enter email and password
      | test.for.ria@gmail.com |
      | test.for.ria123        |
    Then Click Submit
    And See bug for Test №1

  Scenario: №2 Default search by Search Field at Home Page
    Given Get the Home Page
    When At Search Form enter parameters
    Then Click Search button
    When Click at fifth result on page
    Then See result for Test №2

  Scenario: №3 Extended search from Home Page
    Given Get the Home Page
    When Click Advanced Search button at Search Field
    And At Advanced Search Form enter detailed parameters
      | 2010 |
      | 2015 |
    Then Click Search button
    When Click at First result on page
    Then See result for Test №3

  Scenario: №4 New car Search
    Given Get the Home Page
    When Click at header’s link New cars
    Then Choose Chevrolet brand at Catalog of new cars
    And Choose Suburban model at Lineup block
    When Click at the image 2014 - 2018
    Then Click at Offers, where to buy
    And See result for Test №4

  Scenario: №5 Searching Bulldozer with search adjustment
    When Search Form enter parameter
    Then Click on Special equipment at types of vehicles block
    And Choose Bulldozer at drop down list
    And Enter parameters in search block
      | 40000 |
      | 70000 |
    When Click Search button
    Then Click at the first element at the list
    And See result for Test №5

  Scenario: №6 Searching Service station from Home Page header’s menu
    When Hover the link All for cars
    And Click at drop down list at link Service station catalog
    Then Enter parameters at search field:
      | Vinnitsa |
    And Click Search button
    When Click on tick Official at options block
    And Click Search button
    And Click on Show the phone of first element at the list
    Then Copy the phone to clipboard

  Scenario: №7 Asking questions from footer menu Any questions?
    When Scroll down the page to the end
    And Click at link Any questions?
    Then Enter How to register at input search filed
    And Click Search button
    When Click at second link of the list
    Then See result for Test №7

  Scenario: №8 Checking other sites of Ria company, using headers menu
    When Click at link Ria.com at headers menu
    Then Check the address of URL, copy it
    And Get back to the Home Page
    When Click at link Realty at headers menu
    Then Check the address of URL, copy it
    And Get back to Home Page
    When Click at link Car goods at headers menu
    Then Check the address of URL, copy it
    And Get back to Home Page
    When Click at link Auto parts at headers menu
    Then Check the address of URL, copy it

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
    And See result for Test №9

  Scenario: №10 Searching car with some parameters, then changing parameters for other car type
    When Click at Tractor car at types of vehicle block
    And Choose a Tank type from drop down list
    Then Enter parameters at Search block:
      | MAN  |
      | 2015 |
      | 2018 |
    When Click Search button
    Then Check for results for Test №10
