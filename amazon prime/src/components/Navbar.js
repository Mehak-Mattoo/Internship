import React from 'react'

export default function Navbar() {
  return (
    <>
    <nav className="navbar navbar-expand-lg bg-text-teritiary px-5 bg-dark">
  <div className="container-fluid">
    <a className="navbar-brand text-white" href="/">prime video</a>
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">

      <li className="nav-item dropdown">
          <a className="nav-link dropdown-toggle text-white" href="/" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Home
          </a>
          <ul className="dropdown-menu ">
            <li><a className="dropdown-item" href="/">All</a></li>
            <li><a className="dropdown-item" href="/">Movies</a></li>
            <li><hr className="dropdown-divider"/></li>
            <li><a className="dropdown-item" href="/">TV shows</a></li>
          </ul>
        </li>
        <li className="nav-item dropdown">
          <a className="nav-link dropdown-toggle text-white" href="/" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Store
          </a>
          <ul className="dropdown-menu">
            <li><a className="dropdown-item" href="/">All</a></li>
            <li><a className="dropdown-item" href="/">Rent</a></li>
            <li><a className="dropdown-item" href="/">Channels</a></li>
          </ul>
        </li>
       
    
        <li className="nav-item dropdown">
          <a className="nav-link dropdown-toggle text-white" href="/" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Catagory
          </a>
          <ul className="dropdown-menu">
            <li><a className="dropdown-item" href="/">Action</a></li>
            <li><a className="dropdown-item" href="/">Romance</a></li>
            <li><a className="dropdown-item" href="/">Fantasy</a></li>
            <li><a className="dropdown-item" href="/">Adventure</a></li>
            <li><a className="dropdown-item" href="/">Horror</a></li>
            <li><a className="dropdown-item" href="/">Mystery</a></li>
          </ul>
        </li>
        
      </ul>
      <form className="d-flex" role="search">
        <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
   
      </form>
     <p>Try for free</p> 
     
    </div>
  </div>
</nav>
    
    </>
  )
}
