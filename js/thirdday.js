console.log("One");
console.log("Two");
console.log("API CALLL");
console.log("Three");
console.log("Four");

//Async Funtion
setTimeout(() => {
  console.log("API CALLL");
}, 2000);

// Call back function
function greet(name, callback) {
  console.log("Hello " + name);

  setTimeout(() => {
    callback();
  }, 2000);
}

function sayGoodbye() {
  console.log("Goodbye!");
}

greet("John", sayGoodbye);

console.log("Welcome to JavaScript");

// Promise
const promiseExample = new Promise((resolve, reject) => {
  let paymentCompleted = true;
  if (paymentCompleted) {
    resolve("Your payment process has been completed");
  } else reject(" Your payment menthod declined");
});
console.log(promiseExample);

// then and catch to handle promise rejection and fulfill
promiseExample
  .then((message) => {
    console.log("Success: ", message);
  })
  .catch((error) => {
    console.log(error);
  })
  .finally(() => {
    console.log("Your payment has been processed");
  });

// async example and using try catch
function getUser() {
  return new Promise((resolve) => {
    setTimeout(() => {
      console.log("use fetch successfully");
      resolve({ id: 101, name: "Sulav" });
    }, 2000);
  });
}

async function asyncExample() {
  try {
    console.log("Loading....");
    const data = await getUser();
    console.log(" Username: ", data.name);
  } catch (error) {
    console.log(error);
  }
}
asyncExample();

// geting data from api using fetch
async function getUserData() {
  try {
    const data = await fetch("https://jsonplaceholder.typicode.com/posts");
    const response = await data.json();
    console.log(response);
  } catch (error) {
    console.log(error);
  }
}
getUserData();
