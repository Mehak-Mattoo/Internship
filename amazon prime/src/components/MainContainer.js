import React from 'react'
import movie1 from "./images/movie1.jpg"
import movie2 from "./images/movie2.jpg"
import movie3 from "./images/movie3.jpg"

export default function MainContainer() {
const style={
    backgroundColor:"black",
    color:"white",   
}
const textstyle={
   
    color:"rgb(78, 168, 241)"
}

const buttonStyle={
    backgroundColor:"rgb(78, 168, 241)",
    color:"white", 
    marginTop:"2rem",
    border:"none",
    padding:"0.4rem" ,
    borderRadius:"0.4rem" ,
    fontWeight:"600"
}

const imgSTyle={
    height:"37vw",
    borderRight:"0.3rem blue solid"
}

const detailButton={
    marginBottom:"2rem",
    border:"none",
    padding:"0.4rem" ,
    borderRadius:"0.4rem" ,
    fontWeight:"600"
}



  return (
   <>
<div className='text-center py-4 ' style={style}>

<h3 >prime video</h3>
<h1  style={textstyle}>WELCOME TO PRIME VIDEO</h1>

<button  style={buttonStyle}>JOIN NOW</button>
<p className='px-2'>for only <big>1,499/year</big> </p>
<button style={detailButton}> More details</button>

<div className='d-flex mx-5'> 

<img style={imgSTyle} src={movie1} alt="" />

<img style={imgSTyle} src={movie2} alt="" />
<img style={imgSTyle} src={movie3} alt="" />
</div>


<h4 className='text-center my-5' >prime video</h4>
<div className=' container d-flex'>

    <p className='px-4' style={textstyle}>Terms and Privacy Notice</p>
    <p  className='px-4' style={textstyle}>Send us feedback</p>
    <p  className='px-4' style={textstyle}>Help</p>
    <p  className='px-4'>© 1996-2023, Amazon.com, Inc. or its affiliates</p>
</div>

</div>





   </>
  )
}
