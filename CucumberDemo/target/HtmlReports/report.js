$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Page1_Login.feature");
formatter.feature({
  "name": "Register \u0026 Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Registration Functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on Homepage of Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Step1_LoginSteps.user_is_on_Homepage_of_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Sign in",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Step1_LoginSteps.i_Click_on_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the email id for register user and click create account button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Step1_LoginSteps.i_fill_the_email_id_for_register_user_and_click_create_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should ask me for more details for registration and click save button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Step1_LoginSteps.it_should_ask_me_for_more_details_for_registration_and_click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see firstname and lastname as username after account creation",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.Step1_LoginSteps.i_should_see_firstname_and_lastname_as_username_after_account_creation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should able to logout",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Step1_LoginSteps.i_should_able_to_logout()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Login Functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on home page,user fill the email id and password for login and click login button",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Step1_LoginSteps.user_is_on_home_page_user_fill_the_email_id_and_password_for_login_and_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see firstname and lastname as username after login",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Step1_LoginSteps.i_should_see_firstname_and_lastname_as_username_after_login()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Page2_ProductSearch.feature");
formatter.feature({
  "name": "Product Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Product Search in my search page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User authenticated and is on Homepage of Application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Step2_ProductSearchSteps.user_authenticated_and_is_on_Homepage_of_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should able to enter search text in search box",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Step2_ProductSearchSteps.i_should_able_to_enter_search_text_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Search buttom",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.Step2_ProductSearchSteps.i_click_on_Search_buttom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should able to see list of products for my search",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Step2_ProductSearchSteps.i_should_able_to_see_list_of_products_for_my_search()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/Page3_Checkout.feature");
formatter.feature({
  "name": "Checkout process",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To checkout a product from search result",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is authenticated and have product list in search list",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.Step3_CheckOutSteps.user_is_authenticated_and_have_product_list_in_search_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should able to add the item in cart and navigate successfully till payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Step3_CheckOutSteps.i_should_able_to_add_the_item_in_cart_and_navigate_successfully_till_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate product details in payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.Step3_CheckOutSteps.validate_product_details_in_payment_page()"
});
formatter.result({
  "status": "passed"
});
});