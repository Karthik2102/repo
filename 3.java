package com.emailparser;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


public class EmailIdreader {

	private static  List getlist = null;
	public static void main(String[] args) throws Exception {

		ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
		engine.eval("load('E:/JavaScript.js')");

	}


	public static List NameParse(List emailid) {

		getlist =  new ArrayList();
		getlist = Arrays.asList(emailid);

		return emailid;

	}

}
