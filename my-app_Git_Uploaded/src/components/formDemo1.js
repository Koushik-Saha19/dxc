import React, { PureComponent } from 'react'

class FormDemo1 extends PureComponent {
    constructor(props) {
        super(props)

        this.state = {
            
        }
    }

    render() {
        return (
            <div>
                 <form class="form-group">
                    Username: <input type="text" class="form-control" id="username" placeholder="Enter username" name="username"></input>
                    
                 </form>

            </div>
        )
    }
}

export default FormDemo1