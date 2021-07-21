package SeleniumSessions;

public class CustomCSS {

	public static void main(String[] args) {
		
		// Custom CSS
		//id - #{id}
		//class - .{classname}
		
		// If we have id or class we could desing Css for it
		
		//MODEL 1:
		//#id
		//.Classname
		//#input-email
		//input.form-control (tagname.classname)
		
		//MODEL 2:
		//We could with or without tag
		//tagname#id
		//tag.classname
		//input#input-email
		
		//MODEL 3:
		//We could combine both id and class name
		//tagname#id.classname
		//input#input-email.form-control (# for id and . for form control)
		//input.form-control#input-email
		
		//MODEL 4:
		//When multiple classes are available, then split it using
		//.cl.c2.c3...cn
		//input.form-control.private-form__control.login-email

	}

}
