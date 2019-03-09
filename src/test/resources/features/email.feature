Feature: email functionality

  @newYear
  Scenario Outline: sending an automated new year email
    Given user is already on the login page
    And   user enters valid credentials
    Then  user should be able to see the mainpage
    And   user clicks on the Compose button
    Then  user should be able to send an email to "<email>" with the subject "Happy new Year!" and the following body
    """
    Dear <first_name>,

    We know that <old-year> has been a long and demanding year for all of us.    
    
    For the <new_year> I  want to wish you a lot of health, everyday optimism and fulfillment of dreams and New Year’s resolutions!
    
    
    Regards,
    
    xxxxx

    """

    Examples:
      | email                  | first_name | old_year| new_year|
      | xxxxYYYYYY@gmail.com   | xxxx       | 2018    | 2019    |

