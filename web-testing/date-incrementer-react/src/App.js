import React, { useState } from 'react';
import DateIncrementer from './DateIncrementer.js';

function App() {
  const [today] = useState(new Date());

  return (
    <main>
      <DateIncrementer initialDate={today} />
    </main>
  );
}

export default App;
