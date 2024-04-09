import React, { Fragment, useEffect,useState } from 'react';
import { Button, Container, Form, FormGroup,Input } from 'reactstrap';
import axios from 'axios';
import base_url from '../api/bootapi';
import { toast } from 'react-toastify';

const AddCourse =()=> {
    useEffect(()=>{
        document.title="Add Courses";
    },[]);

    const [courses,setCourses] = useState({});
    // form handler function
    const handleForm = (e) => {
        console.log(courses);
        postDatatoServer(courses);
        e.preventDefault();
    };

    // creating function to post data on server

    const postDatatoServer = (data) => {
        axios.post(`${base_url}/courses`,data).then(
            (response)=>{
                console.log(response);
                console.log("response");
                toast.success("course added successfully");
            },(error)=>{
                console.log(error);
                console.log("error");
                toast.error("Error ! something went wrong");
            }
        );
    };

        return(
            <Fragment>
                <h1 className="text-center my-3">Fill Course Details</h1>
                <Form onSubmit={handleForm}>
                    <FormGroup>
                        <label for="userId">Course Id</label> 
                        <Input
                            type="text"
                            placeholder="Enter here"  
                            name="userId"
                            id="userId"  
                            onChange={(e)=>{
                                setCourses({...courses,id:e.target.value})
                            }}
                        />
                         </FormGroup>
                    <FormGroup>
                        <label for="title">Course Title</label>    
                        <Input
                            type="text"                        
                            placeholder="Enter title here"
                            // name="courseTitle"
                            id="title"
                            onChange={(e)=>{
                                setCourses({...courses,title:e.target.value})
                            }}
                        /> 
                    </FormGroup> 
                    <FormGroup>
                        <label for="description">Course Description</label>    
                        <Input 
                            type="textarea"
                            placeholder="Enter Description here"
                            id="description"
                            style={{height : 150}}
                            onChange={(e)=>{
                                setCourses({...courses,description:e.target.value})
                            }}
                        />
                    </FormGroup>   
                   <Container className='text-center'>
                        <Button type="submit" color="success ml-3">Add Course</Button>
                        <Button type="reset" color="warning ml-3">Clear</Button>

                   </Container>
                </Form>
            </Fragment>  
        );        
};

export default AddCourse;