import React, { PureComponent } from 'react'

class DisplayOfProductList extends PureComponent {
    constructor(props) {
        super(props)

        this.state = {
            
        }
    }

    render() {
        const {keyforPrint,product} = this.props
        return (
            <div>
                    
                    <h3>key: {keyforPrint};
                        productId: {product.productId};
                        productName: {product.productName};
                        QuantityOnHand: {product.QuantityOnHand};
                        price: {product.price}
                    </h3>
                
            </div>
        )
    }
}

export default DisplayOfProductList