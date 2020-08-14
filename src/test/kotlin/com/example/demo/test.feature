Feature:
  Create diary entry

  Scenario:
    Given "Ian" clicks button "Add Diary"
    And choose date as "01-01-2020"
    When write diary "today is a wonder day"
    Then system display new button "Save"
