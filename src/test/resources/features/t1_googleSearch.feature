@Google
Feature: Google Search Functionality Title Verification
  Agile story: As a user, when I am on the Google search page I should type apple in the search box and
  I should see the title Steve Jobs

  Scenario: Search page title verification
    When user is on Google search page
    And user types apple in the google search box and clicks enter
    Then user sees Steve Jobs is in the google title
