jest.mock('./dateUtils');

import React from 'react';
import { render, fireEvent } from '@testing-library/react';
import { dateToString, addOneDay } from './dateUtils';
import DateIncrementer from './DateIncrementer';

test('renders initial date', () => {
  dateToString.mockReturnValue("mockDateString");

  const date = new Date(2020, 0, 1);
  const { getByText } = render(<DateIncrementer initialDate={date} />);
  const dateElement = getByText("mockDateString");

  expect(dateToString).toHaveBeenCalledWith(date);
  expect(dateElement).toBeInTheDocument();
});

test('updates correctly when clicking the "+1" button', () => {
  const mockDate = new Date(2021, 6, 7);
  addOneDay.mockReturnValueOnce(mockDate);

  const date = new Date(2020, 0, 1);
  const { getByText } = render(<DateIncrementer initialDate={date} />);
  const button = getByText("+1");

  fireEvent.click(button);

  expect(addOneDay).toHaveBeenCalledWith(date);
  expect(dateToString).toHaveBeenCalledWith(mockDate);
});
