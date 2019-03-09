/*
  Question: Write a function that reverses characters in (possibly nested) parentheses in the input string.

  Input strings will always be well-formed with matching ()s.
  
  Example: For inputString = "(bar)", the output should be reverseInParentheses(inputString) = "rab";
  
  SOLUTION:
*/

reverseInParentheses = (inputString) => {
    while(inputString.indexOf('(') != -1) {
        var startIndex = inputString.lastIndexOf('(');
        var endIndex = inputString.indexOf(')', startIndex);
        var reverse = inputString.slice(startIndex+1, endIndex).split("").reverse();
        inputString = inputString.substring(0, startIndex) + reverse.join("") + inputString.substring(endIndex+1, inputString.length);
    }
    
    return inputString;
}
