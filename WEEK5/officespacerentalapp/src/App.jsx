import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import office from './assets/office.jpg'

function App() {
   const offices = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: office
    },
    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Bangalore",
      Image: office
    },
    {
      Name: "SmartWorks",
      Rent: 65000,
      Address: "Hyderabad",
      Image: office
    }
  ];

  return (
    <div className="App">

      <h1>Office Space , at Affordable Range</h1>

      {
        offices.map((item, index) => (

          <div key={index}>

            <img
              src={item.Image}
              alt="Office Space"
              width="25%"
              height="25%"
            />

            <h2>Name: {item.Name}</h2>

            <h3
              style={{
                color: item.Rent <= 60000 ? "red" : "green"
              }}
            >
              Rent Rs. {item.Rent}
            </h3>

            <h3>Address: {item.Address}</h3>

            <br />

          </div>

        ))
      }

    </div>
  );

}

export default App
