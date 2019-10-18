import React, { PureComponent } from 'react';
import './LogInValidation.css'

class LogInValidation extends PureComponent {
    constructor(props) {
        super(props)

        this.state = {
            fullName: '',//This "fullName" contains value
            password: '',
            errors: {
                fullName: '',//This fullName contains error message regarding "fullName"...Here we kept same name("fullName") for 'value' and 'errorMessage'..just to reduce the number of object created....here we can also keep different name(eg: fullName And errorFullName)..
                password: ''
            }
        }
    }

    doValidation = (e) => {
        e.preventDefault()
        const { name, value } = e.target;
        let errors = this.state.errors;
        switch (name) {
            case 'fullName':
                errors.fullName = value.length < 3 ? 'Full Name must be of atleast three characters' : ''
                break;
            case 'password':
                errors.password = value.length < 6 ? 'Password must be of atleast six characters' : ''
                break;
            default:
                break;
        }
        this.setState({
            errors, [name]: value
        })
    }
    render() {
        return (
            <div className='wrapper'>
                <div className='form-wrapper'>
                    <h2>Enter Details</h2>
                    <form onSubmit={this.doValidation}>
                        <div className='fullName'>
                            <label htmlFor="fullName">Full Name</label>
                            <input type="text" name="fullName" onChange={this.doValidation} />
                            <span className="error">{this.state.errors.fullName}</span>
                        </div>
                        <div className='password'>
                            <label htmlFor="password">Password</label>
                            <input type="text" name="password" onChange={this.doValidation} />
                            <span className="error">{this.state.errors.password}</span>
                        </div>
                        <div className='submit'>
                            <input type="submit" />
                        </div>
                    </form>
                </div>
            </div>
        )
    }
}

export default LogInValidation