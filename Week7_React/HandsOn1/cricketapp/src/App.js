import React from "react";
import { ListOfPlayers } from "./Components/ListOfPlayers";
import { ScoreBelow70 } from "./Components/ScoreBelow70";
import { OddPlayers } from "./Components/OddPlayers";
import { EvenPlayers } from "./Components/EvenPlayers";
import { ListOfIndianPlayers } from "./Components/ListOfIndianPlayers";
import { IndianPlayers } from "./Components/PlayersData";

function App() {
  const players = [
    { name: "Jack", score: 50 },
    { name: "Michael", score: 70 },
    { name: "John", score: 40 },
    { name: "Ann", score: 61 },
    { name: "Elisabeth", score: 61 },
    { name: "Sachin", score: 95 },
    { name: "Dhoni", score: 100 },
    { name: "Virat", score: 84 },
    { name: "Jadeja", score: 64 },
    { name: "Raina", score: 75 },
    { name: "Rohit", score: 80 },
  ];

  const flag = true;

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListOfPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <ScoreBelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <div>
          <h1>Indian Team</h1>
          <h1>Odd Players</h1>
          <OddPlayers IndianTeam={IndianPlayers} />
          <hr />
          <h1>Even Players</h1>
          <EvenPlayers IndianTeam={IndianPlayers} />
        </div>
        <hr />
        <div>
          <h1>List of Indian Players Merged:</h1>
          <ListOfIndianPlayers IndianPlayers={IndianPlayers} />
        </div>
      </div>
    );
  }
}

export default App;