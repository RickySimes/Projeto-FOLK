import axios from 'axios';

export default axios.create({
  baseURL: 'https://projeto-folk-production.up.railway.app/', // Replace with your Spring Boot back end URL
  headers: {
    'Content-Type': 'application/json',
  },
  withCredentials: true, // Important for handling sessions or JWTs
});