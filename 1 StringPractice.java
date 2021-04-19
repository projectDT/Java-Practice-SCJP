package stringpractice;

public class StringPractice {

    public static void main(String[] args) {
        
	/*int a=10;//a=-10
        System.out.printf("%05d",a);*/
        
        /*float a=123.45f;//3.45f
        System.out.printf("%6.2f",a);*/
        
        String str="Java";
        System.out.printf("%20s",str);
		
        /*
        String str1="Java Program";
        System.out.println(str1);
        
        String str2=new String("JAVA");
        System.out.println(str2);
        
        char c[]={'H','e','l','l','o'};
        //String str3=new String(c);
        String str3=new String(c,1,3);
        System.out.println(str3);
        
        byte b[]={65,66,67,68};
        //String str4=new String(b);
        String str4=new String(b,1,2);
        System.out.println(str4);
        */
        
        String str1="Java";
        //String str2="Java";
        String str2=new String("Java");
        System.out.println(str1==str2);
		
		String str=new String("netbeans");
        
        /*
        //System.out.println(str.length());
        int len=str.length();
        System.out.println(len);*/
        
        
        /*String str2=str.toUpperCase();
        System.out.println(str2);*/
        
        
        /*str=str.trim();
        System.out.println(str);*/
        
        /*String str2=str.substring(3);
        System.out.println(str2);*/
        
        String str2=str.replace('e', 'M');
        //System.out.println(str2);
        
        System.out.println(str2+ " " +str);
		
		/*
        String str1="Mr. Arsh Sharma";
        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("Arsh" , 4));
        System.out.println(str1.endsWith("Sharma"));
        System.out.println(str1.charAt(4));
        
        for(int i=0;i<str1.length();i++)
            System.out.print(str1.charAt(i));
        */
        
        String str1="www.covid.co.in";
        System.out.println(str1.indexOf("."));
        System.out.println(str1.indexOf(".",4));
        System.out.println(str1.indexOf("covid"));
        System.out.println(str1.lastIndexOf("."));
		
		/*
        String str1="Pyramid";
        String str2="pyramid";
        
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        //System.out.println(str1==str2);
        */
        
        /*
        //String str1="pyramid";
        
        String str1="china wall";
        String str2=new String("china tall");
        
        //System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));
        */
        
        
        String str1="the great wall ";
        String str2="of china";
        System.out.println(str1.contains("wall"));
        System.out.println(str1.concat(str2));//System.out.println(str1 + str2);
		
		
        String str="programmer@gmail.com";
        //String str="programmer@hotmail.com";
      
		int i=str.indexOf("@");
		String uname=str.substring(0,i);
		String domain=str.substring(i+1, str.length());
		  
		System.out.println("Username :"+uname);
		System.out.println("Domain :"+domain);
		  
		int j=domain.indexOf(".");
		String name=domain.substring(0, j);
		System.out.println(name.equals("gmail"));
    }
    
}
