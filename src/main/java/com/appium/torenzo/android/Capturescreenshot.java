package com.appium.torenzo.android;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.hamcrest.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import static TestNG.StaticVariable.screenshotName1;
	public class Capturescreenshot extends Generalfunctions
		{
		
		
       		public Capturescreenshot() throws IOException {
			super();
			// TODO Auto-generated constructor stub
		}

			public static String capture(String screenshotName) throws IOException
			{
				
					SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
					Date date = new Date();
				    screenshotName1 = sdf.format(date);
				    TakesScreenshot screenshot = (TakesScreenshot) driver;
				    File src=screenshot.getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(src, new File("./Screenshot/"+screenshotName1+".jpeg"));
					System.out.println("screenshot name is==>"+screenshotName1);
			
					return screenshotName1;
		
	
	   }
	
  }
		