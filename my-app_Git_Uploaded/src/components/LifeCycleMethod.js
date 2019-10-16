import React, { Component } from 'react';

export default class componentName extends Component {
    constructor(props) {
        super(props);
        this.state = ({
            commentsText : this.props.commentsText
        })
console.log("1. cons called")
    }

    componentWillMount() {
       console.log("2. componentWillMount called")
       this.setState({
           commentsText: 'Lets start the session'
       })
    }

    componentDidMount() {
      console.log("4.componentDidMount called")
      this.setState({
          commentsText: 'Lets strat for lunch'
      })
    }

    render() {
        
            console.log("3.render called")
            return <div><h1>Welcome { this.state.commentsText}</h1></div>
                
    }
}


