export function ScoreBelow70({ players }) {
  let players70 = [];

  return (
    players.map((item) => {
      if (item.score <= 70) {
        players70.push(item);
      }
    }),
    <div>
      {players70.map((item) => (
        <li>
          Mr. {item.name} <span>{item.score}</span>
        </li>
      ))}
    </div>
  );
}