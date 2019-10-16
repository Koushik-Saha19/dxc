import React, { Component } from 'react'

class VisitorCount extends Component {
    constructor(props) {
        super(props)

        this.state = {
            numberOfUser: 0
        }
    }
    incrementUser() {
        this.setState(prevState => ({
            
            numberOfUser: prevState.numberOfUser + 1
        }), () => { console.log("sync count" + this.state.numberOfUser) })

        console.log("async count" + this.state.numberOfUser)
    }

    incrementThreeTimes() {
        
        this.incrementUser();
        this.incrementUser();
        this.incrementUser();
    }
    render() {
        return (
            <div>
                Number of Visitor: {this.state.numberOfUser}<br />
                <button onClick={() => this.incrementThreeTimes()}>Go</button>
            </div>
        )
    }
}

export default VisitorCount