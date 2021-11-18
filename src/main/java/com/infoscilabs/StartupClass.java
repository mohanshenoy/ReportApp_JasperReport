package com.infoscilabs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class StartupClass {
	  
	public static void main(String[] args) throws JRException {
		   
		   //String sourceFileName = "D://IDE//eclipse-jee-2021-03-R//eclipse//workspace-java//ReportApp_JasperReport//src//main//resources//EmployeeReport.jrxml";
		String sourceFileName = "D://IDE//eclipse-jee-2021-03-R//eclipse//workspace-java//ReportApp_JasperReport//src//main//resources//first_report.jrxml";
		   
		   //JRXML file needs to be compiled to generate .jasper
		    JasperReport jasperReport = JasperCompileManager.compileReport(sourceFileName);
		   
		   List<Employee> list = new ArrayList<Employee>();
		   list.add(new Employee("1","mohan","Software Engineer","mohan@gmail.com"));
		   list.add(new Employee("2","vinaya","Housemaker","vinaya@gmail.com")); 
		   list.add(new Employee("3","meghana","College Student","meghana@gmail.com")); 
		   list.add(new Employee("4","manya","School Student","manya@gmail.com")); 
		   list.add(new Employee("5","vinod","Business Mant","vinod@gmail.com")); 
		   list.add(new Employee("6","vandana","Housemaker","vandana@gmail.com")); 
		   list.add(new Employee("7","vineeth","School Student","vineeth@gmail.com")); 
		   list.add(new Employee("8","vanditha","School Student","vanditha@gmail.com")); 
		   
		   JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);
		   
		   Map<String,Object> params = new HashMap<String,Object>();
		   JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, dataSource);
		   
		   String pdfFile = "D://IDE//eclipse-jee-2021-03-R//eclipse//workspace-java//ReportApp_JasperReport//first_report.pdf";
		   String htmlFile = "D://IDE//eclipse-jee-2021-03-R//eclipse//workspace-java//ReportApp_JasperReport//first_report.html";
		   JasperExportManager.exportReportToPdfFile(jasperPrint,pdfFile);	
		   JasperExportManager.exportReportToHtmlFile(jasperPrint,htmlFile);

	   }
	}