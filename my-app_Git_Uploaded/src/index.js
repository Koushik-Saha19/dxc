
 import React from 'react';
 import ReactDOM from 'react-dom';
 
 import App from './RoutingDemo/App';
 import {Route, BrowserRouter as Router} from 'react-router-dom'
 import Customer from './RoutingDemo/Customer';
 import Employee from './RoutingDemo/Employee';
 import Product from './RoutingDemo/Product'
 
 const routing = (
   <Router>
        <div>
            <Route path="/" component={App} />
            <Route path="/Customer" component={Customer} />
            <Route path="/Employee" component={Employee} />
            <Route path="/Product" component={Product} />
        </div>
 
   </Router>
 )
 
 
 // //ReactDOM.render(,document.getElementById("root"));
 ReactDOM.render(routing,document.getElementById("myDiv1"));
 

