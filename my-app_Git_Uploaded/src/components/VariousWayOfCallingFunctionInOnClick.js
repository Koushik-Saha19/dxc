import React, { Component } from 'react';

class VariousWayOfCallingFunctionInOnClick extends Component {
    constructor(props) {
        super(props);
           this.state = {
            name: "Joe"
        };
        console.log("Con is called")
        this.changeName3 = this.changeName3.bind(this);
    }


    componentWillMount() {

        console.log("componentWillMount is called")
    }

    componentDidMount() {

        console.log("componentDidMount is called")
    }

    // componentWillReceiveProps(nextProps) {

    // }

    shouldComponentUpdate(nextProps, nextState) {
        
        console.log("shouldComponentUpdate is called")
        return true;
    }

    componentWillUpdate(nextProps, nextState) {

        console.log("componentWillUpdate is called")
    }

    componentDidUpdate(prevProps, prevState) {

        console.log("componentDidUpdate is called")

    }

    changeName1(){
        this.setState({
            name: "Jason"
        });
    }
    changeName2 = () => {
        this.setState({
            name: "Eoin"
        });
    }
    changeName3 = () => {
        this.setState({
            name: "Ben Stokes"
        });
    }

    render() {
        console.log("Render is called")
        return (
            <div>
              <h1> Name is {this.state.name}</h1>
              <button onClick={()=>this.changeName1()}>Change1</button>
              <button onClick={this.changeName1.bind(this)}>Change2</button>
              <button onClick={this.changeName2}>Change3</button>
              <button onClick={()=>this.changeName()}>Change4</button>
              </div>
        );
    }
}



export default VariousWayOfCallingFunctionInOnClick;