import React, { useState } from "react";

function CurrencyConvertor() {

    const [amount, setAmount] = useState("");
    const [currency, setCurrency] = useState("");

    const handleSubmit = () => {

        const euro = amount / 90;

        alert("Converting to Euro Amount is " + euro);

        setCurrency("Euro");
    };

    return (

        <div>

            <h1 style={{color:"green"}}>Currency Convertor!!!</h1>

            Amount :
            <input
                value={amount}
                onChange={(e)=>setAmount(e.target.value)}
            />

            <br/><br/>

            Currency :
            <input value={currency} readOnly/>

            <br/><br/>

            <button onClick={handleSubmit}>
                Submit
            </button>

        </div>

    );

}

export default CurrencyConvertor;