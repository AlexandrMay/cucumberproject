Feature: Application Login

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into app with username "user" and password "123"
    Then Homepage is populated
    And Cards displayed are "true"

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into app with username "user2" and password "123"
    Then Homepage is populated
    And Cards displayed are "false"

  Scenario: Home page default login4
    Given User is on NetBanking landing page
    When User login into app with following details
    | John | 123456 | Dnipro | 49114 |
    Then Homepage is populated
    And Cards displayed are "false"