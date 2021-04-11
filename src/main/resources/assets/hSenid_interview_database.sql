-- Create new database
CREATE DATABASE  IF NOT EXISTS `hSenid_interview_database`;

-- User "hSenid_interview_database" database
USE `hSenid_interview_database`;

DROP TABLE IF EXISTS `user`;

DROP TABLE IF EXISTS `role`;

DROP TABLE IF EXISTS `users_role`;
   
-- Create "user" table
CREATE TABLE `user` (
	`user_id` int(11) NOT NULL AUTO_INCREMENT,
    `first_name` varchar(45) DEFAULT NULL,
    `last_name` varchar(45) DEFAULT NULL,
    `email` varchar(45) DEFAULT NULL,
    `phone_number` varchar(45) DEFAULT NULL,
    `address` varchar(200) DEFAULT NULL,
    `user_name` varchar(45) UNIQUE NOT NULL,
    `password` varchar(45) NOT NULL,
    PRIMARY KEY (`user_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- Create "role" table    
CREATE TABLE `role` (
	`role_id` int(11) NOT NULL AUTO_INCREMENT,
    `user_type` varchar(45) NOT NULL,
    PRIMARY KEY (`role_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- Create "user_role" table
CREATE TABLE `users_role` (
	`users_role_id` int(11) NOT NULL AUTO_INCREMENT,
	`role_id` int(11) NOT NULL,
    `user_id` int(11) NOT NULL,
    PRIMARY KEY (`users_role_id`),
    CONSTRAINT FK_UserRole FOREIGN KEY (`role_id`) REFERENCES role(`role_id`),
    CONSTRAINT FK_UserDetail FOREIGN KEY (`user_id`) REFERENCES user(`user_id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;   