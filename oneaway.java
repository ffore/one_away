import java.util.Objects;
import java.util.Scanner;

class oneaway{
	public static boolean checkRepl(String a, String b){
		if(Objects.equals(a, b)) return true;

		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) != b.charAt(i)){
				//System.out.println("i = " + i);
				if(i == a.length()-1){
					System.out.println("yuh");
					return true;
				}
				if(Objects.equals(a.substring(i+1, a.length()), b.substring(i+1, b.length()))){ 
					System.out.println(a.substring(i+1, a.length()) + "==" + b.substring(i+1, b.length()));
					return true;
				}
				else{
					return false;
				}
			}
		}
		return false;
	}

	public static boolean checkRemo(String a, String b){

		String l0ng;
		String sh0rt;
		if(a.length() > b.length()){
			l0ng = a;
			sh0rt = b;
		}
		else{
			l0ng = b;
			sh0rt = a;
		}
		
		//if l0ng is 1 or 2 chars, always return true
		if(l0ng.length() == 1 || l0ng.length() == 2){
			return true;
		}
		int size = l0ng.length();
		for(int i = 0; i < size; i++){
			if(i == sh0rt.length()-1 && l0ng.charAt(i) == sh0rt.charAt(i)){
				//example	long:	abcd
				//			short:	abc
				return true;
			}
			if(l0ng.charAt(i) != sh0rt.charAt(i)){
				StringBuilder sb = new StringBuilder(l0ng);
				sb.deleteCharAt(i);
				l0ng = sb.toString();
				if(Objects.equals(l0ng, sh0rt)) return true;
				else return false;
			}
		}
		return false;
	}

	public static void main(String[] args){
		String a;
		String b;

		Scanner sc = new Scanner(System.in);

		System.out.print("enter string 1: ");
		a = sc.nextLine();
		System.out.println("");
		System.out.print("enter string 2: ");
		b = sc.nextLine();
		System.out.println("");
		
		if(a.length() -b.length() == -1 || a.length() -b.length() == 1){
			System.out.println(checkRemo(a, b));
			return;
		}
		if(a.length() == b.length()){
			System.out.println(checkRepl(a, b));
			return;
		}
		else{
			System.out.println("false");
			return;
		}
	}
}

