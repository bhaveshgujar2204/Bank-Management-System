# Bank Management System (Console-Based Java Project)

This is a **console-based banking application** developed in Java using **OOPs concepts**, **Interfaces**, and a **layered package structure**.  
The project simulates basic banking operations such as creating an account, depositing money, withdrawing money, displaying account details, and checking balance.

---

## 📦 Project Structure

com.braindata.bankmanagement

│
├── client → Test.java (main menu)
├── model → Account.java (account data with getters/setters)
├── service → Rbi.java (interface)
└── serviceImpl → Sbi.java (business logic)
---

## 🧩 Explanation of Each Package

### **1. client package**
**File:** `Test.java`  
Contains the **main method** and the **console menu**.  
It takes user input and calls methods of `Rbi` interface through `Sbi` class object.

---

### **2. model package**
**File:** `Account.java`

Contains **data members** of the bank account:

- `private int accNo`
- `private String name`
- `private String mobNo`
- `private String adharNo`
- `private String gender`
- `private int age`

Includes:

- **Getters and Setters**
- **Account object structure** for storing customer details

---

### **3. service package**
**File:** `Rbi.java` (Interface)

Contains abstract method declarations:

public void createAccount();
public void displayAllDetails();
public void depositeMoney();
public void withdrawal();
public void balanceCheck();

yaml
Copy code

These methods define the **rules of RBI** (contract) for banking operations.

---

### **4. serviceImpl package**
**File:** `Sbi.java`

Implements the **Rbi interface**.

Contains complete business logic:

- Creating new account  
- Storing account details  
- Balance calculation  
- Deposit logic  
- Withdrawal logic  
- Displaying all details  

Also contains:  
`private double balance;` → stores current account balance

---

## 🎮 Console Menu (User Interface)

The menu is displayed from `Test.java`:

----- Bank Menu -----

Create Account

Display Account Details

Deposit Money

Withdraw Money

Check Balance

Cancel Transaction

yaml
Copy code

The user enters a choice, and corresponding method of `Sbi` is executed.

---

## 🛠️ Technologies Used
- **Java**
- **OOP Concepts**
  - Encapsulation  
  - Abstraction  
  - Interface  
  - Implementation classes  
- **Scanner Class** for input
- **Eclipse IDE**

---

## 📚 Learning Outcomes
By working on this project, you learn:

- Interface and its implementation  
- Multi-layer architecture (client → service → model)  
- Encapsulation using private fields + getters/setters  
- Basic CRUD banking operations  
- Console input handling  
- Real-world banking simulation basics  

---

## 🚀 How to Run the Project
1. Clone or download the repository
2. Open the project in **Eclipse**
3. Run the file:
com.braindata.bankmanagement.client.Test
4. Use the menu to perform banking operations

---

## 🔮 Future Enhancements
- Store accounts in a database (MySQL)
- Add transaction history
- Add login system (username/password)
- Add multiple account types (Savings/Current)
- Add GUI using Swing or JavaFX

---

## 👨‍💻 Author
**Bhavesh Gujar**
