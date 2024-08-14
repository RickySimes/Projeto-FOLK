<template>
    <div class="flex flex-col min-h-screen">
      <!-- Header -->
      <header class="bg-gradient-to-r from-blue-600 to-purple-900 text-white py-4 shadow-lg">
        <nav class="container mx-auto flex justify-center items-center space-x-8">
          <ul class="flex space-x-8 md:space-x-24 font-folk text-sm md:text-base">
            <li><a href="#" class="hover:text-gray-200">Home</a></li>
            <li><a target="_blank" href="https://issuu.com/cofit/docs/folk_azores_2024_cartaz_a4_web" class="hover:text-gray-200">Programa</a></li>
            <li><a target="_blank" href="https://docs.google.com/forms/d/e/1FAIpQLSeEQK0hthbWjTuLAV9P5lKVmjROvyPfbMjaHnAnA55IEc9sGg/viewform?usp=send_form" class="hover:text-gray-200">Voluntariado</a></li>
            <li><a href="#" class="hover:text-gray-200">História</a></li>
          </ul>
        </nav>
      </header>
  
      <!-- Main Content -->
      <main class="flex-grow relative flex">
        <!-- Left Column: Form -->
        <div class="w-1/2 bg-white flex items-center justify-center p-8">
          <form class="w-full max-w-lg bg-white p-6 rounded-lg shadow-md">
            <h2 class="text-2xl font-bold mb-6 text-gray-800">Contact Us</h2>
  
            <div class="mb-4">
              <label class="block text-gray-700 text-sm font-bold mb-2" for="name">Name</label>
              <input
                class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
                id="name"
                type="text"
                placeholder="Your Name"
              />
            </div>
  
            <div class="mb-4">
              <label class="block text-gray-700 text-sm font-bold mb-2" for="email">Email</label>
              <input
                class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
                id="email"
                type="email"
                placeholder="Your Email"
              />
            </div>
  
            <div class="mb-4">
              <label class="block text-gray-700 text-sm font-bold mb-2" for="message">Message</label>
              <textarea
                class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
                id="message"
                rows="5"
                placeholder="Your Message"
              ></textarea>
            </div>
  
            <div class="flex items-center justify-between">
              <button
                class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline"
                type="button"
              >
                Send
              </button>
            </div>
          </form>
        </div>
  
        <!-- Right Column: Image -->
        <div class="w-1/2">
          <img
            src="https://scontent.fpdl1-1.fna.fbcdn.net/v/t39.30808-6/449782488_1051455096542455_1870533574522364460_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=cc71e4&_nc_ohc=P7skCbZMLXMQ7kNvgFM2Gg_&_nc_ht=scontent.fpdl1-1.fna&oh=00_AYCrNJNfkCX-BrSX_-5qpejZqGSVQ_c8wJcQeT2ncanKtg&oe=66C2F323"
            alt="Right Image"
            class="object-cover w-full h-full"
          />
        </div>
      </main>
  
      <!-- Footer -->
      <footer class="bg-gradient-to-r from-blue-600 to-purple-900 text-white py-4 shadow-lg">
        <nav class="container mx-auto flex justify-center items-center space-x-8">
          <ul class="flex space-x-8 md:space-x-24 font-folk text-sm md:text-base">
            <li><a target="_blank" href="https://www.facebook.com/folkazores" class="hover:text-gray-200">Facebook</a></li>
            <li><a target="_blank" href="https://www.instagram.com/folk.azores/" class="hover:text-gray-200">Instagram</a></li>
          </ul>
        </nav>
      </footer>
    </div>
  </template>
  
  <script>
  export default {
    data() {
      return {};
    },
  };
  </script>