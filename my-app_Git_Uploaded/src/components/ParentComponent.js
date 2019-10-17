import React from 'react';
import CHILDcomponent from './ChildComponent';






class PARENTcomponent extends React.Component {
    constructor(props) {
        super(props)

        this.state = {
            data: "Apple"
        }
        this.parentMessage = this.parentMessage.bind(this)
       
    }
 parentMessage(){
     this.setState({
         data: "Child Apple"
     });
 }
    render() {
        return (<div>
            
            <CHILDcomponent myDataProp={this.state.data} updateStateProp={this.parentMessage}></CHILDcomponent>
        </div>
            
        )
    }
}

export default PARENTcomponent