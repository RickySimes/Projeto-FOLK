<template>
  <div class="flex flex-col min-h-screen">
    <!-- Header -->
    <header class="bg-gradient-to-r from-blue-600 to-purple-900 text-white py-4 shadow-lg">
      <nav class="container mx-auto flex justify-center items-center space-x-8">
        <ul class="flex space-x-8 md:space-x-24 font-folk text-sm md:text-base">
          <li><router-link to="/" class="hover:text-gray-200">Home</router-link></li>
          <li><a target="_blank" href="https://issuu.com/cofit/docs/folk_azores_2024_cartaz_a4_web" class="hover:text-gray-200">Programa</a></li>
          <li><router-link to="/Volunteer" class="hover:text-gray-200">Voluntariado</router-link></li>
          <li><a href="#" class="hover:text-gray-200">História</a></li>
        </ul>
      </nav>
    </header>

    <main class="flex-grow relative">
      <div class="absolute inset-0 overflow-hidden z-0">
        <div class="carousel-container overflow-hidden h-full w-full relative">
          <div ref="carousel" class="flex transition-transform duration-500 ease-in-out h-full" :style="{ transform: `translateX(-${currentIndex * 100}%)` }">
            <img
              v-for="(image, index) in images"
              :key="index"
              :src="image"
              class="w-full object-cover h-full flex-shrink-0"
              :alt="'Background Image ' + (index + 1)"
            />
          </div>
        </div>
      </div>

      <!-- Main Content Layered on Top of Carousel -->
      <div class="absolute inset-0 flex items-center justify-center z-10">
        <div class="flex flex-col items-center justify-center text-white font-folk text-center bg-black bg-opacity-80 p-4 w-full h-full">
          <h1 class="text-5xl md:text-7xl lg:text-9xl font-bold mb-2 select-none">FOLK</h1>
          <h1 class="text-5xl md:text-7xl lg:text-9xl font-bold mt-2 select-none">AZORES</h1>
        </div>
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
    return {
      currentIndex: 0,
      images: [
        'https://scontent.fpdl1-1.fna.fbcdn.net/v/t39.30808-6/449782488_1051455096542455_1870533574522364460_n.jpg?_nc_cat=108&ccb=1-7&_nc_sid=cc71e4&_nc_ohc=P7skCbZMLXMQ7kNvgFM2Gg_&_nc_ht=scontent.fpdl1-1.fna&oh=00_AYCrNJNfkCX-BrSX_-5qpejZqGSVQ_c8wJcQeT2ncanKtg&oe=66C2F323',
        'https://scontent.fpdl1-1.fna.fbcdn.net/v/t39.30808-6/301877786_2297601413727553_1407009636535036503_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=86c6b0&_nc_ohc=UQlIyNDkrXQQ7kNvgEA1JS5&_nc_ht=scontent.fpdl1-1.fna&oh=00_AYD1En3_rtLU1Q59swnwT5e8TRbCbH62gmRy0AdINBwtLA&oe=66C2C5AC',
        'https://scontent.fpdl1-1.fna.fbcdn.net/v/t39.30808-6/436381765_1001826158172016_6081355761918627531_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=f727a1&_nc_ohc=oi-vmBLRQSYQ7kNvgFRE0_O&_nc_ht=scontent.fpdl1-1.fna&oh=00_AYCF9GtzOfw6I6IwMx8OOJpGwlEb76QKg_6ucrblEZ2xAA&oe=66C2F03B'
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
      // Move to the next image
      if (this.currentIndex < this.images.length - 1) {
        this.currentIndex++;
      } else {
        this.currentIndex = 0; // Loop back to the first image
      }
    },
  }
};
</script>