
<html lang="en">

<body>

<h1>FoodFlow Testing Project</h1>

<h2>Project Overview</h2>
<p>This repository contains automated test cases for the FoodFlow web application. Foodflow's user base primarily comprises two groups: individuals associated with homes or orphanages, and surplus food providers. 
Register, Login and logout
Ordering food, changing quantity, remove items, cart options
Direct contact us page
Blogs to interact with developers
Review list
footer , which is make easy to see all the details in one view
Dashboard for food suppliers, add product. The testing is conducted using Selenium WebDriver, TestNG, and Eclipse IDE. The primary focus is to ensure the functionality  in the FoodFlow application.</p>

<h2>Tools and Technologies</h2>
<ul>
    <li><strong>Selenium WebDriver</strong>: For automating web browser interactions.</li>
    <li><strong>TestNG</strong>: For structuring, executing, and reporting test cases.</li>
    <li><strong>Eclipse IDE</strong>: For developing and running the test scripts.</li>
</ul>

<h2>Test Setup</h2>

<h3>Prerequisites</h3>
<ul>
    <li><strong>Java Development Kit (JDK)</strong>: Ensure you have JDK installed on your system.</li>
    <li><strong>Eclipse IDE</strong>: Download and install Eclipse IDE for Java Developers.</li>
    <li><strong>Selenium WebDriver</strong>: Add the Selenium WebDriver libraries to your project.</li>
    <li><strong>TestNG</strong>: Install the TestNG plugin in Eclipse.</li>
</ul>

<h3>Cloning the Repository</h3>
<pre><code>git clone https://github.com/yourusername/foodflow-testing.git
</code></pre>

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
            <li>Open Eclipse and go to <code>File > Import</code>.</li>
            <li>Select <code>Maven > Existing Maven Projects</code> and click <code>Next</code>.</li>
            <li>Browse to the location of the cloned repository and select the root folder.</li>
            <li>Ensure the <code>pom.xml</code> file is detected and click <code>Finish</code>.</li>
        </ol>
    </li>
    <li><strong>Build the Project</strong>:
        <ol>
            <li>In Eclipse, right-click the project in the Project Explorer.</li>
            <li>Select <code>Run As > Maven Install</code> to build the project and download dependencies.</li>
        </ol>
    </li>
</ol>

<h3>Running the Tests</h3>
<ul>
    <li><strong>Using Eclipse</strong>:
        <ol>
            <li>Navigate to the <code>testng.xml</code> file.</li>
            <li>Right-click on the <code>testng.xml</code> file and select <code>Run As > TestNG Suite</code>.</li>
            <li>View the test results in the TestNG Results window.</li>
        </ol>
    </li>
    <li><strong>Using Maven Command Line</strong>:
        <pre><code># Navigate to the project directory
cd path/to/your/project

# Run the tests using Maven
mvn test
</code></pre>
    </li>
</ul>



<h2>Test Cases</h2>

<h3>1. Signup &amp; Signin</h3>
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



<h3>3. Navigation Bar</h3>
<ul>
    <li><strong>Objective</strong>: Validate the correct functionality of the navigation bar.</li>
    <li><strong>Test Scenarios</strong>:
        <ul>
            <li><strong>Navigation to All Sections</strong>: Verify that each link in the navigation bar correctly redirects to the intended section.</li>
            <li><strong>Responsive Behavior</strong>: Ensure the navigation bar is responsive across different devices (desktop, tablet, mobile).</li>
            <li><strong>User-Specific Links</strong>: Check that certain links (e.g., Account, Orders) are only visible to logged-in users.</li>
        </ul>
    </li>
</ul>

<h3>4. Contact Us</h3>
<ul>
    <li><strong>Objective</strong>: Test the functionality of the contact form submission.</li>
    <li><strong>Test Scenarios</strong>:
        <ul>
            <li><strong>Successful Form Submission</strong>: Ensure that the contact form submits successfully with valid data.</li>
            <li><strong>Validation of Form Fields</strong>: Test the form with invalid data (e.g., missing fields, incorrect email format) and verify that error messages are displayed.</li>
            <li><strong>Form Reset Functionality</strong>: Verify that the form reset button clears all input fields.</li>
        </ul>
    </li>
</ul>

<h3>5. Shopping Cart</h3>
<ul>
    <li><strong>Objective</strong>: Validate the functionality of the shopping cart.</li>
    <li><strong>Test Scenarios</strong>:
        <ul>
            <li><strong>Adding Items to Cart</strong>: Test adding items to the cart and verify that they appear with the correct details (name, quantity, price).</li>
            <li><strong>Removing Items from Cart</strong>: Test the removal of items and ensure that they are correctly removed from the cart.</li>
            <li><strong>Updating Item Quantities</strong>: Ensure that updating the quantity of an item in the cart reflects the correct total price.</li>
            <li><strong>Empty Cart Behavior</strong>: Verify that the cart behaves as expected when empty (e.g., appropriate messages, no checkout button).</li>
        </ul>
    </li>
</ul>



</body>
</html>
