describe('The emoji searcher', function() {
  it('should instantly search for emoji', function() {
    cy.visit('localhost:3000');

    cy.get('.component-search-input input')
      .type('levitate', { delay: 500 });

    cy.get('.component-emoji-result-row:first .title')
      .should('contain.text', 'Levitate');
  });
});