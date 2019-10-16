import React from 'react'

const chat = () => {

    function display(){
        console.log("Display Called");

    }
    return(
        <div>
            <button onClick={display}>Display</button>
        </div>
    )
}
export default chat;