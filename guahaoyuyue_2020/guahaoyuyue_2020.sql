/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : guahaoyuyue_2020

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2020-06-06 16:56:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for doctor
-- ----------------------------
DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `doctorId` int(11) NOT NULL AUTO_INCREMENT,
  `doctorTitle` varchar(255) DEFAULT NULL,
  `doctorName` varchar(255) DEFAULT NULL,
  `doctorProfile` varchar(255) DEFAULT NULL,
  `departmentName` varchar(255) DEFAULT NULL,
  `doctorCount` int(11) DEFAULT NULL,
  PRIMARY KEY (`doctorId`),
  KEY `doctorName` (`doctorName`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of doctor
-- ----------------------------
INSERT INTO `doctor` VALUES ('1', '副主任医师', '黄明', '黄明擅长治疗各类皮肤病疑难杂症，具有丰富的临床经验，在痤疮(青春痘)、银屑病(牛皮癣)、白癜风、皮炎、湿疹、荨麻疹、鱼鳞病、毛囊炎、脱发(斑秃)、灰指甲等皮肤病', '皮肤科', '97');
INSERT INTO `doctor` VALUES ('2', '副主任医师', '张三', '泌尿外科学博士，副主任医师，美国波士顿哈佛医学院与麻省总医院泌尿外科访问学者。师从泌尿外科大师钟惟德教授 ，2015年取得博士学位。现工作于惠州市中心人民医院，从事泌尿外科专业多年.参与多项国家重点基金项目，主持省级科研项目2项，研究成果先后共发表SCI文章13篇，其中以第一作者发表3篇，国内核心期刊2篇，出版学术专著2部，获批国家专利1项。', '外科', '50');
INSERT INTO `doctor` VALUES ('3', '副主任医师', '霍畅', '霍畅，女，副主任医师，泸州医学院本科毕业，四川省第四人民医院内二病区副主任兼心内科副主任，四川省中西医结合心血管协会委员，四川省心电图协会委员。1994年毕业后一直从事心内科的临床及科研和带教工作，具有丰富的临床经验。擅长心内科各种疾病的诊断和规范化综合治疗，能够熟练进行相关操作及治疗，熟悉并善于及时跟踪国际国内治疗的最新动态。在国内及国际上发表多篇论文。', '内科', '49');
INSERT INTO `doctor` VALUES ('4', '主治医师', '宋晔英', '硕士研究生学历，毕业于广州中医药大学中医内科专业。擅长运用中医药治疗失眠、头晕、老年病及内科常见病多发病，以及机体亚健康状态的调理。\r\n简介： 硕士研究生学历，毕业于广州中医药大学中医内科专业。擅长运用中医药治疗失眠、头晕、老年病及内科常见病多发病，以及机体亚健康状态的调理。', '内科', '100');
INSERT INTO `doctor` VALUES ('5', '主任医师/教授', '陆明', '陆菊明，男，主任医师，教授，解放军总医院内分泌科主任，博士生导师。自1980年以来先后招收硕士研究生14名(全部毕业)、博士生25名（已全部毕业）、接收博士后5名（出站5名），毕业后都分别在各自岗位担任专业技术骨干或学术带头人。曾获“全军优秀教师”称号。多年侧重于糖尿病及其并发症的防治以及临床药物研究等工作，先后担任多项国际多中心干预研究的指导委员会或管理委员会委员兼中国区的研究负责人，主持和参与50余项国内外新药在中国的注册临床和长期药物干预的研究。', '内科', '100');
INSERT INTO `doctor` VALUES ('6', '副主任医师', '林宁', ' 中医治疗病毒感染性疾病、外感发热、咳嗽、 骨关节病、自身免疫疾病、血液病等内科疾病以及多种五官科、皮肤科慢性疾病', '内科', '80');
INSERT INTO `doctor` VALUES ('7', '主治医师', '任清', '自2000年专业从事疝病领域的治疗，师从美国、欧洲和亚太疝协会终身会员、中华医学会全国疝修补培训中心主任陈杰教授，在首都医科大学附属北京朝阳医院微创疝气病中心进修深造多年。擅长成人及儿童各种疑难病症微创治疗，在腹膜前疝修补手术及腹腔镜手术方面积累了丰富的经验。尤其在小儿疝气微创手术方面，已成功微创治愈3万余例，具有手术切口小（仅0.5cm左右），不需住院，复发率极低等诸多优点。', '外科', '100');
INSERT INTO `doctor` VALUES ('8', '主任医师 / 教授', '顾岩', '擅长肥胖减重与糖尿病等代谢疾病的微创外科治疗（减重手术），疝与腹壁外科疾病（各种腹股沟疝、腹壁疝、食道裂孔疝、盆底疝的微创治疗及其它各种腹壁巨大肿瘤/外伤等复杂疾患的外科治疗）、及胃肠道肿瘤的微创外科治疗。', '外科', '100');
INSERT INTO `doctor` VALUES ('9', '主任医师', '吴浩', '主要从事脊柱退行性病变、脊髓肿瘤、椎体肿瘤、脊髓空洞、寰枕畸形等疾病的研究及治疗，独立完成寰枕融合、颈椎前路、后路手术、胸椎间盘及胸椎OPLL切除+内固定融合手术、一期后路胸椎椎体全切+脊柱稳定性重建术、腰椎疾病各种后路手术、髓内肿瘤切除、椎管内肿瘤切除等。本人重点方向：颈椎病、腰椎疾病、胸椎管狭窄、椎体肿瘤、椎管内肿瘤、髓内肿瘤等治疗。', '外科', '100');
INSERT INTO `doctor` VALUES ('10', '副主任医师 / 讲师', '徐峰', '擅长脱发（脂溢性脱发,男性型秃发、斑秃）、痤疮、白癜风、黄褐斑、银屑病、特应性皮炎、湿疹、荨麻疹、癣、疣、带状疱疹等皮肤病。应用皮肤镜诊断色素性皮肤病和毛发疾病。', '皮肤科', '50');
INSERT INTO `doctor` VALUES ('11', '主任医师', '武晓莉', '1、瘢痕及体表小肿物的精细化修复（包括面部及躯干陈旧外伤瘢痕精细化手术修复、片状瘢痕激光治疗等等）；2、病理性瘢痕的手术+综合治疗（包括病理性瘢痕超减张精细修复+术后放疗、注射、激光等综合治疗）3、病理性瘢痕的非手术治疗（药物注射、激光、外用药物、康复治疗）；4、外伤及手术后瘢痕的早期干预（药物、减张、激光治疗等等）。', '皮肤科', '100');
INSERT INTO `doctor` VALUES ('12', '副主任医师 / 副教授', '胡明根', '解放军总医院肝胆外二科副主任，副主任医师，副教授，硕士研究生导师。主要从事肝胆胰肿瘤的外科治疗，擅长腹腔镜及机器人复杂肝胆胰手术，年均手术300台。承担国家自然科学基金，首都临床特色课题，军队十二五科研面上项目等多项课题。发表sci论文15篇，获北京市科技进步二等奖、三等奖，中华医学科技一等奖，国家科技进步二等奖各一项。2012被评为北京市科技新星、2014被评为总后勤部科技新星。担任中国医师协会外科分会机器人专业委员会委员，中国研究型医院学会微创分会常委。', '外科', '50');
INSERT INTO `doctor` VALUES ('13', '主任医师', '杨骥', '擅长白癜风、红斑狼疮、硬皮病、皮肌炎、湿疹、银屑病、痤疮、荨麻疹、色素性疾病、血管炎、皮肤感染等疾病的诊疗。尖锐湿疣、梅毒、淋病和非淋等性病、皮肤肿瘤的治疗。疑难皮肤病的中西医结合诊治。', '皮肤科', '100');
INSERT INTO `doctor` VALUES ('14', '副主任医师', '谷晓广', '擅长过敏性皮肤病：荨麻疹、湿疹、过敏性皮炎等;色素性皮肤病：白癜风、太田痣、咖啡斑、雀斑、黄褐斑等;红斑鳞屑性皮肤病：银屑病(牛皮癣)、副银屑病等;皮肤肿瘤性皮肤病：脂溢性角化、皮肤纤维瘤、色素痣、皮肤淋巴细胞瘤等;皮肤激光美容：痤疮、痘坑、皮肤皱纹、脱毛等。', '皮肤科', '100');
INSERT INTO `doctor` VALUES ('15', '主任医师', '杨军林', '擅长：脊柱畸形（婴幼儿、青少年、成人及老年脊柱侧凸、后凸畸形，强直性脊柱炎后凸等），脊柱肿瘤，以及颈椎冰病、颈椎管狭窄症、腰椎间盘突出症、腰椎管狭窄症等各类常见脊柱手术。', '儿科', '100');
INSERT INTO `doctor` VALUES ('16', '主任医师 / 教授', '徐正莉', '中西医结合治疗小儿常见病、多发病，在小儿发热、久咳、久喘、厌食、疳积、腹泻、便秘、遗尿、汗证、夜啼、注意力缺陷综合症等诊疗方面独具特色。在治疗抽动秽语综合症、小儿惊厥、肾炎、幼年类风湿病、紫癜等疾病积累了较丰富的临床经验。', '儿科', '100');
INSERT INTO `doctor` VALUES ('17', '主任医师 / 教授', '常燕群', '任广东省康复医学会常委、广东省儿科学会儿童发育与行为学组副组长、广东省儿童神经学组副组长、广东省特殊儿童家长俱乐部副理事长。 目前，主要从事儿童神经疾病如脑性瘫痪、癫痫、抽动症、多动症等疾病的诊疗工作，对脑性瘫痪的综合治疗有丰富的经验，在基础方面对脑缺氧缺血性损伤的发病机制有一定的研究', '儿科', '50');
INSERT INTO `doctor` VALUES ('18', '主治医师', '徐玲玲', ' 熟悉儿科的常见疾病及危重症疾病的诊断及治疗，特别对儿童喂养，保健，感染，消化，呼吸，生长发育十分专长', '儿科', '100');
INSERT INTO `doctor` VALUES ('19', '主任医师', '杨莉', '毕业于武汉大学口腔医学院，从事口腔临床工作20多年，有丰富的口腔全科临床经验。擅长儿童牙病的防治、错合畸形的早期矫正、牙体牙髓疾病的诊治及美容牙科（正畸、美白、种植修复等）。 广东省口腔医学会老年口腔专业委员会副主任委员、广东省口腔医学会儿童口腔专业委员会常委、广东省口腔医学会牙体牙髓专业委员会委员。', '口腔科', '100');
INSERT INTO `doctor` VALUES ('20', '主任医师 / 教授', '张清彬', ' 主要从事颞下颌关节疾病、三叉神经痛、面瘫、面肌痉挛等疾病的诊疗。擅长“序列梯度”治疗颞下颌关节疾病及“微创方法”诊疗三叉神经痛和面神经疾患。', '口腔科', '80');
INSERT INTO `doctor` VALUES ('21', '主任医师 / 教授', '朴正国', ' 口腔颌面外科的先天及后天畸形（正颌外科、面部轮廓手术、颌面创伤后畸形、唇腭裂）的诊治，颌面部的医学整形及美容手术、微整形', '口腔科', '100');
INSERT INTO `doctor` VALUES ('22', '主任医师', '姜陵', '擅长于牙体病、牙髓病、急慢性根尖周病、牙周病及其他口腔疾病的诊治；擅长拔牙术、牙槽手术、颌面外科手术、牙周手术、根尖手术、囊肿摘除术等口腔外科手术；擅长活动局部及全口义齿、固定义齿、美容性修复与正畸术、功能性轿正术等技术。并熟练掌握烤瓷技术、精密高熔铸造技术等。同时在治疗口腔一些慢性、疑难病方面有较深的研究和独到的疗法。', '口腔科', '80');
INSERT INTO `doctor` VALUES ('23', '副主任医师', '冯雪亮', '擅长治疗：成人及儿童各类斜视手术，眼睑下垂手术，儿童白内障手术，泪道疾患，眼整形', '眼科', '99');
INSERT INTO `doctor` VALUES ('24', '主任医师 / 教授', '李俊红', '擅长治疗：成人及儿童各类型斜视手术、成人和儿童白内障超声乳化手术、眼睑下垂手术、泪道手术和眼整形手术等', '眼科', '50');
INSERT INTO `doctor` VALUES ('25', '主治医师', '张顺华', '在白内障方面超声乳化和小切口ECCE技术娴熟，侧重于各种复杂性白内障及青光眼合并白内障的治疗，在普通白内障治疗中注重手术的舒适性以及良好的术后裸眼视力。在青光眼方面，专注于不同类型青光眼的个体化治疗，联合应用药物、激光和手术获得最佳治疗效果。', '眼科', '100');
INSERT INTO `doctor` VALUES ('26', '主治医师', '郑霖', '擅长于眼底病的诊治，包括糖尿病视网膜病变、视网膜脱离、黄斑前膜、黄斑裂孔、视网膜静脉阻塞等。手术技术娴熟，擅长于外路视网膜脱离复位术、玻璃体切除术以及白内障手术。', '眼科', '80');
INSERT INTO `doctor` VALUES ('27', '主治医师', '谭先杰', '博士研究生导师，从事妇科良恶性肿瘤的诊断和治疗。', '妇科', '100');
INSERT INTO `doctor` VALUES ('28', '主任医师', '刁斌', '擅长： 女性盆底疾病、妇科肿瘤、妇科内分泌及病理产科的诊治，精通妇科阴式手术、宫腹腔镜手术等微创手术及盆底重建手术。', '妇科', '100');
INSERT INTO `doctor` VALUES ('29', '主任医师 / 教授', '韩凤英', '副主任医师，1994年毕业于第四军医大学临床医学（本科） ，中华医学会妇科协会委员，擅长于计划生育手术及指导、宫颈LEEP刀手术方案的制定、异位妊娠保守治疗术后输卵管治疗，对计划生育手术及相关指导、宫颈疾病的早期筛查及手术治疗、多囊卵巢、不孕不育的诊治有丰富的经验。', '妇科', '100');
INSERT INTO `doctor` VALUES ('30', '主任医师 / 教授', '张艳珍', '擅长优生优育、孕产妇保健、产前筛查、产前诊断、产前遗传咨询以及妊娠期并发症的诊治。熟练掌握各项产前诊断技术，进行羊水过多、羊水过少的宫内治疗，胎儿胸腹水的检查与治疗，具有产科危重孕产妇救治丰富经验。', '妇科', '100');

-- ----------------------------
-- Table structure for doctorduty
-- ----------------------------
DROP TABLE IF EXISTS `doctorduty`;
CREATE TABLE `doctorduty` (
  `doctorDutyId` int(11) NOT NULL AUTO_INCREMENT,
  `doctorId` int(11) NOT NULL,
  `doctorDate` datetime(6) DEFAULT NULL,
  `timeFlag` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`doctorDutyId`),
  KEY `doctorId` (`doctorId`),
  CONSTRAINT `doctorduty_ibfk_1` FOREIGN KEY (`doctorId`) REFERENCES `doctor` (`doctorid`)
) ENGINE=InnoDB AUTO_INCREMENT=197 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of doctorduty
-- ----------------------------
INSERT INTO `doctorduty` VALUES ('1', '1', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('2', '2', '2020-06-06 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('3', '3', '2020-06-06 00:00:22.000000', '0');
INSERT INTO `doctorduty` VALUES ('4', '4', '2020-06-06 00:00:22.000000', '1');
INSERT INTO `doctorduty` VALUES ('5', '5', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('6', '6', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('7', '7', '2020-06-06 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('8', '8', '2020-06-06 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('9', '9', '2020-06-06 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('10', '10', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('11', '11', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('12', '12', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('13', '13', '2020-06-06 00:00:22.000000', '0');
INSERT INTO `doctorduty` VALUES ('14', '14', '2020-06-06 00:00:22.000000', '1');
INSERT INTO `doctorduty` VALUES ('15', '15', '2020-06-06 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('16', '16', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('17', '17', '2020-06-06 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('18', '18', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('19', '19', '2020-06-06 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('20', '20', '2020-06-06 00:00:22.000000', '1');
INSERT INTO `doctorduty` VALUES ('21', '21', '2020-06-06 00:00:22.000000', '1');
INSERT INTO `doctorduty` VALUES ('22', '22', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('23', '23', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('24', '24', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('25', '25', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('26', '26', '2020-06-06 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('29', '1', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('30', '2', '2020-06-07 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('31', '3', '2020-06-07 00:00:22.000000', '1');
INSERT INTO `doctorduty` VALUES ('32', '4', '2020-06-07 00:00:22.000000', '0');
INSERT INTO `doctorduty` VALUES ('33', '5', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('34', '6', '2020-06-07 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('35', '7', '2020-06-07 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('36', '8', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('37', '9', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('38', '10', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('39', '11', '2020-06-07 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('40', '12', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('41', '13', '2020-06-07 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('42', '14', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('43', '15', '2020-06-07 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('44', '16', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('45', '17', '2020-06-07 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('46', '18', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('47', '19', '2020-06-07 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('48', '20', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('49', '21', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('50', '22', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('51', '23', '2020-06-07 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('52', '24', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('53', '25', '2020-06-07 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('55', '26', '2020-06-07 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('81', '1', '2020-06-08 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('82', '2', '2020-06-08 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('83', '3', '2020-06-08 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('84', '4', '2020-06-08 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('85', '5', '2020-06-08 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('86', '6', '2020-06-08 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('87', '7', '2020-06-08 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('88', '8', '2020-06-08 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('89', '9', '2020-06-08 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('90', '10', '2020-06-08 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('91', '11', '2020-06-09 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('92', '12', '2020-06-09 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('93', '13', '2020-06-09 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('94', '14', '2020-06-09 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('95', '15', '2020-06-09 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('96', '16', '2020-06-09 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('97', '17', '2020-06-09 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('98', '18', '2020-06-09 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('99', '19', '2020-06-09 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('100', '20', '2020-06-09 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('101', '21', '2020-06-09 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('102', '22', '2020-06-09 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('103', '23', '2020-06-09 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('104', '24', '2020-06-09 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('105', '25', '2020-06-09 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('106', '26', '2020-06-10 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('107', '1', '2020-06-10 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('108', '2', '2020-06-10 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('109', '3', '2020-06-10 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('110', '4', '2020-06-10 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('111', '5', '2020-06-10 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('112', '6', '2020-06-10 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('113', '7', '2020-06-10 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('114', '8', '2020-06-10 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('115', '9', '2020-06-10 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('116', '10', '2020-06-10 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('117', '11', '2020-06-10 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('118', '12', '2020-06-10 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('119', '13', '2020-06-10 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('120', '14', '2020-06-10 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('121', '15', '2020-06-10 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('122', '16', '2020-06-10 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('123', '17', '2020-06-11 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('124', '18', '2020-06-11 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('125', '19', '2020-06-11 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('126', '20', '2020-06-11 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('127', '21', '2020-06-11 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('128', '22', '2020-06-11 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('129', '23', '2020-06-11 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('130', '24', '2020-06-11 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('131', '25', '2020-06-11 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('132', '26', '2020-06-11 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('133', '1', '2020-06-11 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('134', '2', '2020-06-11 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('135', '3', '2020-06-11 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('136', '4', '2020-06-11 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('137', '5', '2020-06-11 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('138', '6', '2020-06-11 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('139', '7', '2020-06-11 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('140', '8', '2020-06-11 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('141', '9', '2020-06-11 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('142', '10', '2020-06-11 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('143', '11', '2020-06-12 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('144', '12', '2020-06-12 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('145', '13', '2020-06-12 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('146', '14', '2020-06-12 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('147', '15', '2020-06-12 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('148', '16', '2020-06-12 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('149', '17', '2020-06-12 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('150', '18', '2020-06-12 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('151', '19', '2020-06-12 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('152', '20', '2020-06-12 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('153', '21', '2020-06-12 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('154', '22', '2020-06-12 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('155', '23', '2020-06-12 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('156', '24', '2020-06-12 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('157', '25', '2020-06-12 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('158', '26', '2020-06-13 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('159', '1', '2020-06-13 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('160', '2', '2020-06-13 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('161', '3', '2020-06-13 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('162', '4', '2020-06-13 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('163', '5', '2020-06-13 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('164', '6', '2020-06-13 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('165', '7', '2020-06-13 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('166', '8', '2020-06-13 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('167', '9', '2020-06-13 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('168', '10', '2020-06-13 16:45:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('169', '11', '2020-06-13 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('170', '12', '2020-06-13 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('171', '13', '2020-06-13 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('172', '14', '2020-06-13 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('173', '15', '2020-06-13 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('174', '16', '2020-06-13 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('175', '17', '2020-06-14 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('176', '18', '2020-06-14 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('177', '19', '2020-06-14 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('178', '20', '2020-06-14 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('179', '21', '2020-06-14 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('180', '22', '2020-06-14 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('181', '23', '2020-06-14 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('182', '24', '2020-06-14 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('183', '25', '2020-06-14 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('184', '26', '2020-06-14 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('185', '27', '2020-06-14 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('186', '28', '2020-06-14 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('187', '29', '2020-06-14 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('188', '30', '2020-06-14 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('189', '27', '2020-06-14 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('190', '28', '2020-06-14 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('191', '29', '2020-06-14 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('192', '30', '2020-06-15 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('193', '27', '2020-06-15 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('194', '28', '2020-06-15 00:00:00.000000', '0');
INSERT INTO `doctorduty` VALUES ('195', '29', '2020-06-15 00:00:00.000000', '1');
INSERT INTO `doctorduty` VALUES ('196', '30', '2020-06-15 00:00:00.000000', '1');

-- ----------------------------
-- Table structure for feedback
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `fbId` int(11) NOT NULL AUTO_INCREMENT,
  `userTel` char(11) NOT NULL,
  `opinion` varchar(255) DEFAULT NULL,
  `feedbackTime` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`fbId`),
  KEY `userTel` (`userTel`),
  CONSTRAINT `feedback_ibfk_1` FOREIGN KEY (`userTel`) REFERENCES `user` (`usertel`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of feedback
-- ----------------------------
INSERT INTO `feedback` VALUES ('1', '13751665699', '意见', null);
INSERT INTO `feedback` VALUES ('2', '15019266357', '我的意见', null);
INSERT INTO `feedback` VALUES ('3', '13202223111', '杨莉医生很好，网上挂号预约真方便', null);

-- ----------------------------
-- Table structure for orderlist
-- ----------------------------
DROP TABLE IF EXISTS `orderlist`;
CREATE TABLE `orderlist` (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `userTel` char(11) NOT NULL,
  `departmentName` varchar(255) DEFAULT NULL,
  `doctorName` varchar(255) DEFAULT NULL,
  `diseaseDescription` varchar(255) DEFAULT NULL,
  `appointmentTime` datetime DEFAULT NULL,
  `timeFlag` tinyint(2) DEFAULT NULL,
  `orderTime` datetime DEFAULT NULL,
  `visitingState` tinyint(2) DEFAULT NULL,
  `callNumberState` char(3) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `doctorId` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderId`),
  KEY `userTel` (`userTel`),
  KEY `doctorId` (`doctorId`),
  KEY `doctorName` (`doctorName`),
  CONSTRAINT `orderlist_ibfk_1` FOREIGN KEY (`userTel`) REFERENCES `user` (`usertel`),
  CONSTRAINT `orderlist_ibfk_2` FOREIGN KEY (`doctorId`) REFERENCES `doctor` (`doctorid`),
  CONSTRAINT `orderlist_ibfk_3` FOREIGN KEY (`doctorName`) REFERENCES `doctor` (`doctorname`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of orderlist
-- ----------------------------
INSERT INTO `orderlist` VALUES ('6', '13202223111', '眼科', '冯雪亮', '角膜炎', '2020-06-02 00:00:00', '0', '2020-05-31 08:01:42', '1', null, '23');
INSERT INTO `orderlist` VALUES ('8', '13202223111', '内科', '黄明', '感冒', '2020-06-03 18:00:00', '0', '2020-05-30 18:29:08', '0', null, '1');
INSERT INTO `orderlist` VALUES ('9', '13202223111', '内科', '霍畅', '头痛', '2020-06-07 00:00:00', '0', '2020-05-29 08:20:26', '-1', null, '3');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userTel` char(11) NOT NULL,
  `userName` varchar(255) NOT NULL,
  `userPwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`userId`),
  UNIQUE KEY `userTel` (`userTel`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '13202223111', '小明', '123456');
INSERT INTO `user` VALUES ('2', '15926265932', '点点', '946626');
INSERT INTO `user` VALUES ('3', '17727291455', '小红', '898989');
INSERT INTO `user` VALUES ('4', '13751665699', '琪琪', '123456');
INSERT INTO `user` VALUES ('5', '15019266357', '小李', '565656');
INSERT INTO `user` VALUES ('6', '13751666822', '梅梅', '123456');
