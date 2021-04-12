Feature: Regression test suite for DVS Automation Admin

  Scenario Outline: User now enters the valid credentials and clicks on Login button
    Given Plan Smart Administrative Portal Login Screen
    Then Verify url of Plan Smart Administrative Portal Login Screen
    Given "<username>" "<password>" and login button

    Examples: 
      | username                    | password   |
      |   |

  Scenario: User now selects and verify client and project
    Given User is on selectClient Page
    When Select clientName
    Then Verify select period page
    When Select ProjectName
    Then verify home stats page selectedClient
    Then Get statistics data from home page
    Then Open pdf and close it

  Scenario Outline: performing action on subscriber search with different search criteria
    When click on subscriber Menu
    Then click on standard alt doc list to open pdf
    Then enter firstname "<FirstName>" and retrieve data
    Then verify search result of grid
    Then click on partial match
    Then Retrieve data for partial match
    Then verify partial match grid result
    Then click on dependent
    Then retrieve result for dependent exact match
    Then verify grid of dependent
    Then click on dependent partial match
    Then retrieve result for dependent partial match
    Then verify grid

    Examples: 
      | FirstName |
      | first     |

  Scenario Outline: User perform addition modification and verifying changelog for dependant and subscriber
    When click and verify  subscriber menu
    Then search subscriber using "<AccountNumber>"
    Then click on retrieve button
    Then verify search results are displayed
    Then add new subscriber using "<FirstName>" "<LastName>" "<Address>" "<City>" "<DateOfBirth>" "<zip>" "<mem>" "<ssn>"
    Then modify sub "<ModifySubFirstName>"  and save
    Then click on sub view changelog and Verify "<ModifySubFirstName>"
    Then click on GoBack button to return
    Then add new dependent using "<FirstName>" "<LastName>" "<DateOfBirth>" "<mem>"
    Then modify dep "<ModifyDepFirstName>" and save
    Then click on dep view changelog and Verify"<ModifyDepFirstName>"
    Then click on GoBack button
    Then click on save and return to subscriber button

    Examples: 
      | AccountNumber | FirstName | LastName | Address   | City  | ModifySubFirstName | ModifyDepFirstName | DateOfBirth | zip   | ssn      | mem   |
      |      
  Scenario Outline: User perform action in DataEntry tab
    Then click and verify  DataEntry tab
    Then write typecode "<TypeCode>" in dependant type code
    Then Click on save and continue
    Then insert document
    Then Click on insert documents button
    Then verify the dependant gender and select child first name,child last name,date of birth,father first name,father last name if dependant is male.If female then select child first name, child last name, date of birth, mother first name,mother last name
    Then click on attempt verification

    Examples: 
      | TypeCode |
      | BC       |

  Scenario: User Perform action in Audit tab
    Then click and verify  Audit tab
    Then click on the cross icon to remove verification for the dependent
    Then click on yes from remove verification dialog

  Scenario Outline: User perform action in Issues tab
    Then click and verify Issues tab
    #Then verify that issue is created "<ModifySubFirstName>" "<LastName>"

    Examples: 
      | ModifySubFirstName | LastName |
       |

  #Meenakhsi Subscriber Mailings tab start
  Scenario: User Perform action in Subscriber Mailings tab
    Then click and verify  subscriber mailings tab
    #Then click on queue new mailings button
    #Then open and close view mailings link
    #Then close the pop up

  # Meenakhsi Subscriber Mailings tab end
  Scenario: User perform action in Resource tab
    Then click and verify Resources tab
    Then select and search state
    Then click on consulates
    Then get all the consulates values from the list
    Then click on document library
    Then select document type and search
    Then Verify returned search results

  # Meenakshi scenario for Client issue tab
  Scenario Outline: User perform search for client issues
    When click and verify Client Issues Menu
    Then search using "<From>"
    Then verify search result are displayed

    Examples: 
      | From      |
      | 6/20/2016 |

  #Author: Pawan Dubey
  Scenario: User selects Client Issues section and verifying issue insertion and redirection to all issue tabs
    #Given User is on issue Page
    #When  user insert a new issue
    #  Removed search case as it is already covered by Meenakshi in above scenario
    Then user clicks issue schedular tab and verifies the navigation
    Then user clicks issue events tab and verifies the navigation
    Then user clicks issue templates tab and verifies the navigation
    Then user clicks template catagories tab and verifies the navigation
    Then delete dependant and subscriber

  # Abhishek bhambri Mailing Tab 6/19/2018
  Scenario Outline: User verify the Mailings Menu
    When click and verify  Mailings menu
    Then search subscriberids using "<subids>"
    Then click on Retrieve Mailings button
    #Then verify mailing search results are displayed
    #Then user click on view button and pdf open

    #Then user verify by click on test vendor button
    Examples: 
      | subids   |
      | 10536278 |

  #  Author: Pawan Dubey
  Scenario: User selects Dependent types section and verifies its associated functionalities.
    Given user is on Dependent types page
    Then user clicks Add button from Dependent Types Not Allowed grid
    Then user verifies addition to Dependent Types Allowed grid
    Then user clicks cross icon to remove the added option
    Then user verifies the removal of option from dep allowed grid
    Then user verifies the addition to dep not allowed grid
    Then user clicks preview button and verifies opening of PDF in new browser tab
    Then user clicks save button and capture update text of bottom
    Then Open Dependent type pdf and close it

  Scenario: User selects Verification section and verifies its associated functionalities.
    Given user is on verification page
    Then user clicks select and then edit
    Then user verifies appeared window
    Then user clicks cancel button of window
    Then user click on verification list pdf preview and close it
    Then user clicks Checklist Setup link of top options
    Then user verifies grids on Checklist setup page
    Then user clicks on Letter Setup link and verifies grid

  Scenario: User perform action in communication
    When click and verify communications menu
    Then edit currently configured letters
    Then click on additional options button and close the dialog
    Then click on pdf preview button and close the window
    Then click on html preview button and close the window
    Then click and verify issue tab
    Then click and verify emails tab
    Then click and verify SMS tab

  # Author: Pawan Dubey  #
  Scenario: User selects Reports section and verifies its associated functionalities.
    Given user clicks Reports and redirects to Reports page
    Then user clicks Run link from Select version grid
    Then user clicks Retrieve button and verifies opening of PDF in new tab
    Then user clicks Go back button and return to Reports main page
    Then user selects Internal Reports and clicks Run link of first option from version grid
    Then user clicks Retrieve button and verifies opening of PDF in new tab
    Then user clicks Go back button and return to Reports main page
    Then user clicks Report Schedular and verifies page
    Then user clicks Report History and verifies page

  # Abhishek Bhambri Received Document-->Scan Queue Page 7/17/2018
  Scenario Outline: User perform action in Received documents
    When clicked on received document from left panel
    Then click on scan queue button
    #Then user enter values "<ScanDate>"
    #Then click on Retreive button
    #Then verify the result on scan queue page
    #Then Click on View button and verify open and close pdf

    Examples: 
      | ScanDate  |
      | 4/12/2020 |

  #  Meenakshi Received Document--> Fax Queue Page 7/17/2018
  Scenario Outline: User perform action in Received documents fax queue
    Then click on fax queue tab
    Then user enter values for fax date "<FaxDate>"
    Then click on fax Retreive button
    Then verify the result on fax queue page
    Then open fax pdf and close it

    Examples: 
      | FaxDate  |
      | 1/1/2019 |

  Scenario Outline: User perform action in Received documents module
    When clicked on received document from left navigation panel
    Then click on mail prep button
    Then click on the search icon from record info section
    Then verify that user is on quick search page
    Then enter first name "<FirstName>" for subscriber and retrieve exact match
    Then Get the grid result for exact match
    Then Click on partial match radio button and retrieve partial match
    Then Get the grid result for partial match
    Then click on dependent radio button
    Then click on exact match radio button
    Then enter last name "<LastName>" for dependent and retrieve exact match
    Then Get the exact match result for dependent
    Then Click on partial match radio button for dependent and retrieve partial match
    Then Get the partial match result for dependent

    Examples: 
      | FirstName | LastName |
      | first     | last     |

  #  Meenakshi scenario for Quality Control tab
  Scenario Outline: User perform search for Quality control data
    When click and verify Quality Control Menu
    Then search using "<From>" date
    Then click on filter button
    Then verify search results are displayed for quality control

    Examples: 
      | From     |
      | 1/1/2020 |

  # Abhishek Bhambri File Transfer Tab 6/22/2018
  Scenario Outline: User verify the File Transfer Menu
    When Click and verify File Transfer Menu
    #Then Filter using "<Froms>"
    #Then Click on Filter button
    #Then verify result are displayed
    #Then click on File Imports tab
    #Then verify the result on File Import screen

    Examples: 
      | Froms    |
      | 1/1/2016 |

  # Author: Pawan Dubey  #
  Scenario: User selects Admin section and verifies its associated functionalities.
    Given user is on Admin page

  Scenario: User selects Home section and verifies its associated functionalities.
    Then user clicks Home link from header section and verifies Grid present on Home

  Scenario: User selects Client section and verifies its associated functionalities.
    Then user clicks Clients link from header section and verifies Grid on Clients
    Then user clicks Division List and verifies Grid present on Division List
    Then user clicks Client Phases and verifies Grid present on Client Phases
    Then user clicks Project Close and verifies Grid on Project Close
    Then user clicks Documentary Library and verifies Grid present on Documentary Library
    Then user clicks Portal Interface and verifies Grid present on Portal Interface

  Scenario: User selects Client Period section and verifies its associated functionalities.
    #  Client Period
    Then user clicks Client Period link from header section and verifies Grid on Client Period
    Then user clicks Period Info and verifies Grid present on Period Info
    Then user clicks Period Alerts and verifies Grid present on Period Alerts
    Then user clicks Plan-Guard and verifies Grid on Plan-Guard
    #Then user clicks Portal and verifies Grid present on Portal
    Then user clicks Participant Website and verifies Grid present on Participant Website
    Then user clicks Affidavits and verifies Grid present on Affidavits
    Then user clicks Custom Text and verifies Grid present on Custom Text
    Then user clicks Reports and verifies Grid present on Reports
    Then user clicks Override Authoring and verifies Grid present on Override Authoring
    Then user clicks Email Override and verifies Grid present on clicks Email Override

  #Scenario: User selects Details Type and verifies its associated functionalities.
  ###  Detail Types
  #Then  user clicks Details Type link from header section and verifies Grid on Details Type page
  #	Then  user clicks Assign Sets To Type verifies Assign Sets To Type
  #	Then  user clicks Override Authoring and verifies Grid on Override Authoring
  #	Scenario: User selects Documents and verifies its associated functionalities.
  ###  Documents
  #Then  user clicks Documents link from header section and verifies Grid on Documents
  #	Then  user clicks Doc Sets and verifies Doc Sets
  #Then  user clicks Document Swap and verifies Grid on Document Swap
  #Then  user clicks Standard Alt Doc List and verifies Grid on Standard Alt Doc List
  #Then  user clicks Assign Docs To Set and verifies Grid on Assign Docs To Set
  Scenario: User selects DEAR Setup and verifies its associated functionalities.
    ###  DEAR Setup
    Then user clicks DEAR Setup link from header section and verifies Grid on Dear Setup
    Then user clicks DEAR Templates and verifies Dear Templates
    Then user clicks DEAR Catagories and verifies Dear Templates

  #Scenario: User selects Permissions and verifies its associated functionalities.
  ###  Permissions
  #	Then  user clicks Permissions link from header section and verifies Grid on Permissions
  #	Scenario: User selects Users Setup and verifies its associated functionalities.
  ###  Users
  #	Then  user clicks Users Setup link from header section and verifies Grid on Users
  #	Then  user clicks Assign Clients and verifies Assign Clients
  #	Then  user clicks Assign Depts and verifies Assign Depts
  #	Then  user clicks Assign Work Queues and verifies Assign Work Queues
  #   Scenario: User selects Reporting Setup and verifies its associated functionalities.
  ###  Reporting
  #Then  user clicks Reporting link from header section and verifies Grid on Reporting
  Scenario: User selects BOS section and verifies its associated functionalities.
    ###  BOS
    Then user clicks BOS link from header section, clicks Stop Refresh button and verifies Grid on BOS
    Then user clicks Current Jobs, clicks Stop Refresh button and verifies Grid on Current Jobs
    Then user clicks Archieved Jobs, retrieve and verifies Grid present on Archieved Jobs
    Then user clicks Job Schedular and verifies Grid on Job Schedular
    Then user clicks Monitering and verifies Grid on Monitering

  Scenario Outline: User selects SQLizers section and verifies its associated functionalities.
    ###  SQLizers
    Then user clicks SQLizers link from header section and verifies navigation to SQLizers
    Then user searches a query using "<queryname>"
    Then user runs a query by date as param "<dateparameter>"
    Then user verifies query result grid
    Then user clicks Setup Queries and searches queries and saves parameter

    Examples: 
      | queryname | dateparameter |
      | Mailings  | 05/05/2018    |

  Scenario: User selects Misc section and verifies its associated functionalities.
    #  Misc
    Then user clicks Misc link from header section and verifies navigation to Misc
    Then User clicks Info / Scripting Items and verifies element on Info / Scripting Items
    Then user clicks Issue Detail Reasons and verifies element on Issue Detail Reasons
    Then user clicks Issue Detail Results and verifies element on Issue Detail Results
    Then user clicks Override reasons and verifies element on Override reasons
    Then user clicks logoff

