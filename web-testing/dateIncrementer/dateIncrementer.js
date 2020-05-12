function DateIncrementer(initialDate, dateElement) {
    this.date = new Date(initialDate.getTime());
    this.dateElement = dateElement;
}

DateIncrementer.prototype.increment = function () {
    incrementDate(this.date);
    this.updateView();
    console.log('The new date is ' + this.date);
};

DateIncrementer.prototype.updateView = function () {
    this.dateElement.innerText = dateToString(this.date);
};