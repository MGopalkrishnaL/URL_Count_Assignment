
# URL Count Application

This app is used to tell how many time the other persons are visited your app/website and what are there name. This is basically used in the Big company to know how many users are Visiting there websites.



## API Reference
#### Get:- 

##### Get all visitors and there visits.

```http
http://localhost:8080/api/v1/visitor-count-app/AllUsername-count
```


##### Get Single visitor and there visits.

```http
http://localhost:8080/api/v1/visitor-count-app/username/{username}/count
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `username`| `string` | **Required :** name of user to fetch|

##### Get only visitor count.

```http
http://localhost:8080/api/v1/visitor-count-app/ActualVisitors

```
##### Get only visits count.

```http
http://localhost:8080/api/v1/visitor-count-app/count
```

## Explanation

* In this we used Model View Controller model which is popularly known as MVC .
* we used dependency like spring-Web,spring-dev tool.
* we build this using springboot.
* First we created the packages model , contoller , server .
* In model we create the class where it contains data members ,getters ,setters and constructors.
* In server we write all the business logics .
* In controller we build the api`s and perform CURD operations like{Get,Post,Put,Delete} but we used only Get operation in this.    
