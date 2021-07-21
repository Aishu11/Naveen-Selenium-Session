package SeleniumSessions;

public class CustomXPath_1 {

	public static void main(String[] args) {
		
		
		//X-Path - It is a function available in By Class
		//By. xpath("")
		//Xpath - Address of th element
		//Types:
		//1. Absolute: Parent to Child to Child, Hierrarchial
		///html/body/div[2]/div[3]/div[1]/ul/li/a 	
		
		//Disadvantage of Absolute Xpath - the hierarchy might get change
		
		//2. Relative/Custom: use with xpath functions, attributes
		
		//Formula: - Target to get the one of one and below is the formula
		
		//Model 1:
		//htmltag[@attributename = 'value']
		
		//In the below site
		//input[@id ='input-email']
		//input9@name='']
		//input[@type='submit']
		
		//Model 2: - using and and 2 attributes
		//htmltag[@att1 = 'value' and '@attr2 = 'value]
		//input[@type='text' and @name = 'email']
		
		//Model 3: - using or and 2 attributes
		//htmltag[@att1 = 'value' or '@attr2 = 'value]
		//input[@type='text' or @name = 'email']
		
		//Model 4: - using the other attributes when id is not available
		//input[@value = 'Login']
		
		//only for attribute we need to give @
		
		//Advanced Xpath: 
		//Model 5 : using text function - used for links, headers,span and labels
		//htmltag[text() = 'value']
		//h2[text() = 'New Customer'] - for header tag
		//a[text() = 'Login'] - for links
		
		//Model 6: using contains function - used with text and attribute
		//For Contains we shouldn't use '='. we need to use ','
		//Model 6.1: using contains with attribute
		//htmltag[contains(@id,'value')]
		//input[contains(@id,'input-email')] - This means show me the id that contains the value as input email
		//input[contains(@id,'input')]
		//input[contains(@id,'email')]
		
		//Dynamic Attributes(id)
		//<input firstname_123>
		//<input firstname_456>
		//<input firstname_789>
		//For the above case, we shall write as below.
		//input[contains(@id,'firstname_') 
		//pick the value that is context and complete with contains with 
		
		//Model 6.2: using contains with text function
		//htmltag[contains(text(),'value')]
		//h1[contains(text(), 'class customer')] 
		
		//Model 6.3: using combintaion of contains with attribute and contains with text
		//htmltag[contains[@attributename,'value'] and contains[text(),'value']
		//a[contains(text(), 'Freshcaller') and contains(@href,'source')]
		
		//Model 6.4 : using combinations of contains and attribute
		// One attribute with contains and other without contains
		//htmltag[@attriname = 'value' and contains(@attriname2, 'value')]
		//input[@type='submit' and contains(@value,'Login')]
		
		//Model 7: using startswith function - used with text and attribute
		//For starts-with we shouldn't use '='. we need to use ','
		//h2[starts-with(text(),'Refreshing')]
		
		//starts-with and contains can be user for any html tag.
		//We dont have 'Ends-with' tag
		
		//Model 7.1: combination fo starts with contains and simple attri-value
		//htmltag[starts-with(@attr ,'value) and contains(@attr,'value) and @attr = 'value']
		
		
		//INDEX:
		
	}

}
