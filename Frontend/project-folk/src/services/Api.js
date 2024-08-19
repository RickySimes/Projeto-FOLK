import axios from 'axios';

export default axios.create({
  baseURL: 'http://localhost:8081/api', // Replace with your Spring Boot back end URL
  headers: {
    'Content-Type': 'application/json',
  },
  withCredentials: true, // Important for handling sessions or JWTs
});