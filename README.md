# A Short Exercise to Explore Object-Oriented Programming - Encapsulation

---
## Overview

This repository is a short exercise designed for you to explore **Encapsulation** which is one of the
four pillars of Object-Oriented Programming (OOP).

---
## 📖 Instructions

- Fork this repository
  

- To run the program, go to the [Main](src/main/java/com/techreturners/encapsulation/bankaccount/app/Main.java) class which 
  is the entry point and run it using IntelliJ
  

- There are two models `DodgyBankAccount` and `SecureBankAccount`, these are located in the 
  [model](src/main/java/com/techreturners/encapsulation/bankaccount/model) directory.

---
## 🤓 Study Prompts

Use the following questions to guide your exploration and learning! 🗺

- Run the `main` method on the `Main` class, what is it doing? What is being outputted to the console?


- Look at the `DodgyBankAccount`, this class is not well-encapsulated.
  Can you note down the problems with how the class is designed, and the ways it is being misused?
  
  Class Variables of Dodgybankaccount  are public. Account no,Balance and Reward no should be private.
  Public variables can be accessed and modified outside the class.
  AddReward Method also public.Can be accessed and modified outside the class.

- Compare and contrast the `DodgyBankAccount` and the `SecureBankAccount`, how is the `SecureBankAccount` different to 
the `DodgyBankAccount`? How is it designed to prevent it from being misused? Are there instances of better method names
  for clearer abstraction?
  
  Class variables are private in SecureBankAccount. Encapsulation has been applied here.
  DodgyBankAccount method variables are public instead of private.
  
  DebitAmount and AddReward methods are common in both the classes. Can be moved to Base class.
  
