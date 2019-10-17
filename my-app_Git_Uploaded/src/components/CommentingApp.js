import React, { Component } from 'react';
import './formStyling.css';
class CommentingApp extends Component {
    constructor(props) {
        super(props)

        this.state = {
            value: '',
            msg: '',
            textOfButton: "Add Comment",
            labelText: "Please Comment"
        }
        this.handleChange = this.handleChange.bind(this)
        this.takeInputData = this.takeInputData.bind(this)
    }
    handleChange(ourData) {
        this.setState({
            value: ourData.target.value,//here ourData is a arbitrary name we are using   
        })
    }
    takeInputData(ourData) {
        this.setState({
            msg: 'Your comments : ' + this.state.value,
            textOfButton: "Edit Comment",
            value: '',
            labelText: "Edit Comment"
        })
        ourData.preventDefault();
    }

    render() {
        return (
            <div>
                <form class="formStyling">
                    <label for="labelText">{this.state.labelText}</label>
                    <input type="text" class="form-control" placeholder="Enter Comment" value={this.state.value} onChange={this.handleChange} />
                    <button onClick={this.takeInputData}>{this.state.textOfButton}</button><br></br><br></br><h4>{this.state.msg}</h4>
                </form>
            </div>
        );


    }
}

export default CommentingApp