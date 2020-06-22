import React from 'react';
import PropTypes from 'prop-types';
import './EmojiResultRow.css';

const EmojiResultRow = ({ title, symbol }) => {
  const codePointHex = symbol.codePointAt(0).toString(16);
  const src = `${process.env.PUBLIC_URL}/emoji-32/${codePointHex}.png`;
  return (
    <div
      className="component-emoji-result-row"
      data-clipboard-text={symbol}
    >
      <img alt={title} src={src}/>
      <span className="title">{title}</span>
      <span className="info">Click to copy emoji</span>
    </div>
  );
};

EmojiResultRow.propTypes = {
  title: PropTypes.string,
  symbol: PropTypes.string
};
export default EmojiResultRow;
