// import "./App.css";
import UserCard from "./UserCard";
import Experience from "./Experience";
import Header from "./components/Header";
import About from "./components/About";
import Contact from "./components/Contact";
import EffectCompontent from "./EffectCompontent";
import TrialContext from "./TrialContext";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import ContactUS from "./pages/contactus";
import AboutUs from "./pages/aboutus";
import ReactMomo from "./components/reactMomo";
import LazyLoad from "./components/lazyLoading";
import Memo from "./components/UseMemo";
import Debounce from "./components/Debouncing";
import { lazy, Suspense } from "react";
import Counter from "./pages/reduxPage";
import Product from "./components/ProductPage";

// const aboutUs = lazy(() => import("./pages/aboutus"));
// const contactUs = lazy(() => import("./pages/contactus"));

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
    // <div className="App">
    /* <div className="user-cards">
        {users.map((user, index) => (
          <UserCard key={index} user={user} />
        ))}
        <Experience />
      </div> */

    // <EffectCompontent />
    // <TrialContext />
    <BrowserRouter>
      {/* <Suspense fallback={<p> Please be calm page is loading......</p>}> */}
      <Routes>
        <Route path="/contactus" element={<ContactUS />} />
        <Route path="/aboutus" element={<AboutUs />} />
        <Route path="/reactmemo" element={<ReactMomo />} />
        <Route path="/lazyloading" element={<LazyLoad />} />
        <Route path="/usememo" element={<Memo />} />
        <Route path="/debounce" element={<Debounce />} />
        <Route path="/reduxComponent" element={<Counter />} />
        <Route path="/products" element={<Product />} />
      </Routes>
      {/* </Suspense> */}
    </BrowserRouter>
  );
}

export default App;
