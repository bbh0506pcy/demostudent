create database filmviedo;
use fimlviedo;
CREATE TABLE students (
    stuid INT(11) PRIMARY KEY,
    stunum VARCHAR(20) NOT NULL,
    stuname VARCHAR(20) NOT NULL,
    stusex VARCHAR(10) NOT NULL,
    stuage INT(11) NOT NULL,
    class VARCHAR(20) NOT NULL
);
INSERT INTO students (stuid, stunum, stuname, stusex, stuage, class) VALUES
(1, '20220001', '张三', '男', 20, '计算机科学与技术'),
(2, '20220002', '李四', '女', 21, '信息工程'),
(3, '20220003', '王五', '男', 19, '电子商务'),
(4, '20220004', '赵六', '女', 20, '会计学'),
(5, '20220005', '钱七', '男', 22, '人力资源管理'),
(6, '20220006', '孙八', '女', 21, '市场营销'),
(7, '20220007', '周九', '男', 20, '物流管理'),
(8, '20220008', '吴十', '女', 19, '国际贸易'),
(9, '20220009', '郑十一', '男', 21, '金融学'),
(10, '20220010', '王十二', '女', 20, '审计学'),
(11, '20220011', '赵十三', '男', 22, '法学'),
(12, '20220012', '钱十四', '女', 19, '经济学'),
(13, '20220013', '孙十五', '男', 20, '新闻学'),
(14, '20220014', '周十六', '女', 21, '广告学'),
(15, '20220015', '吴十七', '男', 22, '英语'),
(16, '20220016', '郑十八', '女', 19, '日语'),
(17, '20220017', '王十九', '男', 20, '法语'),
(18, '20220018', '赵二十', '女', 21, '汉语言文学'),
(19, '20220019', '钱二十一', '男', 22, '历史学'),
(20, '20220020', '孙二十二', '女', 19, '考古学');

CREATE TABLE admin (
    adminid INT(11) PRIMARY KEY,
    adminnum VARCHAR(20) NOT NULL,
    adminpaw VARCHAR(10) NOT NULL
);
INSERT INTO admin (adminid, adminnum, adminpaw) VALUES
(1, 'admin', '123456'),
(2, 'admin002', 'password2'),
(3, 'admin003', 'password3');

CREATE TABLE users (
    userid INT(11) PRIMARY KEY,
    usernum VARCHAR(20) NOT NULL,
    userpaw VARCHAR(20) NOT NULL
);
INSERT INTO users (userid, usernum, userpaw) VALUES
(1, '202404', '123456'),
(2, '2018002', 'password2'),
(3, '2018003', 'password3'),
(4, '2018004', 'password4'),
(5, '2018005', 'password5');

CREATE TABLE courses (
    courseid INT(11) PRIMARY KEY,
    coursehours INT(20) NOT NULL,
    coursename VARCHAR(20) NOT NULL,
    courseteacher VARCHAR(30) NOT NULL
);
INSERT INTO courses (courseid, coursehours, coursename, courseteacher) VALUES
(1, 64, '数据结构与算法', '张老师'),
(2, 48, '数据库原理与应用', '王老师'),
(3, 32, 'Java程序设计', '李老师'),
(4, 48, '网络原理', '赵老师'),
(5, 48, '操作系统', '钱老师'),
(6, 64, '计算机组成原理', '孙老师'),
(7, 48, '软件工程', '周老师'),
(8, 32, '数据挖掘', '吴老师'),
(9, 48, '人工智能', '郑老师'),
(10, 48, '编译原理', '陈老师'),
(11, 64, '计算机网络', '朱老师'),
(12, 48, '信息安全', '刘老师'),
(13, 32, 'Web开发', '何老师'),
(14, 48, '物联网技术', '许老师'),
(15, 48, '软件测试', '江老师'),
(16, 64, '分布式系统', '丁老师'),
(17, 48, '图像处理', '梁老师'),
(18, 32, '并行计算', '范老师'),
(19, 48, '嵌入式系统', '魏老师'),
(20, 48, '大数据技术', '袁老师');


CREATE TABLE declares (
    declareid INT(11) PRIMARY KEY,
    projectname VARCHAR(20) NOT NULL,
    declaretime VARCHAR(255) NOT NULL,
    projectscore INT(11) NOT NULL,
    declaerfile VARCHAR(255) NOT NULL,
    stunum VARCHAR(20) NOT NULL
);
INSERT INTO declares (declareid, projectname, declaretime, projectscore, declaerfile, stunum) VALUES
(1, '项目1', '2024-04-01', 85, '/path/to/project1.pdf', '20220001'),
(2, '项目2', '2024-04-02', 78, '/path/to/project2.pdf', '20220002'),
(3, '项目3', '2024-04-03', 92, '/path/to/project3.pdf', '20220003'),
(4, '项目4', '2024-04-04', 80, '/path/to/project4.pdf', '20220004'),
(5, '项目5', '2024-04-05', 88, '/path/to/project5.pdf', '20220005'),
(6, '项目6', '2024-04-06', 75, '/path/to/project6.pdf', '20220006'),
(7, '项目7', '2024-04-07', 90, '/path/to/project7.pdf', '20220007'),
(8, '项目8', '2024-04-08', 82, '/path/to/project8.pdf', '20220008'),
(9, '项目9', '2024-04-09', 86, '/path/to/project9.pdf', '20220009'),
(10, '项目10', '2024-04-10', 79, '/path/to/project10.pdf', '20220010'),
(11, '项目11', '2024-04-11', 94, '/path/to/project11.pdf', '20220011'),
(12, '项目12', '2024-04-12', 85, '/path/to/project12.pdf', '20220012'),
(13, '项目13', '2024-04-13', 87, '/path/to/project13.pdf', '20220013'),
(14, '项目14', '2024-04-14', 91, '/path/to/project14.pdf', '20220014'),
(15, '项目15', '2024-04-15', 83, '/path/to/project15.pdf', '20220015'),
(16, '项目16', '2024-04-16', 89, '/path/to/project16.pdf', '20220016'),
(17, '项目17', '2024-04-17', 81, '/path/to/project17.pdf', '20220017'),
(18, '项目18', '2024-04-18', 88, '/path/to/project18.pdf', '20220018'),
(19, '项目19', '2024-04-19', 84, '/path/to/project19.pdf', '20220019'),
(20, '项目20', '2024-04-20', 90, '/path/to/project20.pdf', '20220020');

CREATE TABLE scores (
    scoreid INT(11) PRIMARY KEY,
    stunum VARCHAR(20) NOT NULL,
    coursename VARCHAR(20) NOT NULL,
    score INT(11) NOT NULL,
    department VARCHAR(255) NOT NULL
);
INSERT INTO scores (scoreid, stunum, coursename, score, department) VALUES
(1, '20220001', '数据结构与算法', 85, '计算机科学与技术'),
(2, '20220002', '数据库原理与应用', 78, '信息工程'),
(3, '20220003', 'Java程序设计', 92, '计算机科学与技术'),
(4, '20220004', '网络原理', 80, '信息工程'),
(5, '20220005', '操作系统', 88, '计算机科学与技术'),
(6, '20220006', '软件工程', 75, '信息工程'),
(7, '20220007', '人工智能', 90, '计算机科学与技术'),
(8, '20220008', '编译原理', 82, '信息工程'),
(9, '20220009', '计算机组成原理', 86, '计算机科学与技术'),
(10, '20220010', '数据挖掘', 79, '信息工程'),
(11, '20220011', '大数据技术', 94, '计算机科学与技术'),
(12, '20220012', '软件测试', 85, '信息工程'),
(13, '20220013', '嵌入式系统', 87, '计算机科学与技术'),
(14, '20220014', '物联网技术', 91, '信息工程'),
(15, '20220015', 'Web开发', 83, '计算机科学与技术'),
(16, '20220016', '分布式系统', 89, '信息工程'),
(17, '20220017', '并行计算', 81, '计算机科学与技术'),
(18, '20220018', '操作系统', 88, '信息工程'),
(19, '20220019', '软件工程', 84, '计算机科学与技术'),
(20, '20220020', '数据库原理与应用', 90, '信息工程');


