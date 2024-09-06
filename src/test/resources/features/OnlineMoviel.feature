Feature: API Testing with Rest Assured

  Scenario: Register a new user
    Given the user registration endpoint is available
    When I register a user with username "Saran", password "saran123", and email "saran@example.com"
    Then the response status code should be 201
    And the response body should contain username "Saran" and email "saran@example.com"

  Scenario: Login a user
    Given the user login endpoint is available
    When I login with username "Aravindkumar" and password "Aravindkumar123"
    Then the response status code should be 200
    And the response body should contain message "Login successful"

  Scenario: Update user details
    Given the user update endpoint is available
    When I update user with id 1 with username "Aravindark" and email "aravindark@example.com"
    Then the response status code should be 200
    And the response body should contain username "Aravindark" and email "aravindark@example.com"

  Scenario: Delete a user
    Given the user delete endpoint is available
    When I delete user with id 3
    Then the response status code should be 204

  Scenario: Post a movie
    Given the movie post endpoint is available
    When I post a movie with title "Master", director "lokesh", genre "Sci-Fi", and releaseDate "2017-07-16"
    Then the response status code should be 201
    And the response body should contain title "Master" and director "lokesh"

  Scenario: Get a movie by ID
    Given the movie get by ID endpoint is available
    When I get the movie with ID 1
    Then the response status code should be 200
    And the response body should contain title "Goat"

  Scenario: Post a rental
    Given the rental post endpoint is available
    When I post a rental with userId 1, movieId 1, and rentalDate "2022-01-01"
    Then the response status code should be 201
    And the response body should contain userId 1 and movieId 1

  Scenario: Get all rentals
    Given the rentals get all endpoint is available
    When I get all rentals
    Then the response status code should be 200
    And the response body should contain rentals
