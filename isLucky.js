//QUESTION

//Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the
//digits is equal to the sum of the second half.

//Given a ticket number n, determine if it's lucky or not

//Example:
//For n = 1230, the output should be
//  isLucky(n) = true;

//SOLUTION

function isLucky(n) {
    let N = n.toString().split("");
    let sumFirst = 0;
    let sumSecond = 0;
    for(let i =0,j=N.length/2; i < N.length/2;i++) {
        sumFirst += parseInt(N[i]);
        sumSecond += parseInt(N[j]);  
        j++
    }
    return (sumFirst == sumSecond);
}
