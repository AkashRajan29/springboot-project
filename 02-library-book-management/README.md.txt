Library-Management-System

RUN : LibraryApplication.java

Base URL: http://localhost:8080/api/books

Method	Endpoint	      Purpose

POST	/api/books	      Add a book
GET	    /api/books	      View all books
GET	    /api/books/1	   Search by ID
PUT	    /api/books/1	   Update book details
PATCH	/api/books/1/availability?available=false Mark unavailable
DELETE	/api/books/1	  Delete a book