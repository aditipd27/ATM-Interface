# ATM-Interface

### Project Title: **ATM Interface**  

### Description:  
The ATM Interface project is a console-based application designed to simulate basic banking transactions. It provides a user-friendly experience for account management, including checking balances, depositing, and withdrawing money. The project demonstrates foundational object-oriented programming concepts and interactive system design in Java.



### Key Features:  
1. **Account Management**: 
   - Users can check their balance, deposit money, and withdraw funds.  
   - All transactions are processed securely, with real-time updates to the account.  

2. **User Interaction**:
   - The application uses a menu-driven interface, allowing users to choose actions easily.  
   - Continuous interaction is supported until the user decides to exit the system.  

3. **Validation**:  
   - Ensures that deposit amounts are positive.  
   - Validates sufficient balance before allowing a withdrawal.



### Technology Stack:  
- **Programming Language**: Java  
- **IDE/Compiler**: Any Java-supported IDE like Eclipse, IntelliJ IDEA, or command-line tools.



### Modules Overview:  

1. **`BankAccount.java`**  
   - **Role**: Represents the user's bank account.  
   - **Key Functionalities**:  
     - Store and retrieve the account balance.  
     - Perform deposit and withdrawal operations with necessary validations.  
   - **Class Fields and Methods**:  
     - `balance`: Private field for storing the account balance.  
     - `getBalance()`: Method to fetch the current balance.  
     - `deposit(amount)`: Adds funds if the amount is positive.  
     - `withdraw(amount)`: Deducts funds if sufficient balance exists.

2. **`ATM.java`**  
   - **Role**: Manages ATM operations and serves as the interaction layer between the user and the bank account.  
   - **Key Functionalities**:  
     - Display an interactive menu.  
     - Process user input to perform specific operations.  
   - **Features**:  
     - Supports continuous usage with a loop.  
     - Provides feedback for successful or unsuccessful operations.

3. **`ATMInterface.java`**  
   - **Role**: Entry point of the application.  
   - **Key Functionalities**:  
     - Initializes a `BankAccount` with a default balance.  
     - Starts the ATM operations by calling the `start()` method of the `ATM` class.



### Functional Flow:  
1. **Initialization**: The program starts by creating a `BankAccount` instance with a predefined balance (e.g., $500).  
2. **Menu Display**: The ATM displays a menu with options:  
   - Check Balance  
   - Deposit Money  
   - Withdraw Money  
   - Exit  
3. **User Interaction**: Based on the user’s choice:  
   - The balance is displayed.  
   - Money is added or deducted with appropriate validations.  
   - The program exits when the user selects "Exit."  
4. **Looping**: After each operation, the menu is redisplayed until the user decides to exit.



### Applications:  
1. **Educational Tool**: Ideal for teaching object-oriented programming concepts like encapsulation, class interaction, and method overriding.  
2. **Real-world Simulation**: Demonstrates the basics of financial transaction systems.  
3. **Scalable Foundation**: Can be expanded into a more complex banking system with additional features like account types, transaction history, or multiple user support.



### Advantages:  
1. Easy to understand and implement for beginners.  
2. Demonstrates essential programming concepts such as validation, loops, and error handling.  
3. Modular design, allowing for easy modifications or extensions.



### Possible Improvements:  
1. **Error Handling**: Add exception handling for invalid inputs.  
2. **Persistence**: Save account data using a file or database for long-term storage.  
3. **GUI**: Replace the console interface with a graphical user interface for better usability.  
4. **Multi-User Support**: Allow the system to manage multiple accounts.

