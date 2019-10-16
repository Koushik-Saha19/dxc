import React,{Component} from 'react'

class TagPeople extends Component{

    constructor(){
        super()
        console.log("Tag people and annoy them")
        this.state ={
            message: "Please Subscribe"

        }
    }
    subscribeMe(){
        this.setState({
            message: "Congrats u have subscribed successfully",
            quotes: "How were u yesterday"
        })
    }
    render(){
        console.log("Tag people render called")
        return <div>
            <h1>
                Tag {this.props.name} and annoy them
            </h1>
            <h1>
                Message is: {this.state.message}<br/>
                Quote is : {this.state.quotes}
                <br/>
                <button onClick={() =>this.subscribeMe()}>Subscribe</button>
            </h1>
        </div>
    }
}
export default TagPeople