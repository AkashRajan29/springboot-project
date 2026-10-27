&#x20;**Online Food Order System**



\## Run

1\. Open this folder as an Existing Maven Project in Eclipse.

2\. Wait for Maven dependencies to download.

3\. Run `FoodOrderApplication.java` as Java Application, or use `mvn spring-boot:run`.

4\. Base URL: `http://localhost:8080/api/orders`



**POST**

Create a food order



URL   http://localhost:8080/api/orders



In Postman: Body → raw → JSON



{

&#x20; "customerName": "Akash",

&#x20; "foodItem": "Chicken Fried Rice",

&#x20; "quantity": 2,

&#x20; "price": 180.0

}





Expected: 201 Created, with an automatically generated orderId.



**GET**

**Get all orders**



http://localhost:8080/api/orders



**GET**

**Find order by ID**



http://localhost:8080/api/orders/1



**PUT**

**Update an entire order**



http://localhost:8080/api/orders/1



{

&#x20; "customerName": "Akash",

&#x20; "foodItem": "Veg Biryani",

&#x20; "quantity": 3,

&#x20; "price": 150.0

}







**PATCH**

**Update selected fields**



http://localhost:8080/api/orders/1



{

&#x20; "quantity": 4

}





PATCH supports partial changes; for this implementation, use a nonzero quantity when updating quantity.



**DELETE**

**Delete an order**



http://localhost:8080/api/orders/1



Expected: 204 No Content.



**Validation test**

Try sending this invalid POST request:



{

&#x20; "customerName": "",

&#x20; "foodItem": "",

&#x20; "quantity": 0,

&#x20; "price": 0

}

