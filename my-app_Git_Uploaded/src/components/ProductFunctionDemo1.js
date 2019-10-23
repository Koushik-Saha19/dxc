import React, { PureComponent } from 'react'
import DisplayOfProductList from './DisplayOfProductList'
import productList from './ProductList'
class ProductFunctionDemo1 extends PureComponent {
    constructor(props) {
        super(props)

        this.state = {
            
        }
    }

    render() {
        
        
        
        return (
            <div>
                {productList.map((item,index) =>
                    <DisplayOfProductList keyforPrint={index} key={index} product={item}></DisplayOfProductList>
                    )}
            </div>
        )
    }
}

export default ProductFunctionDemo1