Feature: To validate the Flipkart Application

Background:

Given Launch the Flipkart Application
When Close the popup
Then It should Navigate to the Home page

#@tc001 @Regression
#Scenario: To validate the Search functionality

#Given User enter the Text in the Search field
#When Click the search button
#Then It should navigate to the search result page and display the relevent details
#And Extract the results and print in console
#And Print the Third result and keep it in the console
#And Select Minimum and Maximum Amount
#And Select the Brand
#And Select the Battery Capacity
#Then It should display the Relevant result

#@tc002 @Regression
#Scenario: To validate the Fashion Functionality

#Given User to move the Fashion link
#When Cursor to move to the Trends link
#And Click On Search bar
#And Search For Flowers Key word
#Then It should display page title


  #Scenario Outline permet d'exécuter le même scénario avec plusieurs jeux de données (Examples).
  @tc003
  Scenario Outline: To validate the search functionality with different values

    Given Enter the "<searchtext>" in the search field
    When click the search button
    Then It should navigate to the next page and display the corresponding page

    Examples:
      | searchtext |  |
      | Mobile     |  |
      | Tv         |  |
      | Speaker    |  |
      | Shirt      |  |