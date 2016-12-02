-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.6.17 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  8.0.0.4458
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 test 的数据库结构
CREATE DATABASE IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `test`;


-- 导出  表 test.father1 结构
CREATE TABLE IF NOT EXISTS `father1` (
  `fid` int(11) NOT NULL,
  `fname` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  test.father1 的数据：~1 rows (大约)
/*!40000 ALTER TABLE `father1` DISABLE KEYS */;
INSERT INTO `father1` (`fid`, `fname`) VALUES
	(1, 'MIKE');
/*!40000 ALTER TABLE `father1` ENABLE KEYS */;


-- 导出  表 test.hus1 结构
CREATE TABLE IF NOT EXISTS `hus1` (
  `id` int(11) NOT NULL,
  `hname` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  test.hus1 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `hus1` DISABLE KEYS */;
INSERT INTO `hus1` (`id`, `hname`) VALUES
	(1, 'MIKE'),
	(2, 'JACK');
/*!40000 ALTER TABLE `hus1` ENABLE KEYS */;


-- 导出  表 test.stu1 结构
CREATE TABLE IF NOT EXISTS `stu1` (
  `sid` int(11) NOT NULL,
  `sname` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  test.stu1 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `stu1` DISABLE KEYS */;
INSERT INTO `stu1` (`sid`, `sname`) VALUES
	(1, 'JACK'),
	(2, 'MIKE');
/*!40000 ALTER TABLE `stu1` ENABLE KEYS */;


-- 导出  表 test.tea1 结构
CREATE TABLE IF NOT EXISTS `tea1` (
  `tid` int(11) NOT NULL,
  `tname` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  test.tea1 的数据：~1 rows (大约)
/*!40000 ALTER TABLE `tea1` DISABLE KEYS */;
INSERT INTO `tea1` (`tid`, `tname`) VALUES
	(2, 'ALCIE');
/*!40000 ALTER TABLE `tea1` ENABLE KEYS */;


-- 导出  表 test.teastu1 结构
CREATE TABLE IF NOT EXISTS `teastu1` (
  `tid` int(11) NOT NULL DEFAULT '0',
  `sid` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`tid`,`sid`),
  KEY `t_s_2` (`sid`),
  CONSTRAINT `t_s_1` FOREIGN KEY (`tid`) REFERENCES `tea1` (`tid`),
  CONSTRAINT `t_s_2` FOREIGN KEY (`sid`) REFERENCES `stu1` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  test.teastu1 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `teastu1` DISABLE KEYS */;
INSERT INTO `teastu1` (`tid`, `sid`) VALUES
	(2, 1),
	(2, 2);
/*!40000 ALTER TABLE `teastu1` ENABLE KEYS */;


-- 导出  表 test.user 结构
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) COLLATE utf8_bin NOT NULL,
  `password` varchar(20) CHARACTER SET gbk NOT NULL,
  `age` int(11) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `u_username` (`username`)
) ENGINE=MyISAM AUTO_INCREMENT=1392 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- 正在导出表  test.user 的数据：102 rows
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `username`, `password`, `age`, `birth`) VALUES
	(1028, '荣守一', '2222', 212121, '2010-12-12'),
	(1058, '杨宏昌', '119', 100, '2015-07-02'),
	(1054, '李悦', '911', NULL, NULL),
	(1059, '卢志远', '119', 100, NULL),
	(1213, '京东商城', '999', 6, NULL),
	(1067, '吴润浩', '119', NULL, NULL),
	(1068, '卫昆', '119', NULL, NULL),
	(1224, '北京', '9999', 100, NULL),
	(1205, '嘎嘎嘎嘎', '111', 1, '2015-06-06'),
	(1076, '哈啊哈eeee', '22', NULL, NULL),
	(1080, '朱海龙', '110', NULL, NULL),
	(1081, '郭蛋蛋', '坏蛋', NULL, NULL),
	(1083, '汪海洋', '211', 1, NULL),
	(1084, '武玉密', '大都比', NULL, NULL),
	(1094, '汪海洋', '又调皮了', NULL, NULL),
	(1234, '李克强总理', '111', 10, NULL),
	(1088, '肉丝', '你又调皮了', NULL, NULL),
	(1089, '武筱筱', '999', 88, NULL),
	(1301, '智建伟', '9988', 100, '2015-08-25'),
	(1093, '武胖子', '1\' or 1', NULL, NULL),
	(1097, '武玉密', '888', NULL, NULL),
	(1096, '武胖子', '太可爱了', NULL, NULL),
	(1098, '欢哥', 'v587+100', NULL, NULL),
	(1099, '武玉密', '大?丝', NULL, NULL),
	(1186, '岳南娣', '666666', 20, NULL),
	(1102, 'weikun', '119', 5555, NULL),
	(1187, '海康威视', '00', 20, NULL),
	(1191, '周永康', '12112', 11, NULL),
	(1193, '卫昆', '123', NULL, NULL),
	(1216, 'sdfdsf', 'sdfdsfds', NULL, NULL),
	(1217, 'sdfsfs', '65656565', NULL, NULL),
	(1387, '哈尔滨', '999', 100, '2016-11-22'),
	(1232, '美好', '999', 10, NULL),
	(1233, '美111好', '111', 102, NULL),
	(1236, '大白1', '111', 10, NULL),
	(1298, '1232323', '23423', NULL, NULL),
	(1239, 'wang', '111', 10, NULL),
	(1240, 'NEW', '222', 144, NULL),
	(1241, 'wang', '111', 10, NULL),
	(1242, 'NEW', '222', 144, NULL),
	(1243, '麦克', '888', 10, NULL),
	(1244, '习大大', '777', 200, NULL),
	(1304, '智建伟', '9988', 100, '2015-08-25'),
	(1262, '令完成', '99', 30, '1989-01-01'),
	(1261, '安倍', '111', 20, '1989-09-01'),
	(1303, '智建伟', '9988', 100, '2015-08-25'),
	(1269, '周子炎', '999', 10, '1991-09-01'),
	(1275, '盛某某', 'D01', 200, '1981-01-01'),
	(1274, '张某某', 'D03', 100, '1999-01-01'),
	(1279, '王某某', '777', 120, NULL),
	(1278, '赵某某', '999', 10, NULL),
	(1280, '关某某', '888', 100, NULL),
	(1282, '赵某某', '999', 200, NULL),
	(1283, '孙某某', '宣武区', 123, NULL),
	(1284, '赵某某', '999', 200, NULL),
	(1285, '孙某某', '宣武区', 123, NULL),
	(1286, '王某某', '999', 990, '2015-08-30'),
	(1287, '韩某某345345345345345345345345dfgtfdgfdgfdg2345345345dfgfd', '宣武区', 123, NULL),
	(1293, '和你', '11', 11, '2015-07-16'),
	(1295, '上海', '8888188181', NULL, NULL),
	(1305, 'yyy', '12112', NULL, NULL),
	(1316, '王祖蓝', '111', 20, '1989-09-01'),
	(1317, '包贝尔', '222', 30, '1989-01-01'),
	(1318, '邓超', '333', 40, '1989-02-01'),
	(1315, '6767', '', NULL, NULL),
	(1319, '王祖蓝', '111', 20, '1989-09-01'),
	(1320, '包贝尔', '222', 30, '1989-01-01'),
	(1321, '邓超', '333', 40, '1989-02-01'),
	(1322, '王祖蓝', '111', 20, '1989-09-01'),
	(1323, '包贝尔', '222', 30, '1989-01-01'),
	(1324, '邓超', '333', 40, '1989-02-01'),
	(1325, '王祖蓝', '111', 20, '1989-09-01'),
	(1326, '包贝尔', '222', 30, '1989-01-01'),
	(1327, '邓超', '333', 40, '1989-02-01'),
	(1328, '王祖蓝', '111', 20, '1989-09-01'),
	(1329, '包贝尔', '222', 30, '1989-01-01'),
	(1330, '邓超', '333', 0, '1989-02-01'),
	(1331, '王祖蓝', '111', 20, '1989-09-01'),
	(1332, '包贝尔', '222', 30, '1989-01-01'),
	(1333, '哈尔滨', '999', 0, '1989-02-01'),
	(1357, 'yyyy', '433434', NULL, NULL),
	(1335, '包贝尔1123', '222', NULL, NULL),
	(1382, 'root', 'root', NULL, NULL),
	(1338, '周子炎', '999', 10, '1991-09-01'),
	(1388, '哈尔滨', '555222', NULL, '2016-11-22'),
	(1340, '张某某12312', 'D03', NULL, NULL),
	(1341, '王某某', '111', NULL, NULL),
	(1361, '上海', '888', NULL, NULL),
	(1343, '习总书记', '777', 120, '2015-10-17'),
	(1344, 'weik', '8887772323', 10, '1978-01-01'),
	(1346, '翟耀', '8888', NULL, NULL),
	(1375, 'root', 'root', NULL, NULL),
	(1384, '特朗普', '999', NULL, NULL),
	(1385, '特朗普', '999', NULL, NULL),
	(1386, 'wei', '999', NULL, NULL),
	(1376, 'root', 'root', NULL, NULL),
	(1377, 'root', 'root', NULL, NULL),
	(1378, 'root', 'root', NULL, NULL),
	(1379, 'root', 'root', NULL, NULL),
	(1380, 'root', 'root', NULL, NULL),
	(1381, 'root', 'root', NULL, NULL),
	(1391, '2', '3', NULL, NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;


-- 导出  表 test.user5 结构
CREATE TABLE IF NOT EXISTS `user5` (
  `username` varchar(10) NOT NULL DEFAULT '',
  `sex` varchar(10) NOT NULL DEFAULT '',
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`username`,`sex`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  test.user5 的数据：~4 rows (大约)
/*!40000 ALTER TABLE `user5` DISABLE KEYS */;
INSERT INTO `user5` (`username`, `sex`, `age`) VALUES
	('JACK', 'F', 200),
	('JACK', 'M', 100),
	('LALALA', 'F', 100),
	('MIKE', 'M', 100);
/*!40000 ALTER TABLE `user5` ENABLE KEYS */;


-- 导出  表 test.wife1 结构
CREATE TABLE IF NOT EXISTS `wife1` (
  `id` int(11) NOT NULL,
  `wname` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `h_w_1` FOREIGN KEY (`id`) REFERENCES `hus1` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- 正在导出表  test.wife1 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `wife1` DISABLE KEYS */;
INSERT INTO `wife1` (`id`, `wname`) VALUES
	(1, 'ROSE'),
	(2, 'ALICE');
/*!40000 ALTER TABLE `wife1` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
