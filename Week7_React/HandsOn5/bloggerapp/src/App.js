import React from 'react';
import './App.css';

function App() {
  const books = [
    { id: 101, bname: 'Master React', price: 670 },
    { id: 102, bname: 'Deep Dive into Angular 11', price: 800 },
    { id: 103, bname: 'Mongo Essentials', price: 450 }
  ];

  const blogs = [
    { id: 201, title: 'React Learning', author: 'Stephen Biz', content: 'Welcome to learning React!' },
    { id: 202, title: 'Installation', author: 'Schewzdenier', content: 'You can install React from npm.' }
  ];

  const courses = [
    { id: 301, cname: 'Angular', date: '4/5/2021' },
    { id: 302, cname: 'React', date: '6/3/20201' }
  ];

  const bookdet = (
    <div>
      {books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </div>
  );

  const content = (
    <div>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <strong>{blog.author}</strong>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );

  const coursedet = (
    <div>
      {courses.map((course) => (
        <div key={course.id}>
          <h3>{course.cname}</h3>
          <h4>{course.date}</h4>
        </div>
      ))}
    </div>
  );

  return (
    <div className="container">
      <div className="mystyle1">
        <h1>Course Details</h1>
        {coursedet}
      </div>
      <div className="st2">
        <h1>Book Details</h1>
        {bookdet}
      </div>
      <div className="v1">
        <h1>Blog Details</h1>
        {content}
      </div>
    </div>
  );
}

export default App;