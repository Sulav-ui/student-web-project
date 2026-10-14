// Arrow function to display number
const displayNumber = () => {
  for (let i = 1; i <= 10; i++) {
    console.log(i);
  }
};
displayNumber();

// Normal function to display number
function display() {
  for (let i = 1; i <= 10; i++) {
    console.log("Normal function", i);
  }
}
display();

// Event Listener in a button mouseover
let button = document.getElementById("btn");
button.addEventListener("mouseover", () => {
  alert(" You've done mouse over the button!!!!");
});

// Event Listener in a button Onclick
let button1 = document.getElementById("btn1");
button1.addEventListener("click", () => {
  alert("You've clicked the button !!!");
});
