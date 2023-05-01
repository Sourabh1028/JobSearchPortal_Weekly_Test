# Job Search Portal
This project is a Job Search Portal with Validations built using Spring Boot with Java.

## Framework Used
* Spring Boot

---

## Language Used
* Java
---

## Data Flow

```
The user sends a request to the application through the API endpoints.
```
```
The API receives the request and sends it to the appropriate controller method.
```
```
The controller method makes a call to the method in service class.
```
```
The method in service class builds logic and retrieves or modifies data, which is in turn given to controller class
```
```
The controller method returns a response to the API.
```
```
The API sends the response back to the user.
```

---

## Functions used :-

### API Endpoints :-

* GetMapping: "/get/location/{location}"
```
This endpoint gives us the data of all Restaurant stored in our data base.
```

---

* PostMapping: "/"
```
In database we add a new Restaurant given through API.
```

---

* DeleteMapping: "/Delete/Salary/{salary}"
```
In database we delete a Restaurant by id given through API.
```

---

* PutMapping: "/update/salary/{salary}/id/{id}"
```
In database we update a Restaurant by id given through API.
```

---

## Data structure Used
* ArrayList
```
We have used ArrayList data structure as a database to implement Operations 
```
---

## Project Summary
The Job Search Portal is a Spring Boot Project written in Java that is used by job seckers. This project is built using the Spring boot framework. The proect uses ArrayList as the datastructure to store daya.

The project includes four main components, the JobController, the JobService, the JobDao, and the Job class. The JobController class receives requests from the user interface layer and delegates them to the JobService. The JobService processes the request and retrieves or updates data from the JobDao. The jobDao uses an ArrayList data structure to store and manage user data, and the Job class defines the Job data model.
