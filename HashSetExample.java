//Santiago, Bryan Aaron B. | ICT-101

import java.util.*;

public class HashSetExample
{
   static void Consonants()
   {
	String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
	Set<String> consonantsSet = new HashSet<>(Arrays.asList(consonants));
	System.out.println(consonantsSet);
   }
   public static void main(String[] args)
   {
	   Consonants();
   }
}