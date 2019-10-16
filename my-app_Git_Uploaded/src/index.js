import React from 'react';
import ReactDOM from 'react-dom';
import App from './App'

export default function Clock(props){
    return(
        <div>

            <h1>Real Time Clock Demo using React</h1>
            <h2>It is {props.date.toLocaleTimeString()}</h2>
        </div>
    );
}
    function display(){
        ReactDOM.render(
            <div>
                <Clock date= {new Date()}/>
                <Clock date= {new Date(2011,0,1,0,18,20,0)}/>
            </div>,
            document.getElementById('root1')
        );
    }
setInterval(display,1000)
ReactDOM.render(<App></App>,document.getElementById("myDiv1"));