Given a string s, return the longest possible palindromic string in s.


var longestPalindrome = function(s) {
    let ans = "";
    let reverseAns = "";
    let oddString = "";
    let hashTable = {};
    
    for (let i=0; i<s.length; i++) {
        hashTable[s[i]] = hashTable[s[i]] !== undefined ? ++hashTable[s[i]] : 1; 
    }
    
    let allKeys = Object.keys(hashTable);
    for (let i =0; i< allKeys.length; i++) {
        let noOfRepetition = hashTable[allKeys[i]];

        if (noOfRepetition % 2 !== 0) {
            noOfRepetition = noOfRepetition - 1;
            if (oddString === "") {
                oddString = allKeys[i];
            }
        }

        for (let j=0;j<noOfRepetition/2;j++) {
            ans += allKeys[i];
            reverseAns = allKeys[i] + reverseAns ;
        }
    }
    
    return ans + oddString + reverseAns;
};
