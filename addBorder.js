/*
 QUESTION: Given a rectangular matrix of characters, add a border of asterisks(*) to it.

  Example

  For

  picture = ["abc",
             "ded"]
  the output should be

  addBorder(picture) = ["*****",
                        "*abc*",
                        "*ded*",
                        "*****"]
                        
  SOLUTION:
*/

addBorder = (picture) => {
    var startEnd = "*".repeat(picture[0].length + 2);
    return [
        startEnd,
        ...picture.map(x => "*" + x + "*"),
        startEnd
    ]
}
