package llenadoOntologia;


import virtuoso.jena.driver.*;

import org.apache.jena.query.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class ConsultasCompany {
	
public static void main(String []args) throws Exception{
		
		VirtGraph set = new VirtGraph("company","jdbc:virtuoso://50.18.123.50:1111","dba","dba");
		
		FileReader file = new FileReader("ConsultaCompany.txt");
		
		
		BufferedReader reader = new BufferedReader(file);
		
	    String s = reader.readLine();
		
	    ResultSet results = queryFactory.runQuery(s, "company");
	
	    while( results.hasNext()){
	    	QuerySolution soln = results.nextSolution();
	    	
	    	System.out.println(soln);
	    	//System.out.println(soln.getLiteral("municipio") + " " + soln.getLiteral("sector") + " " soln.get(arg0));
	    	
	    }
					
				
	}

}
