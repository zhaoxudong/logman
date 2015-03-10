package me.gteam.logman.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import java.io.Writer;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class GenerateStrutsConfigFile {
	
	public static void main(String[] args) {
		/**
		 * string is the action name and it should be modified manual
		 */
		String string = "bankdeposit";
		String string1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
		+"<!DOCTYPE struts PUBLIC\n"
		+"\t\"-//Apache Software Foundation//DTD Struts Configuration 2.1.7//EN\"\n"
		+"\t\"http://struts.apache.org/dtds/struts-2.1.7.dtd\">\n"	
		+"<struts>\n"
	  	+"\t<package name=\""+string+"\" namespace=\"/\" extends=\"struts-default\">\n"
	  	+"\t\t<action name=\""+string+"Action_*\"  method=\"{1}\" class=\"me.gteam.logman.struts2.action."+String.valueOf((char)(string.charAt(0)-32))+string.substring(1)+"Action\">\n"
	  	+"\t\t\t<result name=\"\">/jsp/order/addOrder.jsp</result>\n"
	  	+"\t\t</action>\n"	
	  	+"\t</package>\n"
	  	+"</struts>\n";
		System.out.println(string1);
		File file=new File("D:\\java\\workload\\logman\\config\\struts2\\struts-"+string+".xml");
		try {
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(string1);
			bufferedWriter.close();fileWriter.close();
			SAXReader saxReader = new SAXReader();
			File file2 = new File("D:\\java\\workload\\logman\\config\\struts.xml");
			try {
				Document document = saxReader.read(file2);
				Element element = document.getRootElement();
				System.out.println(element.toString());
				Element element2 = element.addElement("include");
				element2.addAttribute("file","struts2/struts-"+string+".xml");
//				XMLWriter writer = new XMLWriter( new OutputStreamWriter(new FileOutputStream("D:\\java\\workload\\logman\\config\\struts.xml"),"UTF-8"));
//				XMLWriter writer = new XMLWriter(new FileWriter(file2));
//				writer.write(document);
//				writer.close();
				Writer writer = new FileWriter(file2);
	            OutputFormat format= OutputFormat.createPrettyPrint();//格式化
	            XMLWriter xmlWriter = new XMLWriter(writer,format);
	            xmlWriter.write(document);
	            xmlWriter.close();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
