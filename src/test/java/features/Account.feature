Feature: Account Login

  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into app with username "user" and password "123"
    Then Homepage is populated
    And Cards displayed are "true"
