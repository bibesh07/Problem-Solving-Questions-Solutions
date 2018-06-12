//QUESTION:
		Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence
  	by removing no more than one element from the array.

//EXAMPLE:

	For sequence = [1, 3, 2, 1], the output should be
	almostIncreasingSequence(sequence) = false;

	There is no one element in this array that can be removed in order to get a strictly increasing sequence.

	For sequence = [1, 3, 2], the output should be
	almostIncreasingSequence(sequence) = true.

	You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly					increasing sequence [1, 3].
	
	SOLUTION:
	function almostIncreasingSequence(sequence) {
  	return answer(sequence);
	}

	function answer(array) {
		const newArray = JSON.stringify(array);
		for(var i=0;i<array.length;i++) {
			var tempArray = JSON.parse(newArray);
			tempArray.splice(i,1);
			if(reduce_this(tempArray)) {
				return true;
			}
		}
		return false;
	}

	 function reduce_this(array) {
		 for(var i=0;i<array.length-1;i++) {
			 console.log(array[i]+ " > " + array[i+1]);
			 if(array[i] >= array[i+1]) {
				 return false;
			 }
		 } 
		 return true;
	 }

//This function works as well
//function reduce_this(arr) {
//  const yes = arr.reduce((acc, x, i) => {
//        if (i==0) return acc;
//        return acc + (arr[i]>arr[i-1]?0:1);
//    }, 0);
//    return yes == 0;
//}
