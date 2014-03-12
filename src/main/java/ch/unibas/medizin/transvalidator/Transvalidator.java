package ch.unibas.medizin.transvalidator;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.tools.ToolProvider;

import com.google.web.bindery.requestfactory.apt.ValidationTool;

public class Transvalidator {

	public static void main(String[] args) throws IOException {

		List<String> javacOpts = new LinkedList<String>();
		javacOpts.add("-source");
		javacOpts.add("1.6");
		javacOpts.add("-target");
		javacOpts.add("1.6");
		
		ValidationTool.exec(args, ToolProvider.getSystemJavaCompiler(), javacOpts);
	}

}
