/*
  QUESTION : You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find the minimal number of moves required to obtain a strictly increasing sequence from the input.

  Example

  For inputArray = [1, 1, 1], the output should be
  arrayChange(inputArray) = 3.
  
  SOLUTION:
*/

function arrayChange(inputArray) {
    var count = 0;
    for (var i =1;i < inputArray.length;i++) {
        if (inputArray[i] <= inputArray[i-1]) {
            var prevValue = inputArray[i];
            inputArray[i] = inputArray[i-1] + 1;
            count += Math.abs(inputArray[i] - prevValue);
        }
    }
    
    return count;
}
