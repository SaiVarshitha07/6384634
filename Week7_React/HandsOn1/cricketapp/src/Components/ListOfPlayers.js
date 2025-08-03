export function ListOfPlayers({ players }) {
  return (
    <div>
      {players.map((item) => {
        return (
          <div>
            <li>
              Mr. {item.name} <span>{item.score}</span>
            </li>
          </div>
        );
      })}
    </div>
  );
}