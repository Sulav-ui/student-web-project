// Verifiying age and licence
let age = 22;
let hasLicense = true;

if (age >= 18) {
  if (hasLicense) {
    console.log("You can drive");
  } else {
    console.log("You need a driving license");
  }
} else {
  console.log("You are too young to drive");
}

// for of example
let names = ["Abc", "def", "ghi"];

for (let name of names) {
  console.log(name);
}

let movie = {
  name: "Harry Porter",
  releaseYear: 1999,
};

for (let key in movie) {
  console.log(key, movie[key]);
}
