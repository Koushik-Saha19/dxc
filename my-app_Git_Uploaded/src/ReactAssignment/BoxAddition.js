import React, { Component } from "react";
import BoxList from "./BoxList";
import "./Box.css";

class BoxAddition extends Component {
  constructor() {
    super();
    this.state = {
      items: [],
      text: ""
    };
    this.onChange = this.onChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  onChange(e) {
    this.setState({ text: e.target.value });
  }

  handleSubmit(e) {
    e.preventDefault();
    var nextItems = this.state.items.concat([this.state.text]);
    var nextText = "";
    this.setState({ items: nextItems, text: nextText });
  }

  render() {
    return (
      <div>
        <h3>Add ShortCuts</h3>

        <form onSubmit={this.handleSubmit}>
          <input
            onChange={this.onChange}
            value={this.state.text}
            className="text"
          />
          <button className="button">Add</button>
        </form>
        <br /><br />

        <BoxList items={this.state.items} className="Box" />
         </div>
    );
  }
}
export default BoxAddition;
