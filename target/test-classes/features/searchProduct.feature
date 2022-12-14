Feature: Search and place the order for products

Scenario Outline: Search Experience for product search in both home page and offer page

Given User is on Greenkart landing page
When user searched with shortname <Name> and extracted actual name of product
#Then user searched for 'tom' shortname in offers page
#And validate producname in offer page matches with landing page

Examples: 
|Name|
|tom|


 