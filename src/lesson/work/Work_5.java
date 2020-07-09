package lesson.work;

import java.util.ArrayList;
import java.util.Scanner;

//多态的使用
class ColaEmployee{
	
	protected String name;
	protected int brithday_month;
	
	
	public ColaEmployee(String name, int brithday_month) {
		this.name = name;
		this.brithday_month = brithday_month;
	}


	public double getSalary(int month) {
		return 0;
	};
}

class SalariedEmployee extends ColaEmployee{
	
	private int salary_month = 5000;
	
	public SalariedEmployee(String name, int brithday_month) {
		super(name,brithday_month);
	}
	
	public double getSalary(int month) {
		if(brithday_month == month) {
			return salary_month+100;
		}
		else {
			return salary_month;
		}
	};
	
}

class HourlyEmployee extends ColaEmployee{
	
	private int salary_hour = 13;
	private int working_hour;
	
	public HourlyEmployee(String name, int brithday_month, int working_hour){
		super(name, brithday_month);
		this.working_hour = working_hour;
	}
	
	public double getSalary(int month) {
		if(brithday_month == month) {
			if(working_hour > 160) {
				return 160 * salary_hour  + (working_hour - 160) * salary_hour * 1.5 + 100;
			}
			else {
				return working_hour * salary_hour + 100;
			}
		}
		else {
			if(working_hour > 160) {
				return 160 * salary_hour  + (working_hour - 160) * salary_hour * 1.5;
			}
			else {
				return working_hour * salary_hour;
			}
		}
	}
}

class SalesEmployee extends ColaEmployee{
	private int sales_amount;
	private double royalty_rate = 0.2;
	
	public SalesEmployee(String name, int brithday_month, int sales_num) {
		super(name, brithday_month);
		this.sales_amount = sales_num;
	}
	
	public double getSalary(int month) {
		if(brithday_month == month) {
			return sales_amount * royalty_rate + 100;
		}
		else {
			return sales_amount * royalty_rate;
		}
	}
}

class Company{
	public void printSalary(ColaEmployee employee, int month) {
		System.out.println(employee.name+"这个月的工资是：");
		System.out.println(employee.getSalary(month));
	}
}
public class Work_5 {

	public static void main(String[] args) {
		ArrayList<ColaEmployee> employees = new ArrayList<ColaEmployee>();
		employees.add(new SalariedEmployee("路人甲",12));
		employees.add(new SalariedEmployee("路人乙",2));
		employees.add(new HourlyEmployee("路人丙",8,175));
		employees.add(new HourlyEmployee("路人丁",10,149));
		employees.add(new SalesEmployee("路人戊",7,30000));
		employees.add(new SalesEmployee("路人己",6,42000));
		
		Company co = new Company();
		System.out.println("请输入月份：");
		int month = new Scanner(System.in).nextInt();
		for(ColaEmployee e : employees) {
			co.printSalary(e, month);
		}
	}
		
}
