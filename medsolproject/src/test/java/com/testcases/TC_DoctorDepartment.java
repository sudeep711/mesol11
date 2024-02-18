package com.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseTest;
import com.pages.Page_DoctorDepartment;
import com.pages.Page_Doctors;
import com.pages.Page_dDelete;
import com.pages.Page_dEdit2;
import com.pages.Page_login;

public class TC_DoctorDepartment{ 

BaseTest base=new BaseTest();
	@BeforeTest(groups="reg")
	public  void  url_lunch() throws IOException {
		base.setup();
	}
	
	@Test(priority=1,groups="reg")
		
	public void login()	throws InterruptedException {
		Page_login log =new Page_login(base.getdriver());
		log.login();

	}
	
		
@Test
(priority=2,groups="reg")
public void DoctorDept() throws Exception {
	Page_DoctorDepartment doctorDept= new Page_DoctorDepartment(base.getdriver());
	doctorDept.doctordepartmentTest();
}


@Test(priority=4)
	public void dEdit() throws InterruptedException {
	Page_dEdit2 edit=new Page_dEdit2(base.getdriver()) ;
	edit.editTest();
}
	
	@Test
	(priority=3)
	public void dDelete() throws InterruptedException {
		Page_dDelete det=new Page_dDelete(base.getdriver());
	det.dDelete();
	
				
	
		
	}
}

	


