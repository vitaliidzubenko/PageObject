Feature: : Testing UI AutoRia

  Scenario: №1 Registration
    Given Get the Home Page
    When Click Enter cabinet
    And Click Register
    And Click Enter with Google
    And Enter 'test.for.ria@gmail.com' and 'test.for.ria123'
    Then Verify bug for First Test

  Scenario: №2 Default search by Search Field at Home Page
    Given Get the Home Page
    When At Search Form enter parameters
    And Click Search button second test
    And Click at fifth result on page
    Then Verify result for Second Test

  Scenario: №3 Extended search from Home Page
    Given Get the Home Page
    When Click Advanced Search button at Search Field
    And At Advanced Search Form enter years '2010' and '2015' of vehicle
    And Click Search button third test
    And Click at First result on page
    Then Verify result for Third Test

  Scenario: №4 New car Search
    Given Get the Home Page
    When Click at header’s link New cars
    And Choose Chevrolet brand at Catalog of new cars
    And Choose Suburban model at Lineup block
    And Click at the image
    And Click at Offers, where to buy
    Then Verify result for Fourth Test

  Scenario: №5 Searching Bulldozer with search adjustment
    When Search Form enter parameter
    And Click on Special equipment at types of vehicles block
    And Choose Bulldozer at drop down list
    And Enter parameters of price from '40000' and price to '70000' and submit it
    And Click at the first element at the list
    Then Verify result for Fifth Test

  Scenario: №6 Searching Service station from Home Page header’s menu
    When Hover and click the link All for cars
    And Enter parameter at search field and submit it
    And Click on tick Official at options block and submit it
    And Click on Show the phone of first element at the list
    Then Verify the phone is shown

  Scenario: №7 Asking questions from footer menu Any questions?
    When Scroll down the page to the end, Click at link questions
    And Enter How to register at input search field and submit it
    And Click at second link of the list
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
    And Scroll down to Click at link Cars from Lithuania
    And At the left filters panel enter parameters and submit it
    And Click at one of filtered results
    Then Verify result for Nineth Test

  Scenario: №10 Searching car with some parameters, then changing parameters for other car type
    When Click at Tractor car at types of vehicle block
    And Choose a Tank type from drop down list
    And Enter parameters at Search block and submit it
    Then Check for results for Tenth Test
