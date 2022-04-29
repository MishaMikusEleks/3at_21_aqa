CREATE SCHEMA `aqa_3AT_21` ;

CREATE TABLE `aqa_3AT_21`.`student` (
                                        `id_student` INT NOT NULL,
                                        `name` VARCHAR(45) NULL,
                                        `bd` DATETIME NULL,
                                        `course` INT NULL,
                                        PRIMARY KEY (`id_student`));

CREATE TABLE `aqa_3AT_21`.`address` (
                                        `id_address` INT NOT NULL,
                                        `country` VARCHAR(45) NULL,
                                        `city` VARCHAR(45) NULL,
                                        PRIMARY KEY (`id_address`));

CREATE TABLE `aqa_3AT_21`.`address_student` (
                                                `id_address_student` INT NOT NULL,
                                                `id_address` VARCHAR(45) NULL,
                                                `id_student` VARCHAR(45) NULL,
                                                PRIMARY KEY (`id_address_student`));