package test_task14;

class MyRegex {
	String pattern;

	MyRegex() {
		String s = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
		pattern = s + "." + s + "." + s + "." + s;

	}
}