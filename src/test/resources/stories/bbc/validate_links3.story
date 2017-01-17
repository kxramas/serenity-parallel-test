Feature: Feature 3

Narrative:
...

Lifecycle:
Before:
Given a user on bbc home page

Scenario: Scenario 3
Meta:
@regression

When user navigates to sports page
Then <count> number of navigation links should be displayed

Examples:
|count|
|11|
|10|
|11|