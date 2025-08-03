import React, { useState } from "react";
import "./App.css";

function App() {
  const [count, setCount] = useState(5);
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("");

  const handleWelcome = () => {
    alert("welcome");
  };

  const handleClick = () => {
    alert("I was clicked");
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    alert("Hello! Member1");

    const amt = parseFloat(amount);
    const curr = currency.trim().toLowerCase();

    if (!isNaN(amt) && curr === "euro") {
      const converted = Math.round(amt * 80);
      alert(`Converting to Euro Amount is ${converted}`);
    }
  };

  return (
    <div className="container">
      <p>{count}</p>

      <div className="button-stack">
        <button onClick={() => setCount(count + 1)}>Increment</button>
        <button onClick={() => setCount(count - 1)}>Decrement</button>
        <button onClick={handleWelcome}>Say welcome</button>
        <button onClick={handleClick}>Click on me</button>
      </div>

      <h1 className="title">Currency Convertor!!!</h1>

      <form onSubmit={handleSubmit}>
        <div className="row">
          <label htmlFor="amount">Amount:</label>
          <input
            type="text"
            id="amount"
            value={amount}
            onChange={(e) => setAmount(e.target.value)}
          />
        </div>

        <div className="row">
          <label htmlFor="currency">Currency:</label>
          <textarea
            id="currency"
            rows="1"
            value={currency}
            onChange={(e) => setCurrency(e.target.value)}
          />
        </div>

        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default App;