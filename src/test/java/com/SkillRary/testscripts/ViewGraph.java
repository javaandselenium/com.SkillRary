package com.SkillRary.testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SkillRary.genericlib.BaseClass;
import com.SkillRary.genericlib.Propertylib;
import com.SkillRary.pomrepository.pages.Home;
import com.SkillRary.pomrepository.pages.Login;

public class ViewGraph extends BaseClass{
	@Test
	public void graph() throws FileNotFoundException, InterruptedException, IOException
	{
		test=reports.createTest("ViewGraph");
		
		Login l=new Login(driver);
		l.logincredentials(Propertylib.getpropertydata("email"),Propertylib.getpropertydata("password"));
		Home h=new Home(driver);
		h.graph();
		h.generate();
		Assert.assertEquals(h.getHundredper(),Propertylib.getpropertydata("hundredper"));
	}

}
