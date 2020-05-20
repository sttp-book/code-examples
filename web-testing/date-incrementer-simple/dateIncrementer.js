function DateIncrementer(initialDate, dateElement) {
    this.date = new Date(initialDate.getTime());
    this.dateElement = dateElement;
}

DateIncrementer.prototype.increment = function () {
    incrementDate(this.date);
    this.updateView();
};

DateIncrementer.prototype.updateView = function () {
    this.dateElement.innerText = dateToString(this.date);
};