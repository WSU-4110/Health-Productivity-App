# Installation Guide

This document will go over how to install the necessary programs to run the application.

## Step 1 (Install Java)

This application is written in java.

Install java from here: https://www.java.com/download/ie_manual.jsp

## Step 2 (MySQL)

This application utilizes MySQL for performing the backend actions.

Install MySQL here: https://dev.mysql.com/downloads/installer/

In a SQL query, create a schema using:

  CREATE DATABASE healthApp;
  
  USE healthApp;
  
  CREATE TABLE users(

	firstName VARCHAR(50),
	
	lastName VARCHAR(50),
	
	username VARCHAR(50),
	
	email VARCHAR(50),
	
	password VARCHAR(50),
	
	phone BIGINT
	
	);

## Step 3 (Eclipse IDE)

Run this application with the Eclipse IDE. You can download it here: https://www.eclipse.org/downloads/

Import the github project into Eclipse using the import feature within the IDE.

To run the application, run/open login_window.java as a Java Application.
