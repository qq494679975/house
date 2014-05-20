prompt PL/SQL Developer import file
prompt Created on 2014年4月5日 by DA
set feedback off
set define off
prompt Loading MENUROLE...
insert into MENUROLE (MID, RID)
values (30, 1);
insert into MENUROLE (MID, RID)
values (1, 1);
insert into MENUROLE (MID, RID)
values (2, 1);
insert into MENUROLE (MID, RID)
values (5, 1);
insert into MENUROLE (MID, RID)
values (6, 1);
insert into MENUROLE (MID, RID)
values (23, 1);
insert into MENUROLE (MID, RID)
values (24, 1);
insert into MENUROLE (MID, RID)
values (26, 1);
insert into MENUROLE (MID, RID)
values (27, 1);
insert into MENUROLE (MID, RID)
values (28, 1);
insert into MENUROLE (MID, RID)
values (29, 1);
insert into MENUROLE (MID, RID)
values (7, 1);
insert into MENUROLE (MID, RID)
values (8, 1);
insert into MENUROLE (MID, RID)
values (9, 1);
insert into MENUROLE (MID, RID)
values (10, 1);
insert into MENUROLE (MID, RID)
values (12, 1);
insert into MENUROLE (MID, RID)
values (13, 1);
insert into MENUROLE (MID, RID)
values (14, 1);
insert into MENUROLE (MID, RID)
values (15, 1);
insert into MENUROLE (MID, RID)
values (16, 1);
insert into MENUROLE (MID, RID)
values (17, 1);
insert into MENUROLE (MID, RID)
values (18, 1);
insert into MENUROLE (MID, RID)
values (19, 1);
insert into MENUROLE (MID, RID)
values (20, 1);
insert into MENUROLE (MID, RID)
values (22, 1);
insert into MENUROLE (MID, RID)
values (21, 1);
insert into MENUROLE (MID, RID)
values (11, 1);
insert into MENUROLE (MID, RID)
values (25, 1);
insert into MENUROLE (MID, RID)
values (31, 1);
insert into MENUROLE (MID, RID)
values (32, 1);
insert into MENUROLE (MID, RID)
values (3, 1);
insert into MENUROLE (MID, RID)
values (4, 1);
insert into MENUROLE (MID, RID)
values (5, 26);
insert into MENUROLE (MID, RID)
values (2, 26);
insert into MENUROLE (MID, RID)
values (4, 26);
insert into MENUROLE (MID, RID)
values (3, 26);
insert into MENUROLE (MID, RID)
values (1, 26);
insert into MENUROLE (MID, RID)
values (31, 27);
insert into MENUROLE (MID, RID)
values (8, 27);
insert into MENUROLE (MID, RID)
values (23, 27);
insert into MENUROLE (MID, RID)
values (21, 27);
insert into MENUROLE (MID, RID)
values (15, 27);
insert into MENUROLE (MID, RID)
values (24, 27);
insert into MENUROLE (MID, RID)
values (19, 27);
insert into MENUROLE (MID, RID)
values (16, 27);
insert into MENUROLE (MID, RID)
values (20, 27);
insert into MENUROLE (MID, RID)
values (13, 27);
insert into MENUROLE (MID, RID)
values (14, 27);
insert into MENUROLE (MID, RID)
values (30, 27);
insert into MENUROLE (MID, RID)
values (26, 27);
insert into MENUROLE (MID, RID)
values (12, 27);
insert into MENUROLE (MID, RID)
values (6, 27);
insert into MENUROLE (MID, RID)
values (10, 27);
insert into MENUROLE (MID, RID)
values (18, 27);
insert into MENUROLE (MID, RID)
values (17, 27);
insert into MENUROLE (MID, RID)
values (9, 27);
insert into MENUROLE (MID, RID)
values (22, 27);
insert into MENUROLE (MID, RID)
values (5, 28);
insert into MENUROLE (MID, RID)
values (4, 28);
insert into MENUROLE (MID, RID)
values (11, 28);
insert into MENUROLE (MID, RID)
values (1, 28);
insert into MENUROLE (MID, RID)
values (2, 28);
insert into MENUROLE (MID, RID)
values (3, 28);
insert into MENUROLE (MID, RID)
values (3, 29);
insert into MENUROLE (MID, RID)
values (6, 29);
insert into MENUROLE (MID, RID)
values (4, 29);
insert into MENUROLE (MID, RID)
values (7, 29);
insert into MENUROLE (MID, RID)
values (11, 29);
insert into MENUROLE (MID, RID)
values (1, 29);
insert into MENUROLE (MID, RID)
values (2, 29);
insert into MENUROLE (MID, RID)
values (5, 29);
commit;
prompt 71 records loaded
prompt Loading TDICTIONARY...
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (11, '孙子', 6, '0');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (12, '孙女', 6, '0');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (1, '家庭类型', 0, '0');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (2, '单人', 1, '0');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (3, '双人', 1, '0');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (4, '三人', 1, '0');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (5, '三人以上', 1, '0');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (6, '家庭角色', 0, '0');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (7, '父亲', 6, '0');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (8, '母亲', 6, '0');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (9, '儿子', 6, '0');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (10, '女儿', 6, '0');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (17, '1', 0, '1');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (18, '1', 1, '1');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (19, '1', 17, '1');
insert into TDICTIONARY (DID, DNAME, DFATHERID, DDEL)
values (20, '1', 17, '1');
commit;
prompt 16 records loaded
prompt Loading TMENU...
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (1, '系统管理', null, 1, 0, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (6, '公告管理', null, 2, 0, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (2, '角色管理', 'rolecrud!rolelist.action', 1, 1, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (3, '菜单管理', 'menucrud!menulist.action', 2, 1, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (5, '用户管理', 'systemcrud!userlist.action', 3, 1, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (7, '总公告管理', 'noticecrud!noticelist.action', 1, 6, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (4, '数据字典', 'dictionarycrud!dictionarylist.action', 0, 1, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (12, '个人公告列表', 'noticecrud!personNoticeList.action', 2, 6, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (13, '个人管理', null, 3, 0, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (14, '小贴士设置', 'systemcrud!toTipPage.action', 1, 13, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (15, '内部邮件', null, 5, 0, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (16, '收件箱', 'eamilcrud!receieveEMail.action', 1, 15, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (17, '发件箱', 'eamilcrud!outboxlist.action', 2, 15, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (18, '垃圾箱', 'eamilcrud!queryGCEMail.action', 3, 15, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (19, '草稿箱', 'eamilcrud!queryDraftEMail.action', 5, 15, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (9, '写信', 'main/emailjsp/writeEMail.jsp', 4, 15, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (8, '基本信息修改', 'main/userjsp/userMessage.jsp', 2, 13, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (10, '修改密码', 'main/userjsp/updatePassword.jsp', 3, 13, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (11, '申请人管理', 'sendusercrud!sendUserList.action', 5, 1, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (25, '总家庭信息管理', 'familycrud!allFamilyList.action', 7, 13, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (20, '个人水费管理', 'watercrud!getPersonWater.action', 5, 26, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (21, '个人电费管理', 'electriccrud!personElecList.action', 6, 26, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (22, '个人家庭信息管理', 'familycrud!getAllFamilies.action', 6, 13, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (23, '合同管理', null, 6, 0, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (24, '个人房屋合同', 'contractcrud!getPersonContract.action', 1, 23, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (31, '个人房租管理', 'housecrud!getPersonHouse.action', 4, 26, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (26, '消费管理', null, 8, 0, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (27, '电费管理', 'electriccrud!electricmoneyList.action', 3, 26, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (28, '水费管理', 'watercrud!watermoneyList.action', 2, 26, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (29, '房屋合同管理', 'contractcrud!contractList.action', 2, 23, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (30, '账号基本信息', 'systemcrud!getUser.action', 4, 13, '0');
insert into TMENU (MID, MNAME, MURL, MORDER, MFATHERID, MISDEL)
values (32, '房租管理', 'housecrud!houseMlist.action', 1, 26, '0');
commit;
prompt 32 records loaded
prompt Loading TROLE...
insert into TROLE (RID, RNAME, RDETAIL, RISDEL)
values (28, '111', '1111', '1');
insert into TROLE (RID, RNAME, RDETAIL, RISDEL)
values (26, '123', '123', '1');
insert into TROLE (RID, RNAME, RDETAIL, RISDEL)
values (29, 'asd', '123123', '1');
insert into TROLE (RID, RNAME, RDETAIL, RISDEL)
values (1, '超级管理员', '这是超级管理员', '0');
insert into TROLE (RID, RNAME, RDETAIL, RISDEL)
values (27, '普通用户', '这个是普通用户', '0');
commit;
prompt 5 records loaded
prompt Loading TTIP...
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (22, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (24, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (29, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (32, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (17, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (19, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (21, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (28, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (1, '0', 100, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (23, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (26, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (31, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (16, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (18, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (20, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (27, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (30, '0', 30, '0', '0');
insert into TTIP (UIID, TSHOW, TTIME, TNORICE, TEMAIL)
values (33, '0', 30, '0', '0');
commit;
prompt 18 records loaded
prompt Loading TUSERFAMILY...
insert into TUSERFAMILY (UFID, UIID, UFROLE, UFMONEY, UFNAME, UFJOB, UFPHONE, UFIDCARD)
values (7, 1, 10, 2000.2, '测试2', '个体户', '2', '123456789123456789');
insert into TUSERFAMILY (UFID, UIID, UFROLE, UFMONEY, UFNAME, UFJOB, UFPHONE, UFIDCARD)
values (1, 1, 7, 3000, '测试1', '个体户', '1234567', '123456789123456789');
insert into TUSERFAMILY (UFID, UIID, UFROLE, UFMONEY, UFNAME, UFJOB, UFPHONE, UFIDCARD)
values (8, 16, 9, 2000, '陈伟达', '无业游民', '18106081991', '350206199109092019');
commit;
prompt 3 records loaded
prompt Loading TUSERINFO...
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (22, '3082F106', '888888', null, null, null, to_date('26-01-2014 20:54:11', 'dd-mm-yyyy hh24:mi:ss'), '2', '0', '0', '测试', 1033);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (24, '3082F108', '888888', null, null, null, to_date('26-01-2014 20:55:27', 'dd-mm-yyyy hh24:mi:ss'), '4', '0', '0', '测试', 332);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (29, '3082F205', '888888', null, null, null, to_date('26-01-2014 20:58:21', 'dd-mm-yyyy hh24:mi:ss'), '3', '0', '0', '测试', 442);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (32, '3082F208', '888888', null, null, null, to_date('26-01-2014 20:59:12', 'dd-mm-yyyy hh24:mi:ss'), '2', '0', '0', '测试', 113);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (1, 'superadmin', '888888', '494679975@qq.com', '厦门', '18106081991', to_date('11-11-2013', 'dd-mm-yyyy'), '2', '0', '0', '测试', 110);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (25, '3082F109', '888888', null, null, null, to_date('24-01-2014', 'dd-mm-yyyy'), '2', '0', '0', '测试', 44);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (19, '3082F103', '888888', null, null, null, to_date('26-01-2014 19:56:05', 'dd-mm-yyyy hh24:mi:ss'), '4', '0', '0', '测试', 45);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (17, '3082F101', '888888', null, null, null, to_date('31-12-2013 21:00:56', 'dd-mm-yyyy hh24:mi:ss'), '2', '0', '0', '测试', 5290.4);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (21, '3082F105', '888888', null, null, null, to_date('26-01-2014 20:53:34', 'dd-mm-yyyy hh24:mi:ss'), '5', '0', '0', '测试', 65);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (28, '3082F204', '888888', null, null, null, to_date('26-01-2014 20:57:59', 'dd-mm-yyyy hh24:mi:ss'), '5', '0', '0', '测试', 77.7);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (23, '3082F107', '888888', null, null, null, to_date('26-01-2014 20:55:05', 'dd-mm-yyyy hh24:mi:ss'), '4', '0', '0', '测试', 99.8);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (31, '3082F207', '888888', null, null, null, to_date('26-01-2014 20:58:59', 'dd-mm-yyyy hh24:mi:ss'), '3', '0', '1', '测试', .8);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (26, '3082F201', '888888', null, null, null, to_date('26-01-2014 20:57:14', 'dd-mm-yyyy hh24:mi:ss'), '3', '0', '0', '测试', 88.5);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (18, '3082F102', '888888', null, null, null, to_date('31-12-2013 21:03:56', 'dd-mm-yyyy hh24:mi:ss'), '2', '0', '0', '测试', 0);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (20, '3082F104', '888888', null, null, null, to_date('26-01-2014 20:53:12', 'dd-mm-yyyy hh24:mi:ss'), '3', '0', '1', '测试', .1);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (16, '3082F203', '888888', '494679975@qq.com', '厦门', '18106081991', to_date('20-12-2013 09:50:23', 'dd-mm-yyyy hh24:mi:ss'), '2', '0', '0', '测试', 2000);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (27, '3082F202', '888888', null, null, null, to_date('26-01-2014 20:57:45', 'dd-mm-yyyy hh24:mi:ss'), '3', '0', '0', '测试', 22);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (30, '3082F206', '888888', null, null, null, to_date('26-01-2014 20:58:41', 'dd-mm-yyyy hh24:mi:ss'), '2', '0', '0', '测试', 33);
insert into TUSERINFO (UIID, UIUSERNAME, UIPASSWORD, UIEMAIL, UIFROM, UIPHONE, UITIME, UIFAMILYTYPE, UIISDEL, UIISLOCK, UIREALNAME, UIMONEY)
values (33, '3082F209', '888888', null, null, null, to_date('26-01-2014 20:59:29', 'dd-mm-yyyy hh24:mi:ss'), '2', '0', '0', '测试', 11);
commit;
prompt 19 records loaded
prompt Loading USER_ROLE...
insert into USER_ROLE (RID, UIID)
values (1, 1);
insert into USER_ROLE (RID, UIID)
values (27, 29);
insert into USER_ROLE (RID, UIID)
values (27, 32);
insert into USER_ROLE (RID, UIID)
values (27, 22);
insert into USER_ROLE (RID, UIID)
values (27, 24);
insert into USER_ROLE (RID, UIID)
values (27, 21);
insert into USER_ROLE (RID, UIID)
values (27, 17);
insert into USER_ROLE (RID, UIID)
values (27, 19);
insert into USER_ROLE (RID, UIID)
values (27, 28);
insert into USER_ROLE (RID, UIID)
values (27, 23);
insert into USER_ROLE (RID, UIID)
values (27, 26);
insert into USER_ROLE (RID, UIID)
values (27, 31);
insert into USER_ROLE (RID, UIID)
values (27, 18);
insert into USER_ROLE (RID, UIID)
values (27, 20);
insert into USER_ROLE (RID, UIID)
values (27, 16);
insert into USER_ROLE (RID, UIID)
values (27, 27);
insert into USER_ROLE (RID, UIID)
values (27, 30);
insert into USER_ROLE (RID, UIID)
values (27, 33);
commit;
prompt 18 records loaded
set feedback on
set define on
prompt Done.
