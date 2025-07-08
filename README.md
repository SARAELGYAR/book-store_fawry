#  Bookstore 

Welcome to *Bookstore*, a fully object-oriented Java console application that simulates an online bookstore.  
This project was built as part of a programming challenge to demonstrate software design principles such as abstraction, inheritance, encapsulation, extensibility, and clean coding.

---

##  Project Overview

This Java project simulates a real-world bookstore that supports multiple types of books:

-  *Paper Book* – has stock and can be shipped to an address.
-  *EBook* – has a file type and is sent via email.
-  *Showcase/Demo Book* – used for display purposes only (not for sale).

The system allows you to:

- Add new books with information like ISBN, title, year, and price.
- Remove outdated books older than a specified number of years.
- Buy books using ISBN, quantity, email, and address.
- Ensure each book type is processed according to its nature (shipping or emailing).

---

 Concepts Used

This project demonstrates the use of *Object-Oriented Programming (OOP)*:

| Concept         | How It’s Applied                                 |
|----------------|--------------------------------------------------|
| *Abstraction* | Book is an abstract class with shared attributes and abstract methods. |
| *Inheritance* | PaperBook, EBook, and ShowcaseBook inherit from Book. |
| *Polymorphism* | Buying and processing books uses polymorphism. |
| *Encapsulation* | Data is stored privately with getters/setters. |
| *Extensibility* | Easy to add new book types without changing core logic. |
