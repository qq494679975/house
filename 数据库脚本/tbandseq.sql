-----------------------------------------
-- Export file for user HOUSE          --
-- Created by DA on 2014/4/5, 16:11:23 --
-----------------------------------------

spool tbandseq.log

prompt
prompt Creating table MENUROLE
prompt =======================
prompt
create table MENUROLE
(
  MID NUMBER(12),
  RID NUMBER(12)
)
;
alter table MENUROLE
  add constraint m_r_fk
  check ("RID" IS NOT NULL);
alter table MENUROLE
  add constraint r_m_fk
  check ("MID" IS NOT NULL);
create index index_mid on MENUROLE (MID);
create index index_menu on MENUROLE (RID);

prompt
prompt Creating table TCONTRACT
prompt ========================
prompt
create table TCONTRACT
(
  CID          NUMBER(12),
  UIID         NUMBER(12),
  CMESSAGE     CLOB,
  CBEGINTIME   DATE,
  CBOSS        VARCHAR2(10),
  CUSER        VARCHAR2(10),
  CONTRACTYEAR VARCHAR2(3)
)
;
alter table TCONTRACT
  add constraint TCONTRACT_pk primary key (CID);
alter table TCONTRACT
  add constraint TCONTRACT_check
  check ("CID" IS NOT NULL);
create index index_TCONTRACT_uiid on TCONTRACT (UIID);

prompt
prompt Creating table TDICTIONARY
prompt ==========================
prompt
create table TDICTIONARY
(
  DID       NUMBER(12),
  DNAME     VARCHAR2(30),
  DFATHERID NUMBER(12),
  DDEL      VARCHAR2(2)
)
;
alter table TDICTIONARY
  add constraint TDICTIONARY_pk primary key (DID);
alter table TDICTIONARY
  add constraint TDICTIONARY_check
  check ("DID" IS NOT NULL);

prompt
prompt Creating table TELECTRICMONEY
prompt =============================
prompt
create table TELECTRICMONEY
(
  EMID       NUMBER(12),
  UIID       NUMBER(12),
  EMTIME     DATE,
  EMUSERTIME DATE,
  EMMONEY    NUMBER(12,1),
  EMNUM      NUMBER(11,1)
)
;
alter table TELECTRICMONEY
  add constraint TELECTRICMONEY_pk primary key (EMID);
alter table TELECTRICMONEY
  add constraint TELECTRICMONEY_check
  check ("EMID" IS NOT NULL);
create index TELECTRICMONEY_index_uiid on TELECTRICMONEY (UIID);

prompt
prompt Creating table TEMAIL
prompt =====================
prompt
create table TEMAIL
(
  EID        NUMBER(12),
  ETITLE     VARCHAR2(1000),
  EMESSAGE   CLOB,
  ETIME      DATE,
  EHASATTACH VARCHAR2(1),
  EFROMUSER  VARCHAR2(20),
  ETOUSER    VARCHAR2(500)
)
;
alter table TEMAIL
  add constraint TEMAIL_pk primary key (EID);
alter table TEMAIL
  add constraint TEMAIL_check
  check ("EID" IS NOT NULL);

prompt
prompt Creating table TEMAILATTACH
prompt ===========================
prompt
create table TEMAILATTACH
(
  EAID   NUMBER(12),
  EID    NUMBER(12),
  EANAME VARCHAR2(100),
  EAURL  VARCHAR2(100)
)
;
alter table TEMAILATTACH
  add constraint TEMAILATTACH_pk primary key (EAID);
alter table TEMAILATTACH
  add constraint TEMAILATTACH_check
  check ("EAID" IS NOT NULL);
create index TEMAILATTACH_indexn on TEMAILATTACH (EID);

prompt
prompt Creating table THOUSEMONEY
prompt ==========================
prompt
create table THOUSEMONEY
(
  HMID      NUMBER(12) not null,
  UIID      NUMBER(12),
  HMTIME    DATE,
  HUSERTIME DATE,
  HMMONEY   NUMBER(4)
)
;
alter table THOUSEMONEY
  add constraint THOUSEMONEY_pk primary key (HMID);

prompt
prompt Creating table TMENU
prompt ====================
prompt
create table TMENU
(
  MID       NUMBER(12),
  MNAME     VARCHAR2(100),
  MURL      VARCHAR2(200),
  MORDER    NUMBER(12),
  MFATHERID NUMBER(12),
  MISDEL    VARCHAR2(1)
)
;
alter table TMENU
  add constraint TMENU_pk primary key (MID);
alter table TMENU
  add constraint TMENU_check
  check ("MID" IS NOT NULL);

prompt
prompt Creating table TNOTICE
prompt ======================
prompt
create table TNOTICE
(
  NNOTICEID  NUMBER(12),
  UIID       NUMBER(12),
  TUUIID     NUMBER(12),
  NTITLE     VARCHAR2(30),
  NTEXT      CLOB,
  NRELESTIME DATE,
  NPASSTIME  DATE,
  NOUTTIME   DATE,
  NISTOP     VARCHAR2(1),
  NHASATTACH VARCHAR2(1),
  ISPASS     VARCHAR2(1)
)
;
alter table TNOTICE
  add constraint TNOTICE_pk primary key (NNOTICEID);
alter table TNOTICE
  add constraint TNOTICE_check
  check ("NNOTICEID" IS NOT NULL);
create index TNOTICE_index1 on TNOTICE (TUUIID);
create index TNOTICE_index2 on TNOTICE (UIID);

prompt
prompt Creating table TNOTICEATTACH
prompt ============================
prompt
create table TNOTICEATTACH
(
  NAATTACHID NUMBER(12),
  NNOTICEID  NUMBER(12),
  NANAME     VARCHAR2(100),
  NAURL      VARCHAR2(100)
)
;
alter table TNOTICEATTACH
  add constraint TNOTICEATTACH_pk primary key (NAATTACHID);
alter table TNOTICEATTACH
  add constraint TNOTICEATTACH_check
  check ("NAATTACHID" IS NOT NULL);
create index TNOTICEATTACH_index1 on TNOTICEATTACH (NNOTICEID);

prompt
prompt Creating table TROLE
prompt ====================
prompt
create table TROLE
(
  RID     NUMBER(12),
  RNAME   VARCHAR2(20),
  RDETAIL VARCHAR2(2000),
  RISDEL  VARCHAR2(1)
)
;
alter table TROLE
  add constraint TROLE_pk primary key (RID);
alter table TROLE
  add constraint TROLE_rid
  check ("RID" IS NOT NULL);

prompt
prompt Creating table TSENDUSER
prompt ========================
prompt
create table TSENDUSER
(
  SUID       NUMBER(12),
  SUUSERNAME VARCHAR2(10),
  SUPHONE    VARCHAR2(11),
  SUMESSAGE  VARCHAR2(3500),
  SUSTATUS   VARCHAR2(1),
  SUTIME     DATE,
  SUPASSTIME DATE,
  UIID       NUMBER(12)
)
;
alter table TSENDUSER
  add constraint TSENDUSER_pk primary key (SUID);
alter table TSENDUSER
  add constraint TSENDUSER_check
  check ("SUID" IS NOT NULL);

prompt
prompt Creating table TTIP
prompt ===================
prompt
create table TTIP
(
  UIID    NUMBER(12),
  TSHOW   VARCHAR2(1),
  TTIME   NUMBER(5),
  TNORICE VARCHAR2(1),
  TEMAIL  VARCHAR2(1)
)
;
create index TTIP_index on TTIP (UIID);

prompt
prompt Creating table TUSEREMAIL
prompt =========================
prompt
create table TUSEREMAIL
(
  UMID      NUMBER(12),
  EID       NUMBER(12),
  UIID      NUMBER(12),
  UMADDRESS VARCHAR2(2),
  UMISREAD  VARCHAR2(1)
)
;
alter table TUSEREMAIL
  add constraint TUSEREMAIL_pk primary key (UMID);
alter table TUSEREMAIL
  add constraint TUSEREMAIL_check
  check ("UMID" IS NOT NULL);
create index TUSEREMAIL_index_eid on TUSEREMAIL (EID);
create index TUSEREMAIL_index_uiid on TUSEREMAIL (UIID);

prompt
prompt Creating table TUSERFAMILY
prompt ==========================
prompt
create table TUSERFAMILY
(
  UFID     NUMBER(12),
  UIID     NUMBER(12),
  UFROLE   NUMBER(12),
  UFMONEY  NUMBER(12,1),
  UFNAME   VARCHAR2(10),
  UFJOB    VARCHAR2(30),
  UFPHONE  VARCHAR2(11),
  UFIDCARD VARCHAR2(18)
)
;
alter table TUSERFAMILY
  add constraint TUSERFAMILY_pk primary key (UFID);
alter table TUSERFAMILY
  add constraint TUSERFAMILY_ufid
  check ("UFID" IS NOT NULL);
create index TUSERFAMILY_index_uiid on TUSERFAMILY (UIID);

prompt
prompt Creating table TUSERINFO
prompt ========================
prompt
create table TUSERINFO
(
  UIID         NUMBER(12),
  UIUSERNAME   VARCHAR2(12),
  UIPASSWORD   VARCHAR2(12),
  UIEMAIL      VARCHAR2(30),
  UIFROM       VARCHAR2(40),
  UIPHONE      VARCHAR2(20),
  UITIME       DATE,
  UIFAMILYTYPE VARCHAR2(1),
  UIISDEL      VARCHAR2(2),
  UIISLOCK     VARCHAR2(1),
  UIREALNAME   VARCHAR2(12),
  UIMONEY      NUMBER(12,1) default 0
)
;
alter table TUSERINFO
  add constraint TUSERINFO_pk primary key (UIID);
alter table TUSERINFO
  add constraint TUSERINFO_check
  check ("UIID" IS NOT NULL);

prompt
prompt Creating table TUSERNOTICE
prompt ==========================
prompt
create table TUSERNOTICE
(
  UIID      NUMBER(12),
  NNOTICEID NUMBER(12),
  IDREAD    NUMBER(1)
)
;
create index TUSERNOTICE_uiid on TUSERNOTICE (UIID);
create index TUSERNOTICE_nno on TUSERNOTICE (NNOTICEID);

prompt
prompt Creating table TWATERMONEY
prompt ==========================
prompt
create table TWATERMONEY
(
  WMID       NUMBER(12),
  UIID       NUMBER(12),
  WMTIME     DATE,
  WMUSERTIME DATE,
  WMMONEY    NUMBER(12,1),
  WMNUM      NUMBER(11,1)
)
;
alter table TWATERMONEY
  add constraint TWATERMONEY_pk primary key (WMID);
alter table TWATERMONEY
  add constraint TWATERMONEY_check_wmid
  check ("WMID" IS NOT NULL);
create index USER_ROLE_index_uiid on TWATERMONEY (UIID);

prompt
prompt Creating table USER_ROLE
prompt ========================
prompt
create table USER_ROLE
(
  RID  NUMBER(12),
  UIID NUMBER(12)
)
;
alter table USER_ROLE
  add constraint USER_ROLE_check_rid
  check ("RID" IS NOT NULL);
alter table USER_ROLE
  add constraint USER_ROLE_check_uiid
  check ("UIID" IS NOT NULL);
create index USER_ROLE_index_uuid on USER_ROLE (UIID);
create index USER_ROLE_index_rid on USER_ROLE (RID);

prompt
prompt Creating sequence SEQ_ATTACH
prompt ============================
prompt
create sequence SEQ_ATTACH
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_DICTIONRY
prompt ===============================
prompt
create sequence SEQ_DICTIONRY
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_ELEC
prompt ==========================
prompt
create sequence SEQ_ELEC
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_EMAIL
prompt ===========================
prompt
create sequence SEQ_EMAIL
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_EMAILATTACH
prompt =================================
prompt
create sequence SEQ_EMAILATTACH
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_EMAILSTATUS
prompt =================================
prompt
create sequence SEQ_EMAILSTATUS
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_FAMILY
prompt ============================
prompt
create sequence SEQ_FAMILY
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_HOUSEMONEY
prompt ================================
prompt
create sequence SEQ_HOUSEMONEY
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_MENU
prompt ==========================
prompt
create sequence SEQ_MENU
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_NOTICE
prompt ============================
prompt
create sequence SEQ_NOTICE
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_ROLE
prompt ==========================
prompt
create sequence SEQ_ROLE
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_SENDUSER
prompt ==============================
prompt
create sequence SEQ_SENDUSER
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_TCONTRACT
prompt ===============================
prompt
create sequence SEQ_TCONTRACT
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_USER
prompt ==========================
prompt
create sequence SEQ_USER
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;

prompt
prompt Creating sequence SEQ_WATER
prompt ===========================
prompt
create sequence SEQ_WATER
minvalue 1
maxvalue 9999999999999999999999999999
start with 1000
increment by 1
cache 20;


spool off
