# Jaydot2 Server

This project provides the back-end services for the Jaydot2 website and acts as example code for implementing Spring Boot based services.

## Building the Application

Use the following command to build the application:

```aidl
./gradlew clean build
```

## Running the Application

To run the application in development mode use:

```aidl
./gradlew bootRun
```
Sample data can be submitted as a POST to the `/user` endpoint:

```aidl
curl -H "Content-Type: application/json" -X POST -d '{fullname": "John Doe", "email": "jdoe@somemail.com"}' http://yoururl/user

```

Here is the sample data for using in a tool like PostMan:

```aidl
{
  "fullname": "John Doe",
  "email": "jdoe@somemail.com"
}
```