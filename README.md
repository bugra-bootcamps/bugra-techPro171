# 📌 Bugra TechPro171 - Test Automation Project

## 📖 Project Description
This project is designed to perform **automation tests for an e-commerce platform**. It verifies core functionalities such as user registration, product search, adding items to the cart, and payment processing.

📌 **Technical Features:**
- **Test Framework:** Selenium WebDriver, JUnit/TestNG  
- **Dependency Management:** Maven  
- **Test Design:** Page Object Model (POM)  
- **Programming Language:** Java  
- **Reporting:** Extent Reports / Allure Reports  
- **Configuration:** Managed via `configuration.properties`  

---

## 🛠️ Setup and Execution

### 1️⃣ Install Dependencies
This project is managed using **Maven**. First, install all dependencies by running the following command:

```sh
mvn clean install
```

### 2️⃣ Run Tests
To run all tests, use:

```sh
mvn test
```

To run a specific test case, for example, user registration:

```sh
mvn -Dtest=Us01_UserRegistrationShouldBeSuccessful test
```

🔹 **Ensure that**:
- The `configuration.properties` file is correctly configured.
- The required browser drivers (`chromedriver`, `geckodriver`, etc.) are set up properly.

---

## 📂 Project Directory Structure

```
bugra-techPro171/
├── .idea/                       # IntelliJ IDEA settings
├── .vscode/                     # VS Code settings
├── TestOutput/                   # Test reports directory
├── src/
│   └── test/
│       ├── java/
│       │   ├── project_team09/
│       │   │   ├── pages/        # Page Object Model classes
│       │   │   ├── tests/        # Test cases
│       │   │   ├── utilities/    # Helper classes (Driver, ConfigReader, etc.)
│       │   │   └── reports/      # Reports (Allure, Extent, etc.)
├── .gitignore                    # Git ignored files
├── configuration.properties       # Configuration settings
├── pom.xml                        # Maven dependency management
└── README.md                      # Project documentation
```

---

## 🚀 Technologies & Dependencies

📌 **Dependencies used in this project:**

- **Selenium WebDriver** (Web automation)
- **JUnit / TestNG** (Testing framework)
- **Apache POI** (Excel file processing)
- **Maven** (Dependency management)
- **Extent Reports / Allure Reports** (Test reporting)

All dependencies are listed in the `pom.xml` file.

---

## 📋 Test Scenarios & User Stories

| **User Story** | **Test File** | **Description** |
|---------------|----------------------------|----------------------|
| **US01** User Registration | `Us01_UserRegistrationShouldBeSuccessful.java` | Verifies that users can successfully register. |
| **US02** Add Address | `Us02_AddAddress.java` | Tests the address addition functionality. |
| **US03** Product Search | `Us03_ProductSearch.java` | Checks if users can search for products correctly. |
| **US04** Add Product to Cart | `Us04_AddProductToCart.java` | Tests the functionality of adding products to the cart. |
| **US05** Make Payment | `Us05_MakePayment.java` | Ensures that users can complete payments successfully. |
| **US06** Update Account Info | `Us06_UpdateAccountInfo.java` | Tests the ability to update account details. |

---

## 🛠️ Configuration File (`configuration.properties`)

Instead of hardcoding test data, store it in `configuration.properties`:

```properties
browser=chrome
baseUrl=https://www.testsite.com
username=testuser
password=Test1234!
```

These values can be accessed in the tests using:

```java
String url = ConfigReader.getProperty("baseUrl");
Driver.getDriver().get(url);
```

---

## 📊 Test Reports
To generate and view Allure reports, run:

```sh
mvn allure:serve
```

If **Extent Reports** is used, reports will be stored in `TestOutput/`.

---

## 🤝 Contributing
To contribute to this project:

1. 📌 **Fork the repository.**
2. 📌 **Create a new branch for your feature.**
3. 📌 **Commit your changes.**
4. 📌 **Push to your forked repo.**
5. 📌 **Submit a Pull Request (PR).**

---

## 📞 Contact & Support
For any questions, open an issue on [GitHub Issues](https://github.com/bugra-bootcamps/bugra-techPro171/issues).

✉️ **Contact:**
- **GitHub:** [@bugra-bootcamps](https://github.com/bugra-bootcamps)
- **Email:** hanbugra@yahoo.com

---

### 📌 Note:
This README template can be **customized based on specific project needs**. Feel free to add more details! 🚀

