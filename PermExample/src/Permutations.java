import java.util.ArrayList;


public class Permutations
{
	public static ArrayList<String> permutations(String word)
	{
		ArrayList<String> result = new ArrayList<String>();
		
		//Base case
		if(word.length() == 1)
			{
				result.add(word);
				return result;
			}
		else
			{
				//Loop through all character positions
				for(int i=0; i < word.length();i++)
				{
					//Form a shorter word by removing the ith character
					String shorter = word.substring(0, i) + word.substring(i + 1);
					
					//Generate all permutations of the simpler word
					ArrayList<String> shorterPermutations = permutations(shorter);
					
					for(String s : shorterPermutations)
						{
							result.add(word.charAt(i) + s);
						}
				}
				return result;
			}
	}

}
