/*
  QUESTION: An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

  Given a string, find out if it satisfies the IPv4 address naming rules.

  Example

  For inputString = "172.16.254.1", the output should be
  isIPv4Address(inputString) = true;

  For inputString = "172.316.254.1", the output should be
  isIPv4Address(inputString) = false.

  316 is not in range [0, 255].
  
  SOLUTION : 
*/

function isIPv4Address(inputString) {
    var intArr = [];
    var charArray = inputString.split(".");
    if (charArray.length != 4) return false;
    charArray.forEach(x => {
        if (x.search("[a-zA-Z]") == -1) {
            intArr.push(parseInt(x));
        }
    });
    return intArr.filter(x => x < 256).length == 4
}