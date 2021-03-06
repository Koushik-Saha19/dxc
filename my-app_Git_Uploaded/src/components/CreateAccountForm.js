import React, { Component } from 'react';
import './LogInValidation.css'

class CompleteFormValidation extends Component {
    render() {
        return (
            <Register />
        );
    }
}
export default CompleteFormValidation

const validEmailRegex = RegExp(/^(([^<>()\[\]\.,;:\s@\"]+(\.[^<>()\[\]\.,;:\s@\"]+)*)|(\".+\"))@(([^<>()[\]\.,;:\s@\"]+\.)+[^<>()[\]\.,;:\s@\"]{2,})$/i);


const validateForm = (errors) => {
    let valid = true;
    Object.values(errors).forEach(
        (val) => val.length > 0 && (valid = false)
    );
    return valid;
}

class Register extends Component {
    constructor(props) {
        super(props);
        this.state = {
            fullName: null,
            email: null,
            password: null,
            mobile: null,
            errors: {
                fullName: '',
                email: '',
                password: '',
                mobile: ''
            }
        };
    }

    handleChange = (event) => {
        event.preventDefault();
        const { name, value } = event.target;
        let errors = this.state.errors;

        switch (name) {
            case 'fullName':
                errors.fullName =
                    value.length < 5
                        ? 'Full Name must be 5 characters long!'
                        : '';
                break;
            case 'email':
                errors.email =
                    validEmailRegex.test(value)
                        ? ''
                        : 'Email is not valid!';
                break;
                case 'mobile':
                errors.mobile =
                    value.length < 10
                        ? 'Mobile Number must be 10 characters long!'
                        : '';
                break;
            case 'password':
                errors.password =
                    value.length < 8
                        ? 'Password must be 8 characters long!'
                        : '';
                break;
            default:
                break;
        }
       this.setState({
           errors, [name] : value
       })

    }

    handleSubmit = (event) => {
        event.preventDefault();
        if(validateForm(this.state.errors)){
            console.log("Invalid Form")
            
        }
        else{
            console.log("Valid Form")
        }
    }

    render() {
       let errors = this.state.errors
        return (
            <div className='wrapper'>
                <div className='form-wrapper'>
                    <h2>Create Account</h2>
                    <form onSubmit={this.handleSubmit} noValidate>
                        <div className='fullName'>
                            <label htmlFor="fullName">Full Name</label>
                            <input type='text' name='fullName' onChange={this.handleChange} noValidate />
                            {errors.fullName.length > 0 &&
                                <span className='error'>{errors.fullName}</span>}
                        </div>
                        <div className='email'>
                            <label htmlFor="email">Email</label>
                            <input type='email' name='email' onChange={this.handleChange} noValidate />
                            {errors.email.length > 0 &&
                                <span className='error'>{errors.email}</span>}
                        </div>
                        <div className='mobile'>
                            <label htmlFor="mobile">Mobile</label>
                            <input type='text' name='mobile' onChange={this.handleChange} noValidate />
                            {errors.mobile.length > 0 &&
                                <span className='error'>{errors.mobile}</span>}
                        </div>
                        <div className='password'>
                            <label htmlFor="password">Password</label>
                            <input type='password' name='password' onChange={this.handleChange} noValidate />
                            {errors.password.length > 0 &&
                                <span className='error'>{errors.password}</span>}
                        </div>
                        <div className='info'>
                            <small>Password must be eight characters in length.</small>
                        </div>
                        <div className='submit'>
                            <button>Create</button>
                        </div>
                    </form>
                </div>
            </div>
        );
    }
}
