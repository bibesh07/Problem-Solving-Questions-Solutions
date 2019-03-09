/*
  QUESTION: Given a string, find out if its characters can be rearranged to form a palindrome.

  Example

  For inputString = "aabb", the output should be
  palindromeRearranging(inputString) = true.

  We can rearrange "aabb" to make "abba", which is a palindrome.
  
  SOLUION:
*/

palindromeRearranging = (inputString) => {
    var oddOccurance =0;
    var split = inputString.split("");
    var uniqueSet = new Set(split);
    if (uniqueSet.size == 1) return true;
    
    uniqueSet.forEach(a => {
        if (split.filter(x => x == a).length % 2 != 0) {
            if(++oddOccurance > 1) {
                return false;
            }
        }
    }); 
    return (oddOccurance <= 1);
}
