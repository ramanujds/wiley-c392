let arr = [10,20,30,40];

// spread and rest

let arr2 = [1,2,...arr]

// console.log(arr2)

// Rest

let [ emelement1 , ...others ] = arr;

// console.log(emelement1,others);

let average = function(...values){
    return values.reduce((a,b)=>a+b)/values.length;
}

console.log(average(10,25,30,40));
