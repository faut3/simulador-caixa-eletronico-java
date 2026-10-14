# ATM Simulator in Java

A console-based ATM simulator developed in Java to practice programming fundamentals, user input handling, conditional logic, loops, and basic balance operations.

## Features

- Check the current account balance
- Make deposits
- Make withdrawals
- Prevent withdrawals when the requested amount exceeds the available balance
- Display the updated balance after each transaction
- End the session through the menu
- Process up to five menu interactions per session

## Technologies

- Java
- `Scanner` for console input
- Conditional statements (`if`, `else if`, and `else`)
- `for` loop for menu control

## How It Works

The program starts with an initial balance of `1000.00` and displays four options:

1. Check balance
2. Make a deposit
3. Make a withdrawal
4. End the session

When the user selects an option, the application processes the request and displays the updated account information. For withdrawals, it verifies whether the account has enough funds before completing the transaction.

## How to Run

### Requirements

- Java Development Kit (JDK) installed
- A terminal or a Java-compatible IDE

### Using the terminal

1. Clone the repository:

   ```bash
   git clone https://github.com/faut3/simulador-caixa-eletronico-java.git
   ```

2. Open the project folder:

   ```bash
   cd simulador-caixa-eletronico-java
   ```

3. Compile the source file:

   ```bash
   javac projeto1.java
   ```

4. Run the program:

   ```bash
   java projeto1
   ```

## What I Learned

During this project, I practiced:

- Creating an interactive console menu
- Reading user input with `Scanner`
- Using conditional logic to handle different operations
- Updating and validating numeric values
- Controlling program execution with loops and `break`
- Handling insufficient-balance scenarios

## Future Improvements

- Reject zero or negative deposit and withdrawal amounts
- Keep the menu running until the user chooses to exit
- Format balances as currency
- Organize each operation into separate methods
- Add automated tests

## Author

Developed by **Mateus Almeida Matos** as part of his Java learning journey in Computer Science.
