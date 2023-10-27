// B. Perform sorting of an array in descending order.
let arr = [5, 6, 1, 7, 3, 2, 4];
let temp;

for(let i=0; i<arr.length; i++) {
    // console.log('i is', arr[i] )
    for(let j=0; j<arr.length; j++){
        // console.log('j is' , arr[j] ) 
        if(arr[i]>arr[j]){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        } 
    }
}
console.log(arr);