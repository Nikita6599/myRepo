package Demo;

public class StringDemo {

	

	public static void main(String[] args) {
		String s1="Hello ";
		String s2="Hello";
		String s3="World";
		StringBuffer sb=new StringBuffer("Hello");
		String s4="This is a demo of trim method";
		System.out.println(s1.equals(s2));
		System.out.println(sb.capacity());
		sb.delete(0,2);
		sb.replace(2, 5,"hey");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
        int ch=s1.indexOf('H');
		System.out.println(ch);
        String s5=s1.concat(s3);
        System.out.println(s5);
        String s6=s1.replaceAll("Hello","Bello");
        System.out.println(s6);
        System.out.println(s4.trim());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.contains("Hel"));
        
        
	} 

}
