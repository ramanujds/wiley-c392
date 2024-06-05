// array de-structuring

let arr = ['Karan','Kumar','Sharma'];

// const firstName = arr[0]
// const middleName = arr[1]
// const lastName = arr[2]

let [lastName] = arr;

console.log(lastName);

// object de-structuring

const person ={
    pname:'Rohit',
    email:'rohit@yahoo.com',
    age:25
}

const {email} = person;

console.log(email);

