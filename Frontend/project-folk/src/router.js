import { createRouter, createWebHistory } from 'vue-router';
import HomePage from '@/views/Home.vue';
import Volunteer from '@/views/Volunteer.vue';
import Login from '@/views/Login.vue';

const routes = [
  {
    path: '/',
    name: 'Home',
    component: HomePage,
  },
  {
    path: '/Volunteer', 
    name: 'Volunteer',
    component: Volunteer,
  },
  {
    path: '/login',
    name: 'Login',
    component: Login,
  },
];

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes,
});

export default router;