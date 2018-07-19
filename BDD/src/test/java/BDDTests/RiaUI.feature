Feature: : Testing UI AutoRia

  Scenario: №1 Registration
    Given Get the Home Page
    When Click Enter cabinet
    Then Click Register
    When Click Enter with Google
    And Enter email and password
      | test.for.ria@gmail.com |
      | test.for.ria123        |
    Then Verify bug for First Test

  Scenario: №2 Default search by Search Field at Home Page
    Given Get the Home Page
    When At Search Form enter parameters
    Then Click Search button second test
    When Click at fifth result on page
    Then Verify result for Second Test

  Scenario: №3 Extended search from Home Page
    Given Get the Home Page
    When Click Advanced Search button at Search Field
    And At Advanced Search Form years of vehicle
      | 2010 |
      | 2015 |
    Then Click Search button third test
    When Click at First result on page
    Then Verify result for Third Test

  Scenario: №4 New car Search
    Given Get the Home Page
    When Click at header’s link New cars
    Then Choose Chevrolet brand at Catalog of new cars
    And Choose Suburban model at Lineup block
    When Click at the image
    Then Click at Offers, where to buy
    And Verify result for Fourth Test

  Scenario: №5 Searching Bulldozer with search adjustment
    When Search Form enter parameter
    Then Click on Special equipment at types of vehicles block
    And Choose Bulldozer at drop down list
    And Enter parameters of price in search block and submit it
      | 40000 |
      | 70000 |
    When Click at the first element at the list
    Then Verify result for Fifth Test

  Scenario: №6 Searching Service station from Home Page header’s menu
    When Hover and click the link All for cars
    Then Enter parameter at search field and submit it
    When Click on tick Official at options block and submit it
    And Click on Show the phone of first element at the list
    Then Verify the phone is shown

  Scenario: №7 Asking questions from footer menu Any questions?
    When Scroll down the page to the end, Click at link questions
    Then Enter How to register at input search field and submit it
    When Click at second link of the list
    Then Verify result for Seventh Test

  Scenario: №8 Checking other sites of Ria company, using headers menu
    When Click at link Ria.com at headers menu
    Then Check the address of URL Ria, Get back to Main page
    When Click at link Realty at headers menu
    Then Check the address of URL Realty, Get back to Main page
    When Click at link Car goods at headers menu
    Then Check the address of URL Car goods, Get back to Main page
    When Click at link Auto parts at headers menu
    Then Check the address of URL Auto parts, Get back to Main page
    And Verify that the last website is displayed

  Scenario: №9 Searching Car from abroad
    When Scroll down to click the Car from abroad
    Then Scroll down to Click at link Cars from Lithuania
    When At the left filters panel enter parameters and submit it
    Then Click at one of filtered results
    And Verify result for Nineth Test

  Scenario: №10 Searching car with some parameters, then changing parameters for other car type
    When Click at Tractor car at types of vehicle block
    And Choose a Tank type from drop down list
    Then Enter parameters at Search block and submit it
    And Check for results for Tenth Test
