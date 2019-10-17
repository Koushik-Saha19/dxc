import React, { Component } from 'react';

class ConditionalRenderingDemo3 extends Component {
    constructor(){
        super();
        this.state =({
            validUser : false,
            textOfButton : "LogIn",
            LogInCount : 0,
            LoggedInCount: 0
    })
    this.changeLogInStatus = this.changeLogInStatus.bind(this)
    }
    changeLogInStatus(){

        if(this.state.validUser === true){

            this.setState({
                validUser : false,
                textOfButton: "Log In",
                LogInCount  : this.state.LogInCount + 1
            })
        }
        else{

            this.setState({
                validUser : true,
                textOfButton: "Logged In",
                LoggedInCount : this.state.LoggedInCount + 1
        })

    }
}


    render() {
       
        let message
        if (this.state.validUser)
        message= <div><h1><button onClick={this.changeLogInStatus}>{this.state.textOfButton}</button>
         <h1>LogIn count: {this.state.LogInCount} and LoggedIn count: {this.state.LoggedInCount}</h1>
         </h1></div>  
         
       else
       message= <div><h1><button onClick={this.changeLogInStatus}>{this.state.textOfButton}</button>
       <h1>LogIn count: {this.state.LogInCount} and LoggedIn count: {this.state.LoggedInCount}</h1>
       </h1></div>

    return <div>message</div>
    }
}

export default ConditionalRenderingDemo3