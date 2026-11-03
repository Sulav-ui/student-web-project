// import Fundamental from "./Rough/Fundamental";
import State from "./Rough/State";
import UserCard from "./Rough/UserCard";

function App() {
  return (
    <>
      <div>
        <h1>Hello, World!</h1>
        <h2>Welcome to React Typescript!</h2>
        <UserCard name="Sulav" age={30} />
        <State />
      </div>
    </>
  );
}

export default App;
