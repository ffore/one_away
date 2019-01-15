import java.util.Objects;

class oneaway{
	public static boolean checkRepl(String a, String b){
		if(Objects.equals(a, b)) return false;

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

	public static void main(String[] args){
		System.out.println(checkRepl("daniel","dadiel"));
	}
}
