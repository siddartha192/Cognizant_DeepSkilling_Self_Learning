import logo from './logo.svg';
import './App.css';
import FlightDetails from './FlightDetails.js'
import React, { useState }from "react";
import UserPage from './UserPage.js';
import GuestPage from './GuestPage.js';


function App() {
  const [ isLoggedIn, setIsLoggedIn] = useState(false);
  return (
    <div className="App">
      <h1>Ticket Booking Application </h1>

      {
        isLoggedIn ? 
          <UserPage logout={() => setIsLoggedIn(false)}/> 
          : 
          <GuestPage login={() => setIsLoggedIn(true)}/>
      }
    </div>
  );
}

export default App;
