spool a.log
drop user &1 cascade;
create user &1 identified by &2;
grant connect,resource to &1;
conn &1/&2;
@@tbandseq.sql
@@datas.sql

spool off;
exit;