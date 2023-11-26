package org.reports;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenrateReportsClass1 extends BaseClass{
	
		

		public static void genrate(String json) {
			File file =new File("target");
			Configuration c = new Configuration(file, "XYZ WEBPAGE");
			c.addClassifications("user", "Harish");
			c.addClassifications("platform", "Windows_Photon Eclipse");
			List<String> li=new LinkedList<String>();
			li.add(json);
			
			
			ReportBuilder r =new ReportBuilder(li,c);
			
		}

}
