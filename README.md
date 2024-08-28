<!DOCTYPE html>
<html lang="en">

<body>
    <h1>FoodFlow Testing Project</h1>
    
<h2>Project Overview</h2>
<p>This repository contains automated test cases for the FoodFlow web application. FoodFlow's user base primarily comprises two groups: individuals associated with homes or orphanages, and surplus food providers. The application includes functionalities for user registration, login and logout, ordering food, changing quantity, removing items, cart options, direct contact us page, blogs, review list, a footer for detailed information, and a dashboard for food suppliers to add products. The testing is conducted using Selenium WebDriver, TestNG, and Eclipse IDE. The primary focus is to ensure the functionality in the FoodFlow application.</p>
 <h2>Tools and Technologies</h2>
<ul>
        <li><strong>Selenium WebDriver</strong>: For automating web browser interactions.</li>
        <li><strong>TestNG</strong>: For structuring, executing, and reporting test cases.</li>
        <li><strong>Eclipse IDE</strong>: For developing and running the test scripts.</li>
    </ul>
    

    
<h2>Maven Project Setup</h2>
    
<h3>Prerequisites</h3>
    <ul>
        <li><strong>Java Development Kit (JDK)</strong>: Ensure you have JDK installed on your system.</li>
        <li><strong>Maven</strong>: Ensure Apache Maven is installed and configured on your system.</li>
        <li><strong>Eclipse IDE</strong>: Download and install Eclipse IDE for Java Developers.</li>
    </ul>
    
<h3>Setting Up the Project</h3>
    <ol>
        <li><strong>Clone the Repository</strong>:
            <pre><code>git clone https://github.com/yourusername/foodflow-testing.git</code></pre>
        </li>
        <li><strong>Import the Maven Project into Eclipse</strong>:
            <ol>
                <li>Open Eclipse and go to <code>File &gt; Import</code>.</li>
                <li>Select <code>Maven &gt; Existing Maven Projects</code> and click <code>Next</code>.</li>
                <li>Browse to the location of the cloned repository and select the root folder.</li>
                <li>Ensure the <code>pom.xml</code> file is detected and click <code>Finish</code>.</li>
            </ol>
        </li>
        <li><strong>Build the Project</strong>:
            <ol>
                <li>In Eclipse, right-click the project in the Project Explorer.</li>
                <li>Select <code>Run As &gt; Maven Install</code> to build the project and download dependencies.</li>
            </ol>
        </li>
    </ol>
    
 <h3>Running the Tests</h3>
    <ul>
        <li><strong>Using Eclipse</strong>:
            <ol>
                <li>Navigate to the <code>testng.xml</code> file.</li>
                <li>Right-click on the <code>testng.xml</code> file and select <code>Run As &gt; TestNG Suite</code>.</li>
                <li>View the test results in the TestNG Results window.</li>
            </ol>
        </li>
    </ul>
    
 <h2>Test Cases</h2>
    
 <h3>1. Signup & Signin</h3>
    <ul>
        <li><strong>Objective</strong>: Verify the functionality of user registration and login.</li>
        <li><strong>Test Scenarios</strong>:
            <ul>
                <li><strong>Successful Registration</strong>: Test valid user inputs for registration and confirm the creation of a new account.</li>
                <li><strong>Registration with Invalid Data</strong>: Test the registration process with invalid data (e.g., missing mandatory fields, incorrect email format) and ensure appropriate error messages are displayed.</li>
                <li><strong>Successful Login</strong>: Test valid credentials for login and confirm access to the user dashboard.</li>
                <li><strong>Login with Invalid Credentials</strong>: Test incorrect username/password combinations and verify that the user cannot log in.</li>
            </ul>
        </li>
    </ul>
    
 <h3>2. Navigation Bar</h3>
    <ul>
        <li><strong>Objective</strong>: Validate the correct functionality of the navigation bar.</li>
        <li><strong>Test Scenarios</strong>:
            <ul>
                <li><strong>Navigation to All Sections</strong>: Verify that each link in the navigation bar correctly redirects to the intended section.</li>
            </ul>
        </li>
    </ul>
    
 <h3>3. Contact Us</h3>
    <ul>
        <li><strong>Objective</strong>: Test the functionality of the contact form submission.</li>
        <li><strong>Test Scenarios</strong>:
            <ul>
                <li><strong>Successful Form Submission</strong>: Ensure that the contact form submits successfully with valid data.</li>
                <li><strong>Validation of Form Fields</strong>: Test the form with invalid data (e.g., missing fields, incorrect email format) and verify that error messages are displayed.</li>
            </ul>
        </li>
    </ul>
    
 <h3>4. Add Product</h3>
    <ul>
        <li><strong>Objective</strong>: Validate the functionality of adding a new product to the system.</li>
        <li><strong>Test Scenarios</strong>:
            <ul>
                <li><strong>Required Fields Validation</strong>: Check that all required fields for adding a product are present.</li>
                <li><strong>Correct Data Entry</strong>: Verify that entering valid details (name, price, quantity) successfully adds the product.</li>
                <li><strong>Duplicate Product Check</strong>: Ensure that adding a product with the same name as an existing product shows an error and prevents duplication.</li>
                <li><strong>Field Format Validation</strong>: Ensure that all required fields accept details in the correct format.</li>
            </ul>
        </li>
    </ul>
</body>
</html>

