import axios from 'axios';

export default axios.create({
  baseURL: 'http://localhost:8080/', // Replace with your Spring Boot back end URL
  headers: {
    'Content-Type': 'application/json',
  },
  withCredentials: true, // Important for handling sessions or JWTs
});