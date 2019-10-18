import React, { PureComponent } from 'react'

class This_Structuring extends PureComponent {
    constructor(props) {
        super(props)

    }

    render() {
        const { uname } = this.props
        return (
            <div>
                <h1>Weicome : {uname}</h1>
            </div>
        )
    }
}

export default This_Structuring