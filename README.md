# Bee's Beignets - A Little Cafe Shop
## Project Description
Bee's Beignets is a spring boot application that leverages Postman to call method actions, allowing the Postman end user to add and modify products for the shop, as well as place orders for customers. 
## Technologies Used
* Java
* Maven
* Spring Boot
* Lombok
* Azure
* DBeaver
* Hibernate
* Postman
## Features and Usage
http://localhost:9001/
POST:
* Ability to add a product: http://localhost:9001/addProduct
* Ability to add multiple products: http://localhost:9001/addProducts
* Ability to place an order for a customer: http://localhost:9001/placeOrder

GET:
* Ability to find a product by its ID: http://localhost:9001/productById/21
* Ability to find all existing products: http://localhost:9001/products
* Ability to find a product by its name: http://localhost:9001/product/Lamb Beignet
* Ability to find all orders: http://localhost:9001/findAllOrders

DELETE:
* Ability to delete a product by its ID: http://localhost:9001/delete/21

PUT:
* Ability to modify and update an item or order: http://localhost:9001/update
## Getting Started
In order to get the shop up and running, you will need: 
1. Java 8 or later. 
2. Tomcat 9.0
3. Postman

All other technologies should be provided with teh pom.xml file included in the cloned repository. Use the command below to glone the project:
```git clone https://github.com/Shawntaria91/BeesBeignets.git```

You will need to connect a database and modify the sql.properties file, adding your credentials. 
