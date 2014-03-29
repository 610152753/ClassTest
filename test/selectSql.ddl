//The sql statement don't need a delimiter(;), 
sql=select a1.empno,a1.job,a1.hiredate,a2.dname,a2.deptno from emp a1,dept a2 where a1.deptno = a2.deptno