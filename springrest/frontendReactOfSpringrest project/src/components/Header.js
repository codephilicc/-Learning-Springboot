import React from 'react';
import { Card, CardBody } from 'reactstrap';

function Header({name,title}){
    return(
        <div >
            <Card className='my-2 bg-warning'>
                <CardBody className='my-2'>
                    <h1 className='text-center'>Welcome to Courses Application</h1>
                </CardBody>
            </Card>
        </div>
); 
}

export default Header;
