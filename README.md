# Clothing store project

This is a project that seeks to recreate an inventory system. It is sought that the user has the comfort of adding products without the need
to do everything manually.

## Things that are integrated in the current version:

- It has output management (which takes into account the modifications of the quantities, and the changes that are made in these), which only works with existing products.

- It has good input handling (which takes into account whether a product exists or not)

- It has a manual creation of new products in case you do not need to register an entry

- It has a record of invoices, customers and suppliers

- It has a process of remembering the theme that we have chosen every time the App is started

- It has complete lists of all invoices in the database, from suppliers, and even from customers


## promises:

- An interface improvement (more intuitive), and much more attractive

- A bug reporting system

- a login

- settings

- Load, overwrite, create and show excel tables

- Keyboard shortcuts that avoid being glued to the mouse


## Features
 
### On the inventory

* Recognizes if the product already exists.

* It warns and blocks the creation of a product if a field is empty or invalid.

* Allows updating the id without any kind of error.

* Warns if when entering the gender of the product, it is incorrect or if you are trying to force the creation of a product with invalid data.

* Simple navigation by keys (up, down) through the table, without always needing the mouse.

* Search for products that fit the filter that we have chosen for the table.

### In entries

* Recognizes if a product exists or not. If it does, it will ask the user if what he wants is to add the quantity of a product to its stock. If you press "Yes", it will create a simple and new record, where it will say the amount that entered and in inventory the amount that we entered will have been added.

* Blocks any invoice that is repeated.

* It does not allow adding to the stock of a product if the values:. description, id, section, brand and provider are not specific.

* Fast navigation by keyboard with the table

### In supplier registry

* Blocks creation if any field is empty.

* Recognizes which field is the one that gives the error and warns directly (still incomplete).

* Search, analyze and prevent the creation of a supplier with an ID that is registered for another person

* If the email has some kind of space, unrecognizable symbol, or is missing: "@gmail.com" blocks the creation and warns (still incomplete for other types of  emails).

* If the email already exists, it blocks and warns.

* A photo can be added to the record (Function not completed).


### Note:

In this project I use the MVC and the MYSQL database to be able to manage the data and that queries can be made in a simple and easy way. The current version in which it is developed is Java 17 with the Eclipse Termurin JDK. If you want to add your database and use it to test the project, I recommend doing so with phpMyAdmin, since that's what I used to create most of it.

To add the database import in phpMyAdmin, first make sure you have XAMPP (or wampServer) installer and have Apache and MySQL server turned on. 

### Sample:


  ![ezgif com-gif-maker](https://user-images.githubusercontent.com/114286961/212016315-24762572-aac7-4572-b334-21d60b98d0ce.gif)


After making sure of the above, create a simple database, go to "import" and do what you see in the following 

### Sample:


  ![gifSQL](https://user-images.githubusercontent.com/114286961/212017470-525da89d-6d1d-4f11-bdff-74314c2acb9f.gif)




