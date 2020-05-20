import React, { useState } from 'react';
import { addOneDay, dateToString } from './dateUtils.js';

function DateIncrementer({ initialDate }) {
  const [date, setDate] = useState(initialDate);

  return (
    <div>
      <p>{dateToString(date)}</p>
      <button onClick={() => setDate(addOneDay)}>
        +1
      </button>
    </div>
  );
}

export default DateIncrementer;