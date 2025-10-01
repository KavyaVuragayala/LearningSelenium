🚀 Selenium 4.35 Web Automation Framework
📌 Overview

This project is a Selenium Web Automation Framework built using Java, TestNG, RestAssured (for API testing), and Maven.
It is designed for end-to-end automation testing of web applications and APIs, with support for:

* Web UI Testing (Selenium 4.35)
*
* API Testing (RestAssured)
*
* Data-Driven Testing (Apache POI – Excel)
*
* Reporting (Allure Reports, TestNG Reports)
*
* Parallel Test Execution (Selenium Grid, Docker, BrowserStack)

**🛠 Tech Stack**

1. Language: Java 11+
2. Build Tool: Maven
3. Testing Framework: TestNG
4. Automation Tools:
   Selenium 4.x (Web UI Testing)
   RestAssured (API Testing)
   Apache POI (Excel Data-Driven Testing)
5. Reporting: Allure Reports / TestNG Reports
6. CI/CD: Jenkins / GitHub Actions
7. Design Pattern: Page Object Model (POM)

📂 Project Structure
Selenium-Automation-Framework/
│── src/
│   ├── main/java/com/kavya/
│   │   ├── base/               # Base classes (WebDriver, API setup)
│   │   ├── endpoints/          # API Endpoints
│   │   ├── modules/            # Payload Manager, Utilities
│   │   ├── pojos/              # POJOs for Request/Response (API)
│   │   └── asserts/            # Custom Assertion Helpers
│   │
│   ├── test/java/com/kavya/tests/
│   │   ├── restfulbooker/crud/ # API CRUD Test Cases
│   │   ├── ui/                 # Web UI Test Cases
│   │   └── utils/              # Helpers (RetryAnalyzer, Listeners)
│
│── pom.xml                     # Maven Dependencies
│── testng.xml                  # TestNG Suite Config
│── README.md                   # Project Documentation

**⚡ Getting Started**
1️⃣ **Prerequisites**

Install Java 11+

Install Maven 3.8+

Install Allure (for reports)

Install IDE (IntelliJ / Eclipse)

Browser Drivers (if Selenium < 4.6.0, otherwise auto-managed)

2️⃣ **Clone the Repository**

git clone https://github.com/your-username/selenium-automation-framework.git
cd selenium-automation-framework

3️⃣ **Install Dependencies**

mvn clean install

4️⃣ **Run Tests**

👉 Run all tests:

mvn test


👉 Run specific suite:

mvn test -DsuiteXmlFile=testng.xml


👉 Run with groups:

mvn test -Dgroups=reg

📊 **Reporting**
✅ **TestNG Default Report**

Reports will be available in:

/test-output/index.html

✅ **Allure Report**

1. Run tests
2. Generate report:

allure serve target/allure-results


🔗 **Integrations**

1. **Selenium Grid / Docker** → Run tests in parallel across browsers.
2. **BrowserStack / Saucelabs** → Run tests on cloud environments.
3. **Jenkins** → CI/CD pipeline integration.

📘 **References**

Selenium Official Docs

TestNG Documentation

Allure Reports

RestAssured Docs

👨‍💻 **Author**

**Kavya
Automation QA | Manual + Automation | Selenium | RestAssured | API**

📧 **Contact**: vuragayalakavyasree18@gmail.com
