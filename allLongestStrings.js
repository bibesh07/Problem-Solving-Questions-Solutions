//QUESTION:
//Given an array of strings, return another array containing all of its longest strings.

//EXAMPLE:
//For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
//allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

//SOLUTION:

allLongestStrings = (inputArray) => {
    let maxLen = inputArray.sort((a,b) => b.length -a.length)[0].length;
    return inputArray.filter(u => u.length == maxLen);
}
