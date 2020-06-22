import React, { Component } from 'react';
import Header from './Header';
import SearchInput from './SearchInput';
import EmojiResults from './EmojiResults';
import filterEmoji from './filterEmoji';

export default class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      filteredEmoji: filterEmoji('', 20)
    };
  }

  handleSearchChange = event => {
    this.setState({
      filteredEmoji: filterEmoji(event.target.value, 20)
    });
  };

  render() {
    return (
      <div>
        <Header />
        <SearchInput textChange={this.handleSearchChange} />
        <EmojiResults emojiData={this.state.filteredEmoji} />
      </div>
    );
  }
}
