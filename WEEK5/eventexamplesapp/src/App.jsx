import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import heroImg from './assets/hero.png'
import './App.css'
import CurrencyConvertor from './CurrencyConvertor.jsx'

function App() {
  const [count,setCount]=useState(0);
  const increment=()=>{
        setCount(count+1);
    }

    const decrement=()=>{
        setCount(count-1);
    }

    const sayHello=()=>{
        alert("Hello Member");
    }

    const multiple=()=>{
        increment();
        sayHello();
    }

    const welcome=(msg)=>{
        alert(msg);
    }

    const clickMe=()=>{
        alert("I was clicked");
    }

 
   


    

    return(
          <>
        <div>

            <h2>{count}</h2>

            <button onClick={multiple}>Increment</button>

            <br/><br/>

            <button onClick={decrement}>Decrement</button>

            <br/><br/>

            <button onClick={()=>welcome("Welcome")}>
                Say Welcome
            </button>

            <br/><br/>

            <button onClick={clickMe}>
                Click on me
            </button>

            <hr/>

            <CurrencyConvertor/>

        </div>

    </>
  )
}

export default App
