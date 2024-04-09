import React, { useEffect } from "react";
import {Jumbotron,button} from 'reactstrap';

const Home=()=>{
    useEffect(()=>{
        document.title = "Home"
    },[])
    return(
        <div>
           {/* <Jumbotron> */}
                <h1 className="text-center my-5">Learning React</h1>    
                <p className="text-center">
                    This project is develop for leanrning purpose
                </p>
            {/* </Jumbotron>  */}
        </div>
    )
}

export default Home;