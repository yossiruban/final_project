## *Full Stack Automation Final Project*


### *This final project designed to summarize my knowledge and skills acquired in an Automation Testing course.*
*
### Introduction
This project demonstrates a smart automation infrastructure. It's built in hierarchy order of modules. This modules contain number of classes with methods.
There few modules: main; common; helpers; actions; page_objects; etc.

Planning the infrastructure of the project in advance gives quite a few advantages:
* Tests created with minimal use of code lines
* Allows you easily work with a variety of applications
* Allows you easily make changes and maintenance in the project


### Project Overview
The project is an example of building an infrastructure for performing automation testing on different types of applications:
* Web based application
* Mobile application
* Web API
* Electron application
* Desktop application

### *Infrastructure project includes usage of:*
* Page Object Design Pattern
* Project Layers (Extensions/Work Flows/Test Cases etc.)
* Support of Different Clients/Browsers
* Failure Mechanism
* Common Functionality
* External Files Support
* Reporting System (including screenshots)
* Visual Testing
* DB support
* CI support  
*
### List of applications were used in this project:
* orangehrm.com webpage - Web based application
* Mortgage calculator - Mobile application
* Student_List_API - Web API
* Electron application
* Windows calculator - Desktop application

### Tools & Frameworks used in the project:
* TestNG - Testing Framework
* Listeners - interface used to generate logs & customize the TestNG reports
* MySQL Free Online DB 
* [Jenkins](https://www.jenkins.io/)- for tests execution
* REST Assured - for API testing
* [Allure](http://allure.qatools.ru/) Reports - as the main reporting system

### Known Issues:
Conflicts with some dependencies can happen when variety of applications are used in the same project (mobile application in this project). 
Since, this project created for DEMO purposes only, In production it has to be divided into several projects (mobile / desktop etc.)

