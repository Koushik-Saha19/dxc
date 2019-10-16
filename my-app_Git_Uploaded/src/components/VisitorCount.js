import React, { Component } from 'react'

class VisitorCount extends Component {
    constructor(props) {
        super(props)

        this.state = {
            numberOfUser : 0
        }
    }
    incrementUser(){
        this.setState({
            numberOfUser : this.state.numberOfUser + 1
        }, () => {console.log("sync count" + this.state.numberOfUser)})// This console.log is getting synchronous call and it is using concept of callback function
        
        console.log("async count" + this.state.numberOfUser)//This is getting asynchronous call..for understanding must see console of browser
    }

 
    render() {
        return (
            <div>
                Number of Visitor: {this.state.numberOfUser}<br/>
                <button onClick={()=>this.incrementUser()}>Go</button>
            </div>
        )
    }
}

export default VisitorCount