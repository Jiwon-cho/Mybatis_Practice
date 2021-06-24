package com.emp.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//lombok-> 데이터 저장용 클래스의 생성자, getter,setter,toString, hascode, equals
//자동으로 만들어주는 라이브러리
//lombok 은 클래스 선언부에 어노테이션을 설정하여 구현됨.
@Data
//getter,setter,toString,hashCode,equals,기본 생성자
@AllArgsConstructor
//전체 맴버변수의 매개변수 있는 생성자
@NoArgsConstructor//기본생성자
@Getter
@Setter
@Builder
public class Employee {

	private String emp_Id;
	private String emp_Name;
	private String emp_No;
	private String email;
	private String phone;
	private String dept_Code;
	private String job_Code;
	private String sal_Level;
	private int Salary;
	private double bonus;
	private String manager_Id;
	
}
