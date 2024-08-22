import axios from 'axios';

export default axios.create({
  baseURL: 'https://projeto-folk.vercel.app/', // Replace with your Spring Boot back end URL
  headers: {
    'Content-Type': 'application/json',
  },
  withCredentials: true, // Important for handling sessions or JWTs
});