Feature: limeroad order

  Scenario: To search a product for men
    Given Launch the browser
    When user open the url "https://www.limeroad.com/"
    And click on shop men
    Then user should see the products displayed for men
