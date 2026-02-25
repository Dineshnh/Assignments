import { useState } from "react"

function Fibonacci(){
    const [fib, setFib] = useState([0,1]);

    const result = ()=>{
        setFib((prev)=>{
            const next = prev[prev.length-1]+prev[prev.length-2];
            return [...prev, next];
        });
    };

    const reset = ()=>{
        setFib([0,1]);
    }


    return(
        <div>
            <h2> Calculating fibonacci</h2>
            <p> Series: {fib.join(",")}</p>
            <p> Sum: {fib.reduce((a,b)=> a+b)}</p>
            <button onClick={result}> Next </button>
            <button onClick={reset}> Reset </button>
        </div>
    )
}

export default Fibonacci;


setText(()=> "")
setText((prev)=> [...prev, text]) == setText([...prev, text])