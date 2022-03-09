Feature: Automation Practice Scenarios

  @H2
  Scenario: Automation Practice Search Item
    Given I am Automation Practice Homepage
    When I search dress
    Then I navigate to search results page
@H2
  Scenario: Validate search keyword
    Given I am Automation Practice Homepage
    When I search for 'skirt'
    Then I validate search keyword 'skirt'

  @H2
  Scenario Outline: Homepage links navigations
    Given I am Automation Practice Homepage
    When I click on link'<Links>'
    Then I validate the page navigates to '<URL>' and '<Title>'

    Examples: 
      | Links    | URL                                                                       | Title               |
      | Women    | http://automationpractice.com/index.php?id_category=3&controller=category | Women - My Store    |
      | T-shirts | http://automationpractice.com/index.php?id_category=5&controller=category | T-shirts - My Store |
