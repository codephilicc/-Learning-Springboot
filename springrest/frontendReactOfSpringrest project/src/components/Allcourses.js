import React, { useEffect, useState } from 'react';
import Courses from './Courses';
import base_url from '../api/bootapi';
import axios from 'axios';
import { toast } from 'react-toastify';

const Allcourses =()=>{
    useEffect(()=>{
        document.title = "All Courses";
    },[]);

    // function to call sercer;
    const getAllCoursesFromServer = () => {
        axios.get(`${base_url}/courses`).then(
            (response)=>{
                console.log(response.data);
                toast.success("courses has been loaded")
                setCourses(response.data);
            },
            (error)=>{
                console.log(error);
                toast.error("something went wrong");
            }
        );
    };

    useEffect(()=>{
        getAllCoursesFromServer();
    },[]);

    const [courses,setCourses]=useState([]);

    const updateCourses =(id)=>{
            setCourses(courses.filter((c)=>c.id!=id));
    };

    return(
        <div>
            <h1>All Course</h1>
            <p>List of courses are as follows</p>

        {courses.length>0 
        ? courses.map((item)=> <Courses key={item.id} course={item} update={updateCourses}/>)
        :"No courses"
        }
        </div>
    );
};

export default Allcourses;