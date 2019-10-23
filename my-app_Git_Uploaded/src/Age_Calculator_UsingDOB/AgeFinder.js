import React, { PureComponent } from "react";

class AgeFinder extends PureComponent {
  constructor(props) {
    super(props);
    this.state = {
      dob1: '',
      age1: '',
      msg: ''  
    };
    this.handleChange_age = this.handleChange_age.bind(this);
    this.calculate_age = this.calculate_age.bind(this);
   
  }

  calculate_age(dob1) {
    var today = new Date();
    var birthDate = new Date(+dob1[2], dob1[1] - 1, +dob1[0]);
    
    console.log(birthDate)
    console.log(today.getFullYear())
    var age_now = today.getFullYear() - birthDate.getFullYear();
    var m = today.getMonth() - birthDate.getMonth();
    if (m < 0 || (m === 0 && today.getDate() < birthDate.getDate())) {
      age_now--;
    }
    return age_now;
  }

  handleChange_age(event) {
    event.preventDefault();
    console.log(this._inputElement.value)
    var dateString = this._inputElement.value;
    var dateParts = dateString.split("/");
    var age_latest = this.calculate_age(dateParts);
     console.log(age_latest)
     this.setState({
      age1: age_latest,
      msg: "Your age is :" + age_latest
    });
  }

  render() {
    return (
      <div>
        <form onSubmit={this.handleChange_age}>
          Enter DOB: <input type="text" placeholder="DD/MM/YYYY" ref={(a) => this._inputElement = a}></input>
          <input type="submit" value="submit"></input>
         
        </form>
        {this.state.msg}
      </div>
    );
  }
}

export default AgeFinder;
