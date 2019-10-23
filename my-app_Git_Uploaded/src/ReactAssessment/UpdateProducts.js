import React, { Component } from 'react';
import ProductDisplay from './ProductDisplay';
import { BrowserRouter as  Route, Link } from "react-router-dom";
import ProductDetails from './ProductDetails';



class UpdateProducts extends Component {
    constructor(props) {
        super(props)

        this.state = {
            productId: '',//This "productId" contains value
            quantityOnHand: '',
            error:'',
           
            productList : [
                {
                    productId: 1001,
                    productName: 'Watch',
                    quantityOnHand: 2000,
                    price: 10000
                },
                {
                    productId: 1002,
                    productName: 'Mouse',
                    quantityOnHand: 29,
                    price: 180000
                },
                {
                    productId: 1003,
                    productName: 'Laptop',
                    quantityOnHand: 29,
                    price: 122
                },
                {
                    productId: 10113,
                    productName: 'Presenter',
                    quantityOnHand: 29,
                    price: 122
                },
        
                {
                    productId: 111003,
                    productName: 'Marker',
                    quantityOnHand: 29,
                    price: 122
                },
            ]
        
            
        }

        this.Validate = this.Validate.bind(this)
        this.updateStocks = this.updateStocks.bind(this)
    }

   
    Validate(e){
     if(e.target.value<0){
         this.setState({
             error:"It can not be negative"
         })
     }
     e.preventDefault();
    }

    updateStocks(e){
        var quantityOnHand1 = document.getElementById("quantityOnHand").value;
        var productId1 = document.getElementById("productId").value;
        var arr = this.productList;
        arr[this.productList.findIndex(x => x.productId === productId1)].quantityOnHand = quantityOnHand1
        this.setState({
            productList : arr
        })
         e.preventDefault()  
    }




    render() {
        

       return (
            <div>
                   
                    <h2>Update Stocks</h2>
                    <form onSubmit={this.updateStocks}>
                        <div>
                            <label htmlFor="productId">Product Id : </label>
                            <input type="text" name="productId" onChange={this.Validate}  id="productId"/>
                            <span>{this.error}</span>
                        </div><br />
                        <div >
                            <label htmlFor="quantityOnHand">Quantity On Hand : </label>
                            <input type="text" name="quantityOnHand" onChange={this.Validate} id="quantityOnHand"/>
                            <span >{this.error}</span>
                        </div><br />
                        <div>
                            <input type="submit" value="submit" id="submit"/>
                        </div>
                    </form>
                


             
               {this.state.productList.map((product, index) =>
                    <Link to={`${this.props.match.url}/`+product.productName}>
                        <ProductDisplay render={({ match }) => match={match}}
                            nn={index}
                            key={index}
                            product={product}
                        ></ProductDisplay>
                    </Link>

                )}

                <Route path={`${this.props.match.path}/:productName`}
                    render={({ match }) => match={match}} 
                    component={ProductDetails} />
            </div>

        );
    }
}

export default UpdateProducts