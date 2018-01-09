Follow the below steps to run this project

Also install POSTMAN chrome plug-in to run and see all API outputs.

1. Below command will start Spring boot application with embedded Tomcat server 

    Open CourseApiApplication.java file, Run as Java Application

2. Read all the topics, run the below rest api

    URL : http://localhost:8080/topics

    Content-Type : application / json

    Method : GET

3. Add topic to the list rest api

    URL : http://localhost:8080/topics

    Content-Type : application / json

    Method : POST

    Body Payload:

    {
      "id": "spring",

      "name": "spring boot",

      "description": "spring boot application"
    }

3. Update topic rest api

      URL : http://localhost:8080/topics/1

      Content-Type : application / json

      Method : PUT

      Body Payload:

      {
        "id": "spring",

        "name": "spring boot",

        "description": "spring boot application"
      }

4.Delete topic rest api

    URL : http://localhost:8080/topics/1

    Content-Type : application / json

    Method : DELETE
