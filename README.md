# StringCalculator
 
Create a simple String calculator with a method signature
 
## Description
1 Create a simple String calculator with a method signature
———————————————
int Add(string numbers)
The method can take up to two numbers, separated by commas, and will return their sum.
for example “” or “1” or “1,2” as inputs.
(for an empty string it will return 0)
Hints:
- Start with the simplest test case of an empty string and move to one and two numbers
- Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
- Remember to refactor after each passing test
2 Allow the Add method to handle an unknown amount of numbers
————————————————————————————————
3 Allow the Add method to handle new lines between numbers (instead of commas).
1 the following input is ok: “1\n2,3” (will equal 6)
2 the following input is NOT ok: “1,\n” (not need to prove it - just clarifying)
3 Allow the Add method to handle new lines between numbers (instead of commas).
7 Delimiters can be of any length with the following format: “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6
8 Allow multiple delimiters like this: “\n” for example “//[*][%]\n1*2%3” should return 6.
9 make sure you can also handle multiple delimiters with length longer than one char
  
## Technologies and Languages used
 
Following technologies used in the app.
 
- Java
- Junit
 
## Getting Started
 
Following are the instructions to worn on the app.
 
### Prerequisites
 
List any prerequisites or requirements needed before getting started.
 
- Java jdk
- Android Studio
- gradle //no need//
 
### Installation
 
Step-by-step guide on how to install and set up your project.
 
1. Clone this repository: `git clone https://github.com/Manojj2025/StringCalculator.git`.
2. Go to the project main directory: `cd StringCalculator/app/src/main/java/com.exmple/StringCalculator`.
3. Go to project app Test directory: `cd StringCalculator/app/src/androidTest/java/com.exmple/StringCalculatorTest`
4. Run to install dependencies
5. Test all casses 
 
