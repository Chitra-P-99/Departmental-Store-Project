# Departmental-Store-Project

Tools and Technologies:

    Java
    Object-Oriented Programming principles
    IDE ( Eclipse)

Project Overview:
This departmental store management system will handle inventory management, customer records, sales, and generate reports.

Key Entities:

    Product:
        Product ID
        Name
        Price
        Stock Quantity

    Customer:
        Customer ID
        Name
        Contact Information

    Sale:
        Sale ID
        Customer (associated with a customer)
        List of products sold
        Total price

Key Functionalities:

    Inventory Management:
        Add products to the inventory.
        Update product information.
        View product details.
        Remove products from inventory.

    Customer Management:
        Add new customers.
        Update customer information.
        View customer details.
        Remove customers from the records.

    Point of Sale (POS):
        Allow the cashier to add products to the cart.
        Calculate the total price of the sale.
        Deduct sold products from the inventory.
        Record the sale in the sales history.

    Sales History:
        Maintain a history of all sales, including details such as the date, customer, and products sold.

    Reports:
        Generate reports, e.g., daily sales reports, product stock reports.

Project Structure:

    Main DepartmentalStore Class:
        This class will contain the main method and handle user input and program flow.

    Product Class:
        Create a class to represent products with fields like ID, name, price, and stock quantity.

    Customer Class:
        Design a class to represent customers with fields like ID, name, and contact information.

    Sale Class:
        Create a class to represent sales, including customer information and a list of products sold.

    Inventory Management:
        Implement methods to add, update, view, and remove products from the inventory.

    Customer Management:
        Implement methods to add, update, view, and remove customer records.

    Point of Sale (POS):
        Create methods for adding products to the cart, calculating the total, and recording the sale.

    Sales History:
        Implement a system for recording and managing sales history.

    Reports:
        Develop methods to generate various reports based on sales and inventory data.

    Exception Handling:
        Handle exceptions, such as out-of-stock products, invalid inputs, etc.
