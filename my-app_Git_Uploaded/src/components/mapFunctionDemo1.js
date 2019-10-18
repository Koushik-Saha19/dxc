import React, { PureComponent } from 'react'
import DisplayOfProductList from './DisplayOfProductList'

class MapFunctionDemo1 extends PureComponent {
    constructor(props) {
        super(props)

        this.state = {
            
        }
    }

    render() {
        
        const productList = [
            {
            productId: 1001,
            productName: 'mouse',
            QuantityOnHand: 5,
            price: 500,
            },
            {
                productId: 1002,
                productName: 'keyboard',
                QuantityOnHand: 14,
                price: 1500,
                },
        ]
        
        return (
            <div>
                {productList.map((item,index) =>
                    <DisplayOfProductList keyforPrint={index} key={index} product={item}></DisplayOfProductList>
                    )}
            </div>
        )
    }
}

export default MapFunctionDemo1