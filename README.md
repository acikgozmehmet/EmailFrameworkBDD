# EmailFrameworkBDD

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
This is an automated email framework which uses a valid gmail account. It sends personalized emails to a list of the 
people and with given personalized keywords.

## Technologies
Project is created with:
* Maven
* Java
* Selenium WebDriver
* Cucumber 
* JUnit
	
## Setup/Availability
install it locally using git:

```
$ git clone https://github.com/acikgozmehmet/EmailFrameworkBDD.git
$ mvn test 
```

Before you run it:
* Enter the valid credentials for the gmail account in the 'configuration.properties' file
* Update the email.feature file for the recepients and message.
