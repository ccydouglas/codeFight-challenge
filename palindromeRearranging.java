/**
Given a string, find out if its characters can be rearranged to form a palindrome.

Example

For inputString = "aabb", the output should be
palindromeRearranging(inputString) = true.

We can rearrange "aabb" to make "abba", which is a palindrome.
**/



boolean palindromeRearranging(String inputString) {
if(inputString.length()==1){
    return true;
}

        Hashtable<Character, Integer> htable = new Hashtable<Character, Integer>(); 
    
    for(int i=0; i<inputString.length();i++){
        if(htable.containsKey(inputString.charAt(i))){
    
	int count = htable.get(inputString.charAt(i));

		// increment the key's value by 1
		htable.put(inputString.charAt(i), count + 1);
            
        }else{
            htable.put(inputString.charAt(i),1);
        }
    }
  
          int count=0;
    
        for (Integer rep : htable.values())  {
            if(rep%2!=0){
                count++;
            }
        }
    
    
    System.out.print(count);
    
    if(count>1){
        return false;
    }else{
        return true;
    }
   
}
