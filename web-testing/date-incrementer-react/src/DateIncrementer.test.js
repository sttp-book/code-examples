import React from 'react';
import { render, fireEvent } from '@testing-library/react';
import DateIncrementer from './DateIncrementer';

test('renders initial date', () => {
  const { getByText } = render(<DateIncrementer initialDate={new Date(2020, 0, 1)} />);
  const dateElement = getByText("2020-01-01");
  expect(dateElement).toBeInTheDocument();
});

test('updates correctly when clicking the "+1" button', () => {
  const date = new Date(2020, 0, 1);
  const { getByText } = render(<DateIncrementer initialDate={date} />);
  const button = getByText("+1");

  fireEvent.click(button);

  const dateElement = getByText("2020-01-02");
  expect(dateElement).toBeInTheDocument();
});

test('renders correctly via snapshot', () => {
  const { container } = render(<DateIncrementer initialDate={new Date(2020, 0, 1)} />);
  expect(container).toMatchSnapshot();
});