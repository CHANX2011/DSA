package session2;
public class mainprgm {
	    public static boolean isPalindrome(String s) {
	        int left = 0;
	        int right = s.length() - 1;
     while (left < right) {
	            if (s.charAt(left) != s.charAt(right)) {
	                return false; 
	            }
	           left++;
	            right--;
	        }
	        return true; 
	    }
	    public static void main(String[] args) {
	        String input = "madam";
        if (isPalindrome(input)) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");

	        }

	    }

	}

