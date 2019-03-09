Feature: email functionality

  @wip
  Scenario Outline: sending automated email
    Given user is already on the login page
    And   user enters valid credentials
    Then  user should be able to see the mainpage
    And   user clicks on the Compose button
    Then  user should be able to send an email to "<email>" with the subject "Message from ScrumMaster" and the following body
    """
    Dear <first_name>,

    We know that you have been working hard during the course.

    Please be patient and keep on hard-work until you reach the destination.

    Please be aware that we meet at the daily standup meeting 9.00 PM EST tonight too.

    -Scrum Master

    """

    Examples:
      | email                  | first_name |
      | cyberghostsm@gmail.com | Mehmet     |

