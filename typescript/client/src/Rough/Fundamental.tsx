import UserCard from "./UserCard";

// Basic Data Types
let a: number = 10;
let b: string = "Hello";
let c: boolean = true;

// Arrays
let numbers: number[] = [1, 2, 3, 4, 5];
let strings: string[] = ["apple", "banana", "cherry"];
let usersData: { name: string; age: number } = {
  name: "Alice",
  age: 25,
};

//Alias
type User = {
  name: string;
  age: number;
};

const user: User = {
  name: "Bob",
  age: 30,
};

// Interface
export interface Student {
  name: string;
  age?: number;
}
const student: Student = {
  name: "Charlie",
  age: 20,
};
const student1: Student = {
  name: "Charlie",
};

//Union Types
let unionVar: string | number;
unionVar = "Hello";
unionVar = 42;

const Fundamental = () => {
  return (
    <>
      {console.log("Number:", a)}
      {console.log("String:", b)}
      {console.log("Boolean:", c)}
      {console.log("Numbers Array:", numbers)}
      {console.log("Strings Array:", strings)}
      {console.log("User Data:", usersData)}
      {console.log("User Alias:", user)}
      {console.log("Student Interface:", student)}
      {console.log("Student Interface with optional age:", student1)}
      {console.log("Union Variable:", unionVar)}
      <UserCard name={student1.name} age={student1.age} />
    </>
  );
};

export default Fundamental;
