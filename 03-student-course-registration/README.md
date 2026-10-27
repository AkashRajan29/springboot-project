**Student Course Registration**



Run `StudentApplication.java` or `mvn spring-boot:run`. 



Base URL: http://localhost:8080/api/students



Method	     Endpoint	                   Purpose



POST	   /api/students	       Register a student

GET	   /api/students	       View all registrations

GET	   /api/students/1	       Find student by ID

DELETE	   /api/students/1	       Delete registration





For POST use :



&#x20;{

&#x20; "studentName": "Akash Rajan",

&#x20; "courseName": "Spring Boot",

&#x20; "email": "akash@example.com",

&#x20; "age": 24

}

