create table dept(
  deptno integer not null,
  dname  char(14),
  loc    char(13),
);
 
create table emp(
  empno    integer not null,
  ename    char(10),
  job      char(9),
  mgr      integer,
  hiredate date,
  sal      integer,
  comm     integer,
  deptno   integer,
 );
