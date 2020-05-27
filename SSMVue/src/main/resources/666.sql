/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.5.40 : Database - vuejsdemo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`vuejsdemo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `vuejsdemo`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `age` int(11) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `PASSWORD` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`age`,`username`,`PASSWORD`,`email`,`sex`) values (1,50,'张老师','123456','zzz@itcast.cn','男 '),(2,31,'刘老师','123','lll@itcast.cn','女'),(3,17,'赵工','213','zg@itcast.cn','女'),(4,40,'高管','213','gg@itcast.cn','female'),(5,1000,'王培毅是','312','lz@jxjt.com','male'),(6,34,'王董','312','wd@jxjt.com','male'),(7,55,'孙老板','4321','slb@xzjt.com','男'),(8,19,'陈秘书','4321','cms@xzjt.com','女');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
