# Exit Test Automation Assignment for Flipkart.com

This assignment automates test case scenarios for "Flipkart.com" leveraging Selenium WebDriver, Java, and TestNG, following the Page Object Model (POM) architecture. It offers selective test execution using an Excel file, centralized configuration via properties files, comprehensive logging, and detailed Extent Reports. Additionally, the project includes custom utility JAR files for common functionalities and integrates seamlessly with Jenkins for CI/CD pipelines.

## Project Structure

- **src/test/java**:
  - **listenerUtils**: Custom Test Listener for logging and reporting and Includes Annotation Transformer for selective test execution..
  - **pages**: POM-based classes for different Flipkart pages.
  - **testcases**: Test classes using TestNG.

- **src/test/resources**:
  - **config.properties**: Project configuration settings.
  - **TestData.xlsx**: Test cases with descriptions, data, and execution status.
  - **log4j2.xml**: Logging configuration.

- **testng.xml**: Configures TestNG suites and test cases.

- **logs**:
  - **output.log**: Logs from test runs.

- **report**:
  - **TestReport.html**: HTML report generated post-test execution.

- **libs**:
  - **exit-test-utils-0.0.1-SNAPSHOT.jar**: Custom utility JAR for common functions.

- **screenshots**:
  - **imgs**: Screenshots from failed tests.

## Instructions

### Prerequisites

- Maven 3.6.3
- Java JDK 8
- testng 7.10.1
- selenium-java 4.21.0
- WebDriver binaries (not required if using Selenium 4.x+)

### Project Setup

1. Clone the repository:
   ```sh
   git clone https://github.com/Mukulchauhan2905/AutomationExitTestAssignment.git

2. Import the project into your IDE.

### Configuration

1. Update config.properties with the appropriate URLs and settings.

2. Ensure TestData.xlsx is correctly formatted for selective test execution.

### Building and Running Tests

- Execute mvn clean test to compile and run the tests.

- Alternatively, configure Jenkins to build and run tests automatically.

### Test Reports

- Post-execution, view the Extent Report at report/TestReport.html.

### CI/CD Integration
- Set up Jenkins jobs to automate project builds and test executions.

### Troubleshooting

- Check logs/output.log for debugging.
- Review Jenkins console output for build and test issues.

