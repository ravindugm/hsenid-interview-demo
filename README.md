# hSenid Interview Project

This project aims to fulfill the assignment that assigns by the hSenid interview panel.

# Clone the repository

Click on the `Code` button and then click the `copy to clipboard` icon.

For example:

```
git@github.com:ravindugm/hsenid-interview-demo.git
```

Then execute the below command on your terminal.

```
$ git clone git@github.com:ravindugm/hsenid-interview-demo.git
```

# System prerequisite for run the project

- Java Development Kit (JDK) Version

```
JDK 11
```

- Database Server

```
MySql
```

- Port Accessibility

This project run using `Port 8080`. So check whether another application already uses `Port 8080`.

For Linux:

```
$ sudo lsof -i :8080
```

To kill the Port:

```
$ sudo kill <port id>
```

# Project prerequisite for run the project

- Create a new Database

Open `src/main/resources/assets/hSenid_interview_database.sql` script and run on `MySQL Server`.

- JDBC Configurations

Open `src/main/resources/application.properties` and change data source properties.

For example:

```
spring.datasource.url=jdbc:mysql://localhost:3306/hSenid_interview_database?useSSL=false&serverTimezone=UTC
spring.datasource.username=spring
spring.datasource.password=12345
```

# Run the Project

Hence this project does not have a `Login Page` have to use `HTTP request URLs` to access the system.

- For access `Admin Interface`:

```
http://localhost:8080/users/list
```
Click on the `Register New Admin` button access to the `Admin Registration Form`.

After filling all details in `Admin Registration Form` then click on the `Save New Admin` button to save the records.

When clicking on the `Save New Admin` button it will save the new record and then redirect to the `Admin Interface` page to avoid data duplication.

Or click on the `Back to User List` link and it will redirect to `Admin Interface`. 

Click on the `View User` button in the `View User` column to view each user details.

- For access `User Registration Form`:

```
http://localhost:8080/users/showUserRegistrationForm
```

After filling in all details in `User Registration Form` then click on the `Register` button to save the records.

When clicking on the `Register` button it will save the new record and then redirect to the `User Login Interface` page to avoid data duplication.

Or click on the `Back to Login Form` link and it will redirect to `User Login Interface` 

```
http://localhost:8080/users/login
```
