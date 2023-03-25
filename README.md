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
docker-compose

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

## Testing

### Run SonarQube for code quality

```agsl
gradlew sonarqube -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqa_248e8df52bcdd6e8240998e8fb71c45a9f0aff0c

gradlew sonar -Dsonar.login=squ_995c80608f7064748ee6d6b69d63330529abc546

./gradlew sonar -Dsonar.login=

./gradlew sonar -Dsonar.projectKey=Jaydot2-server -Dsonar.host.url=http://localhost:9000 -Dsonar.login=sqp_fa00feae610f1d535d4e4f9feccb4724f54be632
```