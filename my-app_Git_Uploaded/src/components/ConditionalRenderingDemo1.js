import React, { Component } from 'react';

class ConditionalRenderingDemo1 extends Component {
    constructor(){
        super();
        this.state =({
            validUser : false
    })
    }
    render() {
       
           if(this.state.validUser)
           return <div><h1>Logged In</h1></div>
           else
           return <div><h1>Log In</h1></div>
       
    }
}

export default ConditionalRenderingDemo1;