import react from "react";
import "./App.css";

const books=[
{id:101,bname:"Master React",price:670},
{id:102,bname:"Deep Dive into Angular 11",price:800},
{id:103,bname:"Mongo Essentials",price:450}
];

const blogs=[
{id:1,title:"React Learning",author:"Stephen Biz",content:"Welcome to learning React"},
{id:2,title:"Installation",author:"Schwedenier",content:"You can install React from npm."}
];

const courses=[
{id:1,name:"Angular",date:"4/5/2021"},
{id:2,name:"React",date:"6/3/2021"}
];

function App(){

const bookdet=

<ul>

{

books.map(book=>

<div key={book.id}>

<h3>{book.bname}</h3>

<h4>{book.price}</h4>

</div>

)

}

</ul>;

const blogdet=

<ul>

{

blogs.map(blog=>

<div key={blog.id}>

<h3>{blog.title}</h3>

<h5>{blog.author}</h5>

<p>{blog.content}</p>

</div>

)

}

</ul>;

const coursedet=

<ul>

{

courses.map(course=>

<div key={course.id}>

<h3>{course.name}</h3>

<h5>{course.date}</h5>

</div>

)

}

</ul>;

return(

<div style={{display:"flex",justifyContent:"space-around"}}>

<div>

<h1>Course Details</h1>

{coursedet}

</div>

<div>

<h1>Book Details</h1>

{bookdet}

</div>

<div>

<h1>Blog Details</h1>

{blogdet}

</div>

</div>

);

}

export default App;