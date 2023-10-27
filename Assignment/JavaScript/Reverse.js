/*A. Take a sentence as an input and reverse every word in that sentence. Example - This is a sunny day > shiT si a ynnus yad.*/
function reverseWord(string,substr){
    return string.split(substr).reverse().join(substr)
}
let string = "This is a sunny day"
let string1 = reverseWord(string,"")
let string2 = reverseWord(string1," ")
console.log(string2);