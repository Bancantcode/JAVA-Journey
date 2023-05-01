//Write a method that takes in a string and returns true if the string is a palindrome (i.e., reads the same forwards and backwards), and false otherwise.

public static boolean isPalindrome(String str) 
{
    String reversed = new StringBuilder(str).reverse().toString();
    return str.equals(reversed);
}
