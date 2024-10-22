package Assigenment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondAssignment {
	public static void main(String[] args) {
        
		String input = "Hdjsh gasghgdsdsgh2123d hjsdg sdhk 01242023 idf32432 32423 d34234jh dfh";
        
		String datePattern = "(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])(\\d{4})";

        Pattern pattern = Pattern.compile(datePattern);
        
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            
        	String date = matcher.group();
            
            System.out.println("Found valid date: " + date);
        }
    }
}