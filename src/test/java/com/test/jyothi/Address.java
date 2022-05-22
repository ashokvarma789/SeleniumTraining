package com.test.jyothi;

public class Address {

	public static void main(String[] args) {
          String ADD1 = "HOM";
          String ADD2 = "OFF";
          String ADD3 = "WRk";
          String ADD4 = "FAx";
          
          switch ("FAX" ) {
          
          case "HOM": 
            System.out.println("Home Phone Number ");
          break;
          case "OFF":
        	 System.out.println("Mobile phone");
        	 break;
          case "WRk": 
              System.out.println("Office Phone Number ");
            break;
          case "FAX": 
              System.out.println("fax Number ");
            break;
        	 
        default:
        	System.out.println("Please give valid input");
          
          }
          
          
          
          
          
	}

}
