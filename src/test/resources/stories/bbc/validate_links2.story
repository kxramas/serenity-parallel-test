Feature: Feature 2

Narrative:
...

Lifecycle:
Before:
Given a user on bbc home page

Scenario: Scenario 2
Meta:
@regression

When user navigates to sports page
Then <count> number of navigation links should be displayed

Examples:
|count|
|11|
|11|
|11|

Scenario: Scenario 5
Meta:
@regression

When user navigates to sports page
Then <count> number of navigation links should be displayed

Examples:
|count|
|11|
|10|
|9|