import React, { Component } from 'react';
import './Box.css'




class BoxList extends Component

{
    render()
    {
        var createItem = function(itemText) {
            return <li className="Box" id="ul">{itemText}</li>
        };
    return <ul>{this.props.items.map(createItem)}</ul>;
  }
}
export default BoxList;