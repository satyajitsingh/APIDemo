# APIDemo

This a JAVA Springboot API demo project built to test REST API calls from Postman. Users will need to build the project and run it ( see below commands).


##### *Introduction*

The API is there to add users to a List, initially/on start the list will be empty.  The service runs on port 8083.

Rest URls:
* Bullet list
  a) Add user/ POST : Postman create new request(POST). URL:- http://localhost:8083/register/user, Header: Content-Type: application/json , Body: select raw and type 
  {
    "name": "User1",
    "age": 31,
    "userID" : "usr00001"
  }


##### *users endpoint url pattern*

##### *build and execute a clean package*

```sh
$ mvn clean package

##### *build and install*

## Running the application

##### *execute application from command-line using spring plugin*

```sh
$ mvn clean spring-boot:run
```

