Feature:  Chase Auto Quote Feature
Scenario: Chase click Auto Link Scenario
Given     User is already on Chase Home Page
When      Interact 4th Slick-dot to display Auto Icon
Then      Select Auto Icon
Scenario: Chase Auto Shop Scenario
When      Select Shop Icon
Then      Select Shop Now Button

Scenario: Chase Search Page Scenario
Given     Window focus switched to new window
And       Ready to buy section available
And       Window title is Chase Auto
When      Get Header content
And       Set GetReady,Zipcode,Condition,New,Used,Body Style,All Body Style,Car Make,All Make,Car Model,All Model,Search,Dream,Match,Get Started
And       New is Selected
And       Verify Zipcode text box 
And       Click submit
And       Verify Zipcode error message
And       Verify Body Style
And       Verify Car Make Exist
And       Verify Car Model Exist
And       Enter Zipcode
And       Verify Car Make text 
And       Verify Car Model text
And       Select Car Make as Acura
And       Verify Car Model is Enable
And       Select TLX as Car Model
And       Click Submit
Then      Guest Box Appears and Click to complete


Scenario: Select Inventory
When      Select cars to compare
Then      Compare selected cars to see results

Scenario: Message Concierge
When      Send Message to dealer

Scenario: Finish message to be sent to concierge
When      Enter First Name
And       Enter Last name
And       Enter Email
And       Enter PhoneNumber
And       Enter Contact Agreement
And       Enter Sharing Agreement
Then      close 








   
