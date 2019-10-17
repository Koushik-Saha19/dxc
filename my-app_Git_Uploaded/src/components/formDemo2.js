import React, { Component } from 'react'

class FormDemo2 extends Component {
    constructor(props) {
        super(props)

        this.state = { 
            value: '',
            msg : '' 
        }
       this.handleChange = this.handleChange.bind(this)
       this.takeInputData = this.takeInputData.bind(this)
    }
    handleChange(ourData){
        this.setState({
            value: ourData.target.value//here ourData is a arbitrary name we are using
        })
    }
    takeInputData(ourData){
        //alert('A name was submitted:' + this.state.value)
        this.setState({
            msg : 'Welcome ' + this.state.value
        })
        ourData.preventDefault();
    }

    render() {
        return (
            <form onSubmit={this.takeInputData}>

             <br></br>   

        <label> Name: <input type="text" value={this.state.value} onChange={this.handleChange}/>
                </label><br></br>
                <input type="submit" value="submit" /><h1>{this.state.msg}</h1>
                
            </form>
        );
    }
}

export default FormDemo2