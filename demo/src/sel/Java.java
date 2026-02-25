package sel;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hello world";
		
		String arr[]=s.split(" ");
		String newarr="";
		
		for(String fin:arr) {
			for(int i=fin.length()-1;i>=0;i--) {
				char c=fin.charAt(i);
				newarr=newarr+c;
			}
			newarr+=" ";
		}
		System.out.println(newarr);
		

	}

}
