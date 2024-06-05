export class Person{
 constructor(private firstName:string, private lastName:string){}
}

export class Employee extends Person{
    constructor(firstName:string,lastName:string, private salary:number){
        super(firstName,lastName)
    }
}


