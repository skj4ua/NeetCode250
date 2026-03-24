package neetcode250;

public class ValidPalindrome {

	    public boolean isPalindrome(String s) {
	    String news="";
	    for(int i=0;i<s.length();i++){
	        int n = s.charAt(i);
	        if(n>=48 &&n<=57)return false;
	        
	        if(n>=65 && n<=90 || n>=97 && n<=122){
	             news+=s.charAt(i);
	        }
	       }
	       news=news.toLowerCase();
	        String revs="";

	       for(int i=news.length()-1;i>=0;i--){
	            revs+=news.charAt(i);
	       }
	        System.out.println(news);
	       System.out.println(revs);

	    return news.equals(revs);
	    }
}
