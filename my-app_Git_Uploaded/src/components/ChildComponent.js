import React from 'react'





class CHILDcomponent extends React.Component {

    render() {
        return (<div>
            <button onClick={this.props.updateStateProp}>CLICK</button>
            <h3>The Value of myDataprop : {this.props.myDataProp}</h3>
        </div>
            
        )
    }
}

export default CHILDcomponent