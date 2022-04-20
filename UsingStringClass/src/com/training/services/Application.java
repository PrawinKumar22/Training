package com.training.services;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int key  = 6;
		
		StringService service = new StringService();
		
		String city = "CHENNAI";
		
		System.out.println(String.format("%s",city));
		
		System.out.println(String.format("%3$.4f%2$.3f%1$.2f",100.456,200.4567,300.56789));
		
		switch(key) {
		
		case 1:
			
			service.stringEquals("ram","ram");
			
			break;
			
		case 2:
			
			service.stringObjectEquals();
			
			break;
			
		case 3:
			
			service.usingTrim("ramesh");
			
			break;
			
		case 4:
			
			service.lengthOfString("ramesh");
			
			break;
			
		case 5:
			
			service.usingSubString("Happy Morning");
			
			break;
			
		case 6:
			
			service.usingCharAtAndIndexOf("ram@abc.com");
			
			break;
			
		case 7:
			
			service.usingReplace("ramesh.com","Welcome to Chennai");
			
			break;
			
		case 8:
			
			service.usingContact("Hello","Chennai");
			
			break;		
			
		case 9:
			
			service.usingCompareTo("A","B");
			
			break;
			
		case 10:
			
			service.usingStringFormat("ram",45.298);
			
			break;
			
		case 11:
			
			service.usingStringFormat(88);
			
			break;
			
		case 12:
			
			service.usingStringFormat(16,16);
			
			break;
			
		case 13:
			
			service.usingStringFormat("ram","ram");
			
			break;
			
		case 14:
			
			service.usingStringFormat(985L);
			
			break;
			
		default:
			
			break;
				
		}
		

	}

}
