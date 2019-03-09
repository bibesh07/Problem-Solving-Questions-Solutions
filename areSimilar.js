/*
  QUESTION : Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

  Given two arrays a and b, check whether they are similar.

  Example

  For a = [1, 2, 3] and b = [1, 2, 3], the output should be
  areSimilar(a, b) = true.
  
  SOLUTION:
*/

areSimilar = (a, b) => {
    if (a.length != b.length) return false;
    var difference = 0;
    for(var i =0; i<a.length;i++) {
        difference = (a[i] == b[i]) ? difference : difference+1;
    }
    a.sort((a,b) => b-a);
    b.sort((a,b) => b-a);
    
    return (difference <= 2 && a.toString() == b.toString()) ? true : false;
    
}
