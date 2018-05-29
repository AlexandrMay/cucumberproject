Feature: Application Login

  Background:
    Given Validate the browser
    When Browser is triggered
    Then Check if browser is started

  @RegTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into app with username "user" and password "123"
    Then Homepage is populated
    And Cards displayed are "true"

    @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into app with username "user2" and password "123"
    Then Homepage is populated
    And Cards displayed are "false"

    @RegTest
  Scenario: Home page default login4
    Given User is on NetBanking landing page
    When User login into app with following details
    | John | 123456 | Dnipro | 49114 |
    Then Homepage is populated
    And Cards displayed are "false"

  @RegTest
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When User login into app with "<username>" and "<password>"
    Then Homepage is populated
    And Cards displayed are "false"

    Examples:
    |username|password|
    |user1   |pass1   |
    |user2   |pass2   |