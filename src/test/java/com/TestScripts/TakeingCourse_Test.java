package com.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.SkillRary.genericlib.BaseClass;
import com.SkillRary.genericlib.Propertylib;
import com.SkillRary.genericlib.Utilies;
import com.SkillRary.pomrepository.pages.Course;
import com.SkillRary.pomrepository.pages.GotoCourse;
import com.SkillRary.pomrepository.pages.Home;
import com.SkillRary.pomrepository.pages.Login;
import com.SkillRary.pomrepository.pages.TakeThisCourse;

public class TakeingCourse_Test extends BaseClass {
	@Test
	public void takeingCourse() throws FileNotFoundException, InterruptedException, IOException
	{
		Login l=new Login(driver);
		l.logincredentials(Propertylib.getpropertydata("email"),Propertylib.getpropertydata("password"));
	    Home h=new Home(driver);
	    h.courseSerach(Propertylib.getpropertydata("coursename"));
	    Course c=new Course(driver);
	    c.seleniumAssignment();
	   
	    TakeThisCourse t=new TakeThisCourse(driver);
	    t.takeCourse();
	    Utilies.select(t.getCountrydd(),Propertylib.getpropertydata("counrty"));
	   Utilies.select(t.getStatesdd(),Propertylib.getpropertydata("state"));
	 t.getSumbitbtn();
	    
	    GotoCourse g=new GotoCourse(driver);
	    g.gotoCourseBtn();
	   
	}

}
