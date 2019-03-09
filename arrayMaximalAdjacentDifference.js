/*
  QUESTION: Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.

Example

For inputArray = [2, 4, 1, 0], the output should be
arrayMaximalAdjacentDifference(inputArray) = 3.

SOLUTION:
*/

arrayMaximalAdjacentDifference = (inputArray) => {
    var maxDiff = 0;
    for (var i =1;i<inputArray.length;i++) {
        let diff = Math.abs(inputArray[i] - inputArray[i-1]);
        maxDiff = (maxDiff < diff) ? diff : maxDiff;
    }
    
    return maxDiff;
}
