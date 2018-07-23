-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema gamitour
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema gamitour
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `gamitour` DEFAULT CHARACTER SET utf8 ;
USE `gamitour` ;

-- -----------------------------------------------------
-- Table `gamitour`.`actividad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`actividad` (
  `idactividad` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(60) NULL DEFAULT NULL,
  `fechainicio` DATE NULL DEFAULT NULL,
  `fechafin` DATE NULL DEFAULT NULL,
  `ubicacion` VARCHAR(60) NULL DEFAULT NULL,
  `numparticipantes` INT(11) NULL DEFAULT NULL,
  `precio` FLOAT NULL DEFAULT NULL,
  `imagen` VARCHAR(60) NULL DEFAULT NULL,
  `puntos` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`idactividad`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `gamitour`.`rol`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`rol` (
  `idrol` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(60) NULL DEFAULT NULL,
  PRIMARY KEY (`idrol`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `gamitour`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`cliente` (
  `idcliente` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(60) NULL DEFAULT NULL,
  `apellidos` VARCHAR(60) NULL DEFAULT NULL,
  `fechanacimiento` DATE NULL DEFAULT NULL,
  `email` VARCHAR(45) NULL DEFAULT NULL,
  `password` VARCHAR(45) NULL DEFAULT NULL,
  `telefono` VARCHAR(45) NULL DEFAULT NULL,
  `direccion` VARCHAR(60) NULL DEFAULT NULL,
  `codigopostal` VARCHAR(10) NULL DEFAULT NULL,
  `avatar` VARCHAR(45) NULL DEFAULT NULL,
  `puntosacumulados` INT(11) NULL DEFAULT NULL,
  `fecharegistro` DATE NULL DEFAULT NULL,
  `rol_idrol` INT(11) NOT NULL,
  PRIMARY KEY (`idcliente`),
  INDEX `fk_cliente_rol1_idx` (`rol_idrol` ASC),
  CONSTRAINT `fk_cliente_rol1`
    FOREIGN KEY (`rol_idrol`)
    REFERENCES `gamitour`.`rol` (`idrol`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `gamitour`.`cliente_has_actividad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`cliente_has_actividad` (
  `cliente_has_actividad_id` INT(11) NOT NULL AUTO_INCREMENT,
  `cliente_idcliente` INT(11) NOT NULL,
  `actividad_idactividad` INT(11) NOT NULL,
  `numparticipantesact` INT(11) NULL DEFAULT NULL,
  `fechaInscripcion` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`cliente_has_actividad_id`),
  INDEX `fk_cliente_has_actividad_actividad1_idx` (`actividad_idactividad` ASC),
  INDEX `fk_cliente_has_actividad_cliente1_idx` (`cliente_idcliente` ASC),
  CONSTRAINT `fk_cliente_has_actividad_actividad1`
    FOREIGN KEY (`actividad_idactividad`)
    REFERENCES `gamitour`.`actividad` (`idactividad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_has_actividad_cliente1`
    FOREIGN KEY (`cliente_idcliente`)
    REFERENCES `gamitour`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `gamitour`.`itinerario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`itinerario` (
  `iditinerario` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(60) NULL DEFAULT NULL,
  `categoria` VARCHAR(45) NULL DEFAULT NULL,
  `duracion` VARCHAR(15) NULL DEFAULT NULL,
  `ubicacion` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`iditinerario`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `gamitour`.`parada`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`parada` (
  `idparada` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(60) NULL DEFAULT NULL,
  `numeroParada` INT(11) NULL DEFAULT NULL,
  `ubicacion` VARCHAR(45) NULL DEFAULT NULL,
  `historia` VARCHAR(200) NULL DEFAULT NULL,
  `anecdotario` VARCHAR(200) NULL DEFAULT NULL,
  `gastronomia` VARCHAR(200) NULL DEFAULT NULL,
  `imagen` VARCHAR(45) NULL DEFAULT NULL,
  `itinerario_iditinerario` INT(11) NOT NULL,
  PRIMARY KEY (`idparada`),
  INDEX `fk_parada_itinerario_idx` (`itinerario_iditinerario` ASC),
  CONSTRAINT `fk_parada_itinerario`
    FOREIGN KEY (`itinerario_iditinerario`)
    REFERENCES `gamitour`.`itinerario` (`iditinerario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `gamitour`.`pruebaDeportiva`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`pruebaDeportiva` (
  `idpruebadeportiva` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(60) NULL DEFAULT NULL,
  `fechainicio` DATE NULL DEFAULT NULL,
  `fechafin` DATE NULL DEFAULT NULL,
  `explicacion` VARCHAR(200) NULL DEFAULT NULL,
  `puntos` INT(11) NULL DEFAULT NULL,
  `parada_idparada` INT(11) NOT NULL,
  PRIMARY KEY (`idpruebadeportiva`),
  INDEX `fk_pruebaDeportiva_parada1_idx` (`parada_idparada` ASC),
  CONSTRAINT `fk_pruebaDeportiva_parada1`
    FOREIGN KEY (`parada_idparada`)
    REFERENCES `gamitour`.`parada` (`idparada`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `gamitour`.`multimedia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`multimedia` (
  `idmultimedia` INT(11) NOT NULL AUTO_INCREMENT,
  `fecha` DATE NULL DEFAULT NULL,
  `comentario` VARCHAR(60) NULL DEFAULT NULL,
  `imagen` VARCHAR(60) NULL DEFAULT NULL,
  `video` VARCHAR(60) NULL DEFAULT NULL,
  `cliente_idcliente` INT(11) NOT NULL,
  `pruebaDeportiva_idpruebadeportiva` INT(11) NOT NULL,
  `puntosacumulados` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`idmultimedia`),
  INDEX `fk_multimedia_cliente1_idx` (`cliente_idcliente` ASC),
  INDEX `fk_multimedia_pruebaDeportiva1_idx` (`pruebaDeportiva_idpruebadeportiva` ASC),
  CONSTRAINT `fk_multimedia_cliente1`
    FOREIGN KEY (`cliente_idcliente`)
    REFERENCES `gamitour`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_multimedia_pruebaDeportiva1`
    FOREIGN KEY (`pruebaDeportiva_idpruebadeportiva`)
    REFERENCES `gamitour`.`pruebaDeportiva` (`idpruebadeportiva`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `gamitour`.`comentario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`comentario` (
  `idcomentario` INT(11) NOT NULL AUTO_INCREMENT,
  `texto` VARCHAR(200) NULL DEFAULT NULL,
  `cliente_idcliente` INT(11) NOT NULL,
  `multimedia_idmultimedia` INT(11) NOT NULL,
  PRIMARY KEY (`idcomentario`),
  INDEX `fk_comentario_cliente1_idx` (`cliente_idcliente` ASC),
  INDEX `fk_comentario_multimedia1_idx` (`multimedia_idmultimedia` ASC),
  CONSTRAINT `fk_comentario_cliente1`
    FOREIGN KEY (`cliente_idcliente`)
    REFERENCES `gamitour`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_comentario_multimedia1`
    FOREIGN KEY (`multimedia_idmultimedia`)
    REFERENCES `gamitour`.`multimedia` (`idmultimedia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `gamitour`.`noticia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`noticia` (
  `idnoticia` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(60) NULL DEFAULT NULL,
  `texto` VARCHAR(200) NULL DEFAULT NULL,
  `fechaalta` DATE NULL DEFAULT NULL,
  `fechacaducidad` DATE NULL DEFAULT NULL,
  `imagen` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idnoticia`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `gamitour`.`premio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`premio` (
  `idpremio` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(60) NULL DEFAULT NULL,
  `descripcion` VARCHAR(200) NULL DEFAULT NULL,
  `imagen` VARCHAR(45) NULL DEFAULT NULL,
  `fechaactivacion` DATE NULL DEFAULT NULL,
  `fechaconsumo` DATE NULL DEFAULT NULL,
  `puntos` INT(11) NULL DEFAULT NULL,
  `cliente_idcliente` INT(11) NOT NULL,
  PRIMARY KEY (`idpremio`),
  INDEX `fk_premio_cliente1_idx` (`cliente_idcliente` ASC),
  CONSTRAINT `fk_premio_cliente1`
    FOREIGN KEY (`cliente_idcliente`)
    REFERENCES `gamitour`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `gamitour`.`pruebaCultural`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`pruebaCultural` (
  `idpruebacultural` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(60) NULL DEFAULT NULL,
  `pregunta` VARCHAR(200) NULL DEFAULT NULL,
  `respuesta` VARCHAR(45) NULL DEFAULT NULL,
  `puntos` INT(11) NULL DEFAULT NULL,
  `parada_idparada` INT(11) NOT NULL,
  PRIMARY KEY (`idpruebacultural`),
  INDEX `fk_pruebaCultural_parada1_idx` (`parada_idparada` ASC),
  CONSTRAINT `fk_pruebaCultural_parada1`
    FOREIGN KEY (`parada_idparada`)
    REFERENCES `gamitour`.`parada` (`idparada`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `gamitour`.`voto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `gamitour`.`voto` (
  `idvoto` INT(11) NOT NULL AUTO_INCREMENT,
  `puntos` INT(11) NULL DEFAULT NULL,
  `cliente_idcliente` INT(11) NOT NULL,
  `multimedia_idmultimedia` INT(11) NOT NULL,
  PRIMARY KEY (`idvoto`),
  INDEX `fk_voto_cliente1_idx` (`cliente_idcliente` ASC),
  INDEX `fk_voto_multimedia1_idx` (`multimedia_idmultimedia` ASC),
  CONSTRAINT `fk_voto_cliente1`
    FOREIGN KEY (`cliente_idcliente`)
    REFERENCES `gamitour`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_voto_multimedia1`
    FOREIGN KEY (`multimedia_idmultimedia`)
    REFERENCES `gamitour`.`multimedia` (`idmultimedia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
