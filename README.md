# Online Shopping System (Design Patterns Project)

This is a simple Java-based online shopping system that demonstrates the use of object-oriented design patterns such as **Adapter**, **Observer**, and **Singleton**. The goal is to show how these patterns help create modular, maintainable, and extensible service-based architecture.

## 🧱 Design Patterns Used

### 1. Adapter Pattern
- **Purpose**: To integrate external payment gateways with different APIs into a consistent internal interface.
- **Used In**: `StripePaymentAdapter` adapts the third-party `StripeAPI` to match our `PaymentService` interface.

### 2. Observer Pattern
- **Purpose**: To decouple the core order processing logic from dependent services such as notification and inventory updates.
- **Used In**: `OrderService` maintains a list of observers and notifies them when an order is placed.

### 3. Singleton Pattern
- **Purpose**: To ensure a single, shared logging instance throughout the application.
- **Used In**: `Logger` class provides a global logging point.

## 🗂️ Project Structure

OnlineShoppingSystem/
│
├── adapter/
│ ├── PaymentService.java
│ ├── StripeAPI.java
│ └── StripePaymentAdapter.java
│
├── observer/
│ ├── Observer.java
│ ├── NotificationService.java
│ └── InventoryService.java
│
├── singleton/
│ └── Logger.java
│
├── order/
│ └── OrderService.java
│
└── App.java


## ▶️ How to Run

### Requirements
- Java 8 or higher
- A terminal or command line environment
- VS Code or any Java IDE (optional)

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/your username/OnlineShoppingSystem.git
   cd OnlineShoppingSystem/src
Compile the source files:

javac */*.java App.java

Run the application:

    java App

You should see logs confirming that payment is processed, inventory is updated, and a notification is sent.


📸 UML Diagrams

Diagrams for the Adapter, Observer, and Singleton patterns are included in the uml_diagrams/ directory .
📚 Documentation

For each design pattern used, this project includes:

    A high-level pattern description

    A UML diagram

    Pattern usage within this system

    Source code in Java

👨🏽‍💻 Author

    [Ikechukwu – GitHub Profile](https://github.com/Par-hue/OnlineShoppingSystem/edit/main/README.md)

📄 License

This project is open-source and available under the MIT License.


