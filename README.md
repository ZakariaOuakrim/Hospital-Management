<h1 align="center">
  <a href="https://github.com/ZakariaOuakrim/Hospital-Management.git">
    <img src="https://raw.githubusercontent.com/ZakariaOuakrim/Hospital-Management/master/src/main/resources/images/1.png" >
  </a>
</h1>
<p align="center">
&nbsp <a target="_blank" href="https://www.linkedin.com/in/zakariaouakz/"><img height="20" src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" /></a>
<a href="https://mail.google.com/mail/?view=cm&to=ouakrimzakaria18@gmail.com" target="_blank" onclick="window.open(this.href,'_blank'); return false;">
  <img height="20" src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" />
</a>

</p>
<p align="center">
  This repository contains the <strong>Hospital Management System</strong> source code.  
  It is a Spring Boot backend application for managing patients, doctors, appointments, and consultations.
</p>


<p align="center">
<a href="#introduction">Introduction</a> &nbsp;&bull;&nbsp;
<a href="#installation">Installation</a> &nbsp;&bull;&nbsp;
<a href="#Features">Features</a> &nbsp;&bull;&nbsp;
<a href="#Database Schema">Database Schema</a> &nbsp;&bull;&nbsp;
<a href="#issue">Issue?</a>
</p>

<i>This project is based on this UML diagram: </i> <br>

<img src="https://raw.githubusercontent.com/ZakariaOuakrim/Hospital-Management/master/src/main/resources/images/4.png" />

# Introduction
This <b>Hospital Management Backend</b> project is built using Spring Boot. It allows hospitals to manage:

- <b>Patients </b>: Register and retrieve patient details.
- <b>Doctors (Médecins)</b>: Assign and manage doctors.
- <b>Appointments (RendezVous)</b>: Schedule and track appointments.
- <b>Consultations</b>: Record medical consultations.

The project follows a RESTful API architecture with proper relationships between entities such as One-to-Many, Many-to-One, and One-to-One using JPA.

# Installation
##### Copy the repository to your local machine
```
https://github.com/ZakariaOuakrim/Hospital-Management.git
```
##### Navigate to the project directory
```
cd Hospital-Management
```

##### Build and run the project using MAVEN
```
mvn clean install
mvn spring-boot:run
```


# Features
- Manage Patients: Add, update, delete, and list patients.

- Manage Doctors: Add and assign doctors to appointments.

- Schedule Appointments: Link patients to doctors through appointments.

- Record Consultations: Store medical reports and consultation details.

- Database Integration: Uses JPA with MySQL for persistence.


# Database Schema

The system follows the following entity relationships:

- <b>One-to-Many</b>: A Patient can have multiple Appointments.

- <b>One-to-Many</b>: A Doctor can have multiple Appointments.

- <b>One-to-One</b>: An Appointment is linked to a Consultation.

##### Example Entity: Patient 
<img src="https://raw.githubusercontent.com/ZakariaOuakrim/Hospital-Management/master/src/main/resources/images/2.png" />

##### Example Entity: Appointment
<img src="https://raw.githubusercontent.com/ZakariaOuakrim/Hospital-Management/master/src/main/resources/images/3.png" />

### Technologies Used

- Spring Boot - Backend framework

- Spring Data JPA - ORM for database interactions

- MySQL/H2 - Database

- Maven - Dependency management

## Issue
This repository is maintained actively, so if you face any issue please <a href="https://github.com/ZakariaOuakrim/Hospital-Management/issues/new">raise an issue</a>.

<h4>Liked the work ?</h4>
Give the repository a star :-)