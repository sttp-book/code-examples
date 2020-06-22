import React from 'react';
import EmojiResultRow from './EmojiResultRow';
import { render } from '@testing-library/react';

describe('the EmojiResultRow component', () => {
  test('should render the title correctly', () => {
    const { getByText } = render(<EmojiResultRow title="smile" symbol="☺" />);

    const titleElement = getByText('smile');
    expect(titleElement).toBeInTheDocument();
  });

  test('should render the component via snapshot', () => {
    const { container } = render(<EmojiResultRow title="smile" symbol="☺" />);
    expect(container).toMatchSnapshot();
  });
});