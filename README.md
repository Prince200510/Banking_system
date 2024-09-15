# Bank System in Java (Command Line)

This project is a simple Bank System implemented in Java using the command line interface. The system allows users to create accounts, check balances, deposit funds, withdraw funds, and perform account searches.

## Features

- **Account Creation**: Create a new account by entering account number, name, mobile number, email, and an initial deposit.
- **Admin Login**: View all account details with a secure password.
- **Search Account**: Search and retrieve account details by account number.
- **Check Balance**: View the current balance of an account.
- **Add Balance**: Add funds to an account.
- **Withdraw Funds**: Withdraw money from an account (minimum Rs. 500 balance required).
  
## Installation and Setup

1. **Clone the repository:**

   ```bash
   git clone https://github.com/Prince200510/Banking_system.git
2. **Compile the Java files:**

   ```bash
   javac BanksystemIPPB.java
3. **Run the program:**

   ```bash
   java BanksystemIPPB
4. **Output:**

   ```bash
   |===========================================================|
   |------------------Indin Post Payment Bank------------------|
   |Press 1 for creating new account                           |
   |Press 2 for display all the account details (Admin Login)  |
   |Press 3 for searching account details                      |
   |Press 4 for checking Balance of account                    |
   |Press 5 for adding Balance in account                      |
   |Press 6 for withdrawal money from account                  |
   |Press 7 Exit                                               |
   |===========================================================|
   Enter the number of account to be create :1
   Press anyone of them: 1
   Enter the account number: 1001
   Enter the account name: Prince Maurya
   Enter the account holder mobile number :9987742369
   Enter the account holder email id :princemaurya8879@gmail.com
   Deposit money :2000
   ---------------------------------------------------------
   Press anyone of them: 2
   Password :prince
   |=============================|
   |-------Account Details-------|
   |=============================|
   Account Number: 1001
   Name: Prince Maurya
   Mobile Number: 9987742369
   Email-ID: princemaurya8879@gmail.com
   Balance: 2000.0
   Press anyone of them: 3
   Search account, enter the account number:1001
   |=============================|
   |-------Account Details-------|
   |=============================|
   Account Number: 1001
   Name: Prince Maurya
   Mobile Number: 9987742369
   Email-ID: princemaurya8879@gmail.com
   Balance: 2000.0
   Press anyone of them: 5
   Enter the account number: 1001
   |=============================|
   |---------Add Balance---------|
   |=============================|
   Name :Prince Maurya
   Enter the amount :1500
   Balance added Successfully !
   Previous Balance :2000.0
   New Balance :3500.0
   ---------------------------------------------------------
   Press anyone of them: 4
   Enter the account number: 1001
   |=============================|
   |-------Customer Balance------|
   |=============================|
   Name: Prince Maurya
   Balance: 3500.0
   ---------------------------------------------------------
   Press anyone of them: 6
   Enter the account number: 1001
   |=============================|
   |--------Withdraw Money-------|
   |=============================|
   Account Number: 1001
   Name :Prince Maurya
   Mobile Number: 9987742369
   Email-ID: princemaurya8879@gmail.com
   Balance: 3500.0
   Enter the amount :500
   Money Withdraw Successfully !
   Previous Balance :3500.0
   New Balance :3000.0
   ---------------------------------------------------------
   Press anyone of them: 7
   Thanks you
## Contributing
Feel free to contribute by forking the repository, submitting pull requests, or opening issues for suggestions and bugs.
