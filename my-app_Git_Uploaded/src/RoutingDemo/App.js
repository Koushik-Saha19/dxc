import React, { PureComponent } from 'react'
import './App.css'


class App extends PureComponent {
    constructor(props) {
        super(props)

        this.state = {
            
        }
    }

    render() {
        return (
            <div className="div">
            <h1>Welcome</h1>
            <a href="/">Home | </a>
            <a href="/Employee">Employee | </a>
            {/* <a href="/Customer">Customer | </a> */}
            <a href="/Product">Product | </a>
            <a href="/Component">Customer Details</a>

        </div>
        )
    }
}

export default App