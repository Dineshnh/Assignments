import { useState } from 'react';

const Todos = () => {
  const [items, setItems] = useState([]);
  const [text, setText] = useState('');
  const [filter, setFilter] = useState('all');

  const addItem = () => {
    if (text.trim() === '') return;
    setItems((prev) => [
      ...prev,
      { id: Date.now(), text, done: false, deleted: false },
    ]);
    setText('');
  };

  const toggleDone = (id) => {
    setItems((prev) =>
      prev.map((item) =>
        item.id === id ? { ...item, done: !item.done } : item
      )
    );
  };

  const deleteItem = (id) => {
    setItems((prev) =>
      prev.map((item) => (item.id === id ? { ...item, deleted: true } : item))
    );
  };

  const filteredItems = items.filter((item) => {
    if (filter === 'all') return true;
    if (filter === 'active') return !item.done;
    if (filter === 'done') return item.done;
  });

  return (
    <div>
      <h2> My Todos</h2>
      <input
        type="text"
        value={text}
        placeholder="Write something here"
        onChange={(e) => setText(e.target.value)}
      />
      <button onClick={addItem}>Add</button>
      <hr />
      <button onClick={() => setFilter('all')}>All</button>
      <button onClick={() => setFilter('active')}>Active</button>
      <button onClick={() => setFilter('done')}>Done</button>

      {filteredItems.map((item) => (
        <li
          key={item.id}
          style={{
            textDecoration: item.deleted ? 'line-through' : 'none',
            opacity: item.deleted ? 0.5 : 1,
          }}
        >
          <input
            type="checkbox"
            checked={item.done}
            onChange={() => toggleDone(item.id)}
            disabled={item.deleted}
          />
          {item.text}
          <button onClick={() => deleteItem(item.id)}>X</button>
        </li>
      ))}
      <hr />
      <p>{items.filter((item) => !item.done && !item.deleted).length} left</p>
      <button onClick={() => setItems([])}>Clear</button>
    </div>
  );
};

export default Todos;
