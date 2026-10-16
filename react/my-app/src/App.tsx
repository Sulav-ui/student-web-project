import "./App.css";
import UserCard from "./UserCard";
import Experience from "./Experience";
import Header from "./components/Header";
import About from "./components/About";
import Contact from "./components/Contact";

function App() {
  // const users = [
  //   {
  //     Name: "Sulav",
  //     Email: "sulav@gmail.com",
  //     Username: "sulav123",
  //   },
  //   {
  //     Name: "Sulav",
  //     Email: "sulav@gmail.com",
  //     Username: "sulav123",
  //   },
  //   {
  //     Name: "Sulav",
  //     Email: "sulav@gmail.com",
  //     Username: "sulav123",
  //   },
  // ];
  return (
    <div className="App">
      {/* <div className="user-cards">
        {users.map((user, index) => (
          <UserCard key={index} user={user} />
        ))}
        <Experience />
      </div> */}
      <div className="app-container">
        <Header />
        <main>
          <About />
          <Experience />
          <Contact />
        </main>
      </div>
    </div>
  );
}

export default App;
