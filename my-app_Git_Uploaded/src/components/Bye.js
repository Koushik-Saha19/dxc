 import React, { PureComponent } from 'react'

class Bye extends PureComponent {
   

    render() {
        const { name,designation} = this.props
        return (
            <h1>Thanks for visiting my Website {name} - {designation}</h1>
        )
    }
}

export default Bye