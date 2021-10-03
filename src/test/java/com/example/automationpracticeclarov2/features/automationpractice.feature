Feature: Sign Up on Automation Practice Website
  A new client will get in the automation practice website
  to do a sign up, create a new account

    Scenario: Sign Up Successfully
      Given the user open the browser
      Given the new user access the landing page
      And the user clicks to sign in
      And the user fills the email field with a valid to create a new account
      And the female user fills all needed fields to create your account
      Then the user closes the browser

    Scenario Outline: Login With an Already Existent User
      Given the user open the browser
      Given the new user access the landing page
      And the user clicks to sign in
      And the user fills the <email> field with a valid to login
      Then the user closes the browser
      Examples:
      | email                               |
      | babiperina+03102021_011637@test.com |
