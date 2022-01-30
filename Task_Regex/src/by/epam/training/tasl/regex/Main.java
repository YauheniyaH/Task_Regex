package by.epam.training.tasl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String input = "ahb acb aeb aeeb adcb axeb";
		Pattern pattern = Pattern.compile("a.b");
		Matcher matcher = pattern.matcher(input);
		while (matcher.find())
			System.out.println(matcher.group());

		String input2 = "aba aca aea abba adca abea";
		Pattern pattern2 = Pattern.compile("a..a");
		Matcher matcher2 = pattern2.matcher(input2);
		while (matcher2.find())
			System.out.println(matcher2.group());
		
		
		String input3 = "aa aba abba abbba abca abea";
		Pattern pattern3 = Pattern.compile("ab+a");
		Matcher matcher3 = pattern3.matcher(input3);
		while (matcher3.find())
			System.out.println(matcher3.group());
	}

}
