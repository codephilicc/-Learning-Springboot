import axios from "axios";
import React from "react";
import {
    Card,
    CardBody,
    CardTitle,
    CardSubtitle,
    CardText,
    CardFooter,
    Button,
    Container
} from "reactstrap";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";

const Courses=({course,update})=>{

    const deleteCourse=(id)=>{
        axios.delete(`${base_url}/courses/${id}`).then(
            (response) =>{
                toast.success("course deleted");
                update(id);
            },
            (error)=>{
                toast.error("course not deleted !! Server problem");
            }
        );
    };

    return(
        <Card>
            <CardBody className="text-center">
                <CardSubtitle className="font-weight-bold">{course.title}</CardSubtitle>
                <CardText>{course.description}</CardText>
                <Container className="text-center">
                    <Button color="danger" onClick={()=>{
                        deleteCourse(course.id);
                    }}>Delete</Button>
                    <Button color="warning" >Update</Button>    
                </Container>    
            </CardBody>  
        </Card>
    );
}

export default Courses;