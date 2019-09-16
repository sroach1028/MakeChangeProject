## Make Change Project

### First week homework for Skill Distillery

### Overview
This program simulates a cash transaction interface.

### How to run
At the start of the program, the user is prompted for two inputs: one for the total cost of an item(s), and a second for amount of money tendered by the customer.
The program will return three possible outcomes:
1. An error message when the amount tendered was less than the total cost (customer didn't pay enough)
2. A message stating the exact change was tendered, so no money is due back to the customer.
3. If the customer is due money back, it outputs the exact amount due back of each denomination (dollars and coins).
### Technologies/topics used
This program utilizes various pre-built Java objects/methods, including Math.round and Scanner. I also created original methods for each step in the program, such as gathering user input, calculating change, separating dollars and cents, and printing messages.  A few of these original methods' parameters allow the passing of Scanner, so the interaction with the user is contained in the methods themselves instead of the main method. There is also instances of type casting, if statements, do-while loops with continue statements, nesting, and switch statements with breaks.
### Lessons
The main method is quite small, as almost all of the actions are performed outside main. The code and sequence is very easy to follow, as it flows from one method down to the next.  This made formatting and organizing the code of utmost importance. I included lots of comments and ordered the methods so they are in the same order of the program's sequence. Writing it this way took more time initially and made the program potentially lengthier, but identifying and fixing bugs was fast and easy.  
