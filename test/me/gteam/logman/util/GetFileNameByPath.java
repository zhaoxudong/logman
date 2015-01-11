package me.gteam.logman.util;

import java.io.File;

public class GetFileNameByPath {
	
	public static void main(String[] args) {
		File file=new File("C:\\java\\workloads\\logman\\src\\me\\gteam\\logman\\domain");
		 String test[];
		 test=file.list();
		 for(int i=0;i<test.length;i++)
		 {
			 if(test[i].endsWith("l"))
			 System.out.println("<mapping resource="+"\"me/gteam/logman/domain/"+test[i]+"\" />");
		 } 
	}
}
