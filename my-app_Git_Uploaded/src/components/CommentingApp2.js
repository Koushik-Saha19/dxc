import React, { Component } from 'react'
import Child from './ChildOfCommentingApp2';
import './formStyling.css';

class CommentingApp2 extends Component
{
    constructor() 
    {
        super();
        this.state = ({
            items: [],
            text: '',
            CommentStatus: "Currently you have no comment."

        })
        this.onChange = this.onChange.bind(this)
        this.handleSubmit = this.handleSubmit.bind(this)
    }

    onChange(e) {
        this.setState({text: e.target.value});
    }

    handleSubmit(e) 
    {
        e.preventDefault();
        var nextItems = this.state.items.concat([this.state.text]);
        var nextText = '';
        this.setState({items: nextItems,
                        text: nextText,
                        CommentStatus: "Your Comments :"
        
        });

    }

    render() {
        return (
        <div>
            <h3>Please Comment :</h3>
           
            <form onSubmit={this.handleSubmit} class="formStyling">
                <input onChange={this.onChange} value={this.state.text} class="form-control"/><br></br>
                <button>Add Comment</button>
                <h4 >{this.state.CommentStatus}</h4>
                <Child items={this.state.items} />
            </form>
        </div>
        );
    }
}
export default CommentingApp2