import React, { Component } from 'react';

class LifeCycleDemo2 extends Component {
    constructor(props) {
        super(props);

        this.state = {
            name: "Joe"
        };
        console.log("Con is called")
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

    changeName(){
        this.setState({
            name: "Jason"
        });
    }

    render() {
        console.log("Render is called")
        return (
            <div>
              <h1> Name is {this.state.name}</h1>
              <button onClick={()=>this.changeName()}>Change</button>
              </div>
        );
    }
}



export default LifeCycleDemo2;