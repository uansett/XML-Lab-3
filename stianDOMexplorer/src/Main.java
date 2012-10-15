
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Main {
	

	public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, TransformerConfigurationException, SAXException{
		DocumentBuilderFactory factory =
				DocumentBuilderFactory
				.newInstance();
		
		DocumentBuilder parser =
				factory.newDocumentBuilder();
		if(args.length < 1) return;
		Document doc =
				parser.parse(new File(args[0]));
		
		Navigator nav = new Navigator(doc.getDocumentElement());
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String input = "";
		while(!input.equals("quit")){
			
			input = in.readLine();
			switch(input){
			case "up": 
				nav.up(); 
				break;
			case "show": 
				System.out.println(nav.show()); 
				break;
			case "child":
				System.out.print("enter a child number: ");
				nav.child(in.read());
				break;
			}
			
			
			
		}
		return;
	}

}
