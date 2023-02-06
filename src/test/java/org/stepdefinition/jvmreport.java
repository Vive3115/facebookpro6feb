package org.stepdefinition;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class jvmreport {
	
	
	public static void generatejvmreport(String jsonfile) {
		
		File f =new File("C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\Reports\\jvmreport");
		
		Configuration c = new Configuration(f, "Facebook Application");
		
		c.addClassifications("platform", "windows");
		c.addClassifications("jdk", "1.8");
		
		List<String> li=new ArrayList<String>();
	
		li.add(jsonfile);
		
		ReportBuilder r =new ReportBuilder(li, c);
		r.generateReports();
		
		
		
		
		
		

	}

}
