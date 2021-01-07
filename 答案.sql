-- 1.查询所有员工信息。查询员工编号，员工姓名，工资，职务名称，职务描述
	select 
	e.id,--员工编号
	e.ename,--员工姓名
	e.salary,--工资
	j.jname,--职务名称
	j.description--职务描述
	from 
	emp e ,job j 
	where 
	e.job_id = j.id;
-- 2.查询员工编号，员工姓名，工资，职务名称，职务描述，部门名称，部门位置
   	select 
	e.id,--员工编号
	e.ename,--员工姓名
	e.salary,--工资
	j.jname,--职务名称
	j.description,--职务描述
	d.dname,--部门名称
	d.loc--部门位置
	from 
	emp e ,job j ,dept d
	where 
	e.job_id = j.id and e.dept_id = d.id;
-- 3.查询员工姓名，工资，工资等级
	/*
	分析：
	1.员工姓名，工资 emp 工资等级 salarygrade
	2.条件：emp.salary >=salarygrade.losalary and emp.salary <=salarygrade.hisalary
	emp.salary between salarygrade.losalary and salarygrade.hisalary
	*/
	select 
	e.ename,
	e.salary,
	s.grade
	from 
	emp e ,salarygrade s
	where
	e.salary between s.losalary and s.hisalary;
-- 4.查询员工姓名，工资，职务名称，职务描述 ，部门名称，部门位置 ，工资等级
	/*
	分析：
	1.员工姓名，工资 emp，职务名称，职务描述 job，部门名称，部门位置 dept，工资等级 salarygrade
	2.条件：emp.salary >=salarygrade.losalary and emp.salary <=salarygrade.hisalary
	emp.salary between salarygrade.losalary and salarygrade.hisalary
	*/
	select 
	e.ename,
	e.salary,
	j.jname,
	j.description,
	d.dname,
	d.loc,
	s.grade
	from 
	emp e ,job j ,dept d ,salarygrade s
	where
	e.dept_id = d.id
	and
	e.job_id = j.id
	and e.salary between s.losalary and s.hisalary;
-- 5.查询出部门编号、部门名称、部门位置、部门人数
 /*
    分析：
	1.部门编号、部门名称、部门位置 dept，部门人数 emp
	2.使用分组查询，按照emp.dept_id完成分组，查询count(id)
	3.使用子查询，将第二步的查询结果和dept表进行关联查询
 */
	select 
	d.id,d.dname,d.loc,e.total
	from 
	dept d,
	(select dept_id,count(id) total
	from emp
	group by dept_id) e
	
	where
	d.id = e.dept_id;
-- 6.查询所有员工的姓名及其直接上级的姓名,没有领导的员工也需要查询
/*
	分析：
	1.姓名 emp,直接上级的姓名 emp
	  *emp表的id和mgr
	2.条件 emp.id = emp.mgr
	3.查询左表的所有数据和交集数据
	  *使用左外连接查询
*/
/*	select
	e1.ename,e1.mgr,e2.id,e2.ename
	from emp e1,emp e2
	where e1.mgr = e2.id;
*/	
	select
	e1.ename,e1.mgr,e2.id,e2.ename
	from emp e1
	left join emp e2
	on e1.mgr = e2.id;