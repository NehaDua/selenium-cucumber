$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Regression test suite for DVS Automation Admin",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User now enters the valid credentials and clicks on Login button",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-now-enters-the-valid-credentials-and-clicks-on-login-button",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Plan Smart Administrative Portal Login Screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Verify url of Plan Smart Administrative Portal Login Screen",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "\"\u003cusername\u003e\" \"\u003cpassword\u003e\" and login button",
  "keyword": "Given "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-now-enters-the-valid-credentials-and-clicks-on-login-button;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9,
      "id": "regression-test-suite-for-dvs-automation-admin;user-now-enters-the-valid-credentials-and-clicks-on-login-button;;1"
    },
    {
      "cells": [
        "abhishek.bhambri@alight.com",
        "alight@123"
      ],
      "line": 10,
      "id": "regression-test-suite-for-dvs-automation-admin;user-now-enters-the-valid-credentials-and-clicks-on-login-button;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 142008,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User now enters the valid credentials and clicks on Login button",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-now-enters-the-valid-credentials-and-clicks-on-login-button;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Plan Smart Administrative Portal Login Screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Verify url of Plan Smart Administrative Portal Login Screen",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "\"abhishek.bhambri@alight.com\" \"alight@123\" and login button",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Simple.plan_Smart_Administrative_Portal_Login_Screen()"
});
formatter.write("Application launched successfully.");
formatter.result({
  "duration": 28718663223,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_url_of_Plan_Smart_Administrative_Portal_Login_Screen()"
});
formatter.write("Application url https://www.yourdependentverification.com/PlanSmart/ verified successfully");
formatter.result({
  "duration": 34904511,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abhishek.bhambri@alight.com",
      "offset": 1
    },
    {
      "val": "alight@123",
      "offset": 31
    }
  ],
  "location": "Simple.and_login_button(String,String)"
});
formatter.write("user logged in  and successfully redirected to select company page");
formatter.result({
  "duration": 12924407322,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 352885480,
  "status": "passed"
});
formatter.before({
  "duration": 29086,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User now selects and verify client and project",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-now-selects-and-verify-client-and-project",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User is on selectClient Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Select clientName",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Verify select period page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Select ProjectName",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "verify home stats page selectedClient",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Get statistics data from home page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Open pdf and close it",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.user_is_on_selectClient_Page()"
});
formatter.write("System successfully redirected the user to Select Company page displaying a list of all clients.");
formatter.result({
  "duration": 6098177406,
  "status": "passed"
});
formatter.match({
  "location": "Simple.select_clientName()"
});
formatter.write("Client selected successfully from select client page.");
formatter.result({
  "duration": 6089740769,
  "status": "passed"
});
formatter.match({
  "location": "Simple.Verify_select_period_page()"
});
formatter.write("System is navigated successfully to the Select Period screen");
formatter.result({
  "duration": 12096742271,
  "status": "passed"
});
formatter.match({
  "location": "Simple.select_ProjectName()"
});
formatter.write("Project selected successfully from select period page");
formatter.result({
  "duration": 9969670538,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_home_stats_page_selectedClient()"
});
formatter.write("System is navigated successfully to the Home stats page of the selected client");
formatter.result({
  "duration": 6110878385,
  "status": "passed"
});
formatter.match({
  "location": "Simple.GetData()"
});
formatter.write("statistics data is  Plan-Smart Statistics \nTotal Employees: 117\nAverage Dependent Per Employee: 1.39\nMost # of Dependents: There is 1 (.85%) employee that has 9 dependents (7461085)\nEmployees with Verifiable Dependents: 97 (82.91%)    [?]\nEmployees with No Verifiable Dependents: 1 (.85%)  [?]\nEmployees with No Dependents: 16 (13.68%)  [?]\nEmployees with Unverified Dependents: 77    [?]\nEmployees with One or More Verified Dependents: 30   [?]\nEmployees with All Verifiable Dependents Verified: 20    [?]\nEmployees with No Received or Pending Documents: 55    [?]\nEmployees with Insufficient Docs (No Dependents Verified): 9    [?]\nEmployees with No Response: 53    [?]\nEmployee Portal Utilization: 28 total hits, 5 unique hits    [?]\n\nDocuments Received:\n144\nDocument Uploads: 19\nAverage Documents Per Week: .27\nMost Documents in One Week: Week of 4/3/2017 had 41 documents received\nTop 3 Documents:\nGovernment Issued Birth Certificate - 60 (41.67%)\nClaim Initiation Form - 21 (14.58%)\nOther - 15 (10.42%)\nBottom 3 Documents:\nForeign Document - 1 (.69%)\nForeign Birth Certificate - 1 (.69%)\nAffidavit of Domestic Partnership - 1 (.69%)\nVerification Statistics\n\nTotal Dependents:\n163\nDependents Subject to Audit: 155  [?]\nVerifiable Dependents: 155 (Spouses: 10 Children: 144 Other: 1)    [?]\nNon-Verifiable Dependents: 8    [?]\nOldest Verifiable Child: Subscribers 10766694, 10767096, 10770835, 10771611 have a 26 yr old child\nYoungest Verifiable Spouse: Subscriber 8973169 has a 28 yr old spouse\n\nDependents Verified:\n64 (41.29%)\nDependents Not Verified: 91 (58.71%)   [?]\nVerifiable Employee Opt Out: 0   [?]\nNon-Verifiable Employer Opt Out: 0   [?]\nVerified After Project Close: 0   [?]\nTotal Ineligible Dependents: 91 (58.71%)  [?]\nAnnual Savings to Date: $0.00  [?]\n\nAverage Verified per Week: .13 \nMost Verified in One Week: Week of 4/2/2017 had 22 dependents verified\n  Issue Statistics\n\nTotal Issues:\n311\nAverage Issues per Week: 1.43\nAverage Duration till Issue Resolved: 5.00 hours\nNumber of Issues Closed: 306 (98.39%)\nNumber of Issues Open: 1 (.32%)\nNumber of Issues Requiring Followup: 4 (1.29%)\nMost Issue in One Week: Week of 7/9/2018 had 394 issues\nOldest Open Audit Issue: Issue dated 9/26/2018 for Subscriber 1115162\nOldest Open Issue: Issue dated 7/24/2012 for Subscriber 1115162\nTotal Issue Details: 356\nAverage Inbound Calls per Week: 0 \nMost Inbound Calls in One Week: Week of 4/18/2016 had 1 calls\nNumber of Phone Calls (Inbound): 1 (.28%)\nNumber of Secure Mailbox : 4 (1.12%)\nNumber of Other: 338 (94.94% , 269 System , 11 Web , 49 Internal )\nUpdated 11/27/2018 6:45:41 AM");
formatter.write("Statistics data fetched successfully");
formatter.result({
  "duration": 461428093,
  "status": "passed"
});
formatter.match({
  "location": "Simple.open_pdf_and_close_it()"
});
formatter.write("https://www.yourdependentverification.com/PlanSmart/Report/frm_rpt_pdf.aspx?rpt_path\u003d6e65d24470159799d6e57d8b637635142e3ad86689abb7d3acbebc6c61cecb67c14067067345be669e8cbbc9b500efef67fd0032a248cef87d61c0b16bfe25fe");
formatter.result({
  "duration": 43257892473,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 364251928,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 21,
  "name": "performing action on subscriber search with different search criteria",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;performing-action-on-subscriber-search-with-different-search-criteria",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "click on subscriber Menu",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "click on standard alt doc list to open pdf",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "enter firstname \"\u003cFirstName\u003e\" and retrieve data",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "verify search result of grid",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "click on partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Retrieve data for partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "verify partial match grid result",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "click on dependent",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "retrieve result for dependent exact match",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "verify grid of dependent",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click on dependent partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "retrieve result for dependent partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "verify grid",
  "keyword": "Then "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;performing-action-on-subscriber-search-with-different-search-criteria;",
  "rows": [
    {
      "cells": [
        "FirstName"
      ],
      "line": 37,
      "id": "regression-test-suite-for-dvs-automation-admin;performing-action-on-subscriber-search-with-different-search-criteria;;1"
    },
    {
      "cells": [
        "first"
      ],
      "line": 38,
      "id": "regression-test-suite-for-dvs-automation-admin;performing-action-on-subscriber-search-with-different-search-criteria;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 32850,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "performing action on subscriber search with different search criteria",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;performing-action-on-subscriber-search-with-different-search-criteria;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 22,
  "name": "click on subscriber Menu",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "click on standard alt doc list to open pdf",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "enter firstname \"first\" and retrieve data",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "verify search result of grid",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "click on partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "Retrieve data for partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "verify partial match grid result",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "click on dependent",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "retrieve result for dependent exact match",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "verify grid of dependent",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "click on dependent partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "retrieve result for dependent partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "verify grid",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_on_subscriber_Menu()"
});
formatter.write("Subscriber button clicked.");
formatter.result({
  "duration": 9834556712,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_standard_alt_doc_list_to_open_pdf()"
});
formatter.write("https://www.yourdependentverification.com/PlanSmart/Report/frm_rpt_pdf.aspx?rpt_path\u003d92a8b82d2560a970f1876dad66d17c770418e4672507d482ffb5dd1fc78ddf40910b31186781476250a400ef4745f568185f7955c771fca9fc97dae5968a4170c515b5dd15d26bff21e22ddaf80e3fe641eeccad39e634cc3980bbb82f9f6ea1923748d907042cf4d074052ddc6026b5e0f0cc1f08549b21cc9b8e1bf4613b53");
formatter.result({
  "duration": 43157876835,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "first",
      "offset": 17
    }
  ],
  "location": "Simple.enter_firstname_and_retrieve_data(String)"
});
formatter.write("FirstName entered successfully and clicked on retrieve button");
formatter.result({
  "duration": 12471028853,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_search_result_of_grid()"
});
formatter.write("Subscriber exact match result verified successfully");
formatter.result({
  "duration": 12103021414,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_partial_match()"
});
formatter.write("Partial match clicked successfully for sub.");
formatter.result({
  "duration": 6029910281,
  "status": "passed"
});
formatter.match({
  "location": "Simple.retrieve_data_for_partial_match()"
});
formatter.write("partial match data retrieved successfully for sub");
formatter.result({
  "duration": 6033002974,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_partial_match_grid_result()"
});
formatter.write("You are returning more than 20 records. Please alter your criteria to limit the records returned or select 100 and search again.");
formatter.result({
  "duration": 118194414608,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_dependent()"
});
formatter.write("Dependent clicked");
formatter.result({
  "duration": 6030842058,
  "status": "passed"
});
formatter.match({
  "location": "Simple.retrieve_result_for_dependent_exact_match()"
});
formatter.write("retrieved button clicked for exact match dep.");
formatter.result({
  "duration": 9176957219,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_grid_of_dependent()"
});
formatter.write("grid verified for exact match dep.");
formatter.result({
  "duration": 12149660909,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_dependent_partial_match()"
});
formatter.write("Partial match dep clicked.");
formatter.result({
  "duration": 6050005252,
  "status": "passed"
});
formatter.match({
  "location": "Simple.retrieve_result_for_dependent_partial_match()"
});
formatter.write("retrieve button clicked for partial match dep");
formatter.result({
  "duration": 13282993307,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_grid()"
});
formatter.write("partial search result verified for dep.");
formatter.result({
  "duration": 12134365805,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 367439407,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 40,
  "name": "User perform addition modification and verifying changelog for dependant and subscriber",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-addition-modification-and-verifying-changelog-for-dependant-and-subscriber",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 41,
  "name": "click and verify  subscriber menu",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "search subscriber using \"\u003cAccountNumber\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "click on retrieve button",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "verify search results are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "add new subscriber using \"\u003cFirstName\u003e\" \"\u003cLastName\u003e\" \"\u003cAddress\u003e\" \"\u003cCity\u003e\" \"\u003cDateOfBirth\u003e\" \"\u003czip\u003e\" \"\u003cmem\u003e\" \"\u003cssn\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 46,
      "value": "#Then modify sub \"\u003cModifySubFirstName\u003e\"  and save"
    },
    {
      "line": 47,
      "value": "#Then click on sub view changelog and Verify \"\u003cModifySubFirstName\u003e\""
    },
    {
      "line": 48,
      "value": "#Then click on GoBack button to return"
    }
  ],
  "line": 49,
  "name": "add new dependent using \"\u003cFirstName\u003e\" \"\u003cLastName\u003e\" \"\u003cDateOfBirth\u003e\" \"\u003cmem\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 50,
      "value": "#Then modify dep \"\u003cModifyDepFirstName\u003e\" and save"
    },
    {
      "line": 51,
      "value": "#Then click on dep view changelog and Verify\"\u003cModifyDepFirstName\u003e\""
    },
    {
      "line": 52,
      "value": "#Then click on GoBack button"
    }
  ],
  "line": 53,
  "name": "click on save and return to subscriber button",
  "keyword": "Then "
});
formatter.examples({
  "line": 55,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-addition-modification-and-verifying-changelog-for-dependant-and-subscriber;",
  "rows": [
    {
      "cells": [
        "AccountNumber",
        "FirstName",
        "LastName",
        "Address",
        "City",
        "ModifySubFirstName",
        "ModifyDepFirstName",
        "DateOfBirth",
        "zip",
        "ssn",
        "mem"
      ],
      "line": 56,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-addition-modification-and-verifying-changelog-for-dependant-and-subscriber;;1"
    },
    {
      "cells": [
        "10536278",
        "stagging",
        "test",
        "chatarpur",
        "Delhi",
        "QA",
        "QA",
        "12/3/1991",
        "78965",
        "123748569",
        "74185"
      ],
      "line": 57,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-addition-modification-and-verifying-changelog-for-dependant-and-subscriber;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 33192,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "User perform addition modification and verifying changelog for dependant and subscriber",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-addition-modification-and-verifying-changelog-for-dependant-and-subscriber;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 41,
  "name": "click and verify  subscriber menu",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "search subscriber using \"10536278\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "click on retrieve button",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "verify search results are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "add new subscriber using \"stagging\" \"test\" \"chatarpur\" \"Delhi\" \"12/3/1991\" \"78965\" \"74185\" \"123748569\"",
  "matchedColumns": [
    1,
    2,
    3,
    4,
    7,
    8,
    9,
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 46,
      "value": "#Then modify sub \"\u003cModifySubFirstName\u003e\"  and save"
    },
    {
      "line": 47,
      "value": "#Then click on sub view changelog and Verify \"\u003cModifySubFirstName\u003e\""
    },
    {
      "line": 48,
      "value": "#Then click on GoBack button to return"
    }
  ],
  "line": 49,
  "name": "add new dependent using \"stagging\" \"test\" \"12/3/1991\" \"74185\"",
  "matchedColumns": [
    1,
    2,
    7,
    10
  ],
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 50,
      "value": "#Then modify dep \"\u003cModifyDepFirstName\u003e\" and save"
    },
    {
      "line": 51,
      "value": "#Then click on dep view changelog and Verify\"\u003cModifyDepFirstName\u003e\""
    },
    {
      "line": 52,
      "value": "#Then click on GoBack button"
    }
  ],
  "line": 53,
  "name": "click on save and return to subscriber button",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_and_verify_subscriber_menu()"
});
formatter.write("System successfully redirected to Subscriber - Search screen");
formatter.result({
  "duration": 9345696460,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10536278",
      "offset": 25
    }
  ],
  "location": "Simple.search_subscriber_using(String)"
});
formatter.write("Subscriber account number entered successfully.");
formatter.result({
  "duration": 6461047580,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_retrieve_button()"
});
formatter.write("Retrieve button is clicked successfully.");
formatter.result({
  "duration": 6043225146,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_search_results_are_displayed()"
});
formatter.write("Search results are displayed successfully.");
formatter.result({
  "duration": 12100109055,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "stagging",
      "offset": 26
    },
    {
      "val": "test",
      "offset": 37
    },
    {
      "val": "chatarpur",
      "offset": 44
    },
    {
      "val": "Delhi",
      "offset": 56
    },
    {
      "val": "12/3/1991",
      "offset": 64
    },
    {
      "val": "78965",
      "offset": 76
    },
    {
      "val": "74185",
      "offset": 84
    },
    {
      "val": "123748569",
      "offset": 92
    }
  ],
  "location": "Simple.add_new_subscriber_using(String,String,String,String,String,String,String,String)"
});
formatter.write("New subscriber added successfully.");
formatter.result({
  "duration": 70133315973,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "stagging",
      "offset": 25
    },
    {
      "val": "test",
      "offset": 36
    },
    {
      "val": "12/3/1991",
      "offset": 43
    },
    {
      "val": "74185",
      "offset": 55
    }
  ],
  "location": "Simple.add_new_dependent_using(String,String,String,String)"
});
formatter.write("New dependant added successfully.");
formatter.result({
  "duration": 43922473962,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_save_and_return_to_subscriber_button()"
});
formatter.write("Successfully saved and clicked on return to subscriber.");
formatter.result({
  "duration": 12053568453,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 326063442,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 59,
  "name": "User perform action in DataEntry tab",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-dataentry-tab",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 60,
  "name": "click and verify  DataEntry tab",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "write typecode \"\u003cTypeCode\u003e\" in dependant type code",
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "Click on save and continue",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "insert document",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "Click on insert documents button",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "verify the dependant gender and select child first name,child last name,date of birth,father first name,father last name if dependant is male.If female then select child first name, child last name, date of birth, mother first name,mother last name",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "click on attempt verification",
  "keyword": "Then "
});
formatter.examples({
  "line": 68,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-dataentry-tab;",
  "rows": [
    {
      "cells": [
        "TypeCode"
      ],
      "line": 69,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-dataentry-tab;;1"
    },
    {
      "cells": [
        "BC"
      ],
      "line": 70,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-dataentry-tab;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 39693,
  "status": "passed"
});
formatter.scenario({
  "line": 70,
  "name": "User perform action in DataEntry tab",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-dataentry-tab;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 60,
  "name": "click and verify  DataEntry tab",
  "keyword": "Then "
});
formatter.step({
  "line": 61,
  "name": "write typecode \"BC\" in dependant type code",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 62,
  "name": "Click on save and continue",
  "keyword": "Then "
});
formatter.step({
  "line": 63,
  "name": "insert document",
  "keyword": "Then "
});
formatter.step({
  "line": 64,
  "name": "Click on insert documents button",
  "keyword": "Then "
});
formatter.step({
  "line": 65,
  "name": "verify the dependant gender and select child first name,child last name,date of birth,father first name,father last name if dependant is male.If female then select child first name, child last name, date of birth, mother first name,mother last name",
  "keyword": "Then "
});
formatter.step({
  "line": 66,
  "name": "click on attempt verification",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_and_verify_DataEntry_tab()"
});
formatter.write("DataEntry tab has been opened without any error");
formatter.result({
  "duration": 12158194727,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BC",
      "offset": 16
    }
  ],
  "location": "Simple.write_typecode_in_dependant_type_code(String)"
});
formatter.write("Type code entered successfully");
formatter.result({
  "duration": 6286647187,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_save_and_continue()"
});
formatter.write("Successfully clicked on save and continue");
formatter.result({
  "duration": 6033340713,
  "status": "passed"
});
formatter.match({
  "location": "Simple.insert_document()"
});
formatter.write("document selected successfully.");
formatter.result({
  "duration": 6180842418,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_insert_documents_button()"
});
formatter.write("insert document button clicked successfully");
formatter.result({
  "duration": 10155526348,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_the_dependant_gender_and_select_child_first_name_child_last_name_date_of_birth_father_first_name_father_last_name_if_dependant_is_male_If_female_then_select_child_first_name_child_last_name_date_of_birth_mother_first_name_mother_last_name()"
});
formatter.write("Gender verified successfully and corresponding data selected from dropdown.");
formatter.result({
  "duration": 30982739712,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_attempt_verification()"
});
formatter.write("Successfully clicked on attempt verification");
formatter.result({
  "duration": 6045246449,
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 339815964,
  "status": "passed"
});
formatter.before({
  "duration": 32850,
  "status": "passed"
});
formatter.scenario({
  "line": 72,
  "name": "User Perform action in Audit tab",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-audit-tab",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 73,
  "name": "click and verify  Audit tab",
  "keyword": "Then "
});
formatter.step({
  "line": 74,
  "name": "click on the cross icon to remove verification for the dependent",
  "keyword": "Then "
});
formatter.step({
  "line": 75,
  "name": "click on yes from remove verification dialog",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_and_verify_Audit_tab()"
});
formatter.write("Audit tab has been opened without any error");
formatter.result({
  "duration": 16664862083,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_the_cross_icon_to_remove_verification_for_the_dependent()"
});
formatter.write("Successfully clicked on the cross icon.");
formatter.result({
  "duration": 12032940011,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_yes_from_remove_verification_dialog()"
});
formatter.write("Successfully clicked on yes");
formatter.result({
  "duration": 12031850486,
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png");
formatter.after({
  "duration": 320502208,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 77,
  "name": "User perform action in Issues tab",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-issues-tab",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 78,
  "name": "click and verify Issues tab",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "verify that issue is created \"\u003cModifySubFirstName\u003e\" \"\u003cLastName\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 81,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-issues-tab;",
  "rows": [
    {
      "cells": [
        "ModifySubFirstName",
        "LastName"
      ],
      "line": 82,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-issues-tab;;1"
    },
    {
      "cells": [
        "QA",
        "test"
      ],
      "line": 83,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-issues-tab;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 34904,
  "status": "passed"
});
formatter.scenario({
  "line": 83,
  "name": "User perform action in Issues tab",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-issues-tab;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 78,
  "name": "click and verify Issues tab",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "verify that issue is created \"QA\" \"test\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_and_verify_Issues_tab()"
});
formatter.write("Issues tab has been opened without any error");
formatter.result({
  "duration": 16118247397,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA",
      "offset": 30
    },
    {
      "val": "test",
      "offset": 35
    }
  ],
  "location": "Simple.verify_that_issue_is_created(String,String)"
});
formatter.result({
  "duration": 6097092328,
  "error_message": "org.junit.ComparisonFailure: expected:\u003ctest, [stagging]\u003e but was:\u003ctest, [QA]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.pageObjects.SubscriberPage.verifyIssueCreated(SubscriberPage.java:411)\r\n\tat stepDefinition.Simple.verify_that_issue_is_created(Simple.java:546)\r\n\tat ✽.Then verify that issue is created \"QA\" \"test\"(login.feature:79)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded6.png");
formatter.after({
  "duration": 356662206,
  "status": "passed"
});
formatter.before({
  "duration": 36614,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 85,
      "value": "#Meenakhsi Subscriber Mailings tab start"
    }
  ],
  "line": 86,
  "name": "User Perform action in Subscriber Mailings tab",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-subscriber-mailings-tab",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 87,
  "name": "click and verify  subscriber mailings tab",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "click on queue new mailings button",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "open and close view mailings link",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "close the pop up",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_and_verify_subscriber_mailings_tab()"
});
formatter.write("mailings tab clicked and verified successfully.");
formatter.result({
  "duration": 12016440407,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_queue_new_mailings_button()"
});
formatter.write("Queue new mailings button clicked successfully.");
formatter.result({
  "duration": 6043257654,
  "status": "passed"
});
formatter.match({
  "location": "Simple.open_and_close_view_mailings_link()"
});
formatter.write("https://www.yourdependentverification.com/PlanSmart/Report/frm_rpt_pdf.aspx?rpt_path\u003d6e65d24470159799d6e57d8b637635142e3ad86689abb7d3acbebc6c61cecb67c14067067345be669e8cbbc9b500efefbc6d433d3deb66a056f175125df62884");
formatter.write("PDF opened successfully");
formatter.result({
  "duration": 43145191596,
  "status": "passed"
});
formatter.match({
  "location": "Simple.close_the_pop_up()"
});
formatter.write("popup closed successfully");
formatter.result({
  "duration": 6034218425,
  "status": "passed"
});
formatter.embedding("image/png", "embedded7.png");
formatter.after({
  "duration": 322190562,
  "status": "passed"
});
formatter.before({
  "duration": 34903,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 92,
      "value": "# Meenakhsi Subscriber Mailings tab end"
    }
  ],
  "line": 93,
  "name": "User perform action in Resource tab",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-resource-tab",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 94,
  "name": "click and verify Resources tab",
  "keyword": "Then "
});
formatter.step({
  "line": 95,
  "name": "select and search state",
  "keyword": "Then "
});
formatter.step({
  "line": 96,
  "name": "click on consulates",
  "keyword": "Then "
});
formatter.step({
  "line": 97,
  "name": "get all the consulates values from the list",
  "keyword": "Then "
});
formatter.step({
  "line": 98,
  "name": "click on document library",
  "keyword": "Then "
});
formatter.step({
  "line": 99,
  "name": "select document type and search",
  "keyword": "Then "
});
formatter.step({
  "line": 100,
  "name": "Verify returned search results",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_and_verify_Resources_tab()"
});
formatter.write("Resouces tab has been opened without any error");
formatter.result({
  "duration": 12126403440,
  "status": "passed"
});
formatter.match({
  "location": "Simple.select_and_search_state()"
});
formatter.write("state searched successfully");
formatter.result({
  "duration": 6303008206,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_consulates()"
});
formatter.result({
  "duration": 8930371311,
  "status": "passed"
});
formatter.match({
  "location": "Simple.get_all_the_consulates_values_from_the_list()"
});
formatter.write("All consulates values are/nZimbabwe   (202) 332-7100;Zambia    (202) 265-9717;Vietnam   (202) 861-0737;Uruguay   (202) 331-1313;United Kingdom  (202) 588-6500;Ukraine   (202) 333-0606;Uganda    (202) 726-7100;Tunisia   (202) 862-1850;Trinidad \u0026 Tobago (202) 467-6490;Thailand   (202) 944-3600;Tanzania   (202) 884-1080;Taiwan    (202) 895-1800;Syria    (202) 232-6313;Switzerland  (202) 745-7900;Sweden    (202) 467-2600;Sudan    (202) 338-8565;South Korea  (202) 939-5663;South Africa  (202) 232-4400;Somali Consulate in Kenya  254-20-2736-618;Sierra Leone  (202) 939-9261;Rwanda    (202) 232-2882;Russia    (202) 298-5700;Philippines  (202) 467-9300;Pakistan   (202) 243-6500;Nigeria   (202) 986-8400;Nicaragua   (202) 939-6570;Netherlands  (877) 388-2443;Nepal    (202) 667-4550;Myanmar   (202) 332-3344;Mexico    (202) 728-1600;Madagascar   (202) 265-5525;Lithuania   (202) 234-5860;Lebanon   (202) 939-6300;Laos    (202) 667-0076;Kenya    (202) 387-6101;Jordan    (202) 966-2664;Japan    (202) 238-6700;Jamaica   (202) 452-0660;Israel    (202) 364-5500;India    (202) 939-7000;Honduras   (202) 966-7702;Haiti    (202) 332-4090;Ghana    (202) 686-4520;Germany   (202) 298-4000;France    (202) 944-6000;Fiji    (202) 466-8320;Ethiopia   (202) 364-1200;Egypt    (202) 895-5400;Ecuador   (202) 234-7200;D.R. of Congo  (202) 726-5500;Croatia   (202) 588-5899;Cote d\u0027Ivoire  (202) 797-0300;Colombia   (202) 387-8338;China    (202) 328-2500;Chile    (202) 785-1746;Chad    (202) 462-4009;Canada    (202) 682-1740;Bosnia   (202) 337-1500;Bolivia   (202) 483-4410;Benin    (202) 232-6656;Belize    (202) 332-9636;Bangladesh   (202) 244-0183;Bahamas   (202) 319-2660;Australia   (202) 797-3255;");
formatter.write("All consulates values are fetched successfully");
formatter.result({
  "duration": 8197032343,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_document_library()"
});
formatter.write("Successfully clicked on document library");
formatter.result({
  "duration": 9053827489,
  "status": "passed"
});
formatter.match({
  "location": "Simple.select_document_type_and_search()"
});
formatter.write("Document searched successfully");
formatter.result({
  "duration": 16598698387,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_returned_search_results()"
});
formatter.write("Search result verified successfully");
formatter.result({
  "duration": 6089145362,
  "status": "passed"
});
formatter.embedding("image/png", "embedded8.png");
formatter.after({
  "duration": 373910860,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 102,
      "value": "# Meenakshi scenario for Client issue tab"
    }
  ],
  "line": 103,
  "name": "User perform search for client issues",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-search-for-client-issues",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 104,
  "name": "click and verify Client Issues Menu",
  "keyword": "When "
});
formatter.step({
  "line": 105,
  "name": "search using \"\u003cFrom\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 106,
  "name": "verify search result are displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 108,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-search-for-client-issues;",
  "rows": [
    {
      "cells": [
        "From"
      ],
      "line": 109,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-search-for-client-issues;;1"
    },
    {
      "cells": [
        "6/20/2016"
      ],
      "line": 110,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-search-for-client-issues;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 31481,
  "status": "passed"
});
formatter.scenario({
  "line": 110,
  "name": "User perform search for client issues",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-search-for-client-issues;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 104,
  "name": "click and verify Client Issues Menu",
  "keyword": "When "
});
formatter.step({
  "line": 105,
  "name": "search using \"6/20/2016\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 106,
  "name": "verify search result are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_and_verify_Client_Issues_Menu()"
});
formatter.write("System successfully redirected to client Issue tab- Search screen");
formatter.result({
  "duration": 14512535874,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6/20/2016",
      "offset": 14
    }
  ],
  "location": "Simple.search_using(String)"
});
formatter.write("Details has been enetered successfully");
formatter.result({
  "duration": 32503865865,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_search_result_are_displayed()"
});
formatter.write("Data fetched successfully.");
formatter.result({
  "duration": 6107424685,
  "status": "passed"
});
formatter.embedding("image/png", "embedded9.png");
formatter.after({
  "duration": 336137105,
  "status": "passed"
});
formatter.before({
  "duration": 31482,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 112,
      "value": "#Author: Pawan Dubey"
    }
  ],
  "line": 113,
  "name": "User selects Client Issues section and verifying issue insertion and redirection to all issue tabs",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-client-issues-section-and-verifying-issue-insertion-and-redirection-to-all-issue-tabs",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 114,
      "value": "#Given User is on issue Page"
    },
    {
      "line": 115,
      "value": "#When  user insert a new issue"
    },
    {
      "line": 116,
      "value": "#  Removed search case as it is already covered by Meenakshi in above scenario"
    }
  ],
  "line": 117,
  "name": "user clicks issue schedular tab and verifies the navigation",
  "keyword": "Then "
});
formatter.step({
  "line": 118,
  "name": "user clicks issue events tab and verifies the navigation",
  "keyword": "Then "
});
formatter.step({
  "line": 119,
  "name": "user clicks issue templates tab and verifies the navigation",
  "keyword": "Then "
});
formatter.step({
  "line": 120,
  "name": "user clicks template catagories tab and verifies the navigation",
  "keyword": "Then "
});
formatter.step({
  "line": 121,
  "name": "delete dependant and subscriber",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.user_clicks_issue_schedular_tab_and_verifies_the_navigation()"
});
formatter.write("User verified issue schedular tab successfully.");
formatter.result({
  "duration": 51691700204,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_issue_events_tab_and_verifies_the_navigation()"
});
formatter.write("User verified issue event tab successfully.");
formatter.result({
  "duration": 21262400111,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_issue_templates_tab_and_verifies_the_navigation()"
});
formatter.write("User verified issue templates tab successfully.");
formatter.result({
  "duration": 44440968008,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_template_catagories_tab_and_verifies_the_navigation()"
});
formatter.write("User verified template catagories tab successfully.");
formatter.result({
  "duration": 20911481868,
  "status": "passed"
});
formatter.match({
  "location": "Simple.delete_dependant_and_subscriber()"
});
formatter.write("Both dependant and subscriber deleted successfully.");
formatter.result({
  "duration": 305574,
  "status": "passed"
});
formatter.embedding("image/png", "embedded10.png");
formatter.after({
  "duration": 339492940,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 123,
      "value": "# Abhishek bhambri Mailing Tab 6/19/2018"
    }
  ],
  "line": 124,
  "name": "User verify the Mailings Menu",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-verify-the-mailings-menu",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 125,
  "name": "click and verify  Mailings menu",
  "keyword": "When "
});
formatter.step({
  "line": 126,
  "name": "search subscriberids using \"\u003csubids\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 127,
  "name": "click on Retrieve Mailings button",
  "keyword": "Then "
});
formatter.step({
  "line": 128,
  "name": "verify mailing search results are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 129,
  "name": "user click on view button and pdf open",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 131,
      "value": "#Then user verify by click on test vendor button"
    }
  ],
  "line": 132,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-verify-the-mailings-menu;",
  "rows": [
    {
      "cells": [
        "subids"
      ],
      "line": 133,
      "id": "regression-test-suite-for-dvs-automation-admin;user-verify-the-mailings-menu;;1"
    },
    {
      "cells": [
        "10536278"
      ],
      "line": 134,
      "id": "regression-test-suite-for-dvs-automation-admin;user-verify-the-mailings-menu;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 38667,
  "status": "passed"
});
formatter.scenario({
  "line": 134,
  "name": "User verify the Mailings Menu",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-verify-the-mailings-menu;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 125,
  "name": "click and verify  Mailings menu",
  "keyword": "When "
});
formatter.step({
  "line": 126,
  "name": "search subscriberids using \"10536278\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 127,
  "name": "click on Retrieve Mailings button",
  "keyword": "Then "
});
formatter.step({
  "line": 128,
  "name": "verify mailing search results are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 129,
  "name": "user click on view button and pdf open",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_and_verify_Mailings_menu()"
});
formatter.write("Mailing tab has been opened without any error");
formatter.result({
  "duration": 3371641471,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10536278",
      "offset": 28
    }
  ],
  "location": "Simple.search_subscriberids_using(String)"
});
formatter.write("Subscriber account number entered successfully.");
formatter.result({
  "duration": 6512913649,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_Retrieve_Mailings_button()"
});
formatter.write("Retrieve button is clicked successfully.");
formatter.result({
  "duration": 6047172623,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_mailing_search_results_are_displayed()"
});
formatter.write("Search results are displayed successfully.");
formatter.result({
  "duration": 6157229074,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_click_on_view_button_and_pdf_open()"
});
formatter.write("https://www.yourdependentverification.com/PlanSmart/Report/frm_rpt_pdf.aspx?rpt_path\u003d6e65d24470159799d6e57d8b637635142e3ad86689abb7d3acbebc6c61cecb67c14067067345be669e8cbbc9b500efef78cfd123c5d784dd703bcaac5cd83d34");
formatter.result({
  "duration": 43162926156,
  "status": "passed"
});
formatter.embedding("image/png", "embedded11.png");
formatter.after({
  "duration": 328592209,
  "status": "passed"
});
formatter.before({
  "duration": 33876,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 136,
      "value": "#  Author: Pawan Dubey"
    }
  ],
  "line": 137,
  "name": "User selects Dependent types section and verifies its associated functionalities.",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-dependent-types-section-and-verifies-its-associated-functionalities.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 138,
  "name": "user is on Dependent types page",
  "keyword": "Given "
});
formatter.step({
  "line": 139,
  "name": "user clicks Add button from Dependent Types Not Allowed grid",
  "keyword": "Then "
});
formatter.step({
  "line": 140,
  "name": "user verifies addition to Dependent Types Allowed grid",
  "keyword": "Then "
});
formatter.step({
  "line": 141,
  "name": "user clicks cross icon to remove the added option",
  "keyword": "Then "
});
formatter.step({
  "line": 142,
  "name": "user verifies the removal of option from dep allowed grid",
  "keyword": "Then "
});
formatter.step({
  "line": 143,
  "name": "user verifies the addition to dep not allowed grid",
  "keyword": "Then "
});
formatter.step({
  "line": 144,
  "name": "user clicks preview button and verifies opening of PDF in new browser tab",
  "keyword": "Then "
});
formatter.step({
  "line": 145,
  "name": "user clicks save button and capture update text of bottom",
  "keyword": "Then "
});
formatter.step({
  "line": 146,
  "name": "Open Dependent type pdf and close it",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.user_is_on_Dependent_types_page()"
});
formatter.write("Navigation to Dependent Types page verified successfully");
formatter.result({
  "duration": 17835282150,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Add_button_from_Dependent_Types_Not_Allowed_grid()"
});
formatter.write("Biological Child Missionary is to be added to allowed dep type grid");
formatter.write("Add button of Dependent not allowed grid clicked successfully");
formatter.result({
  "duration": 24176259499,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_verifies_addition_to_Dependent_Types_Allowed_grid()"
});
formatter.write("Biological Child Missionary not added to allowed dependent type grid.");
formatter.result({
  "duration": 14567272,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_cross_icon_to_remove_the_added_option()"
});
formatter.write("Biological Child Missionary clicked to remove from allowed dep grid successfully.");
formatter.result({
  "duration": 6210137789,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_verifies_the_removal_of_option_from_dep_allowed_grid()"
});
formatter.write("Biological Child Missionary removed from allowed dependent type grid successfully.");
formatter.result({
  "duration": 18656414,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_verifies_the_addition_to_dep_not_allowed_grid()"
});
formatter.write("Biological Child Missionary added back to not allowed dependent type grid successfully.");
formatter.result({
  "duration": 39403253,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_preview_button_and_verifies_opening_of_PDF_in_new_browser_tab()"
});
formatter.write("Preview button clicked successfully");
formatter.result({
  "duration": 12000976946,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_save_button_and_capture_update_text_of_bottom()"
});
formatter.write("Last modified by: Bhambri, Abhishek on 11/28/2018 1:22:48 AM");
formatter.write("Save button clicked and latest update date fetched successfully.");
formatter.result({
  "duration": 12211449052,
  "status": "passed"
});
formatter.match({
  "location": "Simple.open_Dependent_type_pdf_and_close_it()"
});
formatter.write("https://www.yourdependentverification.com/PlanSmart/Report/frm_rpt_pdf.aspx?rpt_path\u003d6e65d24470159799d6e57d8b637635142e3ad86689abb7d3acbebc6c61cecb67c14067067345be669e8cbbc9b500efeff162d1f57d059d7bc901b1eb715dfb74");
formatter.result({
  "duration": 55177612509,
  "status": "passed"
});
formatter.embedding("image/png", "embedded12.png");
formatter.after({
  "duration": 359933862,
  "status": "passed"
});
formatter.before({
  "duration": 36614,
  "status": "passed"
});
formatter.scenario({
  "line": 148,
  "name": "User selects Verification section and verifies its associated functionalities.",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-verification-section-and-verifies-its-associated-functionalities.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 149,
  "name": "user is on verification page",
  "keyword": "Given "
});
formatter.step({
  "line": 150,
  "name": "user clicks select and then edit",
  "keyword": "Then "
});
formatter.step({
  "line": 151,
  "name": "user verifies appeared window",
  "keyword": "Then "
});
formatter.step({
  "line": 152,
  "name": "user clicks cancel button of window",
  "keyword": "Then "
});
formatter.step({
  "line": 153,
  "name": "user click on verification list pdf preview and close it",
  "keyword": "Then "
});
formatter.step({
  "line": 154,
  "name": "user clicks Checklist Setup link of top options",
  "keyword": "Then "
});
formatter.step({
  "line": 155,
  "name": "user verifies grids on Checklist setup page",
  "keyword": "Then "
});
formatter.step({
  "line": 156,
  "name": "user clicks on Letter Setup link and verifies grid",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.user_is_on_verification_page()"
});
formatter.write("Navigation to Verifications page verified successfully");
formatter.result({
  "duration": 10705966007,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_select_and_then_edit()"
});
formatter.write("Select link clicked on Verifications Page successfully");
formatter.write("Edit link clicked on Verifications Page successfully");
formatter.result({
  "duration": 18087209607,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_verifies_appeared_window()"
});
formatter.write("Window on click of Edit link on Verifications page populated successfully.");
formatter.result({
  "duration": 81557693,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_cancel_button_of_window()"
});
formatter.write("Cancel button of window clicked successfully.");
formatter.result({
  "duration": 12089736662,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_click_on_verification_list_pdf_preview_and_close_it()"
});
formatter.write("https://www.yourdependentverification.com/PlanSmart/Report/frm_rpt_pdf.aspx?rpt_path\u003d6e65d24470159799d6e57d8b637635142e3ad86689abb7d3acbebc6c61cecb67c14067067345be669e8cbbc9b500efef6972319c00517c4d5131d0cb6674b0f4");
formatter.result({
  "duration": 63195619108,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Checklist_Setup_link_of_top_options()"
});
formatter.write("Checklist Setup tab clicked successfully.");
formatter.result({
  "duration": 3232068597,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_verifies_grids_on_Checklist_setup_page()"
});
formatter.write("Checklist1 clicked successfully.");
formatter.write("Grid1 and Grid2 on Checklist1 populated successfully.");
formatter.write("Checklist2 clicked successfully.");
formatter.write("Grid1 and Grid2 on Checklist2 populated successfully.");
formatter.write("Checklist3 Clicked successfully.");
formatter.write("Grid1 and Grid2 on Checklist3 populated successfully.");
formatter.result({
  "duration": 43697329533,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_on_Letter_Setup_link_and_verifies_grid()"
});
formatter.write("Letter setup tab clicked successfully.");
formatter.write("Grid on Letter Setup page populated successfully.");
formatter.result({
  "duration": 13895751501,
  "status": "passed"
});
formatter.embedding("image/png", "embedded13.png");
formatter.after({
  "duration": 312474143,
  "status": "passed"
});
formatter.before({
  "duration": 32507,
  "status": "passed"
});
formatter.scenario({
  "line": 158,
  "name": "User perform action in communication",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-communication",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 159,
  "name": "click and verify communications menu",
  "keyword": "When "
});
formatter.step({
  "line": 160,
  "name": "edit currently configured letters",
  "keyword": "Then "
});
formatter.step({
  "line": 161,
  "name": "click on additional options button and close the dialog",
  "keyword": "Then "
});
formatter.step({
  "line": 162,
  "name": "click on pdf preview button and close the window",
  "keyword": "Then "
});
formatter.step({
  "line": 163,
  "name": "click on html preview button and close the window",
  "keyword": "Then "
});
formatter.step({
  "line": 164,
  "name": "click and verify issue tab",
  "keyword": "Then "
});
formatter.step({
  "line": 165,
  "name": "click and verify emails tab",
  "keyword": "Then "
});
formatter.step({
  "line": 166,
  "name": "click and verify SMS tab",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_and_verify_communications_menu()"
});
formatter.write("Communication menu clicked and verified");
formatter.result({
  "duration": 16621024079,
  "status": "passed"
});
formatter.match({
  "location": "Simple.edit_currently_configured_letters()"
});
formatter.write("Edit link clicked successfully");
formatter.result({
  "duration": 6045000416,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_additional_options_button_and_close_the_dialog()"
});
formatter.write("Successfully clicked and closed the additional options");
formatter.result({
  "duration": 12089600814,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_pdf_preview_button_and_close_the_window()"
});
formatter.write("https://www.yourdependentverification.com/PlanSmart/Report/frm_rpt_pdf.aspx?rpt_path\u003d6e65d24470159799d6e57d8b637635142e3ad86689abb7d3acbebc6c61cecb67c14067067345be669e8cbbc9b500efef671797b8141d13ed3f85ed6eb664c009");
formatter.write("successfully clicked and closed pdf preview.");
formatter.result({
  "duration": 43162115514,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_html_preview_button_and_close_the_window()"
});
formatter.write("https://www.yourdependentverification.com/PlanSmart/Report/frm_view_rpt.aspx?rpt_path\u003d6e65d24470159799d6e57d8b637635142e3ad86689abb7d3acbebc6c61cecb67c14067067345be669e8cbbc9b500efef96556704de151a14f49daca4b0f70bc5");
formatter.write("Successfully clicked and closed html preview.");
formatter.result({
  "duration": 43126337740,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_and_verify_issue_tab()"
});
formatter.write("Successfully clicked and verified issue tab");
formatter.result({
  "duration": 12138570949,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_and_verify_emails_tab()"
});
formatter.write("Successfully clicked and verified emails tab");
formatter.result({
  "duration": 16359207740,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_and_verify_SMS_tab()"
});
formatter.write("Successfully clicked and verified SMS tab");
formatter.result({
  "duration": 15084411538,
  "status": "passed"
});
formatter.embedding("image/png", "embedded14.png");
formatter.after({
  "duration": 332945863,
  "status": "passed"
});
formatter.before({
  "duration": 622097,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 168,
      "value": "# Author: Pawan Dubey  #"
    }
  ],
  "line": 169,
  "name": "User selects Reports section and verifies its associated functionalities.",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-reports-section-and-verifies-its-associated-functionalities.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 170,
  "name": "user clicks Reports and redirects to Reports page",
  "keyword": "Given "
});
formatter.step({
  "line": 171,
  "name": "user clicks Run link from Select version grid",
  "keyword": "Then "
});
formatter.step({
  "line": 172,
  "name": "user clicks Retrieve button and verifies opening of PDF in new tab",
  "keyword": "Then "
});
formatter.step({
  "line": 173,
  "name": "user clicks Go back button and return to Reports main page",
  "keyword": "Then "
});
formatter.step({
  "line": 174,
  "name": "user selects Internal Reports and clicks Run link of first option from version grid",
  "keyword": "Then "
});
formatter.step({
  "line": 175,
  "name": "user clicks Retrieve button and verifies opening of PDF in new tab",
  "keyword": "Then "
});
formatter.step({
  "line": 176,
  "name": "user clicks Go back button and return to Reports main page",
  "keyword": "Then "
});
formatter.step({
  "line": 177,
  "name": "user clicks Report Schedular and verifies page",
  "keyword": "Then "
});
formatter.step({
  "line": 178,
  "name": "user clicks Report History and verifies page",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.user_clicks_Reports_and_redirects_to_Reports_page()"
});
formatter.write("Navigation to Reports home page verified successfully.");
formatter.result({
  "duration": 14418778506,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Run_link_from_Select_version_grid()"
});
formatter.write("Run link clicked successfully.");
formatter.write("Navigation to Plan-Guard Client Agenda Stats page verified successfully.");
formatter.result({
  "duration": 14869069075,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Retrieve_button_and_verifies_opening_of_PDF_in_new_tab()"
});
formatter.write("Retrieve button clicked successfully.");
formatter.write("https://www.yourdependentverification.com/PlanSmart/Report/frm_rpt_pdf.aspx?rpt_path\u003d6e65d24470159799d6e57d8b637635142e3ad86689abb7d3acbebc6c61cecb67c14067067345be669e8cbbc9b500efefa4c099bb0df6651905f7a0480408d4a2");
formatter.result({
  "duration": 65414291057,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Go_back_button_and_return_to_Reports_main_page()"
});
formatter.write("Go Back button clicked successfully.");
formatter.write("Navigation to Reports home page on Go back verified successfully.");
formatter.result({
  "duration": 10385826177,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_selects_Internal_Reports_and_clicks_Run_link_of_first_option_from_version_grid()"
});
formatter.write("Internal Reporting selected successfully.");
formatter.write("CAM selected successfully.");
formatter.write("Open Audit run link clicked successfully.");
formatter.write("Run link for Internal Reportings \u003e CAM \u003e Open Audits clicked successfully.");
formatter.write("Navigation to Plan-Guard Client Agenda Stats for CAM report verified successfully.");
formatter.result({
  "duration": 24437078019,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Retrieve_button_and_verifies_opening_of_PDF_in_new_tab()"
});
formatter.write("Retrieve button clicked successfully.");
formatter.write("https://www.yourdependentverification.com/PlanSmart/Report/frm_rpt_pdf.aspx?rpt_path\u003d6e65d24470159799d6e57d8b637635142e3ad86689abb7d3acbebc6c61cecb67c14067067345be669e8cbbc9b500efefb98e4a6e154c50e7786ea814b80c9893");
formatter.result({
  "duration": 46676417418,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Go_back_button_and_return_to_Reports_main_page()"
});
formatter.write("Go Back button clicked successfully.");
formatter.write("Navigation to Reports home page on Go back verified successfully.");
formatter.result({
  "duration": 8986479481,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Report_Schedular_and_verifies_page()"
});
formatter.write("Report Schedular clicked successfully.");
formatter.write("Navigation to Report Schedular page verified successfully.");
formatter.result({
  "duration": 16575004628,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Report_History_and_verifies_page()"
});
formatter.write("Reporting History selected successfully.");
formatter.write("Navigation to Reporting History verified successfully.");
formatter.result({
  "duration": 14062996065,
  "status": "passed"
});
formatter.embedding("image/png", "embedded15.png");
formatter.after({
  "duration": 364341924,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 180,
      "value": "# Abhishek Bhambri Received Document--\u003eScan Queue Page 7/17/2018"
    }
  ],
  "line": 181,
  "name": "User perform action in Received documents",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 182,
  "name": "clicked on received document from left panel",
  "keyword": "When "
});
formatter.step({
  "line": 183,
  "name": "click on scan queue button",
  "keyword": "Then "
});
formatter.step({
  "line": 184,
  "name": "user enter values \"\u003cScanDate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 185,
  "name": "click on Retreive button",
  "keyword": "Then "
});
formatter.step({
  "line": 186,
  "name": "verify the result on scan queue page",
  "keyword": "Then "
});
formatter.step({
  "line": 187,
  "name": "Click on View button and verify open and close pdf",
  "keyword": "Then "
});
formatter.examples({
  "line": 189,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents;",
  "rows": [
    {
      "cells": [
        "ScanDate"
      ],
      "line": 190,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents;;1"
    },
    {
      "cells": [
        "4/12/2018"
      ],
      "line": 191,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 49618,
  "status": "passed"
});
formatter.scenario({
  "line": 191,
  "name": "User perform action in Received documents",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 182,
  "name": "clicked on received document from left panel",
  "keyword": "When "
});
formatter.step({
  "line": 183,
  "name": "click on scan queue button",
  "keyword": "Then "
});
formatter.step({
  "line": 184,
  "name": "user enter values \"4/12/2018\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 185,
  "name": "click on Retreive button",
  "keyword": "Then "
});
formatter.step({
  "line": 186,
  "name": "verify the result on scan queue page",
  "keyword": "Then "
});
formatter.step({
  "line": 187,
  "name": "Click on View button and verify open and close pdf",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.clicked_on_received_document_from_left_panel()"
});
formatter.write("Successfully clicked on received documents");
formatter.result({
  "duration": 13403556630,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_scan_queue_button()"
});
formatter.write("Scan Queue  tab has been opened without any error");
formatter.result({
  "duration": 11570351902,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4/12/2018",
      "offset": 19
    }
  ],
  "location": "Simple.user_enter_values(String)"
});
formatter.write("Scan Date ");
formatter.result({
  "duration": 24896928626,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_Retreive_button()"
});
formatter.write("Retrieve button is clicked successfully.");
formatter.result({
  "duration": 6039385458,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_the_result_on_scan_queue_page()"
});
formatter.write("Search results are displayed successfully.");
formatter.result({
  "duration": 12094236773,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_View_button_and_verify_open_and_close_pdf()"
});
formatter.write("https://www.yourdependentverification.com/PlanSmart/Receivable/frm_view_image.aspx?rpt_path\u003d%5c%5cLCCWEPMG644%5cPlanSmart%5cVerifyRpts%5c8224-1128201813411AM312.PDF");
formatter.result({
  "duration": 43170603821,
  "status": "passed"
});
formatter.embedding("image/png", "embedded16.png");
formatter.after({
  "duration": 404184545,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 193,
      "value": "#  Meenakshi Received Document--\u003e Fax Queue Page 7/17/2018"
    }
  ],
  "line": 194,
  "name": "User perform action in Received documents fax queue",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents-fax-queue",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 195,
  "name": "click on fax queue tab",
  "keyword": "Then "
});
formatter.step({
  "line": 196,
  "name": "user enter values for fax date \"\u003cFaxDate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 197,
  "name": "click on fax Retreive button",
  "keyword": "Then "
});
formatter.step({
  "line": 198,
  "name": "verify the result on fax queue page",
  "keyword": "Then "
});
formatter.step({
  "line": 199,
  "name": "open fax pdf and close it",
  "keyword": "Then "
});
formatter.examples({
  "line": 201,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents-fax-queue;",
  "rows": [
    {
      "cells": [
        "FaxDate"
      ],
      "line": 202,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents-fax-queue;;1"
    },
    {
      "cells": [
        "6/1/2018"
      ],
      "line": 203,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents-fax-queue;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 25664,
  "status": "passed"
});
formatter.scenario({
  "line": 203,
  "name": "User perform action in Received documents fax queue",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents-fax-queue;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 195,
  "name": "click on fax queue tab",
  "keyword": "Then "
});
formatter.step({
  "line": 196,
  "name": "user enter values for fax date \"6/1/2018\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 197,
  "name": "click on fax Retreive button",
  "keyword": "Then "
});
formatter.step({
  "line": 198,
  "name": "verify the result on fax queue page",
  "keyword": "Then "
});
formatter.step({
  "line": 199,
  "name": "open fax pdf and close it",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_on_fax_queue_tab()"
});
formatter.write("System successfully redirected to fax queue tab");
formatter.result({
  "duration": 3541912343,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6/1/2018",
      "offset": 32
    }
  ],
  "location": "Simple.user_enter_values_for_fax_date(String)"
});
formatter.write("Details has been enetered successfully");
formatter.result({
  "duration": 12634202411,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_fax_Retreive_button()"
});
formatter.write("Retrieve button clicked");
formatter.result({
  "duration": 6039343027,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_the_result_on_fax_queue_page()"
});
formatter.write("Fax queue data fetched successfully");
formatter.result({
  "duration": 33173772136,
  "status": "passed"
});
formatter.match({
  "location": "Simple.open_fax_pdf_and_close_it()"
});
formatter.write("https://www.yourdependentverification.com/PlanSmart/Receivable/frm_view_image.aspx?rpt_path\u003d%5c%5cLCCWEPMG644%5cPlanSmart%5cVerifyRpts%5c8224-1128201813549AM871.PDF");
formatter.result({
  "duration": 43334864509,
  "status": "passed"
});
formatter.embedding("image/png", "embedded17.png");
formatter.after({
  "duration": 355752671,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 205,
  "name": "User perform action in Received documents module",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents-module",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 206,
  "name": "clicked on received document from left navigation panel",
  "keyword": "When "
});
formatter.step({
  "line": 207,
  "name": "click on mail prep button",
  "keyword": "Then "
});
formatter.step({
  "line": 208,
  "name": "click on the search icon from record info section",
  "keyword": "Then "
});
formatter.step({
  "line": 209,
  "name": "verify that user is on quick search page",
  "keyword": "Then "
});
formatter.step({
  "line": 210,
  "name": "enter first name \"\u003cFirstName\u003e\" for subscriber and retrieve exact match",
  "keyword": "Then "
});
formatter.step({
  "line": 211,
  "name": "Get the grid result for exact match",
  "keyword": "Then "
});
formatter.step({
  "line": 212,
  "name": "Click on partial match radio button and retrieve partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 213,
  "name": "Get the grid result for partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 214,
  "name": "click on dependent radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 215,
  "name": "click on exact match radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 216,
  "name": "enter last name \"\u003cLastName\u003e\" for dependent and retrieve exact match",
  "keyword": "Then "
});
formatter.step({
  "line": 217,
  "name": "Get the exact match result for dependent",
  "keyword": "Then "
});
formatter.step({
  "line": 218,
  "name": "Click on partial match radio button for dependent and retrieve partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 219,
  "name": "Get the partial match result for dependent",
  "keyword": "Then "
});
formatter.examples({
  "line": 221,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents-module;",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName"
      ],
      "line": 222,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents-module;;1"
    },
    {
      "cells": [
        "first",
        "last"
      ],
      "line": 223,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents-module;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 24295,
  "status": "passed"
});
formatter.scenario({
  "line": 223,
  "name": "User perform action in Received documents module",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-action-in-received-documents-module;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 206,
  "name": "clicked on received document from left navigation panel",
  "keyword": "When "
});
formatter.step({
  "line": 207,
  "name": "click on mail prep button",
  "keyword": "Then "
});
formatter.step({
  "line": 208,
  "name": "click on the search icon from record info section",
  "keyword": "Then "
});
formatter.step({
  "line": 209,
  "name": "verify that user is on quick search page",
  "keyword": "Then "
});
formatter.step({
  "line": 210,
  "name": "enter first name \"first\" for subscriber and retrieve exact match",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 211,
  "name": "Get the grid result for exact match",
  "keyword": "Then "
});
formatter.step({
  "line": 212,
  "name": "Click on partial match radio button and retrieve partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 213,
  "name": "Get the grid result for partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 214,
  "name": "click on dependent radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 215,
  "name": "click on exact match radio button",
  "keyword": "Then "
});
formatter.step({
  "line": 216,
  "name": "enter last name \"last\" for dependent and retrieve exact match",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 217,
  "name": "Get the exact match result for dependent",
  "keyword": "Then "
});
formatter.step({
  "line": 218,
  "name": "Click on partial match radio button for dependent and retrieve partial match",
  "keyword": "Then "
});
formatter.step({
  "line": 219,
  "name": "Get the partial match result for dependent",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.clicked_on_received_document_from_left_navigation_panel()"
});
formatter.write("Successfully clicked on received documents");
formatter.result({
  "duration": 9931908760,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_mail_prep_button()"
});
formatter.write("Successfully clicked on mail prep");
formatter.result({
  "duration": 12864009488,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_the_search_icon_from_record_info_section()"
});
formatter.result({
  "duration": 10305183835,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_that_user_is_on_quick_search_page()"
});
formatter.write("Search screen verified successfully");
formatter.result({
  "duration": 12104245419,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "first",
      "offset": 18
    }
  ],
  "location": "Simple.enter_first_name_for_subscriber_and_retrieve_exact_match(String)"
});
formatter.result({
  "duration": 12425105214,
  "status": "passed"
});
formatter.match({
  "location": "Simple.get_the_grid_result_for_exact_match()"
});
formatter.write("Successfully get grid result for exact match");
formatter.result({
  "duration": 6365871844,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_partial_match_radio_button_and_retrieve_partial_match()"
});
formatter.write("Successfully retrieved subscriber for partial match");
formatter.result({
  "duration": 30351164961,
  "status": "passed"
});
formatter.match({
  "location": "Simple.get_the_grid_result_for_partial_match()"
});
formatter.write("You are returning more than 20 records. Please alter your criteria to limit the records returned or select 100 and search again");
formatter.result({
  "duration": 112583451531,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_dependent_radio_button()"
});
formatter.write("Successfully clicked on dependent radio button");
formatter.result({
  "duration": 6042539744,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_exact_match_radio_button()"
});
formatter.write("Successfully clicked on exact match radio button");
formatter.result({
  "duration": 6154897749,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "last",
      "offset": 17
    }
  ],
  "location": "Simple.enter_last_name_for_dependent_and_retrieve_exact_match(String)"
});
formatter.write("Successfully retrieved dependent using exact match");
formatter.result({
  "duration": 13437366141,
  "status": "passed"
});
formatter.match({
  "location": "Simple.get_the_exact_match_result_for_dependent()"
});
formatter.write("You are returning more than 20 records. Please alter your criteria to limit the records returned or select 100 and search again");
formatter.result({
  "duration": 112104391876,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_partial_match_radio_button_for_dependent_and_retrieve_partial_match()"
});
formatter.write("Successfully retrieved dependent using partial match");
formatter.result({
  "duration": 11205679767,
  "status": "passed"
});
formatter.match({
  "location": "Simple.get_the_partial_match_result_for_dependent()"
});
formatter.write("You are returning more than 20 records. Please alter your criteria to limit the records returned or select 100 and search again");
formatter.result({
  "duration": 112148999119,
  "status": "passed"
});
formatter.embedding("image/png", "embedded18.png");
formatter.after({
  "duration": 748247058,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 225,
      "value": "#  Meenakshi scenario for Quality Control tab"
    }
  ],
  "line": 226,
  "name": "User perform search for Quality control data",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-search-for-quality-control-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 227,
  "name": "click and verify Quality Control Menu",
  "keyword": "When "
});
formatter.step({
  "line": 228,
  "name": "search using \"\u003cFrom\u003e\" date",
  "keyword": "Then "
});
formatter.step({
  "line": 229,
  "name": "click on filter button",
  "keyword": "Then "
});
formatter.step({
  "line": 230,
  "name": "verify search results are displayed for quality control",
  "keyword": "Then "
});
formatter.examples({
  "line": 232,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-search-for-quality-control-data;",
  "rows": [
    {
      "cells": [
        "From"
      ],
      "line": 233,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-search-for-quality-control-data;;1"
    },
    {
      "cells": [
        "1/1/2018"
      ],
      "line": 234,
      "id": "regression-test-suite-for-dvs-automation-admin;user-perform-search-for-quality-control-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 32508,
  "status": "passed"
});
formatter.scenario({
  "line": 234,
  "name": "User perform search for Quality control data",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-perform-search-for-quality-control-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 227,
  "name": "click and verify Quality Control Menu",
  "keyword": "When "
});
formatter.step({
  "line": 228,
  "name": "search using \"1/1/2018\" date",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 229,
  "name": "click on filter button",
  "keyword": "Then "
});
formatter.step({
  "line": 230,
  "name": "verify search results are displayed for quality control",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_and_verify_Quality_Control_Menu()"
});
formatter.write("System successfully redirected to Quality Control tab");
formatter.result({
  "duration": 11500229779,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1/1/2018",
      "offset": 14
    }
  ],
  "location": "Simple.search_using_date(String)"
});
formatter.write("Details has been enetered successfully");
formatter.result({
  "duration": 13199411232,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_filter_button()"
});
formatter.write("Filter button clicked");
formatter.result({
  "duration": 6057682918,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_search_results_are_displayed_for_quality_control()"
});
formatter.write("Quality control data fetched successfully");
formatter.result({
  "duration": 12104634487,
  "status": "passed"
});
formatter.embedding("image/png", "embedded19.png");
formatter.after({
  "duration": 340079107,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 236,
      "value": "# Abhishek Bhambri File Transfer Tab 6/22/2018"
    }
  ],
  "line": 237,
  "name": "User verify the File Transfer Menu",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-verify-the-file-transfer-menu",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 238,
  "name": "Click and verify File Transfer Menu",
  "keyword": "When "
});
formatter.step({
  "line": 239,
  "name": "Filter using \"\u003cFroms\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 240,
  "name": "Click on Filter button",
  "keyword": "Then "
});
formatter.step({
  "line": 241,
  "name": "verify result are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 242,
  "name": "click on File Imports tab",
  "keyword": "Then "
});
formatter.step({
  "line": 243,
  "name": "verify the result on File Import screen",
  "keyword": "Then "
});
formatter.examples({
  "line": 245,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-verify-the-file-transfer-menu;",
  "rows": [
    {
      "cells": [
        "Froms"
      ],
      "line": 246,
      "id": "regression-test-suite-for-dvs-automation-admin;user-verify-the-file-transfer-menu;;1"
    },
    {
      "cells": [
        "1/1/2016"
      ],
      "line": 247,
      "id": "regression-test-suite-for-dvs-automation-admin;user-verify-the-file-transfer-menu;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 26691,
  "status": "passed"
});
formatter.scenario({
  "line": 247,
  "name": "User verify the File Transfer Menu",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-verify-the-file-transfer-menu;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 238,
  "name": "Click and verify File Transfer Menu",
  "keyword": "When "
});
formatter.step({
  "line": 239,
  "name": "Filter using \"1/1/2016\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 240,
  "name": "Click on Filter button",
  "keyword": "Then "
});
formatter.step({
  "line": 241,
  "name": "verify result are displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 242,
  "name": "click on File Imports tab",
  "keyword": "Then "
});
formatter.step({
  "line": 243,
  "name": "verify the result on File Import screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.click_and_verify_File_Transfer_Menu()"
});
formatter.write("File Transfer tab has been opened without any error");
formatter.result({
  "duration": 12188330853,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1/1/2016",
      "offset": 14
    }
  ],
  "location": "Simple.filter_using(String)"
});
formatter.write("Cleint and Froms Date ");
formatter.result({
  "duration": 12836963659,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_Filter_button()"
});
formatter.write("Filter button is clicked successfully.");
formatter.result({
  "duration": 6039751599,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_result_are_displayed()"
});
formatter.write("Search results are displayed successfully.");
formatter.result({
  "duration": 6105331865,
  "status": "passed"
});
formatter.match({
  "location": "Simple.click_on_File_Imports_tab()"
});
formatter.write("File Import tab has been opened without any error");
formatter.result({
  "duration": 12062747979,
  "status": "passed"
});
formatter.match({
  "location": "Simple.verify_the_result_on_File_Import_screen()"
});
formatter.write("Search results are displayed successfully.");
formatter.result({
  "duration": 12091520487,
  "status": "passed"
});
formatter.embedding("image/png", "embedded20.png");
formatter.after({
  "duration": 347200375,
  "status": "passed"
});
formatter.before({
  "duration": 24296,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 249,
      "value": "# Author: Pawan Dubey  #"
    }
  ],
  "line": 250,
  "name": "User selects Admin section and verifies its associated functionalities.",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-admin-section-and-verifies-its-associated-functionalities.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 251,
  "name": "user is on Admin page",
  "keyword": "Given "
});
formatter.match({
  "location": "Simple.user_is_on_Admin_page()"
});
formatter.write("Navigation to Admin page verified successfully.");
formatter.result({
  "duration": 41448469104,
  "status": "passed"
});
formatter.embedding("image/png", "embedded21.png");
formatter.after({
  "duration": 338079705,
  "status": "passed"
});
formatter.before({
  "duration": 24295,
  "status": "passed"
});
formatter.scenario({
  "line": 253,
  "name": "User selects Home section and verifies its associated functionalities.",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-home-section-and-verifies-its-associated-functionalities.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 254,
  "name": "user clicks Home link from header section and verifies Grid present on Home",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.user_clicks_Home_link_from_header_section_and_verifies_Grid_present_on_Home()"
});
formatter.write("Home button clicked successfully.");
formatter.write("Navigation to Home page verified successfully.");
formatter.result({
  "duration": 84583538789,
  "status": "passed"
});
formatter.embedding("image/png", "embedded22.png");
formatter.after({
  "duration": 366051493,
  "status": "passed"
});
formatter.before({
  "duration": 23954,
  "status": "passed"
});
formatter.scenario({
  "line": 256,
  "name": "User selects Client section and verifies its associated functionalities.",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-client-section-and-verifies-its-associated-functionalities.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 257,
  "name": "user clicks Clients link from header section and verifies Grid on Clients",
  "keyword": "Then "
});
formatter.step({
  "line": 258,
  "name": "user clicks Division List and verifies Grid present on Division List",
  "keyword": "Then "
});
formatter.step({
  "line": 259,
  "name": "user clicks Client Phases and verifies Grid present on Client Phases",
  "keyword": "Then "
});
formatter.step({
  "line": 260,
  "name": "user clicks Project Close and verifies Grid on Project Close",
  "keyword": "Then "
});
formatter.step({
  "line": 261,
  "name": "user clicks Documentary Library and verifies Grid present on Documentary Library",
  "keyword": "Then "
});
formatter.step({
  "line": 262,
  "name": "user clicks Portal Interface and verifies Grid present on Portal Interface",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.user_clicks_Clients_link_from_header_section_and_verifies_Grid_on_Clients()"
});
formatter.write("Client clicked successfully.");
formatter.write("Navigation to Client page verified successfully.");
formatter.result({
  "duration": 122192863129,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Division_List_and_verifies_Grid_present_on_Division_List()"
});
formatter.write("Division List clicked successfully.");
formatter.write("Navigation to Division List page verified successfully.");
formatter.result({
  "duration": 48204825325,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Client_Phases_and_verifies_Grid_present_on_Client_Phases()"
});
formatter.write("Client Phases clicked successfully.");
formatter.write("Navigation to Client Phases page verified successfully.");
formatter.result({
  "duration": 35264509356,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Project_Close_and_verifies_Grid_on_Project_Close()"
});
formatter.write("Project Close clicked successfully.");
formatter.write("Navigation to Project Close page verified successfully.");
formatter.result({
  "duration": 42593290453,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Documentary_Library_and_verifies_Grid_present_on_Documentary_Library()"
});
formatter.write("Documentary Library clicked successfully.");
formatter.write("Navigation to Document Library page verified successfully.");
formatter.result({
  "duration": 51485701517,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Portal_Interface_and_verifies_Grid_present_on_Portal_Interface()"
});
formatter.write("Portal Interface clicked successfully.");
formatter.write("Navigation to Portal Interface page verified successfully.");
formatter.result({
  "duration": 66603760710,
  "status": "passed"
});
formatter.embedding("image/png", "embedded23.png");
formatter.after({
  "duration": 690498098,
  "status": "passed"
});
formatter.before({
  "duration": 24980,
  "status": "passed"
});
formatter.scenario({
  "line": 264,
  "name": "User selects Client Period section and verifies its associated functionalities.",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-client-period-section-and-verifies-its-associated-functionalities.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 265,
      "value": "#  Client Period"
    }
  ],
  "line": 266,
  "name": "user clicks Client Period link from header section and verifies Grid on Client Period",
  "keyword": "Then "
});
formatter.step({
  "line": 267,
  "name": "user clicks Period Info and verifies Grid present on Period Info",
  "keyword": "Then "
});
formatter.step({
  "line": 268,
  "name": "user clicks Period Alerts and verifies Grid present on Period Alerts",
  "keyword": "Then "
});
formatter.step({
  "line": 269,
  "name": "user clicks Plan-Guard and verifies Grid on Plan-Guard",
  "keyword": "Then "
});
formatter.step({
  "line": 270,
  "name": "user clicks Portal and verifies Grid present on Portal",
  "keyword": "Then "
});
formatter.step({
  "line": 271,
  "name": "user clicks Participant Website and verifies Grid present on Participant Website",
  "keyword": "Then "
});
formatter.step({
  "line": 272,
  "name": "user clicks Affidavits and verifies Grid present on Affidavits",
  "keyword": "Then "
});
formatter.step({
  "line": 273,
  "name": "user clicks Custom Text and verifies Grid present on Custom Text",
  "keyword": "Then "
});
formatter.step({
  "line": 274,
  "name": "user clicks Reports and verifies Grid present on Reports",
  "keyword": "Then "
});
formatter.step({
  "line": 275,
  "name": "user clicks Override Authoring and verifies Grid present on Override Authoring",
  "keyword": "Then "
});
formatter.step({
  "line": 276,
  "name": "user clicks Email Override and verifies Grid present on clicks Email Override",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.user_clicks_Client_Period_link_from_header_section_and_verifies_Grid_on_Client_Period()"
});
formatter.write("Client Period clicked successfully.");
formatter.write("Navigation to Client Period sub page verified successfully.");
formatter.result({
  "duration": 45298249744,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Period_Info_and_verifies_Grid_present_on_Period_Info()"
});
formatter.write("Period Info clicked successfully.");
formatter.write("Navigation to Period info page verified successfully.");
formatter.result({
  "duration": 23845152210,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Period_Alerts_and_verifies_Grid_present_on_Period_Alerts()"
});
formatter.write("Period Alerts clicked successfully.");
formatter.write("Navigation to Period Alerts page verified successfully.");
formatter.result({
  "duration": 22674365661,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Plan_Guard_and_verifies_Grid_on_Plan_Guard()"
});
formatter.write("Plan Guard clicked successfully.");
formatter.write("Navigation to Plan Guard page verified successfully.");
formatter.result({
  "duration": 34199812276,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Portal_and_verifies_Grid_present_on_Portal()"
});
formatter.write("Portal clicked successfully.");
formatter.write("Navigation to Portals page verified successfully.");
formatter.result({
  "duration": 62845126546,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Participant_Website_and_verifies_Grid_present_on_Participant_Website()"
});
formatter.write("Participant Website clicked successfully.");
formatter.write("Navigation to Participant Website page verified successfully.");
formatter.result({
  "duration": 40239585775,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Affidavits_and_verifies_Grid_present_on_Affidavits()"
});
formatter.write("Affidavits clicked successfully.");
formatter.write("Navigation to Affidevits page verified successfully.");
formatter.result({
  "duration": 32021485621,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Custom_Text_and_verifies_Grid_present_on_Custom_Text()"
});
formatter.write("Custom Text clicked successfully.");
formatter.write("Navigation to Custom Text page verified successfully.");
formatter.result({
  "duration": 32375456521,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Reports_and_verifies_Grid_present_on_Reports()"
});
formatter.write("Reports clicked successfully.");
formatter.write("Navigation to Reports page verified successfully.");
formatter.result({
  "duration": 37187877454,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Override_Authoring_and_verifies_Grid_present_on_Override_Authoring()"
});
formatter.write("Override Authoring clicked successfully.");
formatter.write("Navigation to Override Authoring page verified successfully.");
formatter.result({
  "duration": 24501674496,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Email_Override_and_verifies_Grid_present_on_clicks_Email_Override()"
});
formatter.write("Email Override clicked successfully.");
formatter.write("Navigation to Email Override page verified successfully.");
formatter.result({
  "duration": 32029833974,
  "status": "passed"
});
formatter.embedding("image/png", "embedded24.png");
formatter.after({
  "duration": 661021027,
  "status": "passed"
});
formatter.before({
  "duration": 24295,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 278,
      "value": "#Scenario: User selects Details Type and verifies its associated functionalities."
    },
    {
      "line": 279,
      "value": "###  Detail Types"
    },
    {
      "line": 280,
      "value": "#Then  user clicks Details Type link from header section and verifies Grid on Details Type page"
    },
    {
      "line": 281,
      "value": "#\tThen  user clicks Assign Sets To Type verifies Assign Sets To Type"
    },
    {
      "line": 282,
      "value": "#\tThen  user clicks Override Authoring and verifies Grid on Override Authoring"
    },
    {
      "line": 283,
      "value": "#\tScenario: User selects Documents and verifies its associated functionalities."
    },
    {
      "line": 284,
      "value": "###  Documents"
    },
    {
      "line": 285,
      "value": "#Then  user clicks Documents link from header section and verifies Grid on Documents"
    },
    {
      "line": 286,
      "value": "#\tThen  user clicks Doc Sets and verifies Doc Sets"
    },
    {
      "line": 287,
      "value": "#Then  user clicks Document Swap and verifies Grid on Document Swap"
    },
    {
      "line": 288,
      "value": "#Then  user clicks Standard Alt Doc List and verifies Grid on Standard Alt Doc List"
    },
    {
      "line": 289,
      "value": "#Then  user clicks Assign Docs To Set and verifies Grid on Assign Docs To Set"
    }
  ],
  "line": 290,
  "name": "User selects DEAR Setup and verifies its associated functionalities.",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-dear-setup-and-verifies-its-associated-functionalities.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 291,
      "value": "###  DEAR Setup"
    }
  ],
  "line": 292,
  "name": "user clicks DEAR Setup link from header section and verifies Grid on Dear Setup",
  "keyword": "Then "
});
formatter.step({
  "line": 293,
  "name": "user clicks DEAR Templates and verifies Dear Templates",
  "keyword": "Then "
});
formatter.step({
  "line": 294,
  "name": "user clicks DEAR Catagories and verifies Dear Templates",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.user_clicks_DEAR_Setup_link_from_header_section_and_verifies_Grid_on_Dear_Setup()"
});
formatter.write("DEAR Setup clicked successfully.");
formatter.write("Navigation to Dear Setup page verified successfully.");
formatter.result({
  "duration": 16579597813,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_DEAR_Templates_and_verifies_Dear_Templates()"
});
formatter.write("DEAR Template clicked successfully.");
formatter.write("Navigation to Dear Template page verified successfully.");
formatter.result({
  "duration": 31435254842,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_DEAR_Catagories_and_verifies_Dear_Templates()"
});
formatter.write("DEAR Catagory clicked successfully.");
formatter.write("Navigation to Dear Catagory page verified successfully.");
formatter.result({
  "duration": 16646167686,
  "status": "passed"
});
formatter.embedding("image/png", "embedded25.png");
formatter.after({
  "duration": 329694738,
  "status": "passed"
});
formatter.before({
  "duration": 26690,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 296,
      "value": "#Scenario: User selects Permissions and verifies its associated functionalities."
    },
    {
      "line": 297,
      "value": "###  Permissions"
    },
    {
      "line": 298,
      "value": "#\tThen  user clicks Permissions link from header section and verifies Grid on Permissions"
    },
    {
      "line": 299,
      "value": "#\tScenario: User selects Users Setup and verifies its associated functionalities."
    },
    {
      "line": 300,
      "value": "###  Users"
    },
    {
      "line": 301,
      "value": "#\tThen  user clicks Users Setup link from header section and verifies Grid on Users"
    },
    {
      "line": 302,
      "value": "#\tThen  user clicks Assign Clients and verifies Assign Clients"
    },
    {
      "line": 303,
      "value": "#\tThen  user clicks Assign Depts and verifies Assign Depts"
    },
    {
      "line": 304,
      "value": "#\tThen  user clicks Assign Work Queues and verifies Assign Work Queues"
    },
    {
      "line": 305,
      "value": "#   Scenario: User selects Reporting Setup and verifies its associated functionalities."
    },
    {
      "line": 306,
      "value": "###  Reporting"
    },
    {
      "line": 307,
      "value": "#Then  user clicks Reporting link from header section and verifies Grid on Reporting"
    }
  ],
  "line": 308,
  "name": "User selects BOS section and verifies its associated functionalities.",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-bos-section-and-verifies-its-associated-functionalities.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 309,
      "value": "###  BOS"
    }
  ],
  "line": 310,
  "name": "user clicks BOS link from header section, clicks Stop Refresh button and verifies Grid on BOS",
  "keyword": "Then "
});
formatter.step({
  "line": 311,
  "name": "user clicks Current Jobs, clicks Stop Refresh button and verifies Grid on Current Jobs",
  "keyword": "Then "
});
formatter.step({
  "line": 312,
  "name": "user clicks Archieved Jobs, retrieve and verifies Grid present on Archieved Jobs",
  "keyword": "Then "
});
formatter.step({
  "line": 313,
  "name": "user clicks Job Schedular and verifies Grid on Job Schedular",
  "keyword": "Then "
});
formatter.step({
  "line": 314,
  "name": "user clicks Monitering and verifies Grid on Monitering",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.user_clicks_BOS_link_from_header_section_clicks_Stop_Refresh_button_and_verifies_Grid_on_BOS()"
});
formatter.write("BOS clicked successfully.");
formatter.write("Navigation to BOS page verified successfully.");
formatter.result({
  "duration": 21213924779,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Current_Jobs_clicks_Stop_Refresh_button_and_verifies_Grid_on_Current_Jobs()"
});
formatter.write("Current Jobs clicked successfully.");
formatter.write("Navigation to Current jobs page verified successfully.");
formatter.result({
  "duration": 65794358215,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Archieved_Jobs_retrieve_and_verifies_Grid_present_on_Archieved_Jobs()"
});
formatter.write("Archieved Jobs clicked successfully.");
formatter.result({
  "duration": 10713607401,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Job_Schedular_and_verifies_Grid_on_Job_Schedular()"
});
formatter.write("Job Schedular clicked successfully.");
formatter.write("Navigation to Job Schedular page verified successfully.");
formatter.result({
  "duration": 16224689662,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Monitering_and_verifies_Grid_on_Monitering()"
});
formatter.write("Monitering clicked successfully.");
formatter.write("Navigation to Monitoring page verified successfully.");
formatter.result({
  "duration": 19679681888,
  "status": "passed"
});
formatter.embedding("image/png", "embedded26.png");
formatter.after({
  "duration": 381453017,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 316,
  "name": "User selects SQLizers section and verifies its associated functionalities.",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-sqlizers-section-and-verifies-its-associated-functionalities.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 317,
      "value": "###  SQLizers"
    }
  ],
  "line": 318,
  "name": "user clicks SQLizers link from header section and verifies navigation to SQLizers",
  "keyword": "Then "
});
formatter.step({
  "line": 319,
  "name": "user searches a query using \"\u003cqueryname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 320,
  "name": "user runs a query by date as param \"\u003cdateparameter\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 321,
  "name": "user verifies query result grid",
  "keyword": "Then "
});
formatter.step({
  "line": 322,
  "name": "user clicks Setup Queries and searches queries and saves parameter",
  "keyword": "Then "
});
formatter.examples({
  "line": 324,
  "name": "",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-sqlizers-section-and-verifies-its-associated-functionalities.;",
  "rows": [
    {
      "cells": [
        "queryname",
        "dateparameter"
      ],
      "line": 325,
      "id": "regression-test-suite-for-dvs-automation-admin;user-selects-sqlizers-section-and-verifies-its-associated-functionalities.;;1"
    },
    {
      "cells": [
        "Mailings",
        "05/05/2018"
      ],
      "line": 326,
      "id": "regression-test-suite-for-dvs-automation-admin;user-selects-sqlizers-section-and-verifies-its-associated-functionalities.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 26006,
  "status": "passed"
});
formatter.scenario({
  "line": 326,
  "name": "User selects SQLizers section and verifies its associated functionalities.",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-sqlizers-section-and-verifies-its-associated-functionalities.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 317,
      "value": "###  SQLizers"
    }
  ],
  "line": 318,
  "name": "user clicks SQLizers link from header section and verifies navigation to SQLizers",
  "keyword": "Then "
});
formatter.step({
  "line": 319,
  "name": "user searches a query using \"Mailings\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 320,
  "name": "user runs a query by date as param \"05/05/2018\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 321,
  "name": "user verifies query result grid",
  "keyword": "Then "
});
formatter.step({
  "line": 322,
  "name": "user clicks Setup Queries and searches queries and saves parameter",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.user_clicks_SQLizers_link_from_header_section_and_verifies_navigation_to_SQLizers()"
});
formatter.write("SQLizers clicked successfully.");
formatter.write("Navigation to SQLizers page verified successfully.");
formatter.result({
  "duration": 22464345585,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mailings",
      "offset": 29
    }
  ],
  "location": "Simple.user_searches_a_query_using(String)"
});
formatter.write("Query searched with query name Mailings successfully.");
formatter.result({
  "duration": 9305952046,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "05/05/2018",
      "offset": 36
    }
  ],
  "location": "Simple.user_runs_a_query_by_date_as_param(String)"
});
formatter.write("Query ran with date parameter \u002705/05/2018\u0027 successfully.");
formatter.result({
  "duration": 19254582492,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_verifies_query_result_grid()"
});
formatter.write("Results Grid on Run query verified successfully.");
formatter.result({
  "duration": 6065246291,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Setup_Queries_and_searches_queries_and_saves_parameter()"
});
formatter.write("Setup Queries clicked successfully.");
formatter.write("Navigation to Setup Query page verified successfully.");
formatter.result({
  "duration": 23290274718,
  "status": "passed"
});
formatter.embedding("image/png", "embedded27.png");
formatter.after({
  "duration": 379307159,
  "status": "passed"
});
formatter.before({
  "duration": 24637,
  "status": "passed"
});
formatter.scenario({
  "line": 328,
  "name": "User selects Misc section and verifies its associated functionalities.",
  "description": "",
  "id": "regression-test-suite-for-dvs-automation-admin;user-selects-misc-section-and-verifies-its-associated-functionalities.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 329,
      "value": "#  Misc"
    }
  ],
  "line": 330,
  "name": "user clicks Misc link from header section and verifies navigation to Misc",
  "keyword": "Then "
});
formatter.step({
  "line": 331,
  "name": "User clicks Info / Scripting Items and verifies element on Info / Scripting Items",
  "keyword": "Then "
});
formatter.step({
  "line": 332,
  "name": "user clicks Issue Detail Reasons and verifies element on Issue Detail Reasons",
  "keyword": "Then "
});
formatter.step({
  "line": 333,
  "name": "user clicks Issue Detail Results and verifies element on Issue Detail Results",
  "keyword": "Then "
});
formatter.step({
  "line": 334,
  "name": "user clicks Override reasons and verifies element on Override reasons",
  "keyword": "Then "
});
formatter.step({
  "line": 335,
  "name": "user clicks logoff",
  "keyword": "Then "
});
formatter.match({
  "location": "Simple.user_clicks_Misc_link_from_header_section_and_verifies_navigation_to_Misc()"
});
formatter.write("Misc clicked successfully.");
formatter.write("Navigation to MISC and Nickname page verified successfully.");
formatter.result({
  "duration": 20218046430,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Info_Scripting_Items_and_verifies_element_on_Info_Scripting_Items()"
});
formatter.write("Info Scripting Items clicked successfully.");
formatter.write("Navigation to Info / Scripting Items page verified successfully.");
formatter.result({
  "duration": 61278998608,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Issue_Detail_Reasons_and_verifies_element_on_Issue_Detail_Reasons()"
});
formatter.write("Issue Detail Reasons clicked successfully.");
formatter.write("Navigation to Issue Details Reason page verified successfully.");
formatter.result({
  "duration": 67120408312,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Issue_Detail_Results_and_verifies_element_on_Issue_Detail_Results()"
});
formatter.write("Issue Detail Results clicked successfully.");
formatter.write("Navigation to Issue Details Results page verified successfully.");
formatter.result({
  "duration": 50008702859,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_Override_reasons_and_verifies_element_on_Override_reasons()"
});
formatter.write("Override Reasons clicked successfully.");
formatter.write("Navigation to Override Reasons page verified successfully.");
formatter.result({
  "duration": 43371016636,
  "status": "passed"
});
formatter.match({
  "location": "Simple.user_clicks_logoff()"
});
formatter.write("System is successfully Loggged off");
formatter.result({
  "duration": 17080748077,
  "status": "passed"
});
formatter.embedding("image/png", "embedded28.png");
formatter.after({
  "duration": 384050564,
  "status": "passed"
});
});