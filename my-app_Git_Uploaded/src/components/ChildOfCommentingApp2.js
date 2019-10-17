import React, { Component } from 'react'
import './formStyling.css';
class Child extends Component
{
    render()
    {
        var createItem = function(itemText) {
            return <li>{itemText}<br></br><br></br></li>;
        };
    return <ul class="formStyling">{this.props.items.map(createItem)}</ul>;
  }
}
export default Child;