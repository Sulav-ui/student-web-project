// import Fundamental from "./Rough/Fundamental";
import Form from "./Component/Form/Form";
import State from "./Rough/State";
import UserCard from "./Rough/UserCard";
import UserState from "./UseState/useStates";

function App() {
  return (
    <>
      <div>
        <h1>Hello, World!</h1>
        <h2>Welcome to React Typescript!</h2>
        <UserCard name="Sulav" age={30} />
        <State />
        <Form />
        <UserState />
      </div>
    </>
  );
}

export default App;
