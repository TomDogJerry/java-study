-- 1.��ѯ����Ա����Ϣ����ѯԱ����ţ�Ա�����������ʣ�ְ�����ƣ�ְ������
	select 
	e.id,--Ա�����
	e.ename,--Ա������
	e.salary,--����
	j.jname,--ְ������
	j.description--ְ������
	from 
	emp e ,job j 
	where 
	e.job_id = j.id;
-- 2.��ѯԱ����ţ�Ա�����������ʣ�ְ�����ƣ�ְ���������������ƣ�����λ��
   	select 
	e.id,--Ա�����
	e.ename,--Ա������
	e.salary,--����
	j.jname,--ְ������
	j.description,--ְ������
	d.dname,--��������
	d.loc--����λ��
	from 
	emp e ,job j ,dept d
	where 
	e.job_id = j.id and e.dept_id = d.id;
-- 3.��ѯԱ�����������ʣ����ʵȼ�
	/*
	������
	1.Ա������������ emp ���ʵȼ� salarygrade
	2.������emp.salary >=salarygrade.losalary and emp.salary <=salarygrade.hisalary
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
-- 4.��ѯԱ�����������ʣ�ְ�����ƣ�ְ������ ���������ƣ�����λ�� �����ʵȼ�
	/*
	������
	1.Ա������������ emp��ְ�����ƣ�ְ������ job���������ƣ�����λ�� dept�����ʵȼ� salarygrade
	2.������emp.salary >=salarygrade.losalary and emp.salary <=salarygrade.hisalary
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
-- 5.��ѯ�����ű�š��������ơ�����λ�á���������
 /*
    ������
	1.���ű�š��������ơ�����λ�� dept���������� emp
	2.ʹ�÷����ѯ������emp.dept_id��ɷ��飬��ѯcount(id)
	3.ʹ���Ӳ�ѯ�����ڶ����Ĳ�ѯ�����dept����й�����ѯ
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
-- 6.��ѯ����Ա������������ֱ���ϼ�������,û���쵼��Ա��Ҳ��Ҫ��ѯ
/*
	������
	1.���� emp,ֱ���ϼ������� emp
	  *emp���id��mgr
	2.���� emp.id = emp.mgr
	3.��ѯ�����������ݺͽ�������
	  *ʹ���������Ӳ�ѯ
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