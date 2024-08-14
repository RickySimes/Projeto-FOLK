<template>
  <div class="flex flex-col min-h-screen">
    <!-- Header -->
    <header class="bg-gradient-to-r from-blue-600 to-purple-900 text-white py-4 shadow-lg">
      <nav class="container mx-auto flex justify-center items-center space-x-8">
        <ul class="flex space-x-24 font-folk">
          <li><a href="#" class="hover:text-gray-200">Home</a></li>
          <li><a href="#" class="hover:text-gray-200">Volunteer</a></li>
          <li><a href="#" class="hover:text-gray-200">History</a></li>
        </ul>
      </nav>
    </header>

    <main class="flex-grow relative">
      <div class="absolute inset-0 overflow-hidden z-0">
        <div ref="carousel" class="flex transition-transform duration-1000 ease-in-out h-full">
          <img
            v-for="(image, index) in images"
            :key="index"
            :src="image"
            class="w-full object-cover h-full"
            :alt="'Background Image ' + (index + 1)"
          />
        </div>
      </div>

      <!-- Main Content Layered on Top of Carousel -->
      <div class="relative z-10 container mx-auto py-8 text-white font-folk">
        <h1 class="text-4xl font-bold mb-4">Welcome to My Website</h1>
        <p class="text-lg">
          This is a simple example of how you can use a carousel as a background in your Vue.js application. 
        </p>
      </div>
    </main>

    <!-- Footer -->
    <footer class="bg-gray-800 text-white py-4">
      <div class="container mx-auto text-center">
        &copy; 2024 My Website. All rights reserved.
      </div>
    </footer>
  </div>
</template>

<script>
export default {
  data() {
    return {
      currentIndex: 0,
      images: [
        'https://via.placeholder.com/800x400?text=Image+1',
        'https://via.placeholder.com/800x400?text=Image+2',
        'https://via.placeholder.com/800x400?text=Image+3'
      ]
    };
  },
  methods: {
    next() {
      this.currentIndex = (this.currentIndex + 1) % this.images.length;
      this.updateCarousel();
    },
    prev() {
      this.currentIndex = (this.currentIndex - 1 + this.images.length) % this.images.length;
      this.updateCarousel();
    },
    updateCarousel() {
      const carousel = this.$refs.carousel;
      const offset = this.currentIndex * -100;
      carousel.style.transform = `translateX(${offset}%)`;
    }
  }
};
</script>