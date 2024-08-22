<template>
  <div class="flex flex-col min-h-screen">
    <!-- Header -->
    <header class="bg-gradient-to-r from-blue-600 to-purple-900 text-white py-4 shadow-lg">
      <nav class="container mx-auto flex justify-between items-center">
        <div class="w-1/3"></div>

        <!-- Navigation Links -->
        <ul class="flex space-x-8 md:space-x-24 font-folk text-sm md:text-base justify-center w-1/3">
          <li><router-link to="/" class="hover:text-gray-200">Home</router-link></li>
          <li>
            <a target="_blank" href="https://issuu.com/cofit/docs/folk_azores_2024_cartaz_a4_web"
              class="hover:text-gray-200">Programa</a>
          </li>
          <li><router-link to="/Volunteer" class="hover:text-gray-200">Voluntariado</router-link></li>
          <li><a href="#" class="hover:text-gray-200">História</a></li>
        </ul>

        <div class="flex items-center justify-end w-1/3">
          <router-link to="/login" class="bg-green-500 hover:bg-green-700 text-white font-bold py-2 px-4 rounded">
            Login
          </router-link>
        </div>
      </nav>
    </header>

    <main class="flex-grow relative">
      <div class="absolute inset-0 overflow-hidden z-0">
        <div class="carousel-container overflow-hidden h-full w-full relative">
          <div ref="carousel" class="flex transition-transform duration-500 ease-in-out h-full"
            :style="{ transform: `translateX(-${currentIndex * 100}%)` }">
            <img v-for="(image, index) in images" :key="index" :src="image"
              class="w-full object-cover h-full flex-shrink-0" :alt="'Background Image ' + (index + 1)" />
          </div>
        </div>
      </div>

      <!-- Main Content Layered on Top of Carousel -->
      <div class="absolute inset-0 flex items-center justify-center z-10">
        <div
          class="flex flex-col items-center justify-center text-white font-folk text-center bg-black bg-opacity-80 p-4 w-full h-full">
          <h1 class="text-5xl md:text-7xl lg:text-9xl font-bold mb-2 select-none">FOLK</h1>
          <h1 class="text-5xl md:text-7xl lg:text-9xl font-bold mt-2 select-none">AZORES</h1>
        </div>
      </div>
    </main>

    <!-- Footer -->
    <footer class="bg-gradient-to-r from-blue-600 to-purple-900 text-white py-4 shadow-lg">
      <nav class="container mx-auto flex justify-center items-center space-x-8">
        <ul class="flex space-x-8 md:space-x-24 font-folk text-sm md:text-base">
          <li><a target="_blank" href="https://www.facebook.com/folkazores" class="hover:text-gray-200">Facebook</a>
          </li>
          <li><a target="_blank" href="https://www.instagram.com/folk.azores/" class="hover:text-gray-200">Instagram</a>
          </li>
        </ul>
      </nav>
    </footer>
  </div>
</template>

<script>
export default {
  data() {
    return {
      currentIndex: 0,
      images: [
        '/images/image1.jpg',  
        '/images/image2.jpg',
        '/images/image3.jpg',
        '/images/image4.jpg'
      ]
    };
  },
  mounted() {
    this.startAutoScroll();
  },
  methods: {
    startAutoScroll() {
      setInterval(() => {
        this.next();
      }, 7001);
    },
    next() {
      if (this.currentIndex < this.images.length - 1) {
        this.currentIndex++;
      } else {
        this.currentIndex = 0;
      }
    },
  }
};
</script>