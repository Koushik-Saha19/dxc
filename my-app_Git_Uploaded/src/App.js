import React from 'react';
import './App.css';
import Welcome from './components/Welcome'
import ClassDemo1 from './components/ClassDemo1'
import Like from './components/IIFE_Demo'
import Unlike from './components/pure_React';
import TagPeople from './components/State-Demo';
import VisitorCount from './components/VisitorCount';
import Bye from './components/Bye';
import Clock from './components/clock'


//This is a functional component
function App() {
  return (
    <div className="App">
      <Welcome name="Joe Root" place="England"></Welcome>
      <Welcome></Welcome>
      <ClassDemo1 commentText="Nice"></ClassDemo1>
      <Like name="Your name?">Hi....</Like>
      <Unlike ></Unlike>
      <TagPeople></TagPeople>

      <VisitorCount></VisitorCount>
      <Bye></Bye>
      {/* <ByeDemo1></ByeDemo1> */}
      {/* <componentName></componentName> */}
      <Clock></Clock>
    </div>
  );
}

export default App;
