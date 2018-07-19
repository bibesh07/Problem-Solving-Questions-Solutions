# Problem-Solving-Questions-Solutions

# Q.Given the string, check if it is a palindrome.

#Example

//For inputString = "aabaa", the output should be
//checkPalindrome(inputString) = true;

//A =>
  def checkPalindrome(inputString):
    return (inputString[::-1] == inputString);
