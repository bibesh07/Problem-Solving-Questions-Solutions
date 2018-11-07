//QUESTION:
//Given two strings, find the number of common characters between them.

//Example:
//For s1 = "aabcc" and s2 = "adcaa", the output should be
//  commonCharacterCount(s1, s2) = 3.

//Strings have 3 common characters - 2 "a"s and 1 "c".

//SOLUTION:

function commonCharacterCount(s1, s2) {
    let char1 = s1.split("");
    let char2 = s2.split("");
    let tempArray = [];
    for(var i = 0; i <char1.length;i++) {
        for(var j = 0; j <char2.length;j++) {
            if(char1[i] == char2[j]) {
                tempArray.push(char1[i]);
                char2.splice(j, 1);
                break;
            }
        }
    }
    
    return tempArray.length;
}


//ALTERNATIVELY
function commonCharacterCount(s1, s2) {
    for(let i = 0; i<s1.length;i++) {
        s2 = s2.replace(s1[i], '!');
    }
    
    return s2.split("").filter(u => u == '!').length;
}

