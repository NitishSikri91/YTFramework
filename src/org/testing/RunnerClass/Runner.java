package org.testing.RunnerClass;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


public class Runner {

	public static void main(String[] args) throws BiffException, IOException {
		
		XmlSuite xs = new XmlSuite();
		xs.setName("Suite1");
		XmlTest xt = new XmlTest(xs);
		File f = new File("C:\\Users\\Nitish\\Desktop\\Workspace\\Learning Tracker\\InputExcel1.xls");
			Workbook wb = Workbook.getWorkbook(f);
		Sheet S = wb.getSheet(0);
		int num_rows = S.getRows();
		System.out.println("Number of TC are" + num_rows);
		ArrayList<XmlClass> AL = new ArrayList<XmlClass>();
		
		for(int i=1;i<num_rows;i++)
		{
			Cell cell = S.getCell(4,i); /// getcell (Colno, Rowno)
			if(cell.getContents().equals("Y"))
			{Cell pkg = S.getCell(2, i);
				Cell Cls_name = S.getCell(3,i);	
				String str = pkg.getContents()+"."+ Cls_name.getContents();
				XmlClass xc = new XmlClass(str);
				AL.add(xc);
			}		
		}
		System.out.println(AL.size()); // Sixe 
		xt.setClasses(AL);
		ArrayList<XmlTest> AL1 = new ArrayList<XmlTest>();
		AL1.add(xt);
		xs.setTests(AL1);
		ArrayList<XmlSuite> AL2 = new ArrayList<XmlSuite>();
		AL2.add(xs);
		TestNG t = new TestNG();
		t.setXmlSuites(AL2);
		t.run();
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
